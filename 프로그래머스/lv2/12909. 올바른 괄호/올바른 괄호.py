def solution(s):
    answer = True
    cnt = 0
    for i in range(0, len(s), 1):
        str_s = s[i]
        if str_s == '(':
            cnt = cnt + 1
        else:
            cnt = cnt - 1
        if cnt == -1:
            break
    if cnt != 0:
        answer = False
    return answer