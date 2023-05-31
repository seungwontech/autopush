def solution(n):
    answer = 0
    templist = list(map(str, str(n)))
    templist.sort()
    templist.sort(reverse = True)
    answer = int(''.join(templist))
    return answer