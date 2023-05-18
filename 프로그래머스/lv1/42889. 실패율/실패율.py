def solution(N, stages):
    answer = []
    temp = dict()
    tot = len(stages)
    stages_cnt = 0
    for i in range(1, N + 1):
        if stages.count(i) == 0:
            temp[i] = 0
            continue
        else:
            stages_cnt = stages.count(i)
            temp[i] = stages_cnt/tot
        tot -= stages_cnt
    sorted_dict = sorted(temp.items(), key = lambda item: item[1], reverse = True)
    for i in sorted_dict:
        for j in range(len(i) - 1):
            answer.append(i[0])
            
    return answer