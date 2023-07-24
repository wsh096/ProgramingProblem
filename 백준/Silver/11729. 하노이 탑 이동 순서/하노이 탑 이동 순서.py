MSG_FORMAT = "{} {}"

def main():
    a = int(input())
    print((1<<a)-1)
    hanoi(a, 1, 3)  

def hanoi(N, start, end):
    middle = 6 - start - end
    if N == 1:
        print(MSG_FORMAT.format(start, end))
        return
    if N >= 2:
       hanoi(N-1, start, middle)
       hanoi(1, start, end)
       hanoi(N-1, middle, end)

if __name__ == "__main__":
     main() 