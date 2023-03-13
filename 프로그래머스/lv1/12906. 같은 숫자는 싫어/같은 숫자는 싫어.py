def solution(arr):
    answer = []
    sameNum = -1
    for i in arr:
        if sameNum != i:
            sameNum = i
            answer.append(i)
    return answer
            
        
        
            
        
            
    return answer