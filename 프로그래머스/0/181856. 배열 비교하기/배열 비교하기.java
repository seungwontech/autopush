class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr1.length; i++) {
            a += arr1[i];
        }
        
        for (int i = 0; i < arr2.length; i++) {
            b += arr2[i];
        }
        
        if (arr1.length > arr2.length || (arr1.length == arr2.length && a > b)) {
            answer = 1;
        } else if (arr1.length < arr2.length || (arr1.length == arr2.length && a < b)) {
            answer = -1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}