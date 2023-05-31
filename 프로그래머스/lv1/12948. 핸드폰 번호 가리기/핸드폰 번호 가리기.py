def solution(phone_number):
    answer = ''
    temp_list = list(str(phone_number))
    for i in range(len(temp_list) - 4):
        temp_list[i] = '*'
    
    answer = ''.join(temp_list)
    return answer