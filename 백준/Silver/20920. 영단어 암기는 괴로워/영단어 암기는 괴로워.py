import sys
from collections import defaultdict
from operator import itemgetter

N, M = map(int, sys.stdin.readline().split())
words = defaultdict(int)
for _ in range(N):
    word = sys.stdin.readline().strip()
    if len(word) >= M:
        words[word] += 1
        
word_list = [(k,v) for k, v in words.items()]
word_list.sort(key=itemgetter(0))
word_list.sort(key=lambda x: len(x[0]), reverse=True)
word_list.sort(key=itemgetter(1),reverse=True)

for word, _ in word_list:
    print(word)