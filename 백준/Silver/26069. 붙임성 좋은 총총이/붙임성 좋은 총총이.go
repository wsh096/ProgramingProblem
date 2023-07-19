package main

import (
    "bufio"
    "fmt"
    "os"
    "strings"
)
func main(){
    reader := bufio.NewReader(os.Stdin)
    var N int
    fmt.Scanf("%d", &N)
    set := make(map[string]bool)
    set["ChongChong"] = true
    
    for i := 0; i < N; i++ {
        record, _ := reader.ReadString('\n')
        record = strings.TrimSpace(record)
        people := strings.Split(record, " ")
        A := people[0]
        B := people[1]
        
        if set[A]{
            set[B] = true
        }else if set[B]{
            set[A] = true
        }
    }
    fmt.Println(len(set))
}