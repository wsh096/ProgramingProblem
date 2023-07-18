package main

import (
    "bufio"
    "fmt"
    "os"
)
func main(){
    scanner := bufio.NewScanner(os.Stdin)
    scanner.Scan()
    var N int
    fmt.Sscanf(scanner.Text(), "%d", &N)
    scanner.Scan()
    cnt:=0
    set:=make(map[string]bool)
    for i:=1; i <N;i++{
        scanner.Scan()
        temp:=scanner.Text()
        if temp == "ENTER"{
            cnt += len(set)
            set = make(map[string]bool)
        }else{
            set[temp] = true
        }
        if i == N-1 {
            cnt+=len(set)
        }
    }
    fmt.Println(cnt)
}