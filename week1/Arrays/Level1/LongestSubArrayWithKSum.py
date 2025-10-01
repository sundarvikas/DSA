from typing import List
def LongestSubArrayWithKSum(nums: List[int], k: int) -> int:
    sum = res = 0
    map = {}
    for i in range(len(nums)):
        sum += nums[i]
        if sum == k:
            res = max(res,i+1)
        rem = sum - k
        if rem in map:
            l = i - map[rem]
            res = max(res,l)
        if rem not in map:
            map[rem] = i
    return res

nums = list(map(int,input().split()))
k = int(input())
print(LongestSubArrayWithKSum(nums,k))
