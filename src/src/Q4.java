public class Q4 {
    private int numerador;
    private int denominador;

    public Q4(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero!");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void simplificar() {
        int divisor = mdc(numerador, denominador);
        numerador /= divisor;
        denominador /= divisor;
    }

    public Q4 somar(Q4 outro) {
        int num = this.numerador * outro.denominador + outro.numerador * this.denominador;
        int denom = this.denominador * outro.denominador;
        return new Q4(num, denom);
    }

    public Q4 multiplicar(Q4 outro) {
        int num = this.numerador * outro.numerador;
        int denom = this.denominador * outro.denominador;
        return new Q4(num, denom);
    }

    public boolean igual(Q4 outro) {
        return this.numerador == outro.numerador && this.denominador == outro.denominador;
    }

    public void exibir() {
        System.out.println(numerador + "/" + denominador);
    }

    public static void main(String[] args) {
        Q4 r1 = new Q4(1, 2);
        Q4 r2 = new Q4(3, 4);

        System.out.print("Racional 1: ");
        r1.exibir();
        System.out.print("Racional 2: ");
        r2.exibir();

        Q4 soma = r1.somar(r2);
        System.out.print("Soma: ");
        soma.exibir();

        Q4 produto = r1.multiplicar(r2);
        System.out.print("Produto: ");
        produto.exibir();

        if (r1.igual(r2)) {
            System.out.println("Os números racionais são iguais.");
        } else {
            System.out.println("Os números racionais são diferentes.");
        }
    }
}