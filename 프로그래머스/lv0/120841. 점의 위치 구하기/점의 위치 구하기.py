def solution(dot):
    location = [(3, 2), (4, 1)]
    return location[dot[0] > 0][dot[1] > 0]