num_list = []
for i in range(1, 29):
    num_list.append(int(input()))

for j in range(1, 31):
    if num_list.count(j) == 0:
        print(j)
