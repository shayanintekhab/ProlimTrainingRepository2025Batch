let num1=[1,2,3,4,5,6]
let num2 = new Array(1,2,3,4,5,6)
document.writeln("<br/>")
document.writeln(num1); // separated by ,
document.writeln("<br/>")
document.writeln(num2);
document.writeln("<br/> number of elements of num1 "+num1.length)
document.writeln("<br/> number of elements of num2 "+num2.length)
document.writeln("<br/>")
document.writeln(num1.join(" "));
document.writeln("<br/>")
document.writeln(num2.join(" "));
num1.push(100);         // added at last 
num1.unshift(200)       // added at beginning 
document.writeln("<br/>")
document.writeln(num1); // separated by ,
num1.pop();             // remove element from last 
num1.shift();             // remove element from beginning 
document.writeln("<br/>")
document.writeln(num1); // separated by ,

// remove as well as add in between 
//num1.splice(2,1);           // 1st parameter index position and 2nd parameter number of element to delete 
//num1.splice(3,2);           // 1st parameter index position and 2nd parameter number of element to delete 
//num1.splice(2,0,100);   // 3rd index position add the element 
//num1.splice(2,0,100,200,300,400);   // 3rd index position takes n number of values. 
num1.splice(2,3,100,200,300);   // 3rd index position takes n number of values. 
document.writeln("<br/>")
document.writeln(num1); // separated by ,
