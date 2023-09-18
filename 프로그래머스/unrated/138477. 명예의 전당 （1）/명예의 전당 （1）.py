def solution(k, score):
    answer = []
    k_socre = []
    for i in score:
        k_socre.append(i)
        k_socre.sort(reverse=True)
        if len(k_socre) > k:
            del k_socre[-1]
        answer.append(k_socre[-1])
    return answer