public class table{
    public static void main(String args[]){
        int number =7;
        int limit =10;
        System.out.println("Multiplication table for"+ number);
        for(int i = 1; i<= limit; i++){
            System.out.println(number + " x " + i +" = " + (number * i));
        }
    }
}