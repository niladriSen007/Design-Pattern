
import prototype.Circle;
import prototype.Shape;
import prototype.ShapeClient;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("red");
        ShapeClient shapeClient = new ShapeClient(circle);
        shapeClient.createCloneShape().draw();
    }
}