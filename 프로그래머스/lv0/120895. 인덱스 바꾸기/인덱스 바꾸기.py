def solution(my_string, num1, num2):
    answer = ''
    num1_str = my_string[num1]
    num2_str = my_string[num2]
    for i in range(len(my_string)):
        if num1 == i:
            answer += num2_str
        elif num2 == i:
            answer += num1_str
        else:
            answer += my_string[i]
    return answer