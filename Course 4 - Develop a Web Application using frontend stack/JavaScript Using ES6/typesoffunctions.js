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

// expression style function to find the largest of two numbers 
let findLargest1 = function(a,b) {
    if(a>b){
        return "a is largest"
    }else {
        return "b is largest"
    }
}
// arrow style function to find the largest of two numbers 
let findLargest2 = (a,b)=> {
    if(a>b){
        return "a is largest"
    }else {
        return "b is largest"
    }
}
document.writeln("<br/> Largest of two number using expression style "+findLargest1(100,50))
document.writeln("<br/> Largest of two number using arrow style "+findLargest2(100,50))

// callback function 
//1st parameter is string value and 2nd parameter function name or function body 
function greeting(fname,callback){
    return "Welcome "+callback(fname)
}
let maleInfo = function(fname){
    return "Mr "+fname;
}
let femaleInfo = (fname)=>"Miss "+fname;
document.writeln("<br/>")
document.writeln(greeting("Ravi",maleInfo))
document.writeln("<br/>")
document.writeln(greeting("Reeta",femaleInfo))
document.writeln("<br/>")
document.writeln(greeting("Ajay",function(fname){
    return "Mr "+fname;
}))
document.writeln("<br/>")
document.writeln(greeting("Veeta",(fname)=>"Miss "+fname))
