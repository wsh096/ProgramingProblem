function solution(n) {
    var answer = n;
    for(var i = 1; i <= parseInt(n / 2); i++){
        if(n % i == 0) answer += i;
    }
    return answer;
}