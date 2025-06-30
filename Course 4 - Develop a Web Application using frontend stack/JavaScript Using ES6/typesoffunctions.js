// normal function declaration 
display1();
function display1() {
    document.writeln("<br/>Normal style function creation")
}
display1();

// expression style function. storing function in variable name.
//display3();       // we can't call before declaration because it doesn't support hs hosting 
let display3 = function() {
    document.writeln("<br/>Expression style function creation")
}
display3();
let display4 = ()=>document.writeln("<br/> Simple Arrow function")
display4();

let addNumber1 = function(a,b){
    var sum = a+b;
    return sum;
}
document.writeln("<br> Sum of two number using expression stye is "+addNumber1(100,200))
let addNumber2 = (a,b)=>a+b;        // arrow function return the value without return keyword. 
document.writeln("<br> sum of two number using arrow style is "+addNumber2(100,200));




