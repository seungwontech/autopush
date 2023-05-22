def solution(polynomial):
    answer = ''
    x = [i for i in polynomial.split() if 'x' in i]
    y = [i for i in polynomial.split() if 'x' not in i]
    xcnt = 0
    print(x)
    for i in x:
        if len(i) > 1:
            xcnt += int(i.replace('x',''))
        else:
            xcnt += 1
    if xcnt > 1:
        answer = str(xcnt) +'' + 'x'
    elif xcnt == 1:
        answer = 'x'
    else:
        answer = ''
    ysum = 0
    for i in y:
        if '+' != i:
            ysum += int(i)
    if ysum >= 1:
        if answer != '':
            answer += ' + ' + str(ysum)
        else:
            answer += str(ysum)
    return answer