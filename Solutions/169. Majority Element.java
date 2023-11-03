class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int maj=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                maj=nums[i];
            }
            if(maj==nums[i]) count++;
            else    count--; 
        }
        return maj;
    }
}
//         Map<Integer, Integer> map = new HashMap<>();

//         for(int num : nums){
//             map.put(num, map.getOrDefault(num,0)+1);
//             System.out.println("key:"+ num +" " + " value:"+map.get(num));

//             if(map.get(num) > nums.length/2){
//                 return num;
//             }
//         }
//         return-1;
//     }
// }        
        // int max=0;
        // int key1=0;;
        // HashMap<Integer, Integer> map = new HashMap<>(); //s.c O(N)
        // for(int i=0;i<nums.length;i++){                  //T.C. O(N)
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }else map.put(nums[i],1);
        // }
        // for(int i=0;i<nums.length;i++){                 //t.c. O(N)
        //     if(map.get(nums[i]) >max){
        //         max=map.get(nums[i]);
        //         key1=nums[i];
        //     }
        // }
        // return key1;
//     }
// }