def solution(board, moves):
    answer = 0
    result_list = []
    board_list = []
    result_moves = []
    index = 0
    for i in range(len(board)):
        board_list = []
        for j in range(len(board[i])):
            board_list.append(board[j][index])
        result_list.append(board_list)
        index += 1
    for i in moves:
        a = result_list[i - 1]
        for j in range(len(a)):
            if a[j] > 0:
                result_moves.append(a[j])
                a.insert(j, 0)
                a.remove(a[j + 1])
                break
    b = 0
    while b != len(result_moves) - 1:
        if len(result_moves) > 0:
            if result_moves[b] == result_moves[b + 1]:
                del (result_moves[b])
                del (result_moves[b])
                answer += 2
                b = 0
            else:
                b += 1
        else:
            break        
    return answer