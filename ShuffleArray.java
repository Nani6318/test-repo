import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};
		Random r=new Random();
		for(int i=0;i<nums.length;i++) {
			int randomindex=r.nextInt(nums.length);
			int temp=nums[randomindex];
			nums[randomindex]=nums[i];
			nums[i]=temp;
		}
		for(int t:nums) {
			System.out.println(t);
		}
		//System.out.println(Arrays.toString(nums));
	}
}
