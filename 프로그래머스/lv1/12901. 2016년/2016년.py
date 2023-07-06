def solution(a, b):
    days = [31,29,31,30,31,30,31,31,30,31,30,31]
    weeks = ['FRI',"SAT",'SUN','MON',"TUE",'WED','THU']
    answer = ''
    day = 0
    for i in range(a - 1):
        day += days[i]
    day += (b - 1)
    answer = weeks[day % 7]
    return answer