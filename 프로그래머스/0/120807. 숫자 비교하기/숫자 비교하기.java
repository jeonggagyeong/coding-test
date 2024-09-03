class Solution {
    public int solution(int num1, int num2) {
        
        int answer,num ;
        num = num1 - num2;
        if(num == 0){
            answer = 1;
        }else{
            answer = -1;
        }
        return answer;
    }
}