/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopilha;

/**
 *
 * @author jr13f
 */
import java.util.Scanner;

public class ExercicioPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int escolha = 0;
        Pilha p = new Pilha();
        Pilha pAuxiliar = new Pilha();
        double salario = 0;
        Funcionario fAuxiliar = new Funcionario();
        int tamanhoP;
        int tamanhoPa;

        while (escolha != 8) {
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("Escolha uma opção:\n"
                        + "1 - Listar os dados da Pilha\n"
                        + "2 - Empilha\n"
                        + "3 - Desempilha\n"
                        + "4 - Somar Salarios\n"
                        + "5 - Topo\n"
                        + "6 - Tamanho\n"
                        + "7 - Remover Base\n"
                        + "8 - Sair");
                escolha = ler.nextInt();

                switch (escolha) {
                    case 1:
                        tamanhoP = p.Tamanho();
                        for(int x = 0; x < tamanhoP ;x++){                            
                            pAuxiliar.Empilha(p.Desempilha());
                            System.out.println(pAuxiliar.RetornaTopo().nome + "\n");
                        }
                        for(int x = 0; x < tamanhoP;x++){
                            p.Empilha(pAuxiliar.Desempilha());
                        }
                        break;
                    case 2:
                        Funcionario f = new Funcionario();
                        System.out.println("\nDigite o nome do Funcionrio");
                        f.nome = ler.next();
                        System.out.println("\nDigite o Salario do Funcionrio");
                        f.salario = ler.nextDouble();
                        p.Empilha(f);
                        System.out.println("\nEmpilhado com Sucesso\n");
                        break;
                    case 3:
                        System.out.println("\nFuncionario desempilhado:" + p.Desempilha().nome +"\n");
                        break;
                    case 4:
                        tamanhoP = p.Tamanho();
                        salario = 0;
                        for(int x = 0; x < tamanhoP;x++){
                            pAuxiliar.Empilha(p.Desempilha());
                            salario += pAuxiliar.RetornaTopo().salario; 
                        }
                        System.out.println("\nSalario total dos funcionarios:" + salario +"\n");
                        for(int x = 0; x < tamanhoP;x++){
                            p.Empilha(pAuxiliar.Desempilha());
                        }
                        break;
                    case 5:
                        System.out.println("\nFuncionario do topo:" + p.RetornaTopo().nome +"\n");
                        break;
                    case 6:
                        System.out.println("\nTamanho igual a:" + p.Tamanho()+"\n");
                        break;
                    case 7:
                        tamanhoP = p.Tamanho();
                        for(int x = 0; x < tamanhoP;x++){
                            pAuxiliar.Empilha(p.Desempilha());
                        }
                        System.out.println("\nDado da base removido:" + pAuxiliar.Desempilha().nome +"\n");
                        for(int x = 0; x < (tamanhoP - 1);x++){
                            p.Empilha(pAuxiliar.Desempilha());
                        }
                        break;
                    case 8:
                        System.out.println("\nPrograma finalizado\n");
                        break;
                    default:
                        System.out.println("\nOpção Invalida\n");
                }

            } catch(Exception e) {
                System.out.println("\nErro:" + e.getMessage()+"\n");
            }

        }

    }

}
