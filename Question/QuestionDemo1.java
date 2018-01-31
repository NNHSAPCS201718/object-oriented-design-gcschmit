import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class QuestionDemo1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      ChoiceQuestion q = new ChoiceQuestion( "Who was the inventor of Java?" );
      q.addChoice("James Gosling", true);
      q.addChoice("Alan Kay", false);

      q.display();
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
}

