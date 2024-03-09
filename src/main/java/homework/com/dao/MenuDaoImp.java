package homework.com.dao;

import homework.com.entyti.Menu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static homework.com.utils.Constants.CREATE_DISH_SQL;
import static homework.com.utils.Constants.INIT_DISH_SQL;

public class MenuDaoImp implements MenuDao {

    private final Connection conn;

    private final String table;


    public MenuDaoImp(Connection conn) {
        this.conn = conn;
        table = "menu";
    }


    @Override
    public void createTable() {
        try (Statement st = conn.createStatement()) {
            st.execute("DROP TABLE IF EXISTS " + table);
            st.execute(CREATE_DISH_SQL);

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void addNewDish(Menu menu) {
        try {
            try (PreparedStatement st = conn.prepareStatement(INIT_DISH_SQL)) {
                st.setString(1, menu.getDish_name());
                st.setDouble(2, menu.getDish_price() );
                st.setDouble(3, menu.getDish_weight());
                st.setInt(4, menu.getDiscount());
                st.executeUpdate();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void createSomeDish() {
        addNewDish(new Menu("Big_Fish",12.5,0.3,5));
        addNewDish(new Menu("Сutlet",22.8,0.6,2));
        addNewDish(new Menu("Tea",1.5,0.7,1));
        addNewDish(new Menu("Big-Mak",25.9,0.6,5));
        addNewDish(new Menu("Cheik",10.2,0.7,1));
    }

    @Override
    public List<Menu> getAll() {

        List<Menu> res = new ArrayList<>();

        try {
            try (Statement st = conn.createStatement()) {
                try (ResultSet rs = st.executeQuery("SELECT * FROM " + table)) {
                    while (rs.next()) {
                        Menu menu = new Menu();

                        menu.setDish_id(rs.getLong(1));
                        menu.setDish_name(rs.getString(2));
                        menu.setDish_price(rs.getDouble(3));
                        menu.setDish_weight(rs.getDouble(4));
                        menu.setDiscount(rs.getInt(5));


                        res.add(menu);
                    }
                }
            }

            return res;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
