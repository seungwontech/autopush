def solution(s):
    answer = ''
    temp_s = list(map(str, s))
    if len(temp_s) % 2 == 0:
        answer = temp_s[len(temp_s)//2 - 1]
    answer += temp_s[len(temp_s)//2]
    return answer