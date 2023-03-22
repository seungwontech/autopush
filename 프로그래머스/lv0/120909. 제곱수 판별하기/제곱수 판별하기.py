def solution(n):
    answer = 2
    a = n ** (1 / 2)
    if a % 1 == 0:
        answer = 1
    return answer