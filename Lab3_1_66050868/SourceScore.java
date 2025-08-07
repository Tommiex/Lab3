package Lab3_66050868;

import java.util.ArrayList;

public class SourceScore{
    String scoreLine;
    ArrayList<ScoreListener> list ;

    public SourceScore() {
        list = new ArrayList<>();
    }
    
    public void subscribe(ScoreListener s){
        list.add(s);
    }
    
    public void unSubscribe(ScoreListener s){
        list.remove(s);
    }

    public void setScoreLine(String sLine){
        this.scoreLine = sLine;
        updateScoretoSubscriber(new ScoreEvent(this, sLine));
    }


    public void updateScoretoSubscriber(ScoreEvent e){
        for(ScoreListener l : list){
            l.scoreChange(e);
        }
    }
}