n = int(input())
num_list = list(map(int, input().split()))
max_score = max(num_list)

count = 0
for i in num_list:
    count += i / max_score * 100

print(count / n)
