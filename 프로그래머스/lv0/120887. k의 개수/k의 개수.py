def solution(i, j, k):
    answer = 0
    for i in range(i, j + 1, 1):
        for j in list(map(int, str(i))):
            if j == k:
                answer += 1
    return answer

