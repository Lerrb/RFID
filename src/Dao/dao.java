package Dao;

import java.sql.*;

public class dao {
    /*
    private final static String driverName = "com.mysql.jdbc.Driver";// 数据库驱动
	private static String dbURL = "jdbc:mysql://localhost:3306/tenglong?characterEncoding=utf-8";
	private static String userName = "root";// 数据库的用户名
	private static String userPwd = "";// 数据库的密码
    */
    private final static String driverName = "com.mysql.cj.jdbc.Driver";// 数据库驱动
    private static String dbURL = "jdbc:mysql://localhost:3306/rfid_test?characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8";
    private static String userName = "root";// 数据库的用户名
    private static String userPwd = "aa123456";// 数据库的密码

    private Connection dbConn;
    private PreparedStatement ptmt;

    //建立数据库连接
    public void getConn() throws ClassNotFoundException, SQLException {
        Class.forName(driverName);
        dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
    }

    //创建sql语句包
    public void createPtmt(String sql,Object[] params) throws SQLException{
        ptmt=dbConn.prepareStatement(sql);
		for(int i=0;i<params.length;i++){
			ptmt.setObject(i+1, params[i]);
		}
    }

    //查询
    public ResultSet query() throws SQLException{
        ResultSet rs=ptmt.executeQuery();
        return rs;
    }

    //更新数据
    public int update() throws SQLException{
        int lineNum=0;
        lineNum=ptmt.executeUpdate();
        return lineNum;
    }

    //关闭流
    public void closeRs(ResultSet rs) throws SQLException{
        if(rs !=null){
            rs.close();
        }
    }
    public void closePtmt() throws SQLException{
        if(ptmt !=null){
            ptmt.close();
        }
    }
    public void closeConn() throws SQLException{
        if(dbConn !=null){
            dbConn.close();
        }
    }

}
