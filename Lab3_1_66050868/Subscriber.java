package Lab3_66050868;

public class Subscriber implements ScoreListener{
    
    
    @Override
    public void scoreChange(ScoreEvent e){
        System.out.println(e.getScoreLine());
    }

   
}
