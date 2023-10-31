import java.util.Scanner;
public class Function {
    static void numberCheck() {
    Scanner enter= new Scanner(System.in);
    System.out.println("");
    System.out.println("");
    System.out.println("Please to enter a number!");
    System.out.println("");
    System.out.println("");
    int num = enter.nextInt();
    if (num > 0) {
        System.out.println("");
        System.out.println("");
        System.out.println("You have entered a positve value  " + num );
        System.out.println("");
        System.out.println("");
    }
    else if (num < 0){
        System.out.println("");
        System.out.println("");
        System.out.println("You have entered a negative value  " + num );
        System.out.println("");
        System.out.println("");
    }
    else if (num == 0){
        System.out.println("");
        System.out.println("");
        System.out.println("You have entered zero  " + num );
        System.out.println("");
        System.out.println("");
    }
    else {
        System.out.println("");
        System.out.println("");
        System.out.println("You have entered an invalid number!");
        System.out.println("");
        System.out.println("");
    }
    }
    static void gradeCheck (){
        Scanner put = new Scanner(System.in);
        String subject1 ="Mathematics";
        String subject2 ="English";
        String subject3 ="Accounts";
        String subject4 ="Information Technology";
        String subject5 ="Psycology";  
        System.out.println("");
        System.out.println("");
        System.out.println("Please to enter the grade you have received in Mathematics");
        System.out.println("");
        System.out.println("");
        int gradeMath= put.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Please to enter the grade you have received in English");
        System.out.println("");
        System.out.println("");
        int gradeEnglish= put.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Please to enter the grade you have received in Accounts");
        System.out.println("");
        System.out.println("");
        int gradeAccounts= put.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Please to enter the grade you have received in Information Technology");
        System.out.println("");
        System.out.println("");
        int gradeIT= put.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Please to enter the grade you have received in Psycology");
        System.out.println("");
        System.out.println("");
        int gradePsyche= put.nextInt();
        System.out.println("");
        System.out.println("");
        if (gradeMath>=50){
            System.out.println("You have received passing grade of "+ gradeMath +"% in Mathematics" );
            System.out.println("");
            System.out.println("");
        }
        if (gradeEnglish>=50){
            System.out.println("You have received passing grade of "+ gradeEnglish +"% in English" );
            System.out.println("");
            System.out.println("");
        }
        if (gradeAccounts>=50){
            System.out.println("You have received passing grade of "+ gradeAccounts +"% in Accounts" );
            System.out.println("");
            System.out.println("");
        }
        if (gradeIT>=50){
            System.out.println("You have received passing grade of "+ gradeIT +"% in Information Technology" );
            System.out.println("");
            System.out.println("");
        }
        if (gradePsyche>=50){
            System.out.println("You have received passing grade of "+ gradePsyche +"% in Psycology" );
            System.out.println("");
            System.out.println("");
        }

    }
    public static void main (String[] args){
        System.out.println("");
        System.out.println("");
        Scanner input= new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Option 1: Value Checker          Option 2: Grade Checker");
        System.out.println("");
        System.out.println("");
        int choice = input.nextInt();
        System.out.println("");
        System.out.println("");
        if (choice ==1){
            numberCheck();
        }
        else if (choice == 2){
            gradeCheck ();
        }
        else {
        System.out.println("");
        System.out.println("You have entered an invalid input!");
        System.out.println("");
        System.out.println("");
        }

    }
}
