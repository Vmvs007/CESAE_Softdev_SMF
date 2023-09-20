package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> participantes;

    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<Pessoa>();
    }

    public void adicionarParticipante(Pessoa novoParticipante){

        if(novoParticipante.getIdade()>=18){
            this.participantes.add(novoParticipante);
            System.out.println("Pessoa registada como participante");
        }else{
            System.out.println("Pessoa menor não pode participar no torneio");
        }
    }

    public void imprimirParticipantes(){
        System.out.println("\nParticipantes no Sorteio");
        for(Pessoa pessoa : this.participantes){
            System.out.println("Participante: "+pessoa.getNome()+" | "+pessoa.getTelemovel()+ " | "+pessoa.getEmail()+" | "+pessoa.getIdade());
        }
    }

    public Pessoa sortear(){

        Random random = new Random();

        // Gera um número aleatorio entre 0 e o index máximo encontrado no nosso Array
        int indexVencedor = random.nextInt(this.participantes.size());

        // Instanciar o vencedor de acordo com o index aleatorio
        Pessoa vencedor= this.participantes.get(indexVencedor);

        return vencedor;
    }


}
