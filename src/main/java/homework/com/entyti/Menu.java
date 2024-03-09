package homework.com.entyti;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Menu {

    private String dish_name;

    private double dish_price;

    private double dish_weight;

    private int discount;

    @Override
    public String toString() {
        return "Restaurant Menu: " +
                "dish_name='" + dish_name + '\'' +
                ", dish_price=" + dish_price+"$" +
                ", dish_weight=" + dish_weight+"g" +
                ", discount=" + discount+"%" ;
    }
}
