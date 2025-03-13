public class Array{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        array[2] = 10;
        System.out.println("\nUpdated array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
