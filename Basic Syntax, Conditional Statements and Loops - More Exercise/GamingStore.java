import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double butget = Double.parseDouble(read.nextLine());
        String game = read.nextLine();
        double spend = 0;
        int stop =0;

        while (!game.equals("Game Time")){

            switch (game){
                case "OutFall 4":
                    if (butget>=39.99){
                        butget-=39.99;
                        spend+=39.99;
                        System.out.println(String.format("Bought %s",game));
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (butget>=15.99){
                        butget-=15.99;
                        spend+=15.99;
                        System.out.println(String.format("Bought %s",game));
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (butget>=19.99){
                        butget-=19.99;
                        spend+=19.99;
                        System.out.println(String.format("Bought %s",game));
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (butget>=59.99){
                        butget-=59.99;
                        spend+=59.99;
                        System.out.println(String.format("Bought %s",game));
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (butget>=29.99){
                        butget-=29.99;
                        spend+=29.99;
                        System.out.println(String.format("Bought %s",game));
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (butget>=39.99){
                        butget-=39.99;
                        spend+=39.99;
                        System.out.println(String.format("Bought %s",game));
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            game=read.nextLine();
            if (butget==0){
                System.out.println("Out of money!");
                stop++;
                break;
            }
        }
        if (butget!=0&&stop==0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spend,butget);
        }
    }
}