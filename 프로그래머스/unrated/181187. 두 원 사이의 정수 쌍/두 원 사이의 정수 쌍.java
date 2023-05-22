public class Solution {
    public int solution(int r1, int r2) {
        int result = 0;
        
        // 두 원의 중심 사이의 거리 계산
        double distance = Math.sqrt(Math.pow(0, 2) + Math.pow(0, 2));
        
        // 두 원의 반지름 합과 차 계산
        int radiusSum = r1 + r2;
        int radiusDiff = r2 - r1;
        
        // 두 원이 겹치지 않는 경우
        if (distance > radiusSum) {
            result = 0;
        }
        // 한 원이 다른 원 안에 포함되는 경우
        else if (distance + r1 < r2) {
            result = 0;
        }
        // 두 원이 완전히 겹치는 경우
        else if (distance == 0 && r1 == r2) {
            result = -1;
        }
        // 두 원이 접하는 경우
        else if (distance == radiusSum || distance + r1 == r2) {
            result = 1;
        }
        // 두 원이 두 점에서 만나는 경우
        else {
            result = countIntegerPoints(distance, radiusDiff);
        }
        
        return result;
    }
    
    // 두 원 사이의 정수 좌표 개수 세기
    private int countIntegerPoints(double distance, int radiusDiff) {
        int count = 0;
        
        for (int x = 1; x < radiusDiff; x++) {
            int y = (int) Math.sqrt(radiusDiff * radiusDiff - x * x);
            
            if (y * y + x * x == radiusDiff * radiusDiff) {
                count += 4;
            }
        }
        
        return count;
    }
}