import math
def solution(progresses, speeds):
    answer = []
    dateList = []
    dateValue = 0
    for i in range(0, len(progresses), 1):
        dateValue = (100-progresses[i])/speeds[i]
        dateList.append(math.ceil(dateValue))
    
    cnt = 1
    temp = dateList[0]
    for i in range(1, len(dateList), 1):
        if temp >= dateList[i]:
            cnt = cnt + 1
        else:
            answer.append(cnt)
            temp = dateList[i]
            cnt = 1            
    answer.append(cnt)
    return answer