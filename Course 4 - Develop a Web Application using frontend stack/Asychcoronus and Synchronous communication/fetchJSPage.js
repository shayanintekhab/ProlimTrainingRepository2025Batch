function loadFakeData(){
    fetch("https://dummyjson.com/todos").then(response=>response.json()).then(result=>console.log(result.todos)).catch(error=>console.log(error))
}