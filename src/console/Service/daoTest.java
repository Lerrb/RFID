package console.Service;

import Dao.daoservice;
import modle.parcel;

import java.sql.SQLException;

public class daoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        daoservice daoservice=new daoservice();

        parcel parcel=new parcel(null, "111", "111", "111",
                "111", "111", "111", "111",
                "111","111");
        daoservice.insert(parcel);
        System.out.println("success");
    }
}
