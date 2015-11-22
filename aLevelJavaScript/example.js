// Real JavaScript Applications are written in modules like this one

var APP = (function() { // see how the entire module is wrapped in brackets
  var publicStuff ={} // this is an empty object
        
  privatevariable =111;
        
  function privateMethod() {
      return "There is no way to call this method!";
    }
    
    publicStuff.moduleProperty = 1; // we can just add stuff to an object
    publicStuff.moduleMethod = function() {
      return "thats awesome";
    };
    publicStuff.getPrivateVariable = function(){
      return privatevariable;
    }
    
    return publicStuff; // When the module is executed it returns this object
    
}());// this ends the whole function and calls it with ()
// the function calls itself and returns the publicStuff object
// try loading the example.html page and typing into the console APP.publicMethod();
// neat huh? also becuase the inner publicStuff object is still resident it has access to all the data of its parent
// this is called closure and it's one of the reason JavaScript is awesome..


