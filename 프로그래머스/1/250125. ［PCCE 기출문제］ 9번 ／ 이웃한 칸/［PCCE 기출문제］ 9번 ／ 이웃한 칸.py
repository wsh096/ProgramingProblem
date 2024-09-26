def solution(board, h, w):
    answer = 0
    dx = [0, 1 , 0, -1]
    dy = [1, 0, -1, 0]
    for i in range(4):
        h_check = h + dx[i]
        w_check = w + dy[i]
        if(h_check < 0 or h_check >= len(board) or w_check < 0 or w_check >= len(board[0])):
            continue
        elif(board[h_check][w_check] == board[h][w]):
            answer += 1
            
    return answer