import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int people = Integer.parseInt(read.nextLine());
        String type = read.nextLine();
        String days = read.nextLine();

        double students = 0;
        double business = 0;
        double regular = 0;

        if (days.equalsIgnoreCase("Friday")){
            switch (type){
                case "Students":
                    students+=people*8.45;
                    break;
                case "Business":
                    business+=people*10.90;
                    break;
                case "Regular":
                    regular+=people*15.00;
                    break;
            }
        }else if (days.equalsIgnoreCase("Saturday")){
            switch (type) {
                case "Students":
                    students+=people*9.80;
                    break;
                case "Business":
                    business+=people*15.60;
                    break;
                case "Regular":
                    regular+=people*20.00;
                    break;
            }
        }else if (days.equalsIgnoreCase("Sunday")){
            switch (type) {
                case "Students":
                    students+=people*10.46;
                    break;
                case "Business":
                    business+=people*16.00;
                    break;
                case "Regular":
                    regular+=people*22.50;
                    break;
            }
        }

        if (type.equalsIgnoreCase("Students")&&people>=30){
            students=students-(students*0.15);
            System.out.printf("Total price: %.2f",students);
        }else if (type.equalsIgnoreCase("Students")&&people<30){
            System.out.printf("Total price: %.2f",students);
        }
        else if (type.equalsIgnoreCase("Business")&&people>=100){
            if (days.equalsIgnoreCase("Friday"))
                business=business-(10*10.90);
            else if (days.equalsIgnoreCase("Saturday")){
                business=business-(10*15.60);
            }else {
                business=business-(10*16.00);
            }
            System.out.printf("Total price: %.2f",business);
        }else if (type.equalsIgnoreCase("Business")&&people<100){
            System.out.printf("Total price: %.2f",business);
        }
        else if (type.equalsIgnoreCase("Regular")&&people>=10&&people<=20){
            regular-=regular*0.05;
            System.out.printf("Total price: %.2f",regular);
        }else if (type.equalsIgnoreCase("Regular")&&people<10||people>20){
            System.out.printf("Total price: %.2f",regular);
        }

    }
}