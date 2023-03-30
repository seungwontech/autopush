import math
def solution(my_str, n):
    answer = []
    temp = 0
    temp2 = n
    for i in range(1, math.ceil(len(my_str)/n)+1, 1):
        answer.append(my_str[temp : temp2 * i])    
        temp += n
        temp = temp2 * i
    return answer