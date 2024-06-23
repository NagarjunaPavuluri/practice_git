import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode3sum {
    public static void main(String []args){
        List<List<Integer>>l=new ArrayList<>();
        int []nums = {-1,-1,1,2,-1,-4};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }
                else{
                    l.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        System.out.println(l);
    }
}
