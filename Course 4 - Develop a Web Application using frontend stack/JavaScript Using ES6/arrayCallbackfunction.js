let num = [1,2,3,4,5,6,7,8,9,10];
document.writeln("<br/> "+num)
// map take callback function as parameter 
// it take each element as parameter and return same value or modified value

let modifiedArray = num.map(value=>value+10)
document.writeln("<br/> "+modifiedArray)
// filter function : it take each element from array and 
// apply condition on those element if true return value else no value 
let evenArrayElement = num.filter(value=>value%2==0)
document.writeln("<br/> even array element "+evenArrayElement)
let oddArrayElement = num.filter(value=>value%2!=0)
document.writeln("<br/> odd array element "+oddArrayElement)
// array function chaining 
num.filter(v=>v%2==0).forEach(v=>document.writeln("<br/> Value is "+v))



