import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to calculate the area of a square, rectangle, triangle, or parallelogram?");
        System.out.println("Enter 1 for square, 2 for rectangle, 3 for triangle, and 4 for parallelogram.");
        int selection = scan.nextInt();

        switch (selection){
            case 1: square();
            break;

            case 2: rectangle();
            break;

            case 3: triangle();
            break;

            case 4:
                parallelogram();
                break;

        }

    }
    private static void square(){
        System.out.println("The area of a square is calculated by length squared. or l^2.");

    }

    private static void rectangle(){
        System.out.println("the area of a rectangle is calculated by length time width. or l*w");
    }
    private static void triangle(){
        System.out.println("the area of a triangle is calculated by half of base time height. or (b*h)*.5");
    }
    private static void parallelogram(){
        System.out.println("the area of a parallelogram is calculated by base times height. or b*h");
    }
}
