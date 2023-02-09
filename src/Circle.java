public class Circle extends Shape{
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println(getName() +"'s are is " + Math.PI * (radius * radius)); 
    }

    @Override
    void calculatePeremeter() {
        System.out.println(getName() + "'s peremeter is  " + (2 * Math.PI * radius));
        
    }
    



}
