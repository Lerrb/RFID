package Dao;

import modle.parcel;

import java.sql.SQLException;

public class daoservice {
    private dao dao=new dao();


    public void insert(parcel newParcel) throws SQLException, ClassNotFoundException {
        dao.getConn();
        Object[] obj={newParcel.get物品类型(),newParcel.get现在地址(),newParcel.get发货人(),
                newParcel.get收货人(), newParcel.get发货地址(),newParcel.get收货地址(),
                newParcel.get发货人联系方式(), newParcel.get收货人联系方式(),newParcel.get下一站()};
        dao.createPtmt("" +
                "insert into parcels(物品类型,现在地址,发货人,收货人,发货地址,收货地址,发货人联系方式,收货人联系方式,下一站)" +
                " values(?,?,?,?,?,?,?,?,?)" +
                "",obj);
        dao.update();

        dao.closePtmt();
        dao.closeConn();
    }
}
