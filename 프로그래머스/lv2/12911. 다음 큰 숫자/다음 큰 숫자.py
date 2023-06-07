def solution(n):
    answer = n
    n_format = format(n, 'b').count('1')
    
    while True:
        answer += 1
        a_format = format(answer, 'b').count('1')
        if n_format == a_format:
            break
    return answer