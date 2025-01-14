import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreateDatabase cd=new CreateDatabase();
        CreateTable ct=new CreateTable();
        Contact con=new Contact();
        EditContact ed=new EditContact();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number of your choice from 1 to =");
        int n=sc.nextInt();
        switch (n){
            //UC1 For creating database
            case 1:
                cd.createdb();
                break;
            //UC2 For creating table
            case 2:
                ct.createtable();
                break;
            //Uc3 Adding contact
            case 3:
                con.contact();
                break;
            //UC4 Editing Contact
            case 4:
                ed.edit();
                break;
    }
    }
}