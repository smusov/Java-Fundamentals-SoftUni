import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> num = Arrays.stream(read.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command;

        while (!"end".equals(command = read.readLine())) {
            String[] com = command.split(" ");
            int number;
            switch (com[0]) {
                case "Contains":
                    number = Integer.parseInt(com[1]);
                    printContains(number, num);
                    break;
                case "Print":
                    String prints = com[0]+" "+com[1];
                    if (prints.equals("Print even")){
                        printEvenNums(num);
                    }else {
                        PrintOddNums(num);
                    }
                    break;
                case "Get":
                    printSum(num);
                    break;
                case "Filter":
                    number = Integer.parseInt(com[2]);
                    printFilterNum(num,number,com[1]);
                    break;
            }
        }
    }

    private static void printContains(int numCheck, List<Integer> num) {
        if (num.contains(numCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printEvenNums(List<Integer> num) {
        for (Integer integer : num) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }
    private static void PrintOddNums(List<Integer>num){

        for (Integer integer : num) {
            if (integer % 2 != 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }
    private static void printSum(List<Integer>num){
        int sum =0;
        for (Integer integer : num) {
            sum += integer;
        }
        System.out.println(sum);
    }
    private static void printFilterNum(List<Integer>num, int number, String command){
        switch (command){
            case "<":
                for (Integer integer : num) {
                    if (integer < number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (Integer integer : num) {
                    if (integer > number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (Integer integer : num) {
                    if (integer <= number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (Integer integer : num) {
                    if (integer >= number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
            case "=":
                for (Integer integer : num) {
                    if (integer == number) {
                        System.out.print(integer + " ");
                    }
                }
                System.out.println();
                break;
        }

    }
}
