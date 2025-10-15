// stack and heap in javascript lecture 10

// memoery is of two types -> stack and heap
// stack -> used at primitive data type  that means call by value {that means copying the value and using it}
// heap -> used at non primitive data type  that means call by value {that means it uses original value}


//-----------------stack------------
let myYoutubename = "Ayushdwivedi2108" ;

let anothername = myYoutubename
anothername = "dwivediayush3615"

console.log(myYoutubename);// this value will not change as it provided acopy of it,

console.log(anothername);

//-----------heap-------------------
let userOne ={
    email: "user@google.com",
    upi: "gop@ybl"

}

let userTwo = userOne
userTwo.email ="ayush@gmail.com"

console.log(userOne)
console.log(userTwo)