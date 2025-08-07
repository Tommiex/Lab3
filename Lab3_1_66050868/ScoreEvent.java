package Lab3_66050868;

import java.util.EventObject;

public class ScoreEvent extends EventObject {
    private String scoreLine;

    public ScoreEvent(Object sourceScore, String sLine) {
        super(sourceScore);
        this.scoreLine = sLine;
    }

    public String getScoreLine(){
        return scoreLine;
    }

    
}
