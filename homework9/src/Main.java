import Aluno.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        ArrayList<Aluno> listAluno = new ArrayList<Aluno>();

        int opc = 0;

        while (opc < 3) {
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Mostra Lista");
            System.out.println("3 - Calcular a Média da Turma");
            System.out.println("4 - Sair");
            opc = teclado.nextByte();

            System.out.println();

            switch (opc){
                case 1:
                    System.out.print("Informe Nome do Aluno: ");
                    String nome = teclado.next();

                    System.out.print("Informe Código do aluno: ");
                    Integer codigo = teclado.nextInt();

                    System.out.print("Informe 1° nota: ");
                    Double nota1 = teclado.nextDouble();

                    System.out.print("Informe 2° nota: ");
                    Double nota2 = teclado.nextDouble();

                    System.out.println();

                    Aluno aln;
                    aln = new Aluno(nome, codigo, nota1, nota2);
                    listAluno.add(aln);
                    break;
                case 2:
                    for (Aluno alns : listAluno){
                        System.out.println();
                        System.out.println("Nome: " + alns.getNome() + "\nCódigo: " + alns.getCodigo() + "\n1° Nota: "
                                + alns.getNota1() + "\n2° Nota: " + alns.getNota2());
                    }
                    System.out.println();
                    break;
                case 3:
                    double mediaTm = 0;
                    for (Aluno alns : listAluno){
                        System.out.println("A média de " + alns.getNome() + ": " + alns.mediaNotas());
                        mediaTm += alns.mediaNotas();
                    }
                    double mediaTurma = mediaTm / listAluno.size();
                    System.out.println("Total: " + mediaTm);
                    System.out.println("Quantidade Alunos na Lista: " + listAluno.size());
                    System.out.println("Média da Turma: " + mediaTurma);

                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Errada!!!");
                    break;
            }
        }
    }
}
