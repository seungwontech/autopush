s = int(input())
sum_count = 0
count = 1
while sum_count < s:
    sum_count += count
    if sum_count > s:
        break
    count += 1
print(count - 1)
