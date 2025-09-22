import java.util.Scanner;

public class mediaAluno {

    String nomeDoAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double mediaFinal;
    double somaDasNotas;

    public void coletarDados() {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o nome do Aluno");
        nomeDoAluno = leitor.nextLine();

        System.out.printf("Digite a primeira nota do aluno: ");
        nota1 = leitor.nextDouble();

        System.out.printf("Digite a segunda nota do aluno: ");
        nota2 = leitor.nextDouble();

        System.out.printf("Digite a terceira nota do aluno: ");
        nota3 = leitor.nextDouble();

        System.out.printf("Digite a quarta nota do aluno: ");
        nota4 = leitor.nextDouble();

        calcularMedia();
        exibirResultado();
    }

    public void calcularMedia(){
     somaDasNotas = nota1 + nota2 + nota3 + nota4;
     mediaFinal = somaDasNotas / 4;
    }

    public void exibirResultado () {

        System.out.println("A media do aluno é; " + mediaFinal);

        if (mediaFinal >= 5) {
            System.out.println("O aluno '   " + nomeDoAluno + " foi " + " Aprovado");
        } else {
            System.out.println("O aluno " + nomeDoAluno + " foi " + " Reprovado");
        }

    }
    }
