const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let lines = [];
rl.on('line',(line)=>{
    lines.push(line.trim());
});

rl.on('close',()=>{
    const N = Number(lines[0]);
    lines.shift();
    let cnt = 0;
    let set = new Set();
    for (let i = 1; i < N; i++){
        const temp = lines[i];
        if (temp === "ENTER") {
            cnt += set.size;
            set.clear();
        }else{
            set.add(temp);
        }
        if(i === N-1) {
            cnt += set.size;
        }
    }
    console.log(cnt);
});