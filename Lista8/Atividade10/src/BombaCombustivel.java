public class BombaCombustivel {


    private String tipoCombust;
    private float valorLitro;
    private float quantCombustivel;


    
    public BombaCombustivel (String tipoCombust, float valorLitro, float quantCombustivel){

        this.tipoCombust = tipoCombust;
        this.valorLitro = valorLitro;
        this.quantCombustivel = quantCombustivel;

    }



    public double  abastecerLitro (float litrosAbast){

        double valortotal = valorLitro * litrosAbast;

        return valortotal;

    }

    public double abastecerValor (float valortotal ){

        double litrosAbast = valorLitro * valortotal;

        return litrosAbast;

    }

    

    public void alterarCombust (String tipoCombustivel){

        this.tipoCombust = tipoCombustivel;
    }

    public String retornaCombust(){

        return this.tipoCombust ;
        
    }

    public void alterarValor (float valorLitro){
            
        this.valorLitro = valorLitro;

    }

    public void alterarQuantCombustivel (float quantCombustivel){
                
        this.quantCombustivel = quantCombustivel;
  
    }

    public static void main(String[] args){

            BombaCombustivel a1 = new BombaCombustivel("Alcool", 3, 350);
            System.out.println(a1.abastecerValor(98));
            System.out.println(a1.quantCombustivel);
            a1.alterarCombust("Alcol");
            System.out.println(a1.retornaCombust());
            System.out.println(a1.quantCombustivel);
            System.out.println(a1.abastecerLitro(45));
            System.out.println(a1.quantCombustivel);
    }

    




}
