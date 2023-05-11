def solution(dots):
    answer = 0
    x = [dot[0] for dot in dots]
    y = [dot[1] for dot in dots]
    w = max(x) - min(x)
    h = max(y) - min(y)
    answer = w * h
    return answer