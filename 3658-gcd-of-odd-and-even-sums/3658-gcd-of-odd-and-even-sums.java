class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n+1);
        while(sumEven>0)
        {
            if(sumEven==0)
                return sumOdd;
            int temp= sumEven;
            sumEven= sumOdd % sumEven;
            sumOdd= temp;

        }
        return sumOdd; 
    }
}