import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreateDatabase cd=new CreateDatabase();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number of your choice from 1 to =");
        int n=sc.nextInt();
        switch (n){
            //For creating database
            case 1:
                cd.createdb();
                break;

        }
    }
}