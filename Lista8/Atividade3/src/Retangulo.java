import java.util.Scanner;

public class Retangulo {
    
    private float comprimento;
    private float largura;

    public Retangulo(float compriment, float largura){

        super();
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void trocaComprimento(float comprimento){
        
       this.comprimento = comprimento;

    }

    public void trocaLargura(float largura){
        
       this.largura = largura;

    }
    public float pegaComprimento(){
        
        return comprimento;

    }

    public float pegaLargura(){
        
        return largura;

    }

    public float area(){
        
        return (pegaComprimento() * pegaLargura());

    }

    public float perimetro(){
        
        return (2 * pegaComprimento() ) + (2 * pegaLargura());

    }


     public static void main(String[] args){

        float comprimento;
        float largura;

        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o valor do comprimento: ");
        comprimento =scanner.nextInt();

        System.out.println("informe o valor do comprimento: ");
        largura =scanner.nextInt();

        Retangulo retangulo = new Retangulo(comprimento,largura);

        System.out.println("A area e "+retangulo.area());
        System.out.println("O perimetro e" + retangulo.perimetro());

        
    }
}
