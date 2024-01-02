import BasicIO.*;
import Media.*;
import static java.lang.Math.*;

public class HoneyComb {
    private Turtle yertle;
    private TurtleDisplayer display;
    HoneyComb(){
        yertle = new Turtle ();
        display = new TurtleDisplayer ();
        display.placeTurtle(yertle);
        yertle.moveTo(-20,30);
        yertle.penDown();
        for (int j = 0 ; j < 6; j++){
            yertle.penDown();
        for( int i = 0; i < 6; i++){
            yertle.forward(40);
            yertle.right((PI)/3);
        }
            //yertle.penUp();
            yertle.forward(40);
            yertle.left(PI/3);
    }
       // yertle.right(2*PI/3);
       // yertle.backward(40);
        
    }
}