package lab4;

public class lab4 {
    public static void main(String[] args){

        //task 1
        System.out.println("-----------------------------------------------------------");
        RectangleArea r=new RectangleArea();
        r.getData();
        r.computeField();
        r.fieldDisplay();

        //task 2
        System.out.println("-----------------------------------------------------------");
        Car c=new Car("Civic","Honda",2022,25000,"Blue",5);
        System.out.println(c.toString());
        c.sell(2);
        System.out.println("After selling: qty="+c.getQuantity());
        c.setColor("Black");
        c.setPrice(23999);
        System.out.println("After update: "+c);
        c.delivery(3);
        System.out.println("Final: brand="+c.getBrand()+", model="+c.getModel()+", year="+c.getYear()+", color="+c.getColor()+", price="+c.getPrice()+", qty="+c.getQuantity());

        //additional task
        System.out.println("-----------------------------------------------------------");
        CarLombok c1 = new CarLombok("Civic", "Honda", 2022, 25000, "Blue", 5);
        CarLombok c2 = new CarLombok("Civic", "Honda", 2022, 25000, "Blue", 5);

        System.out.println("Car 1: " + c1);
        System.out.println("Car 2: " + c2);
        System.out.println("Equals: " + c1.equals(c2));
        System.out.println("HashCode 1: " + c1.hashCode());
        System.out.println("HashCode 2: " + c2.hashCode());
    }

}