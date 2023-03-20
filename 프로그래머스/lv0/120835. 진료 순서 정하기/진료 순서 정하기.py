def solution(emergency):
    sort_emergency = sorted(emergency, reverse=True)
    answer = []
    result = {}
    a = 1
    for i in sort_emergency:
        result[i] = a
        a += 1
        
    for i in emergency:
        answer.append(result.get(i))
    return answer