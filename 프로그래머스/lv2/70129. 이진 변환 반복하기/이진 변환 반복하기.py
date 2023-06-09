def solution(s):
    answer = []
    cnt_0 = 0
    cnt_index = 0
    while int(s) > 1:
        cnt_0 += s.count('0')
        s_1 = ''.join(s.split('0'))
        s = format(len(s_1), 'b')
        cnt_index  += 1
    answer = [cnt_index, cnt_0]
    return answer