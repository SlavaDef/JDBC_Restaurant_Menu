package homework.com;

import java.sql.Connection;
import java.sql.SQLException;

import homework.com.dao.MenuDao;
import homework.com.dao.MenuDaoImp;
import homework.com.storage.ConnectionFactory;


import static homework.com.utils.Constants.*;
import static homework.com.utils.Utils.printingEntity;

public class App {
    public static void main(String[] args) throws SQLException {


        try (Connection conn = ConnectionFactory.getConnection()) {

            MenuDao dao = new MenuDaoImp(conn);

            dao.createTable();
            dao.createSomeDish();
            printingEntity(dao.getAllBy(SELECT_BY_PRICE_HIGHT));




        }
    }
}