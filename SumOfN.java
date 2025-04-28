public class SumOfN {

    public int sum(int n){

        if(n == 0) return 0;

        return n+ sum(n-1);
    }

    public static void main(String[] args) {
        SumOfN s  = new SumOfN();

        System.out.println(s.sum(100));
    }
}
