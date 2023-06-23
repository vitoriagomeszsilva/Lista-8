public class Quadrado {
    
    private float lado;
 

    public Quadrado(float lado){

        super();
        this.lado = lado;
    }

    public void trocaLado(float lado){
        
       this.lado = lado;

    }

    public float retornaLado(){
        
        return lado;

    }

    public float calcArea(){
        
        return this.lado* this.lado;

    }


     public static void main(String[] args){

        Quadrado q = new Quadrado(8);
        System.out.println(q.calcArea());
        
    }
}
