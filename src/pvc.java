import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class pvc {
    public static int player=1;
    public static void setPlayer(int i){
        player = i;
    }
    public static int getPlayer(){
        return player;
    }
    public static void run(){
        Stage window = new Stage();
        window.setTitle("Connect 4");

        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six=  new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button ten = new Button("10");
        Button eleven = new Button("11");
        Button twelve = new Button("12");
        Button thirteen = new Button("13");
        Button fourteen = new Button("14");
        Button fifteen = new Button("15");
        Button sixteen = new Button("16");
        Button seventeen = new Button("17");
        Button eighteen = new Button("18");
        Button nineteen = new Button("19");
        Button twenty = new Button("20");
        Button twentyone = new Button("21");
        Button twentytwo = new Button("22");
        Button twentythree = new Button("23");
        Button twentyfour = new Button("24");
        Button twentyfive = new Button("25");
        Button twentysix = new Button("26");
        Button twentyseven = new Button("27");
        Button twentyeight = new Button("28");
        Button twentynine = new Button("29");
        Button thirty = new Button("30");
        Button thirtyone = new Button("31");
        Button thirtytwo = new Button("32");
        Button thirtythree = new Button("33");
        Button thirtyfour = new Button("34");
        Button thirtyfive = new Button("35");
        Button thirtysix = new Button("36");
        Button thirtyseven = new Button("37");
        Button thirtyeight = new Button("38");
        Button thirtynine = new Button("39");
        Button fourty = new Button("40");
        Button fourtyone = new Button("41");
        Button fourtytwo = new Button("42");

        Text boarded = new Text();
        boarded.setText(pvcBoard.btoString());

        one.setOnAction(e->{pvcBoard.setTile(0,0, 1); one.setDisable(true); boarded.setText(pvcBoard.btoString());});
        two.setOnAction(e->{pvcBoard.setTile(0,1, 1); two.setDisable(true);boarded.setText(pvcBoard.btoString());});
        three.setOnAction(e->{pvcBoard.setTile(0,2, 1); three.setDisable(true);boarded.setText(pvcBoard.btoString());});
        four.setOnAction(e->{pvcBoard.setTile(0,3, 1); four.setDisable(true);boarded.setText(pvcBoard.btoString());});
        five.setOnAction(e->{pvcBoard.setTile(0,4, 1); five.setDisable(true);boarded.setText(pvcBoard.btoString());});
        six.setOnAction(e->{pvcBoard.setTile(0,5, 1); six.setDisable(true);boarded.setText(pvcBoard.btoString());});
        seven.setOnAction(e->{pvcBoard.setTile(1,0, 1); seven.setDisable(true);boarded.setText(pvcBoard.btoString());});
        eight.setOnAction(e->{pvcBoard.setTile(1,1, 1); eight.setDisable(true);boarded.setText(pvcBoard.btoString());});
        nine.setOnAction(e->{pvcBoard.setTile(1,2, 1);nine.setDisable(true);boarded.setText(pvcBoard.btoString());});
        ten.setOnAction(e->{pvcBoard.setTile(1,3, 1);ten.setDisable(true);boarded.setText(pvcBoard.btoString());});
        eleven.setOnAction(e->{pvcBoard.setTile(1,4, 1); eleven.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twelve.setOnAction(e->{pvcBoard.setTile(1,5, 1); twelve.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirteen.setOnAction(e->{pvcBoard.setTile(2,0, 1); thirteen.setDisable(true);boarded.setText(pvcBoard.btoString());});
        fourteen.setOnAction(e->{pvcBoard.setTile(2, 1, 1); fourteen.setDisable(true);boarded.setText(pvcBoard.btoString());});
        fifteen.setOnAction(e->{pvcBoard.setTile(2, 2, 1); fifteen.setDisable(true);boarded.setText(pvcBoard.btoString());});
        sixteen.setOnAction(e->{pvcBoard.setTile(2, 3, 1); sixteen.setDisable(true);boarded.setText(pvcBoard.btoString());});
        seventeen.setOnAction(e->{pvcBoard.setTile(2, 4, 1); seventeen.setDisable(true);boarded.setText(pvcBoard.btoString());});
        eighteen.setOnAction(e->{pvcBoard.setTile(2, 5, 1); eighteen.setDisable(true);boarded.setText(pvcBoard.btoString());});
        nineteen.setOnAction(e->{pvcBoard.setTile(3, 0, 1); nineteen.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twenty.setOnAction(e->{pvcBoard.setTile(3, 1, 1); twenty.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentyone.setOnAction(e->{pvcBoard.setTile(3, 2, 1); twentyone.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentytwo.setOnAction(e->{pvcBoard.setTile(3, 3, 1); twentytwo.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentythree.setOnAction(e->{pvcBoard.setTile(3, 4, 1); twentythree.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentyfour.setOnAction(e->{pvcBoard.setTile(3, 5, 1); twentyfour.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentyfive.setOnAction(e->{pvcBoard.setTile(4, 0, 1); twentyfive.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentysix.setOnAction(e->{pvcBoard.setTile(4, 1, 1); twentysix.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentyseven.setOnAction(e->{pvcBoard.setTile(4, 2, 1); twentyseven.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentyeight.setOnAction(e->{pvcBoard.setTile(4, 3, 1); twentyeight.setDisable(true);boarded.setText(pvcBoard.btoString());});
        twentynine.setOnAction(e->{pvcBoard.setTile(4, 4, 1); twentynine.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirty.setOnAction(e->{pvcBoard.setTile(4, 5, 1); thirty.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtyone.setOnAction(e->{pvcBoard.setTile(5, 0,1); thirtyone.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtytwo.setOnAction(e->{pvcBoard.setTile(5, 1, 1); thirtytwo.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtythree.setOnAction(e->{pvcBoard.setTile(5, 2, 1); thirtythree.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtyfour.setOnAction(e->{pvcBoard.setTile(5, 3, 1); thirtyfour.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtyfive.setOnAction(e->{pvcBoard.setTile(5, 4, 1); thirtyfive.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtysix.setOnAction(e->{pvcBoard.setTile(5, 5, 1); thirtysix.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtyseven.setOnAction(e->{pvcBoard.setTile(6, 0, 1); thirtyseven.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtyeight.setOnAction(e->{pvcBoard.setTile(6, 1, 1); thirtyeight.setDisable(true);boarded.setText(pvcBoard.btoString());});
        thirtynine.setOnAction(e->{pvcBoard.setTile(6, 2, 1); thirtynine.setDisable(true);boarded.setText(pvcBoard.btoString());});
        fourty.setOnAction(e->{pvcBoard.setTile(6, 3, 1); fourty.setDisable(true);boarded.setText(pvcBoard.btoString());});
        fourtyone.setOnAction(e->{pvcBoard.setTile(6, 4, 1); fourtyone.setDisable(true);boarded.setText(pvcBoard.btoString());});
        fourtytwo.setOnAction(e->{pvcBoard.setTile(6, 5, 1); fourtytwo.setDisable(true);boarded.setText(pvcBoard.btoString());});

        Button compl = new Button("Load computer move");
        compl.setOnAction(e->{pvcBoard.compMove();
            boarded.setText(pvcBoard.btoString());});

        HBox hlayout = new HBox(10);
        hlayout.getChildren().addAll(one, two, three, four, five, six, seven);
        HBox hlayout1 = new HBox(10);
        hlayout1.getChildren().addAll(eight, nine, ten, eleven,twelve, thirteen, fourteen);
        HBox hlayout2 = new HBox(10);
        hlayout2.getChildren().addAll(fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyone);
        HBox hlayout3 = new HBox(10);
        hlayout3.getChildren().addAll(twentytwo, twentythree, twentyfour, twentyfive, twentysix, twentyseven, twentyeight);
        HBox hlayout4 = new HBox(10);
        hlayout4.getChildren().addAll(twentynine, thirty, thirtyone, thirtytwo, thirtythree, thirtyfour, thirtyfive);
        HBox hlayout5 = new HBox(10);
        hlayout5.getChildren().addAll(thirtysix, thirtyseven,thirtyeight, thirtynine, fourty, fourtyone, fourtytwo);

        VBox buttons = new VBox(10);
        buttons.getChildren().addAll(hlayout, hlayout1, hlayout2, hlayout3, hlayout4, hlayout5);
        buttons.setAlignment(Pos.CENTER);

        VBox board = new VBox(10);
        board.getChildren().addAll(boarded, compl);
        board.setAlignment(Pos.CENTER);

        HBox fin = new HBox(10);
        fin.getChildren().addAll(buttons, board);
        fin.setAlignment(Pos.CENTER);

        Scene scene = new Scene(fin, 500, 500);
        scene.getStylesheets().add("game.css");
        window.setScene(scene);
        window.show();
    }
}
