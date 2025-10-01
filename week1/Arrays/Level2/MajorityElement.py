from typing import List
def majorityElement(nums: List[int]) -> int:
    count = ele = 0
    for num in nums:
        if count == 0:
            ele = num
        count += 1 if ele == num else -1
    return ele

nums = list(map(int,input().split()))
print(majorityElement(nums))