def solution(name, yearning, photo):
    answer = []
    dict_list = dict(zip(name, yearning))
    for i in photo:
        temp = 0
        for j in i:
            if dict_list.get(j) != None:
                temp += int(dict_list.get(j))
        answer.append(temp)
    return answer