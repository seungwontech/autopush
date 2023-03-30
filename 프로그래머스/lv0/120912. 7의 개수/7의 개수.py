def solution(array):
    answer = 0
    for i in array:
        a = list(str(i))
        for j in a:
            if str(j) == '7':
                answer += 1
    return answer