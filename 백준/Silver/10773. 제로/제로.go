package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
)

type Stack struct {
    stack [100000] int 
    size int
}

func main(){
    s := bufio.NewScanner(os.Stdin)
    w := bufio.NewWriter(os.Stdout)
    stack := &Stack{}
    var tc, sum int
    
    if s.Scan() {
        tc, _ = strconv.Atoi(s.Text())
    }
    for i := 0; i < tc; i++ {
        var n int
        
        if s.Scan() {
            n, _ = strconv.Atoi(s.Text())
        }
        
        if n == 0 {
            Pop(stack)
        }else {
            Push(stack, n)
        }
    }
    for stack.size > 0 {
        sum += Pop(stack)
    }
    fmt.Fprintln(w, sum)
    w.Flush()
}

func Push(s *Stack, d int) {
    s.stack[s.size] = d
    s.size++
}

func Pop(s *Stack) int {
    var data int
    if s.size > 0 {
        s.size--
        data = s.stack[s.size]
    }
    return data
}