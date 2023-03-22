def solution(my_string):
    list = ['a','e','i','o','u']
    for i in list:
        findValue = my_string.find(i)
        if findValue > -1:
            my_string = my_string.replace(i, '')
    return my_string