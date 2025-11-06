package lab4;

public class Car {
    private String model, brand, color;
    private int year, quantity;
    private double price;

    public Car(String model, String brand, int year, double price, String color, int quantity){
        this.model=model; this.brand=brand; this.year=year; this.price=price; this.color=color; this.quantity=quantity;
    }

    public String getModel(){return model;}
    public void setModel(String model){this.model=model;}

    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand=brand;}

    public int getYear(){return year;}
    public void setYear(int year){this.year=year;}

    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}

    public String getColor(){return color;}
    public void setColor(String color){this.color=color;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity=quantity;}

    public void delivery(int amount){
        quantity+=amount;
        System.out.println("delivered: "+amount+", total: "+quantity);
    }

    public void sell(int amount){
        if(amount<=quantity){ quantity-=amount; System.out.println("sold: "+amount+", left: "+quantity); }
        else System.out.println("no stock");
    }

    public String toString(){
        return "Car{brand="+brand+", model="+model+", year="+year+", color="+color+", price="+price+", qty="+quantity+"}";
    }
}

