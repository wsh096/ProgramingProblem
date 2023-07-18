import sys

N = int(sys.stdin.readline().strip())
sys.stdin.readline().strip()
cnt = 0
char_set = set()
for i in range(1,N):
    temp = sys.stdin.readline().strip()
    if temp == "ENTER":
        cnt += len(char_set)
        char_set.clear()
    else:
        char_set.add(temp)
    if i == N-1:
        cnt += len(char_set)
print(cnt)