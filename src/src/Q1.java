import java.util.Scanner;

public class Q1 {
    private String titulo;
    private String editora;
    private int anoPublicacao;

    public Q1(String titulo, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Editora: " + editora);
        System.out.println("Ano de publicação: " + anoPublicacao);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite a editora do livro: ");
        String editora = scanner.nextLine();

        System.out.print("Digite o ano de publicação do livro: ");
        int anoPublicacao = scanner.nextInt();

        Q1 livro1 = new Q1(titulo, editora, anoPublicacao);
        livro1.exibirLivro();

        scanner.close();
    }
}