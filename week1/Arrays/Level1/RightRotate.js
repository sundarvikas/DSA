const readline = require('readline');

const rightRotate = (nums,k) => {
    if(k > nums.length) k %= nums.length;
    if(k === 0) return;
    const lastKElements = nums.slice(-k);
    nums.length -= k;
    nums.splice(0, 0, ...lastKElements);
};

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('',(userInput) => {
    const allInputs = userInput.split(" ").map(Number);
    const k = allInputs.pop();
    const nums = allInputs;
    leftRotate(nums,k);
    console.log(nums.join(" "));
    rl.close();
})