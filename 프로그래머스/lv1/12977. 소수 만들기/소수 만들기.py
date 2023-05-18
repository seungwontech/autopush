from itertools import combinations
def solution(nums):
    answer = 0
    com_nums = list(combinations(nums, 3))
    for i in com_nums:
        cnt = 0
        for j in range(1, sum(i) + 1):
            if sum(i) % j == 0:
                cnt += 1
        if cnt == 2:
            answer += 1
    return answer