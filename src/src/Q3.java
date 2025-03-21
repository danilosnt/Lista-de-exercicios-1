import java.util.Scanner;

public class Q3 {
    private String nome;
    private int codDisciplina;

    public Q3(String nome, int codDisciplina) {
        this.nome = nome;
        this.codDisciplina = codDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public void exibirProfessor() {
        System.out.println("Nome do professor: " + nome);
        System.out.println("Código da disciplina: " + codDisciplina);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o código da disciplina: ");
        int codDisciplina = scanner.nextInt();

        Q3 professor = new Q3(nome, codDisciplina);
        professor.exibirProfessor();

        scanner.close();
    }
}