public class PrimeFactors {
    public static void main(String[] args) {
        computePrimeFactors(17);
    }
    public static void computePrimeFactors(int x) {
        //TODO Add your implementation here
        int a = x;
        int b = x;
        if(isPrime(x)){
            a = a-1;
        }

        while(a!=0){
            if(isPrime(a)){
                System.out.println(a);

                a = b-a;
                b = a;
            }
            else{
                a = a-1;
            }
        }
        return;
    }

    public static boolean isPrime(int n) {

        if(n<=0){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }

        }

        return true;
    }
}