class Solution {
    public boolean isHappy(int n) {
        int count = 10;
        while (count > 0) {
            int sum = 0;
            while (n > 0) {
                int last = n % 10;
                sum += (last * last);
                n /= 10;
            }
            if (sum == 1)
                return true;
            n = sum;
            count--;
        }
        return false;
    }
}