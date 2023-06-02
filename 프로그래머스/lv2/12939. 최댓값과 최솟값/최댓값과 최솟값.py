def solution(s):
    answer = ''
    temp_list = list(map(int, s.split()))
    answer = str(min(temp_list)) + ' ' + str(max(temp_list))
    return answer