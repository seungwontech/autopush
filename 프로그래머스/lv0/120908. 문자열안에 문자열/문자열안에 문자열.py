def solution(str1, str2):
    answer = 1
    if str1.find(str2) == -1:
        answer = 2
    return answer