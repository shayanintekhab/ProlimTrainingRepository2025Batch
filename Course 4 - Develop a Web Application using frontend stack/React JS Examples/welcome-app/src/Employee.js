function Employee() {
let id=100;
var name= "Ajay Kumar";
const age = 21;
let skillSet=["Java","Python","React JS"]
let project = {pid:100,pname:"Web App using Spring boot"}

    return(
        <div>
            <h3>Employee details</h3>
            <p>id is {id} name is {name} age is {age} skillSet is {skillSet}</p>
            <p>Project is {project.pid} project name {project.pname}</p>
            <h3>SkillSet</h3>
            <ul>
                {skillSet.map(skill=><li>{skill}</li>)}
            </ul>
        </div>
    ) 
}

export default Employee;