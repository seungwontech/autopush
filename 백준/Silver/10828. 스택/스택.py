import sys

n = int(sys.stdin.readline())

stack = []

for i in range(n):
    values = sys.stdin.readline().split()
    if values[0] == 'push':
        stack.append(values[1])
    elif values[0] == 'pop':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    elif values[0] == 'size':
        print(len(stack))
    elif values[0] == 'empty':
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif values[0] == 'top':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])
