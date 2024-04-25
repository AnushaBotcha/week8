interface Shape {
    float area();
    void dimensions();
}

class Rectangle implements Shape {
    float length, width;

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float area() {
        return length * width;
    }

    public void dimensions() {
        System.out.println("Rectangle Dimensions: " + length + " x " + width);
    }
}

class Triangle implements Shape {
    float base, height;

    Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public float area() {
        return (float) 0.5 * base * height;
    }

    public void dimensions() {
        System.out.println("Triangle Dimensions: " + base + " base x " + height + " height");
    }
}

public class PureAbstraction {
    public static void main(String[] args) {
        // Creating objects with different inputs
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(5, 8);

        // Printing area and dimensions of rectangle
        System.out.println("Area of Rectangle: " + rectangle.area());
        rectangle.dimensions();

        // Printing area and dimensions of triangle
        System.out.println("Area of Triangle: " + triangle.area());
        triangle.dimensions();
    }
}


