// lines beginning with 2 slashes are comments
// to get you started, here is one way we could put the users name in the right place.

 // the value supplied by the user is stored as name
var name = prompt("what is your name?");

// a reference to the html element with id = "userName" is stored as userNameElement
var userNameElement = document.getElementById("userName"); 

 // the innerHTML property of the element is being changed to the value of our name variable
userNameElement.innerHTML = name;

// Now continue writing the program below
