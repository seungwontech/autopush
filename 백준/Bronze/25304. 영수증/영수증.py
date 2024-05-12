x = int(input())
n = int(input())

for i in range(1, n + 1):
    a, b = map(int, input().split())
    x -= a * b

if x == 0:
    print('Yes')
else:
    print('No')