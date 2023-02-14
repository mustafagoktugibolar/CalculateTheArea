public class Square extends Shape {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    void calculateArea() {
        System.out.println(getName() + "'s area is " + (side * side));
        
    }

    @Override
    void calculatePerimeter() {
        System.out.println(getName() + "'s peremeter is " + (4 * side));
        
    }

    
}
