package _05_class._final;

public class Practice1 {
    private final double radius;
    static final double PI = Math.PI;

    public Practice1(double radius){
        this.radius = radius;
    }
    double circleArea(){
        return PI * radius * radius;
    }
}
