def solution(s, n):
    answer = ''
    
    for i in s:
        if i != ' ':
            ord_i = ord(i);
            if ord_i <= 90:
                ord_i = (ord_i - 65 + n) % 26
                answer += chr(ord_i + 65)
            else:
                ord_i = (ord_i - 97 + n) % 26
                answer += chr(ord_i + 97)
        else:
            answer += ' '
    return answer