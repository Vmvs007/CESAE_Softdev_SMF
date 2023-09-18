package Ex_03;

public class Main {
    public static void main(String[] args) {

        String[] vegetariano = {"Couve", "Cenoura", "Relva", "Broculo", "Palha"};
        String[] carnivoro = {"Frango", "Bife da Vazia", "Costeleta de Porco"};

        Animal elefante = new Animal("Trombas", "Elefante Africano","Zimbabue",1200,vegetariano);
        Animal leao = new Animal("Simba", "Leão Africano", "Africa do Sul", 350, carnivoro);

        Animal cao = new Animal("Bolinhas", "Cão Doméstico", "Portugal", 19, new String[]{"Ração","Biscoitos", "Pão"});


    }
}
