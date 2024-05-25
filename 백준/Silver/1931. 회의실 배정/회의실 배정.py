n = int(input())
i_list = []
for i in range(n):
    i_list.append(list(map(int, input().split())))

i_list.sort(key=lambda x: (x[1], x[0]))
count = 1
value = i_list[0][1]
for i in range(1, n):
    if i_list[i][0] >= value:
        value = i_list[i][1]
        count += 1

print(count)
