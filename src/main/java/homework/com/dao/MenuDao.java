package homework.com.dao;

import homework.com.entyti.Menu;

import java.util.List;

public interface MenuDao {

    void addNewDish(Menu menu);

    void createTable();

    void createSomeDish();

    List<Menu> getAllBy(String sql);





}
