import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreateDatabase cd=new CreateDatabase();
        CreateTable ct=new CreateTable();
        Contact con=new Contact();
        EditContact ed=new EditContact();
        DeleteContact del=new DeleteContact();
        RetrieveByCityOrState ret=new RetrieveByCityOrState();
        GetSizeByCityOrState get=new GetSizeByCityOrState();
        RetrieveSortedAlphabetically alpha=new RetrieveSortedAlphabetically();
        AddType_Name type=new AddType_Name();
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
            //UC5 Delete
            case 5:
                del.delete();
                break;
            //UC6 Retrieving the data by city and state
            case 6:
                ret.retrieve();
                break;
            //UC7 Get Size By City or State
            case 7:
                get.getSize();
                break;
            //UC8 Retrieve sorted Alphabetically
            case 8:
                alpha.sortAlphabet();
                break;
            //UC9 Adding Name and type in address Book
            case 9:
                type.add();
                break;
    }
    }
}