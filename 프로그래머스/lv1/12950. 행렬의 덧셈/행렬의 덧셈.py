def solution(arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        temp_arr = []
        for j in range(len(arr1[0])):
            temp_arr.append(arr1[i][j] + arr2[i][j])
        answer.append(temp_arr)
    return answer