def solution(num, k):
    answer = 0
    list_num = list(map(int, str(num)))
    
    for i in list_num:
        if i == k:
            answer = list_num.index(i) + 1
    if answer == 0:
        answer = -1
    return answer