const readline = require('readline');
const maxSubArraySum = (nums) => {
    let sum = 0, res = -Infinity;
    for(const num of nums){
        sum = Math.max(sum+num,num);
        res = Math.max(res,sum);
    }
    return res;
};

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("",(userInput) => {
    const nums = userInput.split(" ").map(Number);
    console.log(maxSubArraySum(nums));
    rl.close();
})