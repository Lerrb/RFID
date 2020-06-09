package console.Service;

import Dao.daoservice;
import modle.parcel;

import java.sql.SQLException;

public class daoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        daoservice daoservice=new daoservice();

        //插入测试
//        parcel parcel=new parcel(null, "111", "111", "111",
//                "111", "111", "111", "111",
//                "111","111");
//        if (daoservice.insert(parcel)==1){
//            System.out.println("success");
//        }else {
//            System.out.println("faild");
//        }

        //更新数据
//        System.out.println(daoservice.updata("cy","xx","1"));

        //删除操作
        System.out.println(daoservice.delete("2"));

    }
}
