package br.senai.sp.jandira.Controller;

import br.senai.sp.jandira.Model.Conexao;
import br.senai.sp.jandira.Model.Funcionario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    public void listarFuncionarios() throws SQLException {
        Statement statement = connection.createStatement();

        String queryList = "SELECT * FROM employees";

        ResultSet resultSet = statement.executeQuery(queryList);

        Funcionario funcionario = new Funcionario();

        while (resultSet.next()){
        funcionario.setIdFuncionario(resultSet.getInt("ID"));
        funcionario.setNome( resultSet.getString("nameEmployee"));
        funcionario.setCargo(resultSet.getString("cargo"));
        funcionario.setDepartamento(resultSet.getString("departamento"));
        funcionario.setSalario(resultSet.getDouble("salario"));

            System.out.println(funcionario.getIdFuncionario());
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getCargo());
            System.out.println(funcionario.getDepartamento());
            System.out.println(funcionario.getSalario());
            System.out.println("-----------------------");

        }


    }
    public void editarFuncionario(String nome, double salario) throws SQLException {
        Statement statement = connection.createStatement();

        String queryUpdate = "UPDATE employees SET salario = " + salario + "WHERE nameEmployee = '" + nome + "'";

        statement.executeUpdate(queryUpdate);

        System.out.println("Dados do funcionário " + nome + " editado com sucesso!");
    }
    public void deletarFuncionario(String nome) throws SQLException {

        Statement statement = connection.createStatement();

        String queryDelete = "DELETE FROM employees WHERE nameEmployee = '" + nome + "'";

        statement.executeUpdate(queryDelete);

        System.out.println("Funcionário " + nome + " deletado com sucesso!");

    }
    public void cadastrarFuncionario(Funcionario funcionario) throws SQLException {

        Statement statement = connection.createStatement();

        String queryCadastro = "INSERT INTO employees (ID, nameEmployee, cargo, departamento, salario)values (" +
                funcionario.getIdFuncionario() + ",'" + funcionario.getNome() + "','" + funcionario.getCargo() + "','" +
                funcionario.getDepartamento() + "'," + funcionario.getSalario() + ")";

        statement.executeUpdate(queryCadastro);

        System.out.println("Funcionário " + funcionario.getNome() + " Cadastrado com sucesso!");



    }
    public void consultarFuncionario(String nome) throws SQLException {
        Statement statement = connection.createStatement();

        String queryConsulta = "SELECT * FROM employees WHERE nameEmployee = '" + nome + "'";

        ResultSet resultSet = statement.executeQuery(queryConsulta);

        List<Funcionario> listConsulta = new ArrayList<>();

        while (resultSet.next()){
            Funcionario funcionario = new Funcionario();

            funcionario.setIdFuncionario(resultSet.getInt("ID"));
            funcionario.setNome( resultSet.getString("nameEmployee"));
            funcionario.setCargo(resultSet.getString("cargo"));
            funcionario.setDepartamento(resultSet.getString("departamento"));
            funcionario.setSalario(resultSet.getDouble("salario"));
            listConsulta.add(funcionario);

        }

        for (Funcionario funcionario : listConsulta){

            System.out.println(funcionario.getIdFuncionario());
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getCargo());
            System.out.println(funcionario.getDepartamento());
            System.out.println(funcionario.getSalario());
            System.out.println("-----------------------");

        }

    }
}
