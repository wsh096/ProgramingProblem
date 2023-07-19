package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter((os.Stdout))
	defer writer.Flush()

	// 1 <= N <= 100,000, 1 <= M <= 10
	var n, m int
	fmt.Fscanln(reader, &n, &m)

	// 일단 map 에 저장
	dict := make(map[string]int)

	for i := 0; i < n; i++ {
		var word string
		fmt.Fscanln(reader, &word)

		if len(word) >= m {
			dict[word]++
		}
	}

	type Word struct {
		word string
		count int
	}

	// slice 에 복사
	word_list := []Word{}
	for key, value := range dict {
		word_list = append(word_list, Word{key, value,})
	}

	// 적당한 조건으로 sort
	sort.Slice(word_list, func(i, j int) bool {
		if word_list[i].count == word_list[j].count {
			if len(word_list[i].word) == len(word_list[j].word) {
				return word_list[i].word < word_list[j].word
			}
			return len(word_list[i].word) > len(word_list[j].word)
		}
		return word_list[i].count > word_list[j].count
	})

	// 결과 출력
	for _, word := range word_list {
		fmt.Fprintf(writer, "%s\n", word.word)
	}
}
