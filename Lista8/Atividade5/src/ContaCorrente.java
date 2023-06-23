public class ContaCorrente {
    
    private String nome;
    private double saldoContaCorrente;
    private int numeroConta;
    
    
        public ContaCorrente(String nome,double saldoContaCorrente, int numeroConta){

                this.numeroConta = numeroConta;
                this.nome = nome;
                this.saldoContaCorrente = saldoContaCorrente;

        }

         public ContaCorrente(String nome, int numeroConta){

                this.numeroConta = numeroConta;
                this.nome = nome;
                this.saldoContaCorrente = 0.0f;

        }

        public void MudarNome(String nome){
                
                this.nome = nome;
                

        }

        public  void deposito(float valor){
                
                this.saldoContaCorrente += valor;
                

        }

        public  void saque(float valor){
                
                if (this.saldoContaCorrente>= valor){

                        this.saldoContaCorrente -= valor;
                }
                
        }

        @Override
        public String toString() {
                return "Conta numero=" + numeroConta + ", nome=" + nome + ", saldo=" + saldoContaCorrente ;
        }

        public static void main(String[] args) {
                ContaCorrente teste = new ContaCorrente("michele",134.0f, 78733 );
                System.out.println(teste.toString());
                teste.MudarNome("jose");
                teste.deposito(250);
                System.out.println(teste.toString());
                teste.saque(132);
                System.out.println(teste.toString());
}
    
}
