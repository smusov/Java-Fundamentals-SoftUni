import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) throws IOException {
        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));

        List<String> schedule = Arrays.stream(read.readLine().split(", ")).collect(Collectors.toList());

        String input = read.readLine();

        while (!"course start".equalsIgnoreCase(input)) {

            String[] inputCommand = input.split(":");
            String command = inputCommand[0];
            String lessonTitle = inputCommand[1];

            switch (command) {

                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(inputCommand[2]);
                    if (!schedule.contains(lessonTitle)) {
                        if (index >= 0 && index < schedule.size()) {
                            schedule.add(index, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                    schedule.remove(lessonTitle);
                    break;
                case "Swap":
                    String swapLessonWith = inputCommand[2];
                    swapping(schedule, lessonTitle, swapLessonWith);
                    break;
                case "Exercise":
                    if (schedule.contains(lessonTitle)) {
                        int indexOfLeson = schedule.indexOf(lessonTitle);
                        if (!schedule.contains(lessonTitle + "-Exercise")) {
                            if (indexOfLeson == schedule.size() - 1) {
                                schedule.add(lessonTitle + "-Exercise");
                            }else {
                                schedule.add(indexOfLeson + 1, lessonTitle + "-Exercise");
                            }
                        }
                    }else if (!schedule.contains(lessonTitle + "-Exercise")) {
                        schedule.add(lessonTitle);
                        schedule.add(lessonTitle + "-Exercise");
                    }
                    break;
                default:
                    break;
            }
            input = read.readLine();
        }

        for (int i = 1; i <= schedule.size(); i++) {
            System.out.println(i + "." + schedule.get(i - 1));

        }
    }
    private static void swapping(List<String> schedule, String lessonTitle, String swapWith) {

        if (schedule.contains(lessonTitle) && schedule.contains(swapWith)) {

            int lessonTitleIndex = schedule.indexOf(lessonTitle);
            int swapWithindex = schedule.indexOf(swapWith);

            schedule.add(swapWithindex, lessonTitle);
            schedule.remove(swapWith);
            schedule.remove(lessonTitleIndex);
            schedule.add(lessonTitleIndex, swapWith);

            if (schedule.contains(lessonTitle + "-Exercise")) {
                if (swapWithindex == schedule.size() - 1) {
                    schedule.add(lessonTitle + "-Exercise");
                }else {
                    schedule.add(swapWithindex + 1, lessonTitle + "-Exercise");
                }
                schedule.remove(lessonTitleIndex + 2);

            }else if (schedule.contains(swapWith + "-Exercise")) {
                if (lessonTitleIndex == schedule.size() - 1) {
                    schedule.add(swapWith + "-Exercise");
                }else {
                    schedule.add(lessonTitleIndex + 1, swapWith + "-Exercise");
                }
                schedule.remove(swapWithindex + 2);
            }
        }
    }

}