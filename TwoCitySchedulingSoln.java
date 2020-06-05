class TwoCitySchedulingSoln {
    public int twoCitySchedCost(int[][] costs) {
        int len=costs.length;
        int total=0;
        int[] refund=new int[len];
        for(int i=0;i<len;i++){
            total+=costs[i][0];
        }
        for(int i=0;i<len;i++){
            refund[i]=costs[i][1]-costs[i][0];
        }
        Arrays.sort(refund);
        int sum=total;
        for(int i=0;i<len/2;i++){
            sum+=refund[i];
        }
        return sum;
    }
}
