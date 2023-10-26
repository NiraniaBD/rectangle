package Model;

public class Model {
    MyShape currentShape;

    public Model() {
    }

    public MyShape getCurrentShape() {
        return currentShape;
    }

    public void createShape() {
        currentShape = new MyShape();
    }
}
