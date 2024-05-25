rows = 9
cols = 9
arr = [[0 for j in range(cols)] for i in range(rows)]

num_list = []
for i in range(cols):
    num_list = input().split()
    for j in range(rows):
        arr[i][j] = num_list[j]

temp_value = 0
row_value = 0
col_value = 0
for i in range(rows):
    for j in range(cols):
        if int(temp_value) <= int(arr[i][j]):
            temp_value = int(arr[i][j])
            row_value = i + 1
            col_value = j + 1

print(int(temp_value))
print(int(row_value), int(col_value))
