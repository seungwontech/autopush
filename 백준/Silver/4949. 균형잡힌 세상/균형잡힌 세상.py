while True:
    value = input()
    stack1 = []
    if value == '.':
        break
    for i in value:

        if i == '[' or i == '(':
            stack1.append(i)
        elif i == ']':
            if len(stack1) != 0 and stack1[-1] == '[':
                stack1.pop()
            else:
                stack1.append(i)
                break

        elif i == ')':
            if len(stack1) != 0 and stack1[-1] == '(':
                stack1.pop()
            else:
                stack1.append(i)
                break
    if len(stack1) == 0:
        print('yes')
    else:
        print('no')
