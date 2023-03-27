def solution(array, n):
    answer = 0
    temp = []
    answer_temp = []
    array.sort()
    for i in array:
        temp.append(abs(n - i))
    answer_temp = [array[temp.index(min(temp))]]
    if len(answer_temp) > 0:
        answer = answer_temp[0]
    return answer