package br.senai.sp.jandira.Controller;

import br.senai.sp.jandira.Model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public void executarMenu() throws SQLException {
        boolean continuar = true;
        FuncionarioController funcionarioController = new FuncionarioController();

        while (continuar){
            System.out.println("----------------------------------------");
            System.out.println("             B E M   V I N D O          ");
            System.out.println("----------------------------------------");
            System.out.println("Listar Funcionários.....................1");
            System.out.println("Cadastrar Funcionários..................2");
            System.out.println("Editar Funcionário......................3");
            System.out.println("Deletar Funcionário.....................4");
            System.out.println("Pesquisar Funcionário...................5");
            System.out.println("Sair....................................6");
            System.out.println("----------------------------------------");
            System.out.println(" ");

            Scanner scanner = new Scanner(System.in);

            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption){
                case 1:
                    funcionarioController.listarFuncionarios();
                    break;
                case 2:
                    Funcionario newfuncionario = new Funcionario();
                    newfuncionario.cadastrarFuncionario();

                    funcionarioController.cadastrarFuncionario(newfuncionario);

                    break;
                case 3:
                    System.out.println("Informe o nome que deseja atualizar: ");
                    String nomeUpdate = scanner.nextLine();
                    System.out.println("Informe o novo salário: ");
                    double salario = scanner.nextDouble();
                    funcionarioController.editarFuncionario(nomeUpdate, salario);
                    break;

                case 4:

                    System.out.println("Informe o nome que deseja excluir: ");
                    String nome = scanner.nextLine();
                    funcionarioController.deletarFuncionario(nome);
                    break;

                case 5:

                    System.out.println("Informe o nome que deseja consultar: ");
                    String nomeConsulta = scanner.nextLine();
                    funcionarioController.consultarFuncionario(nomeConsulta);
                    break;

                case 6:
                    continuar = false;
                    break;
            }
        }
    }
}
