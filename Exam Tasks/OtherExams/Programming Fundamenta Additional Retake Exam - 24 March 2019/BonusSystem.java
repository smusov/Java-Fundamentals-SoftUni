import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BonusSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int students = Integer.parseInt(read.readLine());
        int lectures = Integer.parseInt(read.readLine());
        int bonus = Integer.parseInt(read.readLine());

        int bestBonus = 0;
        int bestStudent = 0;

        for (int i = 1; i <= students; i++) {
            int bonusPerStudent ;
            int visits = Integer.parseInt(read.readLine());

            if (visits > 0 && lectures > 0) {
                bonusPerStudent = (int) Math.ceil((visits * 1.0 / lectures) * (5 + bonus));
            }else {
                bonusPerStudent=5+bonus;
            }

            if (bonusPerStudent >= bestBonus && visits > bestStudent) {
                bestBonus = bonusPerStudent;
                bestStudent = visits;

            }
        }
        System.out.printf("The maximum bonus score for this course is %d.The student has attended %d lectures.\n", bestBonus, bestStudent);
    }
}