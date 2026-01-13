public class Reverse {
    
public static void reverse(int num[]){
     int start = 0, end = num.length-1;

     while (start < end ){
        int temp = num[end];
        num[end] = num[start];
        num[start] = temp;

        start ++;
        end--;
     }
}

public static void main(String[] args) {
        int num[] = {5,6,3,4,9,10};

           reverse(num);
        System.out.print("Array is reversed: ");
        for(int i=0; i<num.length; i++){
            System.out.print( num[i]+" ");
        }
     
    }


    
}
