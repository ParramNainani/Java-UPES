interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double radius = 10;

    @Override
    public void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }

    @Override
    public void perimeter() {
        double p = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + p);
    }
}

class Rectangle implements Shape {
    double l = 10;
    double b = 20;

    @Override
    public void area() {
        double a = l * b;
        System.out.println("Area of Rectangle: " + a);
    }

    @Override
    public void perimeter() {
        double p = 2 * (l + b);
        System.out.println("Perimeter of Rectangle: " + p);
    }
}

class Triangle implements Shape {
    double A = 4;
    double B = 5;
    double C = 6;

    @Override
    public void perimeter() {
        double p = A + B + C;
        System.out.println("Perimeter of Triangle: " + p);
    }

    @Override
    public void area() {
        double s = (A + B + C) / 2.0;
        double a = Math.sqrt(s * (s - A) * (s - B) * (s - C));
        System.out.println("Area of Triangle: " + a);
    }
}

class AP {
    public static void main(String[] args) {
        Shape c1 = new Circle();
        Shape r1 = new Rectangle();
        Shape t1 = new Triangle();

        c1.area();
        c1.perimeter();

        r1.area();
        r1.perimeter();

        t1.area();
        t1.perimeter();
    }
}
