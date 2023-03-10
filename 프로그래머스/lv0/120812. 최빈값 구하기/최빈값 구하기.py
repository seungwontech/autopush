def solution(array):
    dict_list = {}
    for i in array:
        dict_list[i] = array.count(i)

    max_value = max(dict_list.values())
    count = 1
    for i in dict_list.values():
        if max_value == i:
            count = count + 1
    if count > 2:
        answer = -1
    else:
        for j in dict_list:
            if max_value == dict_list[j]:
                answer = j
    return answer