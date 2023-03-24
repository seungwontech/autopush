def solution(numbers):
    answer = 0
    temp = numbers[0] * numbers[1]
    for i in numbers:
        for j in numbers:
            if i != j:
                answer = i * j
                if temp < answer:
                    temp = answer
    return temp