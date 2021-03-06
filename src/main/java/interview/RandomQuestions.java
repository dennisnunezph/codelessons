package interview;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dennis on 6/28/16.
 */
public class RandomQuestions {

    public static void main(String[] args) {


        RandomQuestions rq = new RandomQuestions();
        rq.showQuestions();

    }

    public void showQuestions() {
        Path filePath = FileSystems.getDefault().getPath("/home/dennis/workspace/lessons/codelessons/src/main/java/interview/lessons.txt");
        Response response = new Response();
        try {
            Scanner scanner = new Scanner(System.in);
            List<String> questions = null;
            String inputKey = "";
            String qandA = "";
            String question = "";
            String answer = "";

            String[] qaParts = null;

            while(!inputKey.equalsIgnoreCase("q")) {
                 questions = Files.readAllLines(filePath);

                int index = (int) (Math.random() * questions.size());

                qandA = index > questions.size() -1 ? questions.get(index - 1) : questions.get(index);
                question = qandA;
                if (qandA.contains(";")) {
                    qaParts = qandA.split(";");
                    question = qaParts[0];
                    if (qaParts.length > 1) {
                        answer = qaParts[1];
                    }
                }

                System.out.println("What is : " + question + " ?");

                inputKey = scanner.next();

                if ("a".equalsIgnoreCase(inputKey)) {
                    System.out.println("Answer is : " + answer);
                    answer = "";
                    inputKey = scanner.next();

                    if ("y".equalsIgnoreCase(inputKey)) {
                        response.right++;
                    } else if ("n".equalsIgnoreCase(inputKey)) {
                        response.wrong++;
                    }

                }

            }

            if ("q".equalsIgnoreCase(inputKey)) {
                System.out.println("Youre percentage is :" + response.getPercentage());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    class Response {
        int right = 0;
        int wrong = 0;

        int getTotal() {
            return right + wrong;
        }

        float getPercentage() {
            if (right == 0
                    || wrong == 0) {
                return 0;
            }

            return (Float.valueOf(right) /  Float.valueOf(getTotal())) * 100;
        }
    }
}

