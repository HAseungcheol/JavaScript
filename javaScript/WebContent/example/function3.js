function checkWeight(name, height, weight) {
    this.myName = name;
    this.myHeight = height;
    this.myweight = weight;
    this.minWeight;
    this.maxWeight;
    this.getInfo = function () { //메소드 정의(function 기능 정의해줘야한다.)
        var str = "";
        str += "이름은:" + this.myName + ",";
        str += "키:" + this.myHeight + ",";
        str += "몸무게:" + this.myweight;
        return str;
    }
    this.getResult = function () {
        this.minWeight = (this.myHeight - 100) * 0.9 - 5;
        this.maxWeight = (this.myHeight - 100) * 0.9 + 5;
        if (this.myweight < this.minWeight) {
            return "제중미달";
        } else if (this.myweight > this.maxWeight) {
            return "제중과다";
        } else {
            return "정상범위";
        }
    }
}

checkWeight.prototype.getInfo = function () {
    var str = "";
    str += "이름은:" + this.myName + ",";
    str += "키:" + this.myHeight + ",";
    str += "몸무게:" + this.myweight;
    return str;
}
checkWeight.prototype.getResult = function () {
    this.minWeight = (this.myHeight - 100) * 0.9 - 5;
    this.maxWeight = (this.myHeight - 100) * 0.9 + 5;
    if (this.myweight < this.minWeight) {
        return "제중미달";
    } else if (this.myweight > this.maxWeight) {
        return "제중과다";
    } else {
        return "정상범위";
    }
}


var person = new checkWeight("Hong", 170, 65);
var person1 = new checkWeight("Hwang", 160, 65);
console.log(person.getInfo());
console.log(person.getResult());
console.log(person);
console.log(person1);
for (field in person) {
    //   console.log(field, person[field]);

}