public class Livro {
    private String titulo;
    private String editora;
    private int anoPublicacao;

    public Livro(String titulo, String editora, int anoPublicacao) {
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

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}# Exercícios TAD

- Crie um TAD para armazenar dados de livros: Título, editora, ano de publicação.
  
- Crie um TAD para armazenar dados dos alunos: nome, semestre.

- Crie um TAD para armazenar dados dos professores: nome, Código da disciplina.

- Crie um Tipo Abstrato de Dados (TAD) que represente os números racionais e que contenha as seguintes funcionalidades de:
  
  (a) Criar racional;

  (b) Somar racionais;

  (c) Multiplicar racionais;

  (d) testar igualdade.

- Sabendo que uma conta bancária tem as operações de visualizar saldo, depositar, sacar e atualizar. Crie uma TAD para representar essas operações.

- Sabendo que as operações de uma agenda telefônica possuem as operações: Adicionar, excluir, atualizar, remover. Elabore uma TAD para representar essas operações.

- Crie um TAD para armazenar dados dos pets de um petshop. Os pets deverão ter nome, telefone do tutor, data de nascimento, raça.

- Crie um TAD para armazenar dados da coleção de carrinhos de hotweels.

- Crie um TAD para representar um pedido de restaurante. O pedido deve conter nome do cliente, itens do pedido, quantidades e valor total.

- Crie um TAD para representar uma playlist de músicas. Cada música deve conter título, artista e duração. A playlist deve permitir adicionar, remover e listar músicas.

- Crie um TAD para representar um estoque de produtos de uma loja. Cada produto deve conter nome, código, quantidade em estoque e preço unitário.

- Crie um TAD para representar um histórico de compras de um cliente. Cada compra deve conter a data, a lista de itens comprados e o valor total.

- Crie um TAD para representar um campeonato esportivo. Deve conter nome do campeonato, times participantes e sistema de pontuação.

- Crie um TAD para representar um funcionário de uma empresa. Deve conter nome, cargo, salário e data de admissão.

- Crie um TAD para representar uma fila de atendimento em um hospital. Deve conter nome do paciente, prioridade e horário de chegada.

- Crie um TAD para representar um diário de anotações. Cada anotação deve conter a data, um título e o conteúdo da anotação.
