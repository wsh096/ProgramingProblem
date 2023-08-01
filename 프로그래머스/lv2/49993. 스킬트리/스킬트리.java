// import java.util.HashMap;
// import java.util.Map;

// class Solution {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = 0;
//         Map<Character, Integer> map = new HashMap<>();

//         int idx = 0;
//         for (char c : skill.toCharArray()) {
//             map.put(c, idx++);
//         }

// loop:   for (String s : skill_trees) {
//             boolean visited[] = new boolean[map.size()];
//             for (int i = 0; i < s.length(); i++) {
//                 if (map.keySet().contains(s.charAt(i))) {
//                     for (int j = 1; j <= map.get(s.charAt(i)); j++) {
//                         if(visited[j-1] == false){
//                            continue loop;
//                         }
//                     }
//                     visited[map.get(s.charAt(i))] = true;
//                 }
//             }
//             answer++;
//         }
//         return answer;
    
//     }
// }

// import java.util.*;

// class Solution {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = 0;
//         ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
//         //ArrayList<String> skillTrees = new ArrayList<String>();
//         Iterator<String> it = skillTrees.iterator();

//         while (it.hasNext()) {
//             if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
//                 it.remove();
//             }
//         }
//         answer = skillTrees.size();
//         return answer;
//     }
// }

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        Set<Character> skillSet = new HashSet<>();
        for (char c : skill.toCharArray()) {
            skillSet.add(c);
        }

        for (String tree : skill_trees) {
            boolean isPossible = true;
            int index = 0;

            for (char c : tree.toCharArray()) {
                if (skillSet.contains(c)) {
                    if (c != skill.charAt(index)) {
                        isPossible = false;
                        break;
                    }
                    index++;
                }
            }

            if (isPossible) {
                answer++;
            }
        }

        return answer;
    }
}