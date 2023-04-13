def solution(spell, dic):
    for i in dic:
        cnt = 0
        for j in spell:
            if i.find(j) > -1:
                cnt += 1
        if cnt == len(spell):
            return 1
    return 2