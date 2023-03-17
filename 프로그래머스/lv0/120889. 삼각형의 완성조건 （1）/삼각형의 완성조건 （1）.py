def solution(sides):
    answer = 0
    max_value = max(sides)
    sides.remove(max_value)
    if sides[0] + sides[1] > max_value:
        answer = 1
    else:
        answer = 2
    return answer