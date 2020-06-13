package Dao;

import model.parcel;

import java.sql.SQLException;

public class daoservice {
    private dao dao=new dao();


    public int insert(parcel newParcel) throws SQLException, ClassNotFoundException {
        dao.getConn();
        Object[] obj={newParcel.getCardID(),newParcel.get物品类型(),newParcel.get现在地址(),newParcel.get发货人(),
                newParcel.get收货人(), newParcel.get发货地址(),newParcel.get收货地址(),
                newParcel.get发货人联系方式(), newParcel.get收货人联系方式(),newParcel.get下一站()};
        dao.createPtmt("" +
                "insert into parcels(cardID,物品类型,现在地址,发货人,收货人,发货地址,收货地址,发货人联系方式,收货人联系方式,下一站)" +
                " values(?,?,?,?,?,?,?,?,?,?)" +
                "",obj);
        int i=dao.update();

        dao.closePtmt();
        dao.closeConn();
        return i;
    }

    public int updata(String 现在地址,String 下一站,String cardID) throws SQLException, ClassNotFoundException {
        dao.getConn();
        Object[] obj={现在地址,下一站,cardID};
        dao.createPtmt("update parcels set 现在地址=?,下一站=?  where cardID = ?",obj);
        int i=dao.update();

        dao.closePtmt();
        dao.closeConn();
        return i;
    }

    public int delete(String cardID) throws SQLException, ClassNotFoundException {
        dao.getConn();
        Object[] obj={cardID};
        //DELETE FROM `rfid_test`.`parcels` WHERE (`id` = '2');
        dao.createPtmt("delete from parcels where id=?",obj);
        int i=dao.update();

        dao.closePtmt();
        dao.closeConn();
        return i;
    }
}
