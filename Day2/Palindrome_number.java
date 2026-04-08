class Solution {
    public boolean isPalindrome(int x) {
        int original =x;
        int rev=0;
        while(x!=0){
            int digit=x%10;
            rev=(rev*10) +digit;
            if(x<0){
                return false;
            }
            x= x/10;
        }
        if(original==rev){
            return true;
        }
        return false;
    }
}
