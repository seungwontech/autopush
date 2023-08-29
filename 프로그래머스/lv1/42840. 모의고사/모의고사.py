def solution(answers):
    answer = []
    std1 = [1,2,3,4,5]
    std2 = [2,1,2,3,2,4,2,5]
    std3 = [3,3,1,1,2,2,4,4,5,5]
    scores = [0,0,0]
    
    for idx in range(len(answers)):
        if answers[idx] == std1[idx % 5]:
            scores[0] += 1
        if answers[idx] == std2[idx % 8]:
            scores[1] += 1
        if answers[idx] == std3[idx % 10]:
            scores[2] += 1
            
    for i in range(len(scores)):
        if scores[i] == max(scores):
            answer.append(i + 1)
        
    return answer