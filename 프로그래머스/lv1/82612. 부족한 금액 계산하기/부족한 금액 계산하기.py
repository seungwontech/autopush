def solution(price, money, count):
    temp = 0
    answer = 0
    for i in range(1, count + 1):
        temp += price * i
        
    if temp > money:
        answer = temp - money
    return answer