var APP = (function(){

  var public = {};
  
  var TOTAL_CANNIBALS;
  
  var TOTAL_MISSONARYS;
  
  var MAX_BOAT_CAP;
  
  var state = [];
  public.setup = function(cannibals,missonarys,boat_cap){
    TOTAL_CANNIBALS = cannibals
    TOTAL_MISSONARYS = missonarys;
    MAX_BOAT_CAP = boat_cap
    state.push(cannibals);
    state.push(missonarys);
    state.push(1);
  }
  
  checkMove = function(move,test_state){ // test if a move is legal
    
    if (test_state[0] + move[0] < 0) { // can't be less than zero cannibals on the left hand bank
      return false;
    } else if (Math.abs(move[0]) + Math.abs(move[1]) > MAX_BOAT_CAP){ // Can't be too many in the boat
      return false;
    } else if (Math.abs(move[0]) + Math.abs(move[1]) === 0) { // cant be no one in the boat
      return false;
    } else if (test_state[1] + move[1] < 0){ // cant be less than 0 missonarys on the left bank
      return false;
    } else if (TOTAL_CANNIBALS - test_state[0] < move[0]) { // can't move cannibals that aren't there
      return false;
    } else if (TOTAL_MISSONARYS - test_state[1] < move[1]) { // can't move missonarys that aren't there
      return false;
    }
    return true;
  } // end of check moves
  
  public.doMove = function(move,current_state){
    var new_state =[];
    if (checkMove(move,current_state)){
      new_state.push(current_state[0] + move[0]);
      new_state.push(current_state[1] + move[1]);
      new_state.push(current_state[2] + move[2]);
      return new_state;
    } else {
      return "ILLEGAL";
    }
  } // end of do move
  
  public.getMoves= function(current_state){
    var move_set = []; // a place to put all the moves
    var boat_direction; // where is the boat now?
    var move;
    
    // is the move going to be positive or negative (left or right)
    if (current_state[2] < 1){
      boat_direction = 1;
    } else {
      boat_direction = -1;
      
    }
    
    // generate all possible moves
    for(var i = 0; i <= MAX_BOAT_CAP; i++){
      for(var j = 0; j <= MAX_BOAT_CAP; j++){
        move = [i * boat_direction, j * boat_direction, boat_direction];
        if(checkMove(move, current_state)){ // if the move is legal
          move_set.push(move); // push it in to the list
        }
      }
    }
    return move_set; // return the list
  } // end of getMoves
  
  return public;
}());
