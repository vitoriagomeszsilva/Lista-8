public class Bichinho    {
  
    private String nomeBichinho ;
    private int fomeBichinho ;
    private int saudeBichinho ; 
    private int idadeBichinho ;
    
    public Bichinho (String nomeBichinho, int fomeBichinho, int saudeBichinho, int idadeBichinho) {
        this.nomeBichinho = nomeBichinho;
        this.fomeBichinho = fomeBichinho;
        this.saudeBichinho = saudeBichinho;
        this.idadeBichinho = idadeBichinho;
    }


   
    public void TrocaNome(String nomeBichinho) {
        this.nomeBichinho = nomeBichinho;
    }

    public int retornafomeBichinho() {
        return fomeBichinho;
    }
    
    public String pegaNome() {
        return nomeBichinho;
    }

    public void mudafomeBichinho(int fomeBichinho) {
        this.fomeBichinho = fomeBichinho;
    }

      public void mudasaudeBichinho(int saudeBichinho) {
        this.saudeBichinho = saudeBichinho;
    }

    public int pegasaudeBichinho() {
        return saudeBichinho;
    }


    public int pegaidadeBichinho() {
        return idadeBichinho;
    }


    public float humorBichinho() {
        return retornafomeBichinho() * pegasaudeBichinho();
    }

    public void mudaIdade(int idadeBichinho) {
        this.idadeBichinho = idadeBichinho;
    
    }

    public static void main(String[] args) {
        Bichinho toby = new Bichinho("toby", 0,99, 2);
        System.out.println(toby.humorBichinho());
        toby.mudaIdade(7);
        System.out.println(toby.pegaidadeBichinho());
        toby.TrocaNome("Jose");
        System.out.println(toby.pegaNome());
        toby.mudafomeBichinho(34);
        System.out.println(toby.retornafomeBichinho());
        toby.mudasaudeBichinho(75);
        System.out.println(toby.pegasaudeBichinho());
        System.out.println(toby.humorBichinho());
    }





}
