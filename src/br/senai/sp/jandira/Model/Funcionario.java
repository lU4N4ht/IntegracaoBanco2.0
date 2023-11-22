package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Funcionario {
    private String nome, cargo, departamento;
    private int idFuncionario = 0;
    private double salario;

    public void cadastrarFuncionario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        this.nome = scanner.nextLine();
        System.out.println("Informe o cargo do funcionário: ");
        this.cargo = scanner.nextLine();
        System.out.println("Informe o departamento do funcionário: ");
        this.departamento = scanner.nextLine();
        System.out.println("Informe o salário do funcionário: ");
        this.salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("____________________________________________");






    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
