package prototype;

public class ShapeClient {
  private final Shape shapeType;

  public ShapeClient(Shape shape) {
    this.shapeType = shape;
  }

  public Shape createCloneShape() {
    return shapeType.clone();
  }
}
