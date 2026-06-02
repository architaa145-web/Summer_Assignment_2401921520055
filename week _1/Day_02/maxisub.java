public class maxisub {
    public static void main(String[] args) {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};

        maxisub obj = new maxisub();
        obj.helper(a);
    }

    int maxi = 0;
    int r = 0;
    int sum = 0;

    public void helper(int[] ar) {
        while (r < ar.length) {
            sum = sum + ar[r];
            maxi = Math.max(maxi, sum);
            if(sum<0){
                sum=0;
            }
            r++;
        }
        System.out.println(maxi);
    }
}
