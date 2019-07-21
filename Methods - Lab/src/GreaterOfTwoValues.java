import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterOfTwoValues {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String check = read.readLine();

        switch (check.toLowerCase()){
            case "int":
                int a = Integer.parseInt(read.readLine());
                int b = Integer.parseInt(read.readLine());
                System.out.println(getMax(a, b));
                break;
            case "char":
                char first = read.readLine().charAt(0);
                char second = read.readLine().charAt(0);
                System.out.println(getMax(first, second));
                break;
            case "string":
                String one = read.readLine();
                String two = read.readLine();
                System.out.println(getMax(one, two));
                break;
        }

    }

    private static int getMax(int a,int b){

        if (a>=b){
            return a;
        }else {
            return b;
        }
    }
    private static char getMax (char a,char b){
        if (a>=b){
            return a;
        }else {
            return b;
        }

    }
    private static String getMax(String a,String b){

        if (a.compareTo(b)>=0){
            return a;
        }else {
            return b;
        }

    }
}
