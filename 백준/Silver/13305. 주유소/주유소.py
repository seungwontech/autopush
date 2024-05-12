n = int(input())
distance_list = list(map(int, input().split()))  # 거리
fare_list = list(map(int, input().split()))  # 요금

tot_fare = 0 # 총 요금
left_fare = fare_list[0] # 맨왼쪽
for i in range(len(distance_list)):
    if left_fare > fare_list[i]:
        left_fare = fare_list[i]
    tot_fare += left_fare * distance_list[i]
print(tot_fare)
