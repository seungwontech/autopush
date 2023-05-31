import math
def solution(n):
    answer = -1
    temp = int(math.sqrt(n))
    if temp == math.sqrt(n):
        answer = (temp + 1) ** 2
    return answer