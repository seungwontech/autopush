c = int(input())
result = []
for _ in range(c):
    num_list = list(map(int, input().split()))
    avg = sum(num_list[1:]) / num_list[0]

    count = 0

    for i in num_list[1:]:
        if i > avg:
            count += 1

    result.append((count / num_list[0]) * 100)

for i in result:
    print('%.3f' % i + '%')
