public class ReverseAnArray {


    public void reverse(int[] arr){

        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        ReverseAnArray reverseAnArray = new ReverseAnArray();

        reverseAnArray.reverse(arr);

        for(int i: arr){
            System.out.printf(" "+i);
        }
    }
}
