def solution(nums):
    answer = 0
    nums_set_len = len(set(nums))
    choice_value_len = len(nums) // 2
    answer = min(nums_set_len, choice_value_len)
    return answer