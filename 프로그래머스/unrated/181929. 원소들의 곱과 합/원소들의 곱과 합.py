def solution(num_list):
    answer = 0
    temp = 1
    for i in num_list:
        temp *= i
    if temp < sum(num_list)**2:
        answer = 1
    return answer