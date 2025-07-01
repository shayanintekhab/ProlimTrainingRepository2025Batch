// let emp1 = {id:100,name:"Ravi",age:21,skillSet:["Java","Python","AI"],
//     address:{city:"Bangalore",state:"Kar"},projects:[{pid:1234,tech:"Java"},{pid:1567,tech:"Python"}]};
// document.writeln(emp1)
// console.log(emp1)
// document.writeln("<br/>Employee object details")
// document.writeln("<br/> id is "+emp1.id)
// document.writeln("<br/> name is "+emp1.name)
// document.writeln("<br/> age is "+emp1.age)
// document.writeln("<br/> SkillSet "+emp1.skillSet)       // display in string format. 
// document.writeln("<br/> SkillSet "+emp1.skillSet[0])       // access using index position 
// for(let skill_set of emp1.skillSet){                // retrieve using loop 
//     document.writeln("<br/> "+skill_set)
// }
// document.writeln("<br/> City "+emp1.address.city)
// document.writeln("<br/> State "+emp1.address.state)
// document.writeln("<br/> "+emp1.projects)
// document.writeln("<br/> Working in "+emp1.projects.length+" Project")
// emp1.projects.forEach(p=>document.writeln("<br/>Project Id "+p.pid+" Project technology "+p.tech))

// which contains property and behaviour 
let p1 = {pid:100,pname:"TV",price:56000,display:function(){
    document.writeln("<br/> Product details")
    document.writeln("<br/> PId "+this.pid)
    document.writeln("<br/> PName "+this.pname)
    document.writeln("<br/> Price "+this.price)
}}
p1.display();