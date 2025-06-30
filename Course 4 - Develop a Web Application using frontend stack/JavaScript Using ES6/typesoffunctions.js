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