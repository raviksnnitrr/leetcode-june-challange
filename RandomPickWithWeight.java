class RandomPickWithWeight {
    private int[] sum;
    public Solution(int[] w) {
        sum=new int[w.length];
        sum[0]=w[0];
        for(int i=1;i<w.length;i++){
            sum[i]=sum[i-1]+w[i];
        }
    }
    
    public int pickIndex() {
        Random rand=new Random();
        int target=rand.nextInt(sum[sum.length-1]);
        for(int i=0;i<sum.length;i++){
            if(target<sum[i])
                return i;
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
