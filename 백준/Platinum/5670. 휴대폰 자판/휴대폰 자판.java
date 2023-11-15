import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static class Node {
		Node[] child = new Node[26];
		int cNodeCnt = 0; // 자식 노드 카운트
		int cWordCnt = 0; // 자식으로 들어간 단어 카운트
	}

	static class Trie {
		Node root;

		public Trie() {
			super();
			this.root = new Node();
			this.root.cNodeCnt = 1; // 맨 첫번째 알파벳은 무조건 입력
		}

		void insert(String str) {
			Node node = root;

			int len = str.length();
			int idx;
			for (int i = 0; i < len; i++) {
				idx = str.charAt(i) - 'a';
				if (node.child[idx] == null) {
					if(node.cNodeCnt == 1) { // 갈림길이 처음 만들어 졌다면
						cnt += node.cWordCnt; // 이전 한 갈래에 들어간 단어들 입력 카운트
					}
					node.child[idx] = new Node();
					node.cNodeCnt++;
				}
				if(node.cNodeCnt > 1) { // 여러 갈래라면
					cnt++;
				}
				node.cWordCnt++;
				node = node.child[idx];
			}
			// 종료하는 분기점도 하나의 갈림길
			if (node.cNodeCnt == 1) { // 갈림길이 처음 만들어 졌다면
				cnt += node.cWordCnt;
			}
			node.cNodeCnt+=2; // 해당 분기점이 입력되야 하는 노드로 분류되지 않도록
			node.cWordCnt++;
		}

	}

	static int cnt = 0; // 검색할 때 입력해야 하는 총 횟수

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String input;
		int N;
		double avg;
		while ((input = bf.readLine()) != null && input.length() != 0) {
			// 초기화
			cnt = 0;

			N = Integer.parseInt(input);
			Trie trie = new Trie();
			for (int i = 0; i < N; i++) {
				trie.insert(bf.readLine());
			}
			avg = 1.0 * cnt / N;
			sb.append(String.format("%.2f", avg)).append('\n');
		}
		System.out.println(sb);
	}
}