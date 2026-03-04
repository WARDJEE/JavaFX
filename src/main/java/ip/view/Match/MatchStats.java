package ip.view.Match;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MatchStats extends BorderPane {
    private VBox p1;
    private VBox p2;

    public MatchStats(){
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes(){
        Label name1 = new Label("iets");
        p1 = new VBox(name1);

        Label name2 = new Label("ietsss");
        p2 = new VBox(name2);
    }

    private void layoutNodes(){
        setBottom(p1);
        setAlignment(p1, Pos.BOTTOM_LEFT);

        setTop(p1);
        setAlignment(p2, Pos.TOP_RIGHT);




    }
}
