package Ex_02;

public class Main {

    public static void main(String[] args) {

        Pessoa vitor = new Pessoa("Vitor S.", "911 111 111", "vmvs007@gmail.com",24);
        Pessoa ana = new Pessoa("Ana S.", "911 111 222", "ana@gmail.com",20);
        Pessoa quim = new Pessoa("Quim A.", "911 111 333", "quim@gmail.com",50);
        Pessoa joana = new Pessoa("Joana P.", "911 111 444", "joana@gmail.com",12);
        Pessoa pedro = new Pessoa("Pedro P.", "911 111 555", "pedro@gmail.com",17);
        Pessoa joao = new Pessoa("Joao A.", "911 111 666", "joao@gmail.com",80);

        Sorteio euromilhoes = new Sorteio(1700000);

        euromilhoes.adicionarParticipante(vitor);
        euromilhoes.adicionarParticipante(ana);
        euromilhoes.adicionarParticipante(quim);
        euromilhoes.adicionarParticipante(joana);
        euromilhoes.adicionarParticipante(pedro);
        euromilhoes.adicionarParticipante(joao);

        euromilhoes.imprimirParticipantes();

        Pessoa vencedor= euromilhoes.sortear();

        System.out.println("\n***** Grande Vencedor *****");
        System.out.println(vencedor.getNome()+" | "+vencedor.getIdade());


    }
}
