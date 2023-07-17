package main

import (
    "fmt"
    "strings"
)
func main(){
    var s1 string
    fmt.Scan(&s1)
    
    result := toggleCase(s1)
    fmt.Println(result)
}

func toggleCase(str string) string {
    var builder strings.Builder
    for _, char := range str {
        if char >= 'a' && char <= 'z' {
            builder.WriteRune(char - 'a' + 'A')
        }else if char >= 'A' && char <= 'Z'{
            builder.WriteRune(char - 'A' + 'a')
        }else{
            builder.WriteRune(char)
        }
    }
    return builder.String()
}