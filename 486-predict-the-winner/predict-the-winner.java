// class Solution {
//     public boolean predictTheWinner(int[] nums) {
//         int n =nums.length;
//         int st =0;
//         int last =0;
//         int p1=0;
//         int p2=0;
//         while(st<last){
//             if(nums[st]<=nums[last]){
//                 p1+=nums[last];
//                 last--;
//             }
//             else{
//                 p1+=nums[st];
//                 st++;
//             }
//            if(nums[st]<=nums[last]){
//                 p2+=nums[last];
//                 last--;
//             }
//             else{
//                 p2+=nums[st];
//                 st++;
//             }
//         }
//         if(p1>=p2){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }

// }

class Solution {
   public boolean predictTheWinner(int[] nums) {
    return canWin(nums,0,nums.length-1)>=0;
   }
   private int canWin(int []nums,int st,int last){
    if(st==last){
        return nums[st];

    }
    return Math.max(nums[st]-canWin(nums,st+1,last),nums[last]-canWin(nums,st,last-1));
   }
}