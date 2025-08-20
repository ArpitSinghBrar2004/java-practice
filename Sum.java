import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        System.out.println("enter 1st number: ");
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        System.out.println("enter 2nd number: ");
        int a = input.nextInt();
        int Sum = a + b ;
        System.out.print(Sum);
        input.close();
        
    }
    
}
