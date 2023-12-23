
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        //기준
        final int t = bandage[0];
        final int x = bandage[1];
        final int y = bandage[2];
        final int MAX_HEALTH = health;
      
        int currentTime = 0;
        int currentHealth = health;
       
        for(int[] attack : attacks){
            int attackTime = attack[0];
            int attackDamage = attack[1];
            int healTime = attackTime - currentTime - 1;
            int healPoint = 0;
            if(healTime >= t) {//Get Bonus
                healPoint += (healTime / t) * y;
            }
            //DefaultGetPoint
            healPoint += (healTime * x);
            
            //healthUpdate
            currentHealth = Math.min(currentHealth + healPoint, MAX_HEALTH);
            
            //DamageUpdate
            currentHealth -= attackDamage;
             //ifDie
            if(currentHealth <= 0) return -1;
            //currentTimeUpdate;
            currentTime = attackTime;           
        }

        return currentHealth;
    }
}