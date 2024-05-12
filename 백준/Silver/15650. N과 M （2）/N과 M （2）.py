from itertools import combinations

n, m = map(int, input().split())
n_list = [i + 1 for i in range(n)]
temp_list = combinations(n_list, m)
for i in temp_list:
    for j in i:
        print(j, end=" ")
    print()
