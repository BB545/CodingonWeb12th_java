package _05_class._access_modifier;

public class Practice1 {
    private int width;
    private int height;

    public Practice1(int width) {
        this.width = width;
    }

    public int area() {
        return this.width * this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Practice1Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
