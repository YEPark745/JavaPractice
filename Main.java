package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btn=new Button("Click for hello");
			Button btn1=new Button("Click for bye");
			Button btn2=new Button("Processing");
			btn1.setLayoutY(25);
			btn2.setLayoutX(100);
			Pane pane=new Pane();
//			BorderPane root = new BorderPane();
			Scene scene = new Scene(pane,250,250);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			pane.getChildren().addAll(btn,btn1,btn2);
			primaryStage.setScene(scene);
			primaryStage.show();
			btn.setOnAction(e->System.out.println("Hello")); //lambda expression
			btn1.setOnAction(e->System.out.println("Bye Bye"));
			btn2.setOnAction(e->System.out.println("Process"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
