class CountsmallerNumber{
    
    public List<Integer> countSmaller(int[] nums) {
        LinkedList<Integer> result = new LinkedList<>();
         if(nums == null || nums.length == 0) return result;
         Map<Integer, Integer> map = new HashMap<>();
         int[] copy = Arrays.copyOf(nums, nums.length);
         Arrays.sort(nums);
         int count = 0;
         map.put(nums[nums.length - 1], count);
         for(int i = nums.length - 2; i >= 0; i--){
             if(nums[i] != nums[i + 1]){
                 map.put(nums[i], ++count);
             }
         }
         int[] freq = new int[count+1];
         for(int i = copy.length - 1; i >= 0; i--){
             freq[map.get(copy[i])]++;
             int appear = 0;
             for(int j = count; j > map.get(copy[i]); j--){
                 appear += freq[j];
             }
             result.addFirst(appear);
         }
         return result;        
    }
    
}