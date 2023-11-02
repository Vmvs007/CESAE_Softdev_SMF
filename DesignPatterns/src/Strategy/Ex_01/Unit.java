package Strategy.Ex_01;

public class Unit {

    private String nome;
    private int vida;
    private int forca;
    private AttackStrategy attackStrategy;

    public Unit(String nome, int vida, int forca, AttackStrategy attackStrategy) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.attackStrategy = attackStrategy;
    }

    public void performAttack(){
        attackStrategy.attack();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }


}
