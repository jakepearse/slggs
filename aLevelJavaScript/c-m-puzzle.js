var APP = (function(){

  var public = {};
  
  var TOTAL_CANNIBALS;
  
  var TOTAL_MISSONARYS;
  
  var MAX_BOAT_CAP;
  
  var state = [];
  public.setup = function(cannibals,missonarys,boat_cap){
    TOTAL_CANNIBALS = parseInt(cannibals);
    TOTAL_MISSONARYS = parseInt(missonarys);
    MAX_BOAT_CAP = parseInt(boat_cap);
    state.push(TOTAL_CANNIBALS);
    state.push(TOTAL_MISSONARYS);
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
      new_state.push(parseInt(current_state[0]) + move[0]);
      new_state.push(parseInt(current_state[1]) + move[1]);
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
  
  public.getState= function(){
    return state;
  }
  
  public.breadthFirstSearch = function(key){
    var nodes_visited = 0;
    var t1 = performance.now(); // I want to time how long bub takes
    var current = makeNode(key,null);
    //current.distance = Infinity;
    var nextList =[];
    var visitList =[];
    var q = [];
    q.push(current);
    visitList.push(current.state);
    while (q.length > 0){
      current = q.shift();
      nodes_visited ++;
      if (winner(current.state)){
        console.log("nodes visited="+nodes_visited);
        console.log("bub took :"+ (performance.now()-t1) +" seconds"); //show how long it took
        return buildChain(current);
      }
      nextList = public.getMoves(current.state);
      //console.log(nextList);
      for (var i = 0; i < nextList.length; i++){
        var nextState = public.doMove(nextList[i],current.state);
        var nextNode = makeNode(nextState,current);
        if ( !public.inList(visitList,nextNode.state) && !loser(nextNode.state)){
          q.push(nextNode);
          visitList.push(nextNode.state);
        }
      }
    }
  }
  
  public.depthFirstSearch = function(key){
    var nodes_visited = 0;
        var t1 = performance.now(); // I want to time how long bub takes
    // let s be a stack
    var s = [];
    var v;
    var v_edges;
    var visited = [];
    var current = makeNode(key,null);
    s.push(current);
    while (s.length > 0){
      v = s.pop();
      nodes_visited ++;
      //console.log(v.state);
      if (winner(v.state)){
        console.log("nodes visited ="+nodes_visited);
        console.log("bub took :"+ (performance.now()-t1) +" seconds"); //show how long it took
        return buildChain(v);
        } else if ( !public.inList(visited,v.state) && !loser(v.state)){
        visited.push(v.state);
        v_edges = public.getMoves(v.state);
        for(var i = 0; i < v_edges.length; i++){
          s.push(makeNode(public.doMove(v_edges[i],v.state),v));
        }
        v_edges = [];
      }
      else {
        continue;
      }
    }
  }
  
    
    function buildChain(chain){
      if (chain.parent===null){
        console.log(chain.state);
        return;
      }
      console.log(chain.state);
      buildChain(chain.parent);
    }
      
    function makeNode(state,parent){
      var node = {};
      node.state = state;
      if (parent===null){
      node.distance = 0;
      } else {
        node.distance = parent.distance +1;
        }
      node.parent = parent;
      return node;
    }
  
  
  public.inList = function(l,e){
    var hash = {};
    for (var i = 0; i<l.length;i++){
      hash[l[i]]=i;
    }
     if (hash.hasOwnProperty(e)){
       return true;
     }
     return false;
   }
  
  function loser(state){
    if ( (state[0]>state[1] && state[1] !==0) || (TOTAL_CANNIBALS-state[0]>TOTAL_MISSONARYS-state[1] && TOTAL_MISSONARYS-state[1]!==0)){
     return true;
     }
     return false;
   }
  
  function winner(state){
    if (state[1]===0){
      return true;
    }
    return false;
  }
  
  return public;
  
  
}());
