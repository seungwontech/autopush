value = input().upper()

dis_list = list(set(value))
cnt_list =[]
for i in dis_list:
    cnt_list.append(value.count(i))

if cnt_list.count(max(cnt_list)) > 1:
    print('?')
else:
    print(dis_list[(cnt_list.index(max(cnt_list)))])
