package subject;


class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    class CircleManager {
        public void copy(Circle src, Circle dest) {
            dest.setRadius(src.getRadius());
        }

        public boolean equals(Circle a, Circle b) {
            if (a == b) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Circle pizza=new Circle(5);
        Circle waffle=new Circle(1);
        boolean res = pi

    }
}
