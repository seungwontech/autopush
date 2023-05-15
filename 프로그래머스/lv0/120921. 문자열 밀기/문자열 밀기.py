def solution(A, B):
    answer = -1
    if A == B:
        answer = 0
    else:
        k = True
        a = [ i for i in A]
        b = [ i for i in B]
        cnt = 0
        for i in range(len(A)):
            a.insert(0, a.pop(len(A) - 1))
            cnt += 1
            if a == b:
                answer = cnt
                break
    return answer