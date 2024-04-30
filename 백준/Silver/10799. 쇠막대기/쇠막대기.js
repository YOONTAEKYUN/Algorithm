const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("");

let sticks = [];
let num = 0;

for(let i = 0; i < input.length; i++){
    let str = input[i];
    if(str === "(" && input[i + 1] === ")"){
        num += sticks.length;
        i++;
    } else if(str === "("){
        sticks.push(str);
    } else {
        sticks.pop();
        num++;
    }
}

console.log(num);