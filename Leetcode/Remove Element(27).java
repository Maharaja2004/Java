class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length;i++) {
				if(nums[i]==val) {
					nums[i]=-111;
				}
		}
        for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==-111) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
        int k=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=-111) {
				k++;
			}
		}
        return k;
    }
}
