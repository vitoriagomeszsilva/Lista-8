
class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void imprimir() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Retangulo {
    private int largura;
    private int altura;
    private Ponto pontoInicial;

    public Retangulo(int largura, int altura, Ponto pontoInicial) {
        this.largura = largura;
        this.altura = altura;
        this.pontoInicial = pontoInicial;
    }

    public Ponto encontrarCentro() {
        int centroX = pontoInicial.getX() + largura / 2;
        int centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }

    public Ponto pegaPontoInicial() {
        return pontoInicial;
    }

    public void mudaPontoInicial(Ponto pontoInicial) {
        this.pontoInicial = pontoInicial;
    }


     public int pegaAltura() {
        return altura;
    }

    public void mudaAltura(int altura) {
        this.altura = altura;

    }
    public int pegaLargura() {
        return largura;
    }

    public void mudaLargura(int largura) {
        this.largura = largura;
    }

   
    
}

class Main {
    public static void main(String[] args) {
        Ponto pontoInicial = new Ponto(0, 0);
        Retangulo retangulo = new Retangulo(10, 5, pontoInicial);

        System.out.println("Valores iniciais  retângulo:");
        System.out.println("Ponto Inicial: ");
        pontoInicial.imprimir();
        System.out.println("Largura: " + retangulo.pegaLargura());
        System.out.println("Altura: " + retangulo.pegaAltura());

        Ponto novoPontoInicial = new Ponto(2, 2);
        int novaLargura = 5;
        int novaAltura = 7;

        retangulo.mudaPontoInicial(novoPontoInicial);
        retangulo.mudaLargura(novaLargura);
        retangulo.mudaAltura(novaAltura);

        System.out.println("Novos valores do retângulo:");
        System.out.println("Ponto Inicial: ");
        novoPontoInicial.imprimir();
        System.out.println("Largura: " + retangulo.pegaLargura());
        System.out.println("Altura: " + retangulo.pegaAltura());

        // Finding and printing the center of the rectangle
        Ponto centro = retangulo.encontrarCentro();
        System.out.println("\nCentro do retângulo:");
        centro.imprimir();
    }
}
