from typing import List
def stockBuyAndSell(nums: List[int]) -> int:
    j = res = 0
    for i in range(1,len(nums)):
        if nums[j]>nums[i]:
            j=i
        else:
            res = max(res,nums[i]-nums[j])
    return res

nums = list(map(int,input().split()))
print(stockBuyAndSell(nums))
