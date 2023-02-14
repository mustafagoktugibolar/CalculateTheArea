import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);   

        String processes1 = "Processes...\n"
        +"1 : Find Area\n"
        +"2 : Find Peremeter\n"
        +"Exit : q";

        String processes2 = "Shapes...\n"
        +"1 : Square\n"
        +"2 : Triangel\n"
        +"3 : Circle\n"
        +"b : Back";

        String process3 = "1 : Whole Circle's Area \n"
        +"2 : Part of Circle's Area";

        String unvalid = "Unvalid process...";


        while(true){
            System.out.println(processes1);

            System.out.print("Which process are you choosing : ");
            String process = sc.nextLine();

            if(process.equals("q")){
                sc.close();
                System.out.println("Leaving the program...");
                Thread.sleep(2000);
                break;
            }
            else if(process.equals("1")){

                System.out.println(processes2);
                System.out.println("Which shape are you choosing : ");
                String shape = sc.nextLine();

                if(shape.equals("b")){
                    System.out.println("Going back...");
                    Thread.sleep(2000);
                    continue;
                }
                else if(shape.equals("1")){
                    System.out.println("What is the length of one side : ");
                    int input = sc.nextInt();
                    sc.nextLine();
                    Square square1 = new Square("Square", input);
                    square1.calculateArea();

                }
                else if(shape.equals("2")){
                    System.out.println("Side 1 : ");
                    int a = sc.nextInt();
                    System.out.println("Side 2 : ");
                    int b = sc.nextInt();
                    System.out.println("Side 3 : ");
                    int c = sc.nextInt();
                    sc.nextLine();
                    Triangel triangel1 = new Triangel("Triangel", a, b, c);
                    triangel1.calculateArea();
                }
                else if(shape.equals("3")){
                    System.out.println(process3);
                    System.out.print("Which process are you choosing : ");
                    int newInput = sc.nextInt();

                    if(newInput == 1){

                        System.out.println("What is the radius : ");
                        int input = sc.nextInt();
                        sc.nextLine();
                        Circle circle1 = new Circle("Circle", input);
                        circle1.calculateArea();
                    }
                    else if(newInput == 2){

                        System.out.println("What is the radius : ");
                        int input = sc.nextInt();
                        sc.nextLine();
                        System.out.println("What is the degree : ");
                        int degree = sc.nextInt();
                        Circle circle1 = new Circle("Circle", input, degree);
                        circle1.calculateAreaWithDegree();

                    }
                    else{
                        System.out.println(unvalid);
                    }

                }
                else{
                    System.out.println(unvalid);
                }

            }
            else if(process.equals("2")){
                System.out.println(processes2);
                System.out.println("Which shape are you choosing : ");
                String shape = sc.nextLine();

                if(shape.equals("b")){
                    System.out.println("Going back...");
                    Thread.sleep(2000);
                    continue;
                }
                else if(shape.equals("1")){
                    System.out.println("What is the length of one side : ");
                    int input = sc.nextInt();
                    sc.nextLine();
                    Square square1 = new Square("Square", input);
                    square1.calculatePeremeter();

                }
                else if(shape.equals("2")){
                    System.out.println("Side 1 : ");
                    int a = sc.nextInt();
                    System.out.println("Side 2 : ");
                    int b = sc.nextInt();
                    System.out.println("Side 3 : ");
                    int c = sc.nextInt();
                    sc.nextLine();
                    Triangel triangel1 = new Triangel("Triangel", a, b, c);
                    triangel1.calculatePeremeter();

                }
                else if(shape.equals("3")){
                    System.out.println("What is the radius : ");
                    int input = sc.nextInt();
                    sc.nextLine();
                    Circle circle1 = new Circle("Circle", input);
                    circle1.calculatePeremeter();

                }
                else{
                    System.out.println(unvalid);
                }
            }
            else{
                System.out.println(unvalid);
            }
        }
        
    }
}
