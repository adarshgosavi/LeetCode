class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        boolean[] arr = new boolean[str1.length];

        int n = str1.length;
        int m = str2.length;

        int i = 0;
        int j = 0;

        while(i < n && j < m ){
            if(str1[i] == str2[j]){
                arr[i] = true;
                i++;
                j++;
            }else{
                j++;
            }
        }

        for(int k = 0; k < n; k++){
            if(!arr[k]){
                return false;
            }
        }
        return true;
    }
}