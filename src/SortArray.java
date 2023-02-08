import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        Integer [] input = new Integer[] {2, 3, 4, 5};
        sortMyArray(input);

    }
    public static  void  sortMyArray(Integer [] input) {
        //TODO Add your implementation here
        Arrays.sort(input);
        Integer[] arr = new Integer[input.length];
        int a = 0;
        int b = 0;
        int i = 0;
        while(i< input.length){
            if(a<=b){
                arr[i] = input[i];
                a+=input[i];
            }
            else{
                arr[input.length-i] = input[i];
                b+=input[i];
            }
            i+=1;
        }
        for(Integer x:arr){
            System.out.println(x);
        }
        return;

    }
    }
