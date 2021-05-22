import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;
public class pvp {
    public static int p1Score = 0;
    public static int p2Score = 0;
    public static int p1Wins = 0;
    public static int p2Wins = 0;
    public static void p1Win() {
        Stage window = new Stage();
        Text score = new Text("PLAYER ONE WINS");
        Text p1sc = new Text("PLAYER ONE SCORE: " + p1Score);
        Text p1w = new Text("PLAYER ONE WINS: " + p1Wins);
        Text p2sc = new Text("PLAYER TWO SCORE: " + p2Score);
        Text p2w = new Text("PLAYER TWO WINS: " + p2Wins);
        Button cont = new Button("CONTINUE PLAYING");
        cont.setOnAction(e->{winDow.run(); window.close();});
        VBox vlayout = new VBox(10);
        vlayout.getChildren().addAll(score, p1sc, p1w, p2sc, p2w, cont);
        vlayout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vlayout, 300, 300);
        window.setScene(scene);
        scene.getStylesheets().add("game.css");
        window.show();
    }
    public static void p2Win() {
        Stage window = new Stage();
        Text score = new Text("PLAYER TWO WINS");
        Text p1sc = new Text("PLAYER ONE SCORE: " + p1Score);
        Text p1w = new Text("PLAYER ONE WINS: " + p1Wins);
        Text p2sc = new Text("PLAYER TWO SCORE: " + p2Score);
        Text p2w = new Text("PLAYER TWO WINS: " + p2Wins);
        Button cont = new Button("CONTINUE PLAYING");
        cont.setOnAction(e->{winDow.run(); window.close();});
        VBox vlayout = new VBox(10);
        vlayout.getChildren().addAll(score, p1sc, p1w, p2sc, p2w, cont);
        vlayout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vlayout, 300, 300);
        scene.getStylesheets().add("game.css");
        window.setScene(scene);
        window.show();
    }
}
