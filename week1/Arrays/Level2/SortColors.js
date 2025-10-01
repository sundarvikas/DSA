const sortColors = function(nums){
    let low = mid = 0;
    let high = nums.length - 1;
    while(mid <= high){
        if(nums[mid] === 0){
            [nums[low],nums[mid]] = [nums[mid],nums[low]];
            low++;
            mid++;
        }
        else if(nums[mid] === 1) mid++;
        else{
            [nums[mid],nums[high]] = [nums[high],nums[mid]];
            high--;
        }
    }
    return nums;
}
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question('',(userInput)=>{
    const nums = userInput.split(" ").map(Number);
    console.log(sortColors(nums));
    rl.close();
})
