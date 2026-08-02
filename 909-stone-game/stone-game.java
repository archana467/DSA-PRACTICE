class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        boolean flag =true;
//     int ti=0;
//     int tj=0;
//     for(int i =0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             ti+=piles[i];
//             tj+=piles[j];
//         }

//     }
//     if(ti>=tj){
//  return true;
//     }
   
//     else{
//     return false;
//     }
//2nd logic
int st=0;
int last =n-1;
int al=0;
int bob =0;
while(st<last){
    if(flag==true){

    if(piles[st]<=piles[last]){
        al+=piles[last];
        last--;
    }
    else{
        al+=piles[st];
        st++;
    }
    }
    else{
    if(piles[st]<=piles[last]){
        bob+=piles[last];
        last--;
    }
    else{
        bob+=piles[st];
        st++;
    }
    }
    }
    if(al>bob){
        return true;
    }
    else{
        return false;
    }
}

    }
