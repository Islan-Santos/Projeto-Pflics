package br.com.pflics.dal;

import java.sql.*;

public class ModuloConexao {

    public static Connection conector() {

        java.sql.Connection conexao ;
        String driver = "com.mysql.jdbc.Driver";

        //Armazenando Banco
        String url = "jdbc:mysql://localhost:3306/plataformapflics";
        String user = "root";
        String password = "231002";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }

    }

}
