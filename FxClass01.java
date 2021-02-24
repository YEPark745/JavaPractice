package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;



public class FxClass01 extends Application {
	
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }

 

    @Override
    public void start(Stage primaryStage) throws Exception {
 
        Pane pane=new Pane();
        Scene scene=new Scene(pane,400,300);
        Label l1 = new Label(" First Number");l1.setLayoutY(30);
        Label l2 = new Label(" Second Number");l2.setLayoutY(60);
        Label l3 = new Label(" Result");l3.setLayoutY(90);
        TextField f = new TextField();f.setLayoutY(30);f.setLayoutX(100);
        TextField s = new TextField();s.setLayoutY(60);s.setLayoutX(100);
        TextField t = new TextField();t.setLayoutY(90);t.setLayoutX(100);
        Button btn=new Button("add");btn.setLayoutY(120);btn.setLayoutX(100);
        
        pane.getChildren().addAll(l1,f,l2,s,l3,t,btn);
        primaryStage.setScene(scene);
        primaryStage.show();
        btn.setOnAction(e->{
        int w=Integer.parseInt(f.getText())+Integer.parseInt(s.getText());
        	t.setText(String.valueOf(w));
        });
        
        //btn.setOnAction(new EventHandler<ActionEvent>() {
            //public void handle(ActionEvent e) {
                //System.out.print("hello");
            //}});
    }
}