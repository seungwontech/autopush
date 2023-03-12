def solution(angle):
    answer = 0
    if angle == 180:
        answer = 4
    elif 90 < angle < 180:
        answer = 3
    elif 90 == angle:
        answer = 2
    else:
        answer = 1
    return answer