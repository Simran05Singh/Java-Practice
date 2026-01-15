public class Array_Prefix_Sum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            arr[i] = sum;
        }
        System.out.println("\nPrefix Sum Array:");
        for(int num : arr){ 
            System.out.print(num + " ");
        }
    }
}
