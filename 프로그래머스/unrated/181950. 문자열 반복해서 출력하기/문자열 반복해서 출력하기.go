package main

import (
    "fmt"
    "strconv"
)

func main() {
    var s1 string
    var a string
    fmt.Scan(&s1, &a)
    var n int
    n,err := strconv.Atoi(a)
    if err != nil { return }
    for n > 0 {
        fmt.Print(s1)
        n--
                }
}