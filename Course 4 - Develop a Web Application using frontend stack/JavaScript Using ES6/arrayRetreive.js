let num = [10,20,30,40,50,60]
document.writeln("<br/> "+num)
document.writeln("<br/> "+num[0])
document.writeln("<br/> "+num[1])
document.writeln("<br/> "+num.join("->"))
document.writeln("<br/> using for loop")
for(let i=0;i<num.length;i++){
    document.writeln("<br/>Value is "+num[i])
}
document.writeln("<br/> using for in loop")
for(let index in num){      // index variable retrieve index number 
    document.writeln("<br/> Index is "+index+" Value is "+num[index])
}
document.writeln("<br/> using for of loop")
for(let n of num){
    document.writeln("<br/> Value is "+n)
}
document.writeln("<br/> Using forEach ES6 features")
num.forEach(display)

function display(value,index){
    document.writeln("<br/> Value is "+value+" Index is "+index)
}
document.writeln("<br/> Using forEach ES6 features with expression style ")
num.forEach(function(value,index){
    document.writeln("<br/> VAlue is "+value+" index is "+index)
})
document.writeln("<br/> Using forEach ES6 features with arrow style ")
num.forEach((value,index)=>document.writeln("<br/> VAlue is "+value+" Index is "+index))

