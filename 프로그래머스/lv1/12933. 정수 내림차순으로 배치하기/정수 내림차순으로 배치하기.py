def solution(n):
    answer = 0
    templist = list(str(n))
    templist.sort(reverse = True)
    answer = int(''.join(templist))
    return answer