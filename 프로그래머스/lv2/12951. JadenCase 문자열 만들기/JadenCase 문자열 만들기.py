def solution(s):
    answer = ''
    s_list = list(map(str, s.lower().split(' ')))
    for i in range(len(s_list)):
        answer += s_list[i].capitalize() + ' '
        
    return answer[0 : len(answer) - 1]