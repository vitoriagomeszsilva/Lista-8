import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class miniFazenda {
  
    private String nomeFazenda;
    private int fomeFazenda;
    private int saudeFazenda; 
    private int idadeFazenda;
 
    
    public miniFazenda(String nome, int fome, int saude, int idade) {
        this.nomeFazenda = nome;
        this.fomeFazenda= fome;
        this.saudeFazenda = saude;
        this.idadeFazenda = idade;
    }


        public void mudaFome(int fome) {
        this.fomeFazenda = fome;
    }


    public String pegaNome() {
        return nomeFazenda;
    }

       public int pegaSaude() {
        return saudeFazenda;
    }


    public void TrocaNome(String nome) {
        this.nomeFazenda= nome;
    }

    public int retornaFome() {
        return fomeFazenda;
    }

      public int pegaIdade() {
        return idadeFazenda;
    }




 
    public void mudaSaude(int saude) {
        this.saudeFazenda = saude;
    }

  
    public void mudaIdade(int idade) {
        this.idadeFazenda = idade;
    
    }
    public void brincar(int quantidade) {

        if ((quantidade >= 0) && (quantidade <= 100)) {

        this.saudeFazenda += this.saudeFazenda * (quantidade/100.0f);

        }

    }


    public float humor() {
        return retornaFome() * pegaSaude();
    }

    public void daComida(float quantidade) {

        if ((quantidade >= 0) && (quantidade <= 100)) {

        this.fomeFazenda = (int) (this.fomeFazenda - (this.fomeFazenda * (quantidade/100.0f)));

        }
    }
    
 public String str() {
        return "Bichinho [nome=" + nomeFazenda + ", fome=" + fomeFazenda + ", saude=" + saudeFazenda + ", idade=" + idadeFazenda + "]";
    }



public static void main(String[] args){

        Random aleatorio = new Random();

        miniFazenda gato = new miniFazenda("gato", aleatorio.nextInt(10),

        aleatorio.nextInt(10), 5);

        miniFazenda galo = new miniFazenda("galo", aleatorio.nextInt(10),

        aleatorio.nextInt(10), 5);

        miniFazenda cavalo = new miniFazenda("cavalo", aleatorio.nextInt(10),

        aleatorio.nextInt(10), 5);

        ArrayList<miniFazenda> miniFazenda = new ArrayList();

        miniFazenda.add(gato);
        miniFazenda.add(galo);
        miniFazenda.add(cavalo);

        Scanner scanner = new Scanner(System.in);
        int op;
        int alimento, brinquedo;

                while(true){

                        System.out.println("1. Alimentar todos os bichos" + "2. Brincar com todos os bichos" + "3. Ouvir todos os bichos" );
                      
                        op = scanner.nextInt();
                        if (op == 1){
                        System.out.println("Alimentar todos com: ");
                        alimento = scanner.nextInt();
                        for(int i = 0; i<=2; i++)
                        miniFazenda.get(i).daComida(alimento);

                }

                else if(op ==2){
                        System.out.println("Brincar com todos com: ");
                        brinquedo = scanner.nextInt();
                        for(int i = 0; i<=2; i++)
                        miniFazenda.get(i).brincar(brinquedo);
                        
                }

                else if(op == 3){
                        for(int i = 0; i<=2; i++)
                        {
                        System.out.println(miniFazenda.get(i).str());
                        System.out.println(miniFazenda.get(i).pegaNome() + ": "
                        + miniFazenda.get(i).humor());
                        }
                }
                else

                        break;

                }
    }
}

