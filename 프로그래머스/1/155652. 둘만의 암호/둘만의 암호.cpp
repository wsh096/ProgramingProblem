#include <string>
#include <vector>

using namespace std;
bool word[26];
string solution(string s, string skip, int index) {

    for(int i = 0; i < skip.size(); i++){
        word[skip[i] - 'a'] = true;
    }
    
    for(int i = 0; i < s.size(); i++){
        int j = 0;
        while(j < index){  
           s[i]++;
           j++;
            while(word[s[i] - 'a']){
                if(s[i] - 'a' > 25){
                s[i] -= 26;
                }
                s[i]++;
            }
            if(s[i] - 'a' > 25){
                s[i] -= 26;
                while(word[s[i]-'a']){
                    s[i]++;
                } 
            }
        }
    }

    return s;
}