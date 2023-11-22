package br.senai.sp.jandira;

import br.senai.sp.jandira.Controller.Menu;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.executarMenu();
    }
}
