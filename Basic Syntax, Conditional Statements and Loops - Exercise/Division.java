import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {

    public static void main(String[] args) throws IOException {

        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());

        String output;

        if (n%10==0){
            output= "The number is divisible by 10";
        }else if (n%7==0){
            output= "The number is divisible by 7";
        }else if (n%6==0){
            output= "The number is divisible by 6";
        }else if (n%3==0){
            output= "The number is divisible by 3";
        }else if (n%2==0){
            output= "The number is divisible by 2";
        }else {
            output= "Not divisible";
        }
        System.out.println(output);
    }
}