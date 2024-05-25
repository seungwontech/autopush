num_list = []
for i in range(5):
    num_list.append((int(input())))

k = len(num_list) // 2
num_list.sort()
print(sum(num_list) // len(num_list))
print(num_list[k])
