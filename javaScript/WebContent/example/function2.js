var score = 10;
function myFunc(){
    var score = 20;
    console.log("local:"+ score);
}
myFunc();
console.log("global:"+score);

function newFunc(){
    console.log("global funtion");
}

function outerFunc(){
    function newFunc(){
        console.log("local funtion");
    }
    newFunc();
}

newFunc();
outerFunc();

(function() {
    console.log("return Fnc");
})(); //함수 자체를 정의하면서 바로 실행
