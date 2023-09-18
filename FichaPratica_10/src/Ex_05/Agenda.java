package Ex_05;

public class Agenda {

    private Pessoa[] agenda;
    private int contadorPessoas=0;

    public Agenda() {
        this.agenda = new Pessoa[50];
    }

    /**
     * Método para adicionar novas Pessoas
     * @param pessoaNova Pessoa a adicionar
     */
    public void addPessoa(Pessoa pessoaNova){
        this.agenda[contadorPessoas++]= pessoaNova;
    }

    public void listarAgenda(){
        for(int i=0; i< this.contadorPessoas; i++){
            System.out.print("Contacto "+(i+1)+": ");
            this.agenda[i].exibirDetalhes();
        }
    }
}
