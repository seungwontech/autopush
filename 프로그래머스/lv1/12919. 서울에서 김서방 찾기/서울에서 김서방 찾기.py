def solution(seoul):
    answer = ''
    if 'Kim' in seoul:
        kimIdx = seoul.index('Kim')
        answer = f'김서방은 {kimIdx}에 있다'
    return answer