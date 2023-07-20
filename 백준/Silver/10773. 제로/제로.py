import sys
input = sys.stdin.readline
N = int(input())
stk = []

for i in range(N):
    n = int(input())
    if n == 0:
        stk.pop()
    else:
        stk.append(n)

print(sum(stk))