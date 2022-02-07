public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int cp=0,sp=0,profit=0;
        cp=prices[0];
        for(int i=1;i<prices.length;i++){
           sp=prices[i];
           if(sp>cp)
               profit=Math.max(profit,sp-cp);
           else
               cp=sp;
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock ob=new BestTimeToBuyAndSellStock();
        int[] prices={7,1,5,3,6,4};
        System.out.println(ob.maxProfit(prices));
    }
}
