def solution(n):
    answer = ''
    list_a = ['수', '박']
    while n > 0:
        for i in range(len(list_a)):
            if n == 0:
                break
            else:
                answer += list_a[i]
                n -= 1
    return answer