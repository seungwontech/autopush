n = int(input())
result = 0
plus_int = []
minus_int = []
for i in range(n):
    num = int(input())
    if num > 1:
        plus_int.append(num)
    elif num < 1:
        minus_int.append(num)
    else:
        result += num
plus_int.sort(reverse=True)
minus_int.sort()

for i in range(0, len(plus_int), 2):
    if i + 1 >= len(plus_int):
        result += plus_int[i]
    else:
        result += (plus_int[i] * plus_int[i + 1])
for i in range(0, len(minus_int), 2):
    if i + 1 >= len(minus_int):
        result += minus_int[i]
    else:
        result += (minus_int[i] * minus_int[i + 1])

print(result)
