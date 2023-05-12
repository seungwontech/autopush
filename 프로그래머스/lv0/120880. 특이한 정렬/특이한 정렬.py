def solution(numlist, n):
    answer = []
    numlist.sort()
    print(numlist)
    temp = { i:abs(n - i) for i in numlist}
    sorted_dict = sorted(temp.items(), key = lambda item: item[1])
    print(sorted_dict)
    tempval0 = -1
    tempval1 = -1
    index = -1
    for i in sorted_dict:
        if i[1] == tempval1 and i[0] > tempval0:
            index = answer.index(tempval0)
            answer.insert(index, i[0])
        else:
            tempval0 = i[0]
            tempval1 = i[1]
            answer.append(i[0])
    print(answer)
    return answer