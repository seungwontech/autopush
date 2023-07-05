def solution(array, commands):
    answer = []
    for i in range(len(commands)):
        temp_com = commands[i]
        temp_arr = array[temp_com[0] - 1:temp_com[1]]
        temp_arr.sort()
        if len(temp_arr) != 1:
            answer.append(temp_arr[temp_com[2] - 1])
        else:
            answer.append(temp_arr[0])
            
    return answer