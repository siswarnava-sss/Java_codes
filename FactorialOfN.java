public class FactorialOfN {


    public int factorial(int n){


        if(n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {


        FactorialOfN factorial = new FactorialOfN();

        System.out.println(factorial.factorial(6));
    }
}
