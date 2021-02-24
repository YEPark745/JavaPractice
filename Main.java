package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Main extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
 
        Pane pane=new Pane();
        Scene scene=new Scene(pane,400,600);
        Label l1 = new Label(" FROM");l1.setLayoutY(30);
        Label l2 = new Label(" TO");l2.setLayoutY(60);
        Label l3 = new Label(" Result-Add");l3.setLayoutY(90);
        Label l4 = new Label(" Result-Sub");l4.setLayoutY(120);
        Label l5 = new Label(" Result-Multi");l5.setLayoutY(150);
        Label l6 = new Label(" Result-Modulo");l6.setLayoutY(180);
        TextField f = new TextField();f.setLayoutY(30);f.setLayoutX(100);
        TextField s = new TextField();s.setLayoutY(60);s.setLayoutX(100);
        TextField t = new TextField();t.setLayoutY(90);t.setLayoutX(100);
        TextField u = new TextField();u.setLayoutY(120);u.setLayoutX(100);
        TextField v = new TextField();v.setLayoutY(150);v.setLayoutX(100);
        TextField z = new TextField();z.setLayoutY(180);z.setLayoutX(100);
        
        Button btn=new Button("FIND PRIME");btn.setLayoutY(210);btn.setLayoutX(100);
        Button btn1=new Button("sub");btn1.setLayoutY(210);btn1.setLayoutX(180);
        Button btn2=new Button("multi");btn2.setLayoutY(240);btn2.setLayoutX(100);
        Button btn3=new Button("modulo");btn3.setLayoutY(240);btn3.setLayoutX(180);
        
        pane.getChildren().addAll(l1,f,l2,s,l3,t,l4,u,l5,v,l6,z,btn,btn1,btn2,btn3);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btn.setOnAction(e->{
        //String str=null;
        if(f.get)
        int start=Integer.parseInt(f.getText());
        int end=Integer.parseInt(s.getText());
        for(;start<=end;start++) {
        	int sum=0;
        	for(int i=0;i<start;i++) {
        		if(start%i==0) 
        			sum=sum+i;
        	}
        	if(sum==start) 
        		str=str+String.valueOf(start)+",";
        	t.setText(str+",");
        }
        
        
        });
        
        
        btn1.setOnAction(e->{
        int q=Integer.parseInt(f.getText())-Integer.parseInt(s.getText());
    		u.setText(String.valueOf(q));
        });
        btn2.setOnAction(e->{
        int p=Integer.parseInt(f.getText())*Integer.parseInt(s.getText());
    		v.setText(String.valueOf(p));
        });
        btn3.setOnAction(e->{
        int b=Integer.parseInt(f.getText())%Integer.parseInt(s.getText());
    		z.setText(String.valueOf(b));
        });
        //btn.setOnAction(new EventHandler<ActionEvent>() {
            //public void handle(ActionEvent e) {
                //System.out.print("hello");
            //}}); 
    }
}