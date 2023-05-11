def solution(score):
    answer = []
    temp_score = []
    
    for i in score:
        temp_score.append(sum(i)/len(i))
    temp_score_sort = sorted(temp_score, reverse = True)

    for i in temp_score:
        answer.append(temp_score_sort.index(i) + 1)
    return answer