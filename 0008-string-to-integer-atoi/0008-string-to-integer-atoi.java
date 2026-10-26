// class Solution {
//     public int myAtoi(String s) {
// //       String r =s.trim();
// //       int num =Integer.parseInt(r);
// //     if(num>=Integer.MAX_VALUE){
// //         num=Integer.MAX_VALUE;
// //       }
// //     if(num<=Integer.MIN_VALUE){
// //         num=Integer.MIN_VALUE;
// //       }
// // if(num<0){
// //     return -num;
// // }

// // return num;
//     if(!Character.isDigit(s.charAt(0))){
//         return 0;
//     }
//     StringBuilder sb = new StringBuilder();
//     for(int i=0;i<s.length();i++){
//         char ch=s.charAt(i);
    
//     if(Character.isDigit(ch)){
//         sb.append(ch);
//     }
//     else{
//         break;
//     }
//     }
//     String m=sb.toString();
//     String r=m.trim();
//     int num =Integer.parseInt(r);
//     if(num>=Integer.MAX_VALUE){
//         num=Integer.MAX_VALUE;
//       }
//     if(num<=Integer.MIN_VALUE){
//         num=Integer.MIN_VALUE;
//       }
// if(num<0){
//     return -num;
// }
//    return num; 
  
//     }
//  }
 class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        // Constants for 32-bit signed integer range
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        
        int i = 0;
        int n = s.length();
        
        // Step 1: Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // Check if we've reached the end
        if (i == n) {
            return 0;
        }
        
        // Step 2: Check for sign
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        
        // Step 3: Read digits and convert
        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            
            if (sign * res <= INT_MIN) {
                return INT_MIN;
            }
            if (sign * res >= INT_MAX) {
                return INT_MAX;
            }
            
            i++;
        }
        
        // Step 4: Apply sign and return
        return (int)(res * sign);        
    }
}

