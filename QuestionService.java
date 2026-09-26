import java.util.Scanner;
public class QuestionService{
    Question[] questions = new Question[5];

    

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of India?", "New Delhi", "Mumbai", "Kolkata", "Chennai", "New Delhi");
        questions[1] = new Question(2, "What is the capital of France?", "Paris", "London", "Berlin", "Rome", "Paris");
        questions[2] = new Question(3, "What is the capital of Japan?", "Tokyo", "Osaka", "Kyoto", "Nagoya", "Tokyo");
        questions[3] = new Question(4, "What is the capital of Brazil?", "Brasília", "Rio de Janeiro", "São Paulo", "Salvador", "Brasília");
        questions[4] = new Question(5, "What is the capital of Australia?", "Canberra", "Sydney", "Melbourne", " Brisbane", "Canberra");
        

    }

    String selection[] = new String[5];


    public void displayQuestion(){
        int i = 0;
        for(Question question : questions){
            
            System.out.println("Question ID: " + question.getId());
            System.out.println("Question: " + question.getQuestion());
            System.out.println("Option 1: " + question.getOp1());
            System.out.println("Option 2: " + question.getOp2());
            System.out.println("Option 3: " + question.getOp3());
            System.out.println("Option 4: " + question.getOp4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();

        }

        for(int j = 0; j < questions.length; j++){
            if(selection[j].equals(questions[j].getAnswer())){
                System.out.println("Question ID: " + questions[j].getId() + " is correct");
            }else{
                System.out.println("Question ID: " + questions[j].getId() + " is incorrect" + "  :: Correct answer is: " + questions[j].getAnswer());
            }
        }
    }

    public void printscore(){
        int score = 0;
        for(int j = 0; j < questions.length; j++){
            if(selection[j].equals(questions[j].getAnswer())){
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
    }
}