def solution(s):
    answer = ''
    s_list = list(map(str, s.split(' ')))
    for i in s_list:
        for j in range(len(i)):
            temp_s = ''
            if j % 2 == 0:
                temp_s = i[j].upper()
            else:
                temp_s = i[j].lower()
            answer += temp_s
        answer += ' '
    return answer[0:len(answer) - 1]