def solution(priorities, location):
    queue = [(i,p) for i, p in enumerate(priorities)]
    answer = 0
    while True:
        temp = queue.pop(0)
        if any(temp[1] < q[1] for q in queue):
            queue.append(temp)
        else:
            answer += 1
            if temp[0] == location:
                return answer