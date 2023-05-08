class Solution {
    public int solution(String binomial) {
        String[] input = binomial.split(" ");//백준느낌 한 가득...
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[2]);
        String op = input[1];
        return op.equals("+") ? A + B : op.equals("-") ? A - B : op.equals("*") ? A * B : A / B;
    }
}