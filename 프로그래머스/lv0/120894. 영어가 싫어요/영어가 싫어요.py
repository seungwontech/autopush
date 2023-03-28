def solution(numbers):
    answer = 0
    number_list = {"zero" : "0", "one" : "1", "two": "2"
                   , "three" : "3", "four" : "4", "five": "5", "six": "6"
                   , "seven" : "7", "eight" : "8", "nine": "9"}
    for key, value in number_list.items():
        numbers = numbers.replace(key, value)
    answer = int(numbers)
    return answer