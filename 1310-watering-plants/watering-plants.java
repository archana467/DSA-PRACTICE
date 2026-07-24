class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int steps=0;
        int water=capacity;
        for(int i=0;i<n;i++){
            if(water<plants[i]){
                steps+=2*i;
                water=capacity;
            }
            steps++;
            water-=plants[i];


        }
        return steps;
    }
}