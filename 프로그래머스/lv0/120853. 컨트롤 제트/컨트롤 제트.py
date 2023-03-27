def solution(s):
    answer = 0
    s_list = s.split(' ')
    temp = 0
    for i in s_list:
        if i == 'Z':
            answer = answer - temp
        else:
            answer = answer + int(i)
            temp = int(i)
    return answer