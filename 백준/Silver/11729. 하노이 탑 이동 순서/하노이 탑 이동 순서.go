package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func hanoi(n int, from byte, to byte, byteSlice *[]byte) {
	left := 150 - from - to
	if n == 1 {
		*byteSlice = append(*byteSlice, from, ' ', to, '\n')
		return
	}
	hanoi(n-1, from, left, byteSlice)
	*byteSlice = append(*byteSlice, from, ' ', to, '\n')
	hanoi(n-1, left, to, byteSlice)
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	text, _ := reader.ReadString('\n')
	split := strings.Fields(text)
	N, _ := strconv.Atoi(split[0])
	count := 1<<uint(N) - 1
	fmt.Println(count)
	result := make([]byte, 0, count*4)
	pt := &result
	hanoi(N, '1', '3', pt)
	fmt.Print(string(result))
}
