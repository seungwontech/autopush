def solution(num_list, n):
    answer =[]
    for i in range(0, len(num_list), n):
        temp = [];
        for j in range(i, i + n, 1):
            temp.append(num_list[j])
        answer.append(temp)
    return answer