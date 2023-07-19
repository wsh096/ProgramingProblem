N = int(input())

set = set()
set.add("ChongChong")

for _ in range(N):
    A, B = input().split()
    if A in set:
        set.add(B)
    elif B in set:
        set.add(A)
print(len(set))