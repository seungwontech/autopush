def solution(lottos, win_nums):
    answer = []
    maxmin = []
    cnt = 0
    for nums in win_nums:
        if nums in lottos:
            cnt += 1
            lottos.remove(nums)
    maxmin.append(cnt + lottos.count(0))
    maxmin.append(cnt)
    for num in maxmin:
        if num == 6:
            answer.append(1)
        elif num == 5:
            answer.append(2)
        elif num == 4:
            answer.append(3)
        elif num == 3:
            answer.append(4)
        elif num == 2:
            answer.append(5)
        else:
            answer.append(6)
    return answer