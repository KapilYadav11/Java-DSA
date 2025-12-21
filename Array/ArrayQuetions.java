import java.util.*;
public class ArrayQuetions {
    public static int trappedRainWater(int height[]){
         // this is the problem based on the rain trapped water , and  the logic used in this problem used is much useful , so we can solve more related problem like this 
         // step 1. to calculate the left max boundary - array
         // iss wale m hum aage se back side ko chala rahe hai, aur left max value  ko dal rahe hai
         int n = height.length;
         int leftMax[] = new int[n];
         leftMax[0] = height[0];
         for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
         }

         // step 2. to calculate right max boundary - array
         // iss wale hum back side se aage ki side chal rahe hai , aur right side se jo hum max value mil rahi hai unko dalte ja rahe hai aapne array k aandar
         int rightMax[] = new int[n];
         rightMax[n-1] = height[n-1];
         for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
         }



         // ab hum loop chalayenge taaki hum trapped water nikal sake
         int trappedWater = 0;
         //loop
         for(int i = 0; i<n; i++){
            //waterlevel = min(leftmax bound , rightmax bound) , matlab dono ka minimun jo value hoga vo le lenge ab hum
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterl level - height[i] , matlab jo bhi water level hoga usme se height ko minus kr denge
            trappedWater += waterLevel - height[i];
         }

         return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5}; 
        System.out.println(trappedRainWater(height));
    }
    
}
