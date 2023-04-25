def solution(sides):
    answer = 0
    max_value = max(sides)
    min_value = min(sides)
    for i in range(max_value - min_value + 1, max_value + 1):
        answer += 1
    sum_value = sum(sides)
    for i in range(max_value + 1, sum_value):
        answer += 1
    return answer