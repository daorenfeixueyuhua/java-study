package month12.day28;

public class Rectangle {
    private float weight, height;

    public Rectangle(float weight, float height) {
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());

    }

    public float getLength() {
        return (height + weight) * 2;
    }

    public float getArea() {
        return weight * height;
    }
}
