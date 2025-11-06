package lab4;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarLombok {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}
