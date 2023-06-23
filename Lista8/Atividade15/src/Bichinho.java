public class Bichinho   {
  
    private String nomeBichinho;
    private int fomeBichinho;
    private int saudeBichinho; 
    private int idadeBichinho;
 
    
    public Bichinho(String nome, int fome, int saude, int idade) {
        this.nomeBichinho = nome;
        this.fomeBichinho= fome;
        this.saudeBichinho = saude;
        this.idadeBichinho = idade;
    }

        public void mudaFome(int fome) {
        this.fomeBichinho = fome;
    }


    public String pegaNome() {
        return nomeBichinho;
    }

       public int pegaSaude() {
        return saudeBichinho;
    }


    public void TrocaNome(String nome) {
        this.nomeBichinho = nome;
    }

    public int retornaFome() {
        return fomeBichinho;
    }

      public int pegaIdade() {
        return idadeBichinho;
    }




 
    public void mudaSaude(int saude) {
        this.saudeBichinho = saude;
    }

  
    public void mudaIdade(int idade) {
        this.idadeBichinho = idade;
    
    }
    public void brincar(int quantidade) {

        if ((quantidade >= 0) && (quantidade <= 100)) {

        this.saudeBichinho += this.saudeBichinho * (quantidade/100.0f);

        }

    }


    public float humor() {
        return retornaFome() * pegaSaude();
    }

    public void alimenta(float quantidade) {

        if ((quantidade >= 0) && (quantidade <= 100)) {

        this.fomeBichinho = (int) (this.fomeBichinho - (this.fomeBichinho * (quantidade/100.0f)));

        }
    }
    



    public static void main(String[] args) {
        Bichinho josh = new Bichinho("josh", 34,78, 2);
        System.out.println(josh.humor());
        josh.alimenta(30);
        System.out.println(josh.humor());
        josh.brincar(20);
        System.out.println(josh.humor());
    }





}
