def solution(numbers):
    answer = 0
    result = 0
    max_value = max(numbers)
    numbers.remove(max_value)
    for i in numbers:
        result = max_value * i
        print(result)
        if answer < result:
            answer = result
    
    return answer