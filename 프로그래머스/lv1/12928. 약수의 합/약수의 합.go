package main
import (
    "math"
)

func solution(n int) int {
    answer := 0
    max := int(math.Sqrt(float64(n)))
    for i := 1; i <= max; i++ { 
    if n % i == 0 {
        temp := n / i
        if temp != i {
            answer += i + temp 
        }else{
            answer += i
        }
    }
    }
    return answer
}