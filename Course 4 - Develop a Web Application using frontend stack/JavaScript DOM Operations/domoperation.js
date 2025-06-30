function AddData(){
    //alert("event fired")
    // creating new tag
    var name = document.getElementById("fname").value
    var age = document.getElementById("age").value 
    var pTag = document.createElement("p");     // p tag ready <p></p>
    //var pTagContent = document.createTextNode("Welcome to DOM Operation"); // content ready 
    var pTagContent = document.createTextNode("Name is "+name+" Age is "+age); // content ready 
    pTag.appendChild(pTagContent);      // content added in p tag <p>Welcome to DOM Operation</p>
    //pTag.setAttribute("class","pClass")
    if(age>25){
        pTag.setAttribute("class","pFirstClass")
    }else {
        pTag.setAttribute("class","pSecondClass")
    }
    document.getElementsByTagName("body")[0].appendChild(pTag);     //<body><p>Welcome to DOM operation</p></body>
document.getElementById("fname").value=""
document.getElementById("age").value=""
}