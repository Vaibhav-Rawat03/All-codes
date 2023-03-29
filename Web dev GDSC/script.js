function add(){
    let numberOne=document.getElementById("numberOne").value;
    let numberTwo=document.getElementById("numberTwo").value;
    console.log(numberOne,numberTwo);
    let sum=numberOne + numberTwo;
    document.getElementById("Answer").innerHTML=sum;
}

function mul(){
    let numberOne=document.getElementById("numberOne").value;
    let numberTwo=document.getElementById("numberTwo").value;
    console.log(numberOne,numberTwo);
    let mul=numberOne*numberTwo;
    document.getElementById("Answer").innerHTML=mul;
}

function div(){
    let numberOne=document.getElementById("numberOne").value;
    let numberTwo=document.getElementById("numberTwo").value;
    console.log(numberOne,numberTwo);
    let div=numberOne/numberTwo;
    document.getElementById("Answer").innerHTML=div;
}

function sub(){
    let numberOne=document.getElementById("numberOne").value;
    let numberTwo=document.getElementById("numberTwo").value;
    console.log(numberOne,numberTwo);
    let sub=numberOne-numberTwo;
    document.getElementById("Answer").innerHTML=sub;
}