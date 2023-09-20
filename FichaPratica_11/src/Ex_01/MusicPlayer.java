package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }

    public void addMusica(Musica musicaNova){
        this.programacao.add(musicaNova);
    }

    public void alterarMusica (Musica musicaNova, int index){
        this.programacao.set(index,musicaNova);
    }

    public void trocarMusica(int index1, int index2){
        Musica musicaAux = this.programacao.get(index1);

        this.programacao.set(index1,this.programacao.get(index2));
        this.programacao.set(index2, musicaAux);
    }

    public void removerMusica (int index){
        this.programacao.remove(index);
    }

    public void limparLista(){
        this.programacao.clear();
    }

    public void imprimirRelatorio(){
        for(int i=0; i<this.programacao.size(); i++){
            System.out.println("Musica "+(i+1)+": "+this.programacao.get(i).getTitulo()+" | "+this.programacao.get(i).getGenero()+" | "+this.programacao.get(i).getArtista()+" | "+this.programacao.get(i).getDuracaoSeg());
        }
    }

    public void imprimirRelatorioForEach(){
        for(Musica musica : this.programacao){
            System.out.println("Musica: "+musica.getTitulo()+" | "+musica.getGenero()+" | "+musica.getArtista()+" | "+musica.getDuracaoSeg());
        }
    }

    public void imprimirDuracaoProgramacao(){

        int totalSegundos=0;
        int horas, minutos, segundos;

        for(Musica musica: this.programacao){
           totalSegundos+=musica.getDuracaoSeg();
        }

        System.out.println("Total de Segundos da Programação: "+totalSegundos);

        horas = totalSegundos/3600;

        minutos = (totalSegundos/60)-(horas*60);

        segundos = totalSegundos - (horas*3600) - (minutos*60);

        System.out.println("Duração Total: "+horas+"h " + minutos+"m "+segundos+"s");
    }

}



