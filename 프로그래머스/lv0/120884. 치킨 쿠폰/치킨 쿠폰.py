def solution(chicken):
    cnt = 0
    rest = 0
    restChiCken = chicken
    while chicken:
        chicken = restChiCken // 10
        rest = restChiCken % 10
        cnt += chicken
        restChiCken = chicken + rest

    return cnt