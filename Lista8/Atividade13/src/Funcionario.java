public class Funcionario {


    private String nomeFunc;
    private double salarioFunc;

    public Funcionario (String nomeFuncionario,double salario ){

        this.nomeFunc = nomeFuncionario;
        this.salarioFunc = salario;

    }

    public String returnNome() {
        return nomeFunc;
    }

    public double returnSalario() {
        return salarioFunc;
    }
    
    public static void main(String[] args){

        Funcionario Func = new Funcionario("samuel", 850);
        System.out.println("Nome: " + Func.returnNome() + ", Salário: " +Func.returnSalario());

    }
}

    



