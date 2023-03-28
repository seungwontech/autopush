from collections import Counter
def solution(s):
    answer = ''
    s_list = sorted(list(map(str, s)))
    for key, value in Counter(s_list).items():
        if value == 1:
            answer += ''.join(key)
    return answer