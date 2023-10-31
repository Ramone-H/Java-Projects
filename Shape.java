import java.util.Scanner;
public class Shape {
    public void rectangularArea(){
    System.out.println("");
    System.out.println("");
    Scanner input = new Scanner(System.in);
    System.out.println("");
    System.out.println("");
    System.out.println("Please to enter the length in Meters");
    System.out.println("");
    System.out.println("");
    int rectangularLength = input.nextInt();
    System.out.println("");
    System.out.println("");
    System.out.println("Please to enter the Width in Meters");
    System.out.println("");
    System.out.println("");
    int rectangularWidth = input.nextInt();
    int rectanguleArea= rectangularLength * rectangularWidth;
    System.out.println("");
    System.out.println("");
    System.out.println("The area of the rectangle is:  " + rectanguleArea + " squared meter" );
    System.out.println("");
    System.out.println("");
    }
    public void triangleArea(){
        System.out.println("");
        System.out.println("");
        Scanner enter = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Please to enter the base in Meters");
        System.out.println("");
        System.out.println("");
        int triangularBase = enter.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.println("Please to enter the height in Meters");
        System.out.println("");
        System.out.println("");
        int triangularHeight = enter.nextInt();
        double triangularArea= triangularBase * triangularHeight * 0.5;
        System.out.println("");
        System.out.println("");
        System.out.println("The area of the rectangle is:  " + triangularArea  + " squared meter" );
        System.out.println("");
        System.out.println("");
        }
        public void squareArea(){
            System.out.println("");
            System.out.println("");
            Scanner in = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
            System.out.println("Please to enter the length in Meters");
            System.out.println("");
            System.out.println("");
            int squareLength = in.nextInt();
            System.out.println("");
            System.out.println("");
            int squaredArea= squareLength * squareLength;
            System.out.println("");
            System.out.println("");
            System.out.println("The area of the square is:  " + squaredArea + " squared meter" );
            System.out.println("");
            System.out.println("");
        }
    
        public static void main (String[] args){
            System.out.println("");
            System.out.println("");
            Scanner put = new Scanner(System.in);
            Shape rectangle = new Shape();
            Shape triangle = new Shape();
            Shape square = new Shape();
            System.out.println("");
            System.out.println("");
            System.out.println("Choose 1: Area of rectangle   Choose 2: Area of triangle  Choose 3: Area of square");
            System.out.println("");
            System.out.println("");
            System.out.println("Please to choose a shape that you would like to find the area of!");
            System.out.println("");
            System.out.println("");
            int choose = put.nextInt();
            System.out.println("");
            System.out.println("");
            switch (choose){
            case 1:
            rectangle.rectangularArea();
            break;
            case 2:
            triangle.triangleArea();
            break;
            case 3:
            square.squareArea();
            break;
            default:
            System.out.println("");
            System.out.println("");
            System.out.println("Invalid output");
            System.out.println("");
            System.out.println("");


            }



        }

}
