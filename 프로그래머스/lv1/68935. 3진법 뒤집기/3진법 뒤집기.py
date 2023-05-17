def solution(n):
    answer = 0
    str3 = ''
    while n >= 1:
        n, b = divmod(n, 3)
        print(n, b)
        str3 += str(b)
        print(str3)
    print(int(str3, 3))
    answer = int(str3, 3)
    return answer