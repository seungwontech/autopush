def solution(cipher, code):
    answer = ''
    cipher_list = [i for i in cipher]
    for i in range(code - 1, len(cipher_list), code):
        answer += cipher[i]
    return answer