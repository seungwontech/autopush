def solution(bridge_length, weight, truck_weights):
    answer = 0
    temp = 0
    bridge_len_on = [0] * bridge_length
    while len(bridge_len_on):
        answer += 1
        temp -= bridge_len_on[0]
        bridge_len_on.pop(0)
        
        if truck_weights:
            if temp + truck_weights[0] <= weight:
                temp += truck_weights[0]
                bridge_len_on.append(truck_weights.pop(0))
            else:
                bridge_len_on.append(0)
        
    return answer