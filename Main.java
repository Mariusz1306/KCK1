import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Zmiana wielkości liter");
        Button btn1 = new Button();
        btn1.setMinSize(200,50);
        btn1.setText("Przetwarzaj");
        Button btn2 = new Button();
        btn2.setMinSize(200,50);
        btn2.setText("Wyczyść źródło");
        Button btn3 = new Button();
        btn3.setMinSize(200,50);
        btn3.setDisable(true);
        btn3.setText("Pomoc");
        Button btn4 = new Button();
        btn4.setMinSize(200,50);
        btn4.setText("O programie");
        Button btn5 = new Button();
        btn5.setMinSize(200,50);
        btn5.setText("Zapisz i zakończ");

        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);

        Text Tools = new Text("Narzędzia");
        Text Source = new Text("Źródło");
        TextField SourceTextField = new TextField();
        SourceTextField.setMinSize(200,100);
        Text Output = new Text("Wynik");
        TextField OutputTextField = new TextField();
        OutputTextField.setMinSize(200,100);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));

        Scene scene = new Scene(grid, 500, 325);

        grid.add(Tools, 0, 2);
        grid.add(btn1, 0, 3);
        grid.add(btn2, 0, 4);
        grid.add(btn3, 0, 5);
        grid.add(btn4, 0, 6);
        grid.add(btn5, 0, 7);
        grid.add(Source, 1, 0);
        grid.add(SourceTextField, 1, 1, 1, 4);
        grid.add(Output, 1, 5);
        grid.add(OutputTextField, 1, 6, 1, 4);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
