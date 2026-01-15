public class ArrayIntro {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 0; i<3 ; i++){
            System.out.println(arr[i]);
        }
        //can also declare it in another way
        int arrr[] = {1,2,3,4,5};
        for (int i=0 ; i<5 ; i++) {
            System.out.println(arrr[i]);
        }
    }
}
