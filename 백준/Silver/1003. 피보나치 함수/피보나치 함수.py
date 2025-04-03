import sys

t = int(sys.stdin.readline())
dp = [1] * 42

dp[0] = 0
dp[1] = 1

for i in range(2,41):
    dp[i] = dp[i-2] +dp[i-1]
    
for _ in range(t):
    n = int(sys.stdin.readline())
    
    print(dp[n-1],dp[n])