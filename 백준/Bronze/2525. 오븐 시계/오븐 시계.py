H, M = map(int, input().split())
A = int(input())

H += (M + A) // 60
M = (M + A) % 60

if H > 23:
    H -= 24

print(H, M)
