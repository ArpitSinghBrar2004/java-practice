import java.util.Scanner;
public class UserInput{
    public static void main(String[] args){
        System.out.print("what is your name : ");
        Scanner input= new Scanner(System.in);
        String name = input.nextLine();
        System.out.print(name);
        input.close();

    }
    
}