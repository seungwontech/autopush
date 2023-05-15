def solution(n, arr1, arr2):
    answer = []
    for a1, a2 in zip(arr1, arr2):
        temp = []
        barr1 = bin(a1)[2:].zfill(n)
        barr2 = bin(a2)[2:].zfill(n)
        for ba1, ba2 in zip(barr1, barr2):
            if ba1 == str(1) or ba2 == str(1):
                temp.append('#')
            else:
                temp.append(' ')
        answer.append(''.join(temp))
    return answer