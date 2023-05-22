def solution(s):
    answer = True
    pcont = s.count('p')
    Pcont = s.count('P')
    ycont = s.count('y')
    Ycont = s.count('Y')
    if pcont + Pcont != ycont + Ycont:
        answer = False
    return answer