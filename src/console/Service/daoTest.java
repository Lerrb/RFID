package console.Service;

import Dao.daoservice;
import model.parcel;

import java.sql.SQLException;

public class daoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        daoservice daoservice=new daoservice();

        //插入测试
        parcel parcel=new parcel("01", "物品类型", "现在地址", "发货人",
                "收货人", "发货地址", "收货地址", "发货人联系方式",
                "收货人联系方式","下一站");
        if (daoservice.insert(parcel)==1){
            System.out.println("success");
        }else {
            System.out.println("faild");
        }

        //更新数据
//        System.out.println(daoservice.updata("cy","xx","1"));

        //删除操作
//        System.out.println(daoservice.delete("2"));

    }
}
