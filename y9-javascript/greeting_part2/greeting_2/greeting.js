// To make my greeting customised I need to do three things

// 1. Get some input from the user
// 2. Work out where to put that input data
// 3. Put it there

// 1. get the user input and place it in a variable
var userInputA = prompt("To:");
// 2. now make a variable which has a reference to an element on the page
var outputElementA = document.getElementById("outputElementA");
// 3. set the innerHTML of the element to be the user supplied value
outputElementA.innerHTML = userInputA;  
// 4. get the second user input and place it in a new variable
var userInputB = prompt("From:");
// 5. now make a variable which has a reference to another element on the page
var outputElementB = document.getElementById("outputElementB");
// 6. set the innerHTML of the element to be the user supplied value
outputElementB.innerHTML = userInputB;  
