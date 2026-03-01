package ip.router;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class Router {
    private StackPane root;

    public Router(StackPane root) {
        this.root = root;
    }

    public void showView(Node view) {
        root.getChildren().setAll(view); // Verwijder oude, zet nieuwe
    }

    public void showOverlay(Node overlay) {
        root.getChildren().add(overlay); // Zet bovenop de huidige view
    }

    public void hideOverlay(Node... nodes) {
        root.getChildren().removeAll(nodes);
    }
}
