def solution(my_string):
    temp = []
    temp2 = ''
    for i in my_string:
        if i.isdigit():
            temp2 +=''.join(i)
            print(temp2)
        else:
            if temp2 !='':
                temp.append(int(temp2))
                temp2 =''
    if temp2 !='':
        temp.append(int(temp2))
    return sum(temp)