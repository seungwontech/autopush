def solution(phone_book):
    answer = True
    phone_book_srtd = sorted(phone_book)
    for i, j in zip(phone_book_srtd, phone_book_srtd[1:]):
        if j.startswith(i):
            answer = False
    return answer