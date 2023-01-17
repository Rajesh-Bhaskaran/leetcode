class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int [] arr= new int[2];
        ArrayList al = new ArrayList();
        for(int a:nums){
            al.add(a);
        }
        for(int i=0;i<nums.length;i++){
            int check=target-nums[i];
            if(al.contains(check)&&i!=al.indexOf(check)){
                arr[0]=i;
                arr[1]=al.indexOf(check);
                return arr;
            }
            
        }
        return arr;
    }
}
