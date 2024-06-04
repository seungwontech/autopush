import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Object> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], 0);
        }
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                if(map.containsKey(number.substring(0, i))){
                    answer = false;
                    break;
                }
            }    
        }
        
        return answer;
    }
}