//datatype conversion and confusion 

let score = "33abc"

console.log(typeof score);
console.log(typeof(score));


let valueInNumber = NUMBER(score)
console.log(typeof score);
// the output will be NaN that means it is not a number 

// null is coverted in number it will give up value 0

//undfined datatype output will be NaN 

// boolean will giv 1 & 0 in number conversion 

//"33" => 33
// "33abc" => NaN

let isloggedIN = 1
let booleanlogedin = Boolean(isloggedIN)
console.log(booleanlogedin); // output => true

// " "{emty boleean string coversion} => false
//"Ayush" {boolean conversion}=> true

let SomeNumber = 33
let StringNumber  = String(SomeNumber)
console.log(StringNumber); // output => 33 
console.log(typeof(StringNumber)); // but when we check type of it will give string 



