// Strings in JavaScript

const name = "Ayush";
const repoCount = 50; // numeric is fine too

// 1️⃣ Old-style concatenation
console.log(name + " " + repoCount); 
// Output: Ayush 50

// 2️⃣ Modern way using template literals (backticks) and string methods
console.log(`Hello, my name is ${name.toUpperCase()} and my repo count is ${repoCount}`); 
// Output: Hello, my name is AYUSH and my repo count is 50

// 3️⃣ String object (use capital 'S')
const gameName = new String('AYUSHdwivedi');

// 4️⃣ Accessing character by index
console.log(gameName[5]); 
// Output: H  (6th character, 0-based index)

// 5️⃣ Accessing the prototype of the string object
console.log(gameName.__proto__); 
// Output: String {constructor: ƒ, anchor: ƒ, big: ƒ, blink: ƒ, bold: ƒ, charAt: ƒ, ...}

// 6️⃣ Accessing the length of the string
console.log(gameName.length); 
// Output: 12

// 7️⃣ Accessing character with charAt() using non-numeric input
console.log(gameName.charAt('d')); 
// Output: A  ('d' coerced to 0, so returns first character)

// 8️⃣ Accessing character at a specific numeric index
console.log(gameName.charAt(4)); 
// Output: H  (character at index 4)

// 9️⃣ Finding the index of a character in the string
console.log(gameName.indexOf('d')); 
// Output: 10  (first occurrence of 'd')
// Strings in JavaScript

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


