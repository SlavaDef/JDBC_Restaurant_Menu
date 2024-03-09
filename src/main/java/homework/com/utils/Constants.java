package homework.com.utils;

public class Constants {

    public static final String CREATE_DISH_SQL ="CREATE TABLE menu (dish_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
            "dish_name VARCHAR(50) NOT NULL, dish_price DOUBLE NOT NULL, " +
            "dish_weight DOUBLE NOT NULL, " +
            "discount INT NOT NULL )";


    public static final String INIT_DISH_SQL = "INSERT INTO menu " +
            "(dish_name, dish_price, dish_weight, discount)" +
            " VALUES(?, ?, ?, ?)";
}
