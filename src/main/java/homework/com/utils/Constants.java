package homework.com.utils;

public class Constants {

    public static final String CREATE_DISH_SQL = "CREATE TABLE menu (dish_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
            "dish_name VARCHAR(255) NOT NULL, dish_price DOUBLE NOT NULL, " +
            "dish_weight FLOAT NOT NULL, " +
            "discount INT NOT NULL )";


    public static final String INIT_DISH_SQL = "INSERT INTO menu " +
            "(dish_name, dish_price, dish_weight, discount)" +
            " VALUES(?, ?, ?, ?)";

    public static final String GET_ALL = "SELECT * FROM menu ";
    public static final String SELECT_BY_PRICE_LOW = "SELECT * FROM menu ORDER BY dish_price";

    public static final String SELECT_BY_PRICE_HIGHT = "SELECT * FROM menu ORDER BY dish_price DESC";
}
