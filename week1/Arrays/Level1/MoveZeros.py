from typing import List
def moveZeros(nums: List[int]) -> List[int]:
    j = 0
    for i in range(len(nums)):
        if nums[i] != 0:
            nums[i], nums[j] = nums[j], nums[i]
            j += 1
    return nums

nums = list(map(int,input().split()))
print(moveZeros(nums))
