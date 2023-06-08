def solution(a, b, n):
    answer = 0
    while n >= a:
        temp_n = n // a * b
        temp = n % a
        answer += temp_n
        n = temp_n + temp
    return answer