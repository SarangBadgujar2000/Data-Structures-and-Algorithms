import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double a=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
            arr.add(nums2[j]);
        }
         for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        Collections.sort(arr);
        
        if(arr.size()%2==0){
            //double x = (double) arr.get(arr.size()/2);
            //double y = (double) arr.get(arr.size()/2-1);
            a =(double)( arr.get(arr.size()/2) + arr.get(arr.size()/2-1) )/2;
                     
        }
        else{
            a=arr.get(arr.size()/2);
        }
        return a;
    }
}