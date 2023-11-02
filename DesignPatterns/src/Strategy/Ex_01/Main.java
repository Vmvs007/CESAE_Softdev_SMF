package Strategy.Ex_01;

public class Main {

    public static void main(String[] args) {
        Unit heroi = new Unit("Vitor",100,30,new MagicAttackStrategy());

        heroi.performAttack();

        heroi.performAttack();

        heroi.setAttackStrategy(new MeleeAttackStrategy());

        heroi.performAttack();

        heroi.setAttackStrategy(new SilentAttackStrategy());

        heroi.performAttack();
    }



}
