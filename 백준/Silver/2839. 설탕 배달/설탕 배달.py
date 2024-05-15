n = int(input())
bag = 0

if n % 5 == 0:
    print(n // 5)
else:
    while n > 0:
        n -= 3
        bag += 1
        if n == 1 or n == 2:
            print(-1)
        if n % 5 == 0:
            bag += n // 5
            print(bag)
            break
