n = int(input())
stack = []
print_value = []
k = 1
isNo = False
for i in range(n):
    value = int(input())
    while k <= value:
        stack.append(k)
        print_value.append('+')
        k += 1

    if stack[-1] == value:
        stack.pop()
        print_value.append('-')
    else:
        print('NO')
        isNo = True
        break

if not isNo:
    for i in print_value:
        print(i)
