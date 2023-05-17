def solution(numbers):
    answer = []
    temp = -1
    number = numbers[0]
    result_set = set()
    for index_i, value_i in enumerate(numbers):
         for index_j, value_j in enumerate(numbers):
            if value_i != value_j and index_i != index_j:
                temp = value_i + value_j
            elif value_i == value_j and index_i != index_j:
                temp = value_i + value_j
            if temp != -1:
                result_set.add(temp)
    answer = list(result_set)
    return sorted(answer)