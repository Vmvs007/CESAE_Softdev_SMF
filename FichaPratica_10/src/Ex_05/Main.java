package Ex_05;

public class Main {
    public static void main(String[] args) {

        Pessoa vitor = new Pessoa("Vitor","vmvs007@gmail.com","911 111 111", 24);
        Pessoa quim = new Pessoa("Joaquim", "quim@gmail.com","912 222 222", 40);
        Pessoa maria = new Pessoa("Maria", "maria@outlook.com", "933 333 333", 30);
        Pessoa tomas = new Pessoa("Tomas", "tomas@mail.pt", "924 444 444", 29);

        Agenda aMinhaAgenda = new Agenda();

        aMinhaAgenda.addPessoa(vitor);
        aMinhaAgenda.addPessoa(quim);
        aMinhaAgenda.addPessoa(maria);
        aMinhaAgenda.addPessoa(tomas);

        aMinhaAgenda.listarAgenda();

    }
}
