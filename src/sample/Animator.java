package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Animator
{
    GraphicsContext gc;

    public Animator(GraphicsContext gc)
    {
        this.gc = gc;
    }

    public void animate()
    {
        gc.setStroke(Color.BLACK);
        gc.clearRect(0, 0, 1000, 600);
//        gc.beginPath();
        gc.strokeOval(200, 200, 30, 0);
    }

    public void drawShapes()
    {
        Random random = new Random();
        gc.setFill(Color.GREY);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        for (int i = 0; i < random.nextInt(20) + 5; i++)
        {
            gc.strokeOval(random.nextInt(1000), random.nextInt(600), 75, 75);
        }

//        var x = 1000;
//        function animate()
//        {
//            requestAnimationFrame(animate);
//            gc.setStroke(Color.BLACK);
//            gc.clearRect(0,0,1000,600);
//            gc.beginPath();
//            gc.strokeOval(200,200,30,0);
//            gc.stroke();
//
//
//        }
//        gc.beginPath();
//        gc.strokeOval(200,200,30,0);

    }
}
