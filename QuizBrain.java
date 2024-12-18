import java.util.*;

public class QuizBrain {
    private Question[] questionList;
    private int questionNumber = 0;
    private int score = 0;

    public QuizBrain(Question[] questionList) {
        this.questionList = questionList;
    }

    public boolean stillHasQuestions() {
        return questionNumber < questionList.length;
    }

    public void nextQuestion() {
        Question currentQuestion = questionList[questionNumber];
        questionNumber++;
        System.out.println("Q." + questionNumber + ": " + currentQuestion.getText() + " (True/False)");
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();
        checkAnswer(userAnswer, currentQuestion.getAnswer());
        sc.close();
    }

    private void checkAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            score++;
            System.out.println("Yeah!!! That's correct.");
        } else {
            System.out.println("That's wrong.");
        }
        System.out.println("The correct answer is: " + correctAnswer);
        System.out.println("Your current score is: " + score + "/" + questionNumber + "\n");
    }

    public int getScore() {
        return score;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }
}