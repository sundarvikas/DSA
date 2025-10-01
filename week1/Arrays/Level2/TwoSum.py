from typing import List

def twoSum(nums: List[int], target: int) -> List[int]:
    map = {}
    for i in range(len(nums)):
        if nums[i] in map:
            return [map[nums[i]],i]
        else:
            map[target - nums[i]] = i
    return []

nums = list(map(int, input().split()))
target = int(input())
print(twoSum(nums,target))