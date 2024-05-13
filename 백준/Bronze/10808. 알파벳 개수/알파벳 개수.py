s = input()
al_list = [0] * 26
for i in s:
    al_list[ord(i) - ord('a')] += 1
for i in al_list:
    print(i, end=' ')