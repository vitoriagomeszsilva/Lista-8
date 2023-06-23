

class Carro {

  private double  consumoM;
  private double  nivelTanque;

  public Carro (double  consumoM){

    this.consumoM = consumoM;
    nivelTanque = 0;
    
  }

  public void andar(double distancia){

   double trip = this.consumoM / distancia;

      if (trip <= this.nivelTanque) {
            this.nivelTanque -= trip;
            System.out.println("O veículo percorreu " + distancia + " km.");
        } else {
            System.out.println("O veículo não pode percorrer essa distância.");
        }
    
  }



  public  double  nivelCombustiovel(){

    return this.nivelTanque;
      
  }

  public void abastecer(double litrosAbastecidos){

      this.nivelTanque = litrosAbastecidos + this.nivelTanque;
    
  }


  
    public static void main(String[] args) {
          Carro fit = new Carro(24); 
          fit.abastecer(30); 
          fit.andar(100); 
          System.out.println("Combustível no tanque : " + fit.nivelCombustiovel()+ "    litros.");


   }


  
}

