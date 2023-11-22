package br.senai.sp.jandira.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String servidor, senha, usuario, banco;
    public Connection conexao;
    public Conexao(){
        this.servidor = "LocalHost";
        this.banco = "db_company";
        this.usuario = "root";
        this.senha = "bcd127";
    }

    public void  connectionDiver(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Connection getConnection(){
        connectionDiver();
        return conexao;
    }

}
