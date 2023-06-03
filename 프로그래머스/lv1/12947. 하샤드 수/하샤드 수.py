def solution(x):
    answer = True
    x_list = list(map(int, str(x)))
    if x % sum(x_list) != 0:
        answer = False
    return answer