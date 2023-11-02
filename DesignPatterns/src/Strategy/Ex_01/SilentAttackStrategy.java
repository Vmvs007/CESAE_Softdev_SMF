package Strategy.Ex_01;

public class SilentAttackStrategy implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Realizar um ataque silencioso");
    }
}
