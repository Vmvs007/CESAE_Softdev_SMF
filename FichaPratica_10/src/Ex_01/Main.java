package Ex_01;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Mercedes","A45",2022,420,2000,15,TipoCombustivel.GASOLINA);
        Carro carro2 = new Carro("Ford","Mustang",1970,420,2000,30,TipoCombustivel.GASOLINA);
        Carro carro3 = new Carro("Datsun","1200",1975,90,1200,30,TipoCombustivel.DIESEL);
        Carro carro4= new Carro("Renault", "Clio",2010,110,1600,7,TipoCombustivel.DIESEL);

        carro1.ligar();
        carro2.ligar();
        carro3.ligar();
        carro4.ligar();
        
        System.out.println("\nVencedor da Corrida 1:");

        Carro vencedor1 = carro1.corrida(carro2);
        vencedor1.exibirDetalhes();

        System.out.println("\nVencedor da Corrida 2:");

        Carro vencedor2 = carro3.corrida(carro4);
        vencedor2.exibirDetalhes();

        System.out.println("\nVencedor da Corrida Final:");

        Carro grandeVencedor = vencedor1.corrida(vencedor2);
        grandeVencedor.exibirDetalhes();

        /*
        if(vencedor==null){
            System.out.println("Nenhum! Foi empate!");
        }else{
            vencedor.exibirDetalhes();
        }
        */




    }



}
