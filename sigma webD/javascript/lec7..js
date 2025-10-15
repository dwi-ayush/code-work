const name = "Ayush";
const repoCount = 50; // numeric is fine too

// Outdated concatenation
console.log(name + " " + repoCount);

// Modern way using template literals (backticks)
console.log(`Hello, my name is ${name.toUpperCase()} and my repo count is ${repoCount}`);

// String object (use capital 'S')
const gameName = new String('AYUSHdwivedi');

// Accessing character by index
console.log(gameName[5]); // Output: H

//Accessing the prototype
console.log(gameName.__proto__);

//Accessing the length
console.log(gameName.length);

//New observation
console.log(gameName.charAt('d'));
//Accessing the charcter palce i.e.  we need to check out the place of the charcter 

//Accessing the indexvalue, means finding out the what value at that particular index 
console.log(gameName.charAt(4));

// finding the index value 
console.log(gameName.indexOf('d'));


