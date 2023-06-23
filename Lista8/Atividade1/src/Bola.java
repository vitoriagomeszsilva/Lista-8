public class Bola {


    private String corBola;
    private int circunferenciaBola;
    private String materialBola;


    public Bola( String corBola, int circunferenciaBola,String materialBola){

        super();
        this.corBola =corBola;
        this.circunferenciaBola = circunferenciaBola ;
        this.materialBola = materialBola;
    }

    public void trocaCorBola( String corBola){
        
        this.corBola = corBola;

    }


    public String mostraCorBola(){
        
        return this.corBola;

    }
     public static void main(String[] args){

        Bola b = new Bola("roxa", 17,"madeira");
        System.out.println(b.mostraCorBola());
        b.trocaCorBola("azul");
        System.out.println(b.mostraCorBola());
    }
}

 
    

