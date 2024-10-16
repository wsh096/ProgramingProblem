#include <string>
#include <vector>


using namespace std;
string intToBinaryString(int n){
    string binary;
    while(n > 0){
        binary += (n % 2 == 0) ? "0" : "1";
        n /= 2;
    }
    return binary;
}
vector<int> solution(string s) {
    int deletecnt = 0;
    int processcnt = 0;
    while(s != "1"){
        int cnt = 0;
        for(int i = 0; i < s.size(); i++){
            s[i] == '0' ? deletecnt++ : cnt++;
        }
        s = intToBinaryString(cnt);
        processcnt++;
    }
    return {processcnt, deletecnt};
}