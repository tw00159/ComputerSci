package batteryCalc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
public class MyBindingDragginBall extends Application
{
public static void main(String[] args){
launch(args);
}
public void start(Stage primaryStage)
{
Pane root = createRootPane();
Scene scene1 = new Scene(root);
primaryStage.setScene(scene1);
primaryStage.setTitle("Taylor Wilson");
primaryStage.show();
}
public static double setOpacity(double x)
{
      x=1.0;
   return x;
}
public Pane createRootPane()
{
Circle ball = new Circle(100, 50, 25);
Pane root = new Pane(ball);
root.setMinSize(300, 300);
root.setOnMousePressed(event -> 
{
ball.setCenterX(event.getX());ball.setCenterY(event.getY());
});
root.setOnMouseDragged(event ->{ball.setFill(Color.BLACK); 
while(ball.setCenterX(event.getX()>ball.setCenterY(event.getY())))
{
do{
ball.setOpacity(1.0 - 0.1);
ball.setCenterY(event.getY());

}
}

root.setOnMouseReleased(event ->{ ball.setFill(Color.BLACK);ball.setOpacity(1.0); });
return root;
}
}
}        


}
