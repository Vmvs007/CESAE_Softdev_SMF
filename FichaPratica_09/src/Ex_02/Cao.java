package Ex_02;

public class Cao {
    private String nome, raca, latido="Au au au";

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void ladrar(){
        System.out.println(this.latido);
    }

    public void ladrar3Vezes(){
        System.out.println(this.latido);
        System.out.println(this.latido);
        System.out.println(this.latido);
    }



}
