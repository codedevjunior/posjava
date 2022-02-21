package dao;

import conexaojdbc.SingleConnection;

import java.sql.Connection;

public class Userposdao {

    private Connection connection;

    public Userposdao(){
        connection = SingleConnection.getConnection();
    }
}
