var obj;
function startTask() {
    obj = setInterval(start,1000)
}
let i=0;
function start() {
    //document.writeln(i)
    let dd = new Date();
    document.getElementById("time").innerHTML=dd.getHours()+" : "+dd.getMinutes()+" : "+dd.getSeconds()
    document.getElementById("output").innerHTML=i;
    if(i%2==0){
        //document.bgColor="RED"
        document.getElementsByTagName("body")[0].style.backgroundColor="RED";
        document.getElementsByTagName("h2")[0].style.color="WHITE"
    }else {
        //document.bgColor="GREEN"
        document.getElementsByTagName("body")[0].style.backgroundColor="GREEN";
        document.getElementsByTagName("h2")[0].style.backgroundColor="RED";
    }
    i++;
}
function stop() {
    clearInterval(obj);
}