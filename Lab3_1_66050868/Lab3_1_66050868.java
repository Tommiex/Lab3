package Lab3_66050868;

import java.util.Scanner;

public class Lab3_1_66050868 {
    public static void main(String[] args) {
        SourceScore sScore = new SourceScore();
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        sScore.subscribe(s1);
        sScore.subscribe(s2);
        
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("Enter score");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                break;
            }

            sScore.setScoreLine(input);
            
        }
        sc.close();

    }
}
