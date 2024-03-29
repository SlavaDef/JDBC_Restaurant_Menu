package homework.com.entyti;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Menu {

    private long dish_id;

    private String dish_name;

    private double dish_price;

    private float dish_weight;

    private int discount;

    public Menu(String dish_name, double dish_price, float dish_weight, int discount) {
        this.dish_name = dish_name;
        this.dish_price = dish_price;
        this.dish_weight = dish_weight;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Restaurant Menu: " +
                "name = '" + dish_name + '\'' +
                ", price = " + dish_price+"$" +
                ", weight = " + dish_weight+"g" +
                ", discount = " + discount+"%" ;
    }
}
