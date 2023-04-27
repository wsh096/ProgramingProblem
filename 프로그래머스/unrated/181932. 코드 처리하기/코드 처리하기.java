class Solution {
    public String solution(String code) {

        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i)=='1'){
                flag = !flag;
                continue;
            }
            if(flag && i % 2 == 0){
                sb.append(code.charAt(i));
            }else if(!flag && i % 2 == 1){
                sb.append(code.charAt(i));
            }
        }
        if(sb.length()==0) return "EMPTY";
        return sb.toString();
    }
}