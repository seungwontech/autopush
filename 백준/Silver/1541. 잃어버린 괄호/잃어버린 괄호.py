n = str(input())
a_list = n.split('-')
num_list = []
for i in a_list:
    k = i.split('+')
    cnt = 0
    for j in k:
        cnt += int(j)
    num_list.append(cnt)
num = num_list[0]
for i in range(1, len(num_list)):
    num -= num_list[i]
print(num)
