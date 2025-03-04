import java.util.Scanner;

public class QuestionService {

    Question [] questions = new Question[4];
    String [] Selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "what is the name of Nigerian president", "george Bush", "Tim Colwill", "Muhammed Tinubu", "Muhammed Tinubu" );
        questions[1] = new Question(2,"What is the capital of France?", "Berlin", " Madrid", "paris", "paris");
        questions[2] = new Question(3,"What is the chemical symbol for gold?", "Au","Ag", "Fe", "Au");
        questions[3] = new Question(4, "Who wrote Romeo and Juliet?", "Charles Dickens", "William Shakespeare", "Mark Twain", "William Shakespeare");
    }

    public void playQuiz(){
        int i =0;
        for(Question q : questions){
            System.out.println("Question no "+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            Scanner input = new Scanner(System.in);

            Selection [i]= input.nextLine();
            i++;


        }


    }
    public void printScore(){
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String userAnswer = Selection[i];
            String actualAnswer = que.getAnswer();
            if(actualAnswer.equalsIgnoreCase(userAnswer)){
                score++;
            }
        }
        System.out.println("Score = " + score);
    }




}
