public class ShiftingArrayElements {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4, 5, 6, 7, 8, 1, 2, 3};
        System.out.println("Before shifting array elements");
        for (int k = 0; k < arr.length; ++k) {
            System.out.print(arr[k] + " ");
        }
        shiftArrayElements(n, arr);
    }

    static public void shiftArrayElements(int n, int arr[]) {
        int temp = 0;
        for (int i = 0; i < n; ++i) {
            temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; --j) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        System.out.println("\nAfter shifting array elements");
        for (int k = 0; k < arr.length; ++k) {
            System.out.print(arr[k] + " ");
        }
    }

}
