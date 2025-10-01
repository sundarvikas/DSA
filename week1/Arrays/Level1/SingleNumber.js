const readline = require('readline');

const singleNumber = (nums) => {
    let res = 0;
    for(const num of nums) res ^= num;
    return res;
};

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (userInput) => {
    const nums = userInput.split(' ').map(Number);
    console.log(singleNumber(nums));
    rl.close();
});