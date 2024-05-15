import sys

n = int(sys.stdin.readline())

for i in range(n):
    stack = input()
    cnt_a = 0
    for j in stack:
        if j == '(':
            cnt_a += 1
        elif j == ')':
            cnt_a -= 1
        if cnt_a < 0:
            print('NO')
            break
    if cnt_a > 0:
        print('NO')
    elif cnt_a == 0:
        print('YES')
