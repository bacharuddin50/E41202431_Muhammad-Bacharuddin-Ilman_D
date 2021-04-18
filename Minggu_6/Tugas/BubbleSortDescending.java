package bubble.sort.descending;

public class BubbleSortDescending {

    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 4, 5};
        printArray(grades);
        System.out.println();
        bubbleSort(grades);
    }
    public static void bubbleSort(int[] a){
        int n = a.length;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j] < a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            printArray(a);
            System.out.println();
        }
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
