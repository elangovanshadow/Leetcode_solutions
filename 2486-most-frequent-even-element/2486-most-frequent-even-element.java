class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> dic = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                if(dic.get(nums[i])!=null){
                    int val = dic.get(nums[i]);
                    val++;
                    dic.put(nums[i],val);
                }
                else{
                    dic.put(nums[i],1);
                }
            }
            
        }
        int max=-1;
        int res = -1;
        ArrayList<Integer> ans=new ArrayList<>();

        for (Integer i : dic.keySet()) {
            if(dic.get(i)>=max){
                max=dic.get(i);
            }
        }
        for (Integer i : dic.keySet()) {
            if(dic.get(i) == max){
                ans.add(i);
            }
        }

        Collections.sort(ans);
        if (ans.size() > 0){
            return ans.get(0);
        }
        return -1;
    }
}