package AirplaneStore;

import AirplaneStore.Enums.Arma;
import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

public class Main {
    public static void main(String[] args) {

        JatoPrivado gulfstream = new JatoPrivado(111222, 2005,2,"Gulfstream A15",5500,15,18,3,8000,400,5000000,8,1000, CategoriaJato.LIGHT_JET);
        gulfstream.addInstalacao(Instalacao.WC);
        gulfstream.addInstalacao(Instalacao.TOMADAS);
        gulfstream.addInstalacao(Instalacao.CINEMA);

        JatoPrivado cessna = new JatoPrivado(111333, 2016, 2, "Cessna Citation", 8000,22,26,4,7900,420,7500000,10,1500,CategoriaJato.MIDSIZE_JET);
        cessna.addInstalacao(Instalacao.WC);
        cessna.addInstalacao(Instalacao.TOMADAS);
        cessna.addInstalacao(Instalacao.SUITE);
        cessna.addInstalacao(Instalacao.ESCRITORIO);

        JatoPrivado bombardier = new JatoPrivado(111444,2020,2,"Bombardier Learjet", 11500,28,34,6,8100,450,10000000,22,1800,CategoriaJato.HEAVY_JET);
        bombardier.addInstalacao(Instalacao.WC);
        bombardier.addInstalacao(Instalacao.WC);
        bombardier.addInstalacao(Instalacao.TOMADAS);
        bombardier.addInstalacao(Instalacao.TOMADAS);
        bombardier.addInstalacao(Instalacao.COZINHA);

        AviaoCombate f16 = new AviaoCombate(999000,2010,1,"F16",2000,8,6,1.5,2500,800,17000000,"USA",false);
        f16.addArma(Arma.METRALHADORA);
        f16.addArma(Arma.FOGUETES);

        AviaoCombate f35 = new AviaoCombate(999111,2020,2,"F35", 1900,9,6.5,1.8,3500,1000,50000000,"USA",true);
        f35.addArma(Arma.METRALHADORA);
        f35.addArma(Arma.FOGUETES);
        f35.addArma(Arma.MISSEIS);

        AviaoCombate rafale = new AviaoCombate(999222, 2021, 1,"Dassault Rafale",2800,8.5,7,2,1900,750,55000000,"França",true);
        rafale.addArma(Arma.BOMBAS);
        rafale.addArma(Arma.METRALHADORA);
        rafale.addArma(Arma.FOGUETES);
        rafale.addArma(Arma.TORPEDO);


        Catalogo airplaneStore = new Catalogo();

        airplaneStore.adquirirAviao(gulfstream);
        airplaneStore.adquirirAviao(cessna);
        airplaneStore.adquirirAviao(bombardier);

        airplaneStore.adquirirAviao(f16);
        airplaneStore.adquirirAviao(f35);
        airplaneStore.adquirirAviao(rafale);

        airplaneStore.imprimirCatalogo();
    }
}
