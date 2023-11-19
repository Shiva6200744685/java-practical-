abstract class Shape {
    abstract double calc_area();
    abstract double calc_volume();
}

class Sphere extends Shape {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calc_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calc_volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    double radius;
    double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calc_area() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    double calc_volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

class Cylinder extends Shape {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calc_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calc_volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

class Box extends Shape {
    double length;
    double breadth;
    double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calc_area() {
        return 2 * (length*breadth + breadth*height + length*height);
    }

    @Override
    double calc_volume() {
        return length * breadth * height;
    }
}

public class ShapeCal{
    public static void main(String[] args) {

        Sphere sphere = new Sphere(5);
        System.out.println("Area of sphere: " + sphere.calc_area());
        System.out.println("Volume of sphere: " + sphere.calc_volume());

        Cone cone = new Cone(5, 10);
        System.out.println("Area of cone: " + cone.calc_area());
        System.out.println("Volume of cone: " + cone.calc_volume());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Area of cylinder: " + cylinder.calc_area());
        System.out.println("Volume of cylinder: " + cylinder.calc_volume());
    }
}