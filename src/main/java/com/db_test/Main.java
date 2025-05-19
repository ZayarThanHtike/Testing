package com.db_test;

import java.sql.Connection;
import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private String ip = "localhost";

    private String port = "3306";
    private  String dbname = "testdb";
    private String username = "root";
    private  String password = "";

    protected Connection get_Db_Connection(){
    Connection con = null;

    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + dbname, username,password);
    }
    catch (Exception ex){
        ex.printStackTrace();

    }
    return  con;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Connection con = m.get_Db_Connection();

        try {
            if(con != null) {
                con.close();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}