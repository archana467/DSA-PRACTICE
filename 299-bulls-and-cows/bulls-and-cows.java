class Solution {
    public String getHint(String secret, String guess) {
    ArrayList<Character> list=new ArrayList<>();
    ArrayList<Character> list1=new ArrayList<>();
    
    int bulls=0;
    int cows=0;
    for(int i=0;i<secret.length();i++){
        char s=secret.charAt(i);
        char g=guess.charAt(i);
        if(s==g){
            bulls++;
        }
        else{
            list.add(s);
            list1.add(g);
        }
    }
    for(char g:list1){
        if(list.contains(g)){
            cows++;
            list.remove(Character.valueOf(g));
        }
    }
    return bulls + "A" + cows + "B";
    }
}