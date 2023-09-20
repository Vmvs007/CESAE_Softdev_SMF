package Ex_01;

public class Main {
    public static void main(String[] args) {

        Musica theScientist = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica bohemianRapsody = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica nossaDanca = new Musica("Nossa Danca", "Genero 1", "Calema", 115);
        Musica estaVida = new Musica("Esta Vida", "Eletronica", "Marshmello", 300);
        Musica vampire = new Musica("Vampire", "Classica", "Olivia Rodrigo", 230);
        Musica precoCerto = new Musica("Olarilole", "Nem sei", "Pedro Mafama", 600);
        Musica mozartSinfonia5 = new Musica("Sinfonia 5", "Classica", "Mozart",5990);


        MusicPlayer mp = new MusicPlayer();

        mp.addMusica(theScientist);
        mp.addMusica(bohemianRapsody);
        mp.addMusica(nossaDanca);
        mp.addMusica(estaVida);
        mp.addMusica(vampire);
        mp.addMusica(precoCerto);

        mp.alterarMusica(mozartSinfonia5,5);

        mp.imprimirRelatorio();

        System.out.println();

        mp.imprimirDuracaoProgramacao();

        System.out.println();

mp.trocarMusica(0,5);
mp.imprimirRelatorioForEach();

    }




}
