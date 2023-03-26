import math
def solution(n):
    answer = 0
    for i in range(1, 11):
        fac = math.factorial(i);
        if fac <= n:
            answer = i
    return answer