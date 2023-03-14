def solution(money):
    result1 = money // 5500
    result2 = money - 5500 * result1
    answer = [result1, result2]
    return answer