def solution(age):
    alphabet = ['a','b','c','d','e','f','g','h','i','j']
    str_age = str(age)
    answer = ''
    for i in str_age:
        answer += alphabet[int(i)]
    return answer