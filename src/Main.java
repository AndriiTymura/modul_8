public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape oval = new Oval();
        Shape triangle = new Triangle();
        Shape parallelogram = new Parallelogram();
        
        Print print = new Print();

        print.printShape(quad);
        print.printShape(circle);
        print.printShape(oval);
        print.printShape(parallelogram);
        print.printShape(triangle);
    }
}
