def solution(array):
    count_temp = 0 
    answer = 0
    i_value = 0
    
    for i in array:
        count = array.count(i)
        if i_value == i:
            continue
            
        if count > count_temp:
            count_temp = count
            i_value = i
            
        elif count == count_temp:
            if i_value == i:
                continue
                
            answer = -1
            
    if answer != -1:
        answer = i_value
    return answer