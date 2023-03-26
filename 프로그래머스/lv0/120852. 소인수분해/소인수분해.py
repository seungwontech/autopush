def solution(n):
    d = 2
    answer = []
    while d <= n:
        if n % d == 0:
            answer.append(d)
            n = n / d
        else:
            d = d + 1
    return sorted(list(set(answer)))