import java.util.ArrayList;


public class Macaco {
    

private String nome;
private ArrayList<Object> estomago = new ArrayList();

    public Macaco(String nome) {
        this.nome = nome;
    }
    

    public void alimentar(Object ob) {
        estomago.add(ob);
    }

    public void digerir() {
        if (!estomago.isEmpty())
        estomago.remove(estomago.size()-1);
    }

    public void Estomago() {
        for(Object i : estomago)
        System.out.println("estomago: " + i.toString());
    }

    
    public static void main(String[] args) {
        Macaco chita = new Macaco("juju");
        Macaco kong = new Macaco("jaja");
        chita.alimentar("pera");
        chita.Estomago();
        chita.alimentar("uva");
        chita.Estomago();
        chita.alimentar("caqui");
        chita.Estomago();
        chita.digerir();
        chita.Estomago();
        kong.alimentar("bluberry");
        kong.alimentar("laranja");
        kong.Estomago();
}


}
