package _05_class;

public class Practice1Rectangle {

    public int width;
    public int height;

    public Practice1Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Practice1Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
