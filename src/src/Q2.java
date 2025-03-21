import java.util.Scanner;

public class Q2 {
    private String nome;
    private int semestre;

    public Q2(String nome, int semestre) {
        this.nome = nome;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void exibirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Semestre letivo: " + semestre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o semestre em que o aluno está: ");
        int semestre = scanner.nextInt();

        Q2 aluno = new Q2(nome, semestre);
        aluno.exibirAluno();

        scanner.close();
    }
}