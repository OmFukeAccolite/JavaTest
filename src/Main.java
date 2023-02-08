import java.util.*;
public class Main {


    public static void main(String[] args) {

        // This File is only for testing


        int num = 8;
        List<Integer> prime = getPrimeNumbers(num);
        List<Integer> result = new ArrayList<>();
        int len = prime.size();
//        System.out.println(prime);
        getPrimeSum(100);

//        recursion(result,prime.size()-1,0,num,prime);

    }

    static void recursion(List<Integer> arr,int n,int sum,int num,List<Integer> prime){
        if(sum == num){
            System.out.println(arr);
            return;

        }
        if(sum>num){
            return;
        }
        if(n<0){
            return;
        }


        arr.add(prime.get(n));

        recursion(arr,n-1,sum+prime.get(n),num,prime);

        arr.remove(arr.size()-1);

        recursion(arr,n-1,sum,num,prime);

    }

    static List<Integer> getPrimeNumbers(int num){
        List<Integer> list = new ArrayList<>();

        boolean[] primeNumbers = new boolean[num+1];
        for(int i = 0;i<=num;i++){
            primeNumbers[i] = true;
        }

        for(int i = 2; i*i<=num;i++){
            if(primeNumbers[i] == true){

                for(int j= i*i;j<=num;j+=i){
                    primeNumbers[j] = false;
                }
            }


        }
        for(int i=1;i<=num;i++){
            if(primeNumbers[i] == true){
                list.add(i);

            }
        }


        return list;
    }


    public static void getPrimeSum(int n){
        int a = n;
        int b = n;
        if(isPrime(n)){
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