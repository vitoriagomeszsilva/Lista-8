public class Conta {

            private int nConta;
            private String nome;
            protected float dinheiroConta;

    public Conta(int nConta, String nome, float saldoConta){

                this.nConta = nConta;
                this.nome = nome;
                this.dinheiroConta = saldoConta;
    }

    public Conta(int nConta, String nome){

    this.nConta = nConta;
    this.nome = nome;
    this.dinheiroConta = 0.0f;

    }

    public void saque(float valor) {

        if (this.dinheiroConta >= valor) {
        this.dinheiroConta -= valor;
        }
    }

    public void deposito(float valor) {
        this.dinheiroConta += valor;

    }

  

     public void alterNome(String nome) {
        this.nome = nome;
    }


    public String conveString() {

        return "numero=" + nConta + ", nome=" + nome + ", saldo=" + dinheiroConta ;

        }

        public class ContaInvestimento extends Conta{

        private float taxaJuros;

        public ContaInvestimento(int numeroConta, String nome, float saldoConta, float taxaJuros){

            super(numeroConta, nome, saldoConta);
            this.taxaJuros = taxaJuros;

        }

        public void Juros() {

            this.dinheiroConta += (this.dinheiroConta * this.taxaJuros/100);

        }


        public String tostString() {

            return "taxaJuros=" + taxaJuros + ", saldo=" + dinheiroConta ;

        }
    
    


    }

    public static void main(String[] args){

        Conta nubank = new Conta(929291, "nino", 900);
        Conta.ContaInvestimento  contaInvestimento = nubank.new ContaInvestimento(123, "Jose", 1000, 10);

        System.out.println(contaInvestimento.tostString());
        contaInvestimento.Juros();
        contaInvestimento.Juros();
        contaInvestimento.Juros();
        contaInvestimento.Juros();
        contaInvestimento.Juros();
        System.out.println(contaInvestimento.tostString());
    }



    



}

