n = int(input())


def p(n):
    if n > 1:
        return n * p(n - 1)
    else:
        return 1


print(p(n))
