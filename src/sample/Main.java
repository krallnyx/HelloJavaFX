package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // test without the FXML file by commenting the next line an de-commenting 22-30
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);

//        Label greeting = new Label("Welcome!");
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//        greeting.setTextFill(Color.GREEN);
//        root.getChildren().add(greeting);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 650, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
