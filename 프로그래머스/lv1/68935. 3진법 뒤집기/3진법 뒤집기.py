def solution(n):
    answer = 0
    str3 = ''
    while n >= 1:
        n, b = divmod(n, 3)
        str3 += str(b)
    answer = int(str3, 3)
    return answer