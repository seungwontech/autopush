def solution(dartResult):
    answer = 0
    temp_list = []
    temp = 0
    dartResult = dartResult.replace('10', 'K')
    for i in dartResult:
        if i.isdigit():
            temp = int(i)
        else:
            if 'K' == i:
                temp = 10
            if 'S' == i:
                temp = temp ** 1
                temp_list.append(temp)
                temp = 0
            elif 'D' == i:
                temp = temp ** 2
                temp_list.append(temp)
                temp = 0
            elif 'T' == i:
                temp = temp ** 3
                temp_list.append(temp)
                temp = 0
            elif '*' == i:
                if len(temp_list) > 1:
                    temp_list[-2] = temp_list[-2] * 2
                    temp_list[-1] = temp_list[-1] * 2
                else:
                    temp_list[-1] = temp_list[-1] * 2
            elif '#'== i:
                 temp_list[-1] = temp_list[-1] * -1
    answer = sum(temp_list)
    return answer