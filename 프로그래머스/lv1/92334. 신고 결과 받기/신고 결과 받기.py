from collections import defaultdict
def solution(id_list, report, k):
    answer = []
    report = list(set(report))
    user = defaultdict(set)
    cnt = defaultdict(int)
    
    for i in report:
        val0, val1 = i.split()
        user[val0].add(val1)
        cnt[val1] += 1

    for i in id_list:
        result = 0
        for j in user[i]:
            if cnt[j] >= k:
                result += 1
        answer.append(result)
    return answer