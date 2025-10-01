const readline = require('readline')

const longestSubArrayWithKSum = (nums,k) => {
    let sum = 0;
    let res = 0;
    let myMap = new Map();
    for(let i=0;i<nums.length;i++){
        sum += nums[i];
        if(sum === k) res = Math.max(res,i+1);
        let rem = sum - k;
        if(myMap.has(rem)){
            let len = i - myMap.get(rem);
            res = Math.max(res,len);
        }
        if(!myMap.has(sum)) myMap.set(sum,i);
    }
    return res;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('',(userInput) => {
    const allInput = userInput.split(" ").map(Number);
    const k = allInput.pop();
    const nums = allInput;
    console.log(longestSubArrayWithKSum(nums,k));
    rl.close();
});