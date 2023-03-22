def solution(my_string):
    answer = 0 
    strList = list(map(str,my_string))
    for i in strList:
        if str.isdigit(i) == True:
            answer += int(i)
    return answer