def solution(my_string):
    answer = []
    for i in my_string:
        if str.isdigit(i) == True:
            answer.append(int(i))
    return sorted(answer)