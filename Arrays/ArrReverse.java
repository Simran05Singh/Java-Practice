public class ArrReverse {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = new int[arr1.length];
        int j=0;
        for(int i=arr1.length-1 ; i>=0 ; i--){
            arr2[j] = arr1[i];
            j++;
        }
        System.out.println("Reversed Array:");
        for(int i=0 ; i<arr2.length ; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
