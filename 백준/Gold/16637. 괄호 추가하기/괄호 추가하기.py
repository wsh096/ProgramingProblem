def solve(i, sums:int):
    global result
    if i >= N:
        result = max(sums, result)
        return
    
    solve(i + 2, op(sums, int(input_data[i]), input_data[i - 1]))

    if i + 2 < N:
        right = op(int(input_data[i]), int(input_data[i + 2]), input_data[i + 1])
        solve(i + 4, op(sums, right, input_data[i - 1]))

def op(i, j, oper):
    if oper == '+':
        return i + j
    elif oper == '-':
        return i - j
    else:
        return i * j

N = int(input()) 
input_data = input()
result = -100001 

solve(2, int(input_data[0]))

print(result)
