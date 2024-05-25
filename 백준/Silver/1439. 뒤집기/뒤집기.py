s = input()
chg0 = 0
chg1 = 0

if s[0] == '0':
    chg1 += 1
else:
    chg0 += 1

for i in range(len(s) - 1):
    if s[i] != s[i + 1]:
        if s[i + 1] == '0':
            chg1 += 1
        else:
            chg0 += 1

print(min(chg0, chg1))
