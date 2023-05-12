from math import gcd
def solution(a, b):
    answer = 2
    b //= gcd(a,b)
    while b%2==0:
        b//=2  
    while b%5==0:
        b//=5 
    if b == 1:
        answer = b
    return answer