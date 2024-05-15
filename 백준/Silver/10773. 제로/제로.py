import sys

k = int(sys.stdin.readline())
stack = []
for i in range(k):
    value = int(sys.stdin.readline())
    if value != 0:
        stack.append(value)
    else:
        stack.pop(-1)

print(sum(stack))