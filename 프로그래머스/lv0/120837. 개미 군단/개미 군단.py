def solution(hp):
    answer = 0
    a = 5
    b = 3
    c = 1
    answer = hp // a
    hp = hp % a
    answer += hp // b
    hp = hp % b
    answer += hp // c
    hp = hp % c
    return answer