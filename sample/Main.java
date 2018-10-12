package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        GridPane gridpane2 = new GridPane();
        gridpane2.setPadding(new Insets(5));

        Label labelRight = new Label("Narzędzia");

        VBox vBox = new VBox();
        TextArea textUp = new TextArea("ola");
        TextArea textDown = new TextArea("OLA");
        vBox.getChildren().addAll(new Label("Źródło"), textUp, new Label("Wynik"), textDown);

        gridpane.add(vBox, 0, 1);
        gridpane2.add(labelRight, 0, 1);

        Button bnt1 = new Button();
        bnt1.setText("Przetwarzaj");
        bnt1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(bnt1, Priority.ALWAYS);
        gridpane2.setHgrow(bnt1, Priority.ALWAYS);
        gridpane2.add(bnt1, 0, 2);

        Button btn2 = new Button();
        btn2.setText("Wyczyść źrodło");
        btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn2, Priority.ALWAYS);
        gridpane2.setHgrow(btn2, Priority.ALWAYS);
        gridpane2.add(btn2, 0, 3);


        Button btn3 = new Button();
        btn3.setText("Pomoc");
        btn3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn3, Priority.ALWAYS);
        gridpane2.setHgrow(btn3, Priority.ALWAYS);
        btn3.setDisable(true);
        gridpane2.add(btn3, 0, 4);

        Button btn4 = new Button();
        btn4.setText("O programie");
        btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn4, Priority.ALWAYS);
        gridpane2.setHgrow(btn4, Priority.ALWAYS);
        gridpane2.add(btn4, 0, 5);

        Button btn5 = new Button();
        btn5.setText("Zapisz i zakończ");
        btn5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        gridpane2.setVgrow(btn5, Priority.ALWAYS);
        gridpane2.setHgrow(btn5, Priority.ALWAYS);
        gridpane2.add(btn5, 0, 6);
        
        GridPane gridpane3 = new GridPane();
        gridpane3.add(gridpane, 0, 0);
        gridpane3.add(gridpane2, 1, 0);
        ColumnConstraints columnLeft = new ColumnConstraints();
        columnLeft.setHgrow(Priority.ALWAYS);
        columnLeft.setMaxWidth(300);
        ColumnConstraints columnRight = new ColumnConstraints();
        columnRight.setHgrow(Priority.ALWAYS);
        gridpane3.getColumnConstraints().addAll(columnLeft, columnRight);

        Scene scene = new Scene(gridpane3, 500, 300);

        primaryStage.setTitle("Zmiana wielkości liter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
