public class Funcionario {


    private String nomeFunc;
    private double salarioFunc;

    public Funcionario (String nomeFuncionario,double salario ){

        this.nomeFunc = nomeFuncionario;
        this.salarioFunc = salario;

    }

    public void newSalario(double valor) {

        this.salarioFunc = valor;
    }


    public double returnSalario() {
        return salarioFunc;
    }

     public String returnNome() {
        return nomeFunc;
    }
    
    public static void main(String[] args){

        Funcionario Func = new Funcionario("jose", 1200);
        System.out.println("Nome: " + Func.returnNome() + ", Salário: " +Func.returnSalario());
        Func.newSalario(1600);
        System.out.println("Nome: " + Func.returnNome() + ", Salário: " +Func.returnSalario());

    }
}

    



