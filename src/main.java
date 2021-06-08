import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class main extends Application {
    //This lauches he main window to open the program
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //This laynhes the pain window, where the user can choose PVP or PVC, and has intro text
        Stage window = primaryStage;
        Button pvpb = new Button("Player V. Player");
        pvpb.setOnAction(e->{winDow.run(); window.close();});
        Text pvpIntro = new Text("To play PVP, the first player will choose the button that corresponds with the slot \n" +
                "that they want to take. Once the first player chooses a slot, it will immediately be the next player's turn. \n" +
        "Scores will be incremented with 4 extra points every three rounds.");
        Button pvcb = new Button("Player V. Computer");
        pvcb.setOnAction(e->{pvc.run(); window.close();});
        VBox vlayout = new VBox(10);
        vlayout.setAlignment(Pos.CENTER);
        vlayout.getChildren().addAll(pvpIntro, pvpb, pvcb);
        Scene scene = new Scene(vlayout, 500, 500);
        scene.getStylesheets().add("game.css");
        window.setScene(scene);
        window.show();
    }

}
