func solution(arr []int) float64 {
    var result float64 = 0
    
    for _, val := range arr {
        result += float64(val)
    }
    b := result/float64(len(arr))
    return b
}