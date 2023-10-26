import Enums.AlimentacaoAnimal;
import Enums.FamiliaPlanta;

public class Main {
    public static void main(String[] args) {

        // Instanciar plantas
        Planta acacia1 = new Planta("Acacia", "Acacia species", "Angola", 48, FamiliaPlanta.ARVORE, 2);
        Planta rose1 = new Planta("Rose", "Rosa species", "France", 30, FamiliaPlanta.FLOR, 4);
        Planta sunflower1 = new Planta("Sunflower", "Helianthus species", "USA", 15, FamiliaPlanta.FLOR, 3);
        Planta lavender1 = new Planta("Lavender", "Lavandula species", "Spain", 10, FamiliaPlanta.ERVA, 2);
        Planta oak1 = new Planta("Oak", "Quercus species", "United Kingdom", 80, FamiliaPlanta.ARVORE, 5);
        Planta tulip1 = new Planta("Tulip", "Tulipa species", "Netherlands", 5, FamiliaPlanta.FLOR, 2);
        Planta mint1 = new Planta("Mint", "Mentha species", "Italy", 3, FamiliaPlanta.ERVA, 1);
        Planta pine1 = new Planta("Pine", "Pinus species", "Canada", 50, FamiliaPlanta.ARVORE, 4);
        Planta daisy1 = new Planta("Daisy", "Bellis species", "Germany", 2, FamiliaPlanta.FLOR, 1);
        Planta basil1 = new Planta("Basil", "Ocimum species", "India", 1, FamiliaPlanta.ERVA, 1);
        Planta maple1 = new Planta("Maple", "Acer species", "Canada", 40, FamiliaPlanta.ARVORE, 3);
        Planta orchid1 = new Planta("Orchid", "Orchidaceae species", "Brazil", 7, FamiliaPlanta.FLOR, 2);
        Planta thyme1 = new Planta("Thyme", "Thymus species", "Greece", 4, FamiliaPlanta.ERVA, 1);
        Planta fir1 = new Planta("Fir", "Abies species", "Sweden", 60, FamiliaPlanta.ARVORE, 4);
        Planta marigold1 = new Planta("Marigold", "Tagetes species", "Mexico", 3, FamiliaPlanta.FLOR, 2);
        Planta eucalyptus1 = new Planta("Eucalyptus", "Eucalyptus species", "Australia", 25, FamiliaPlanta.ARVORE, 3);
        Planta thistle1 = new Planta("Thistle", "Cirsium species", "Scotland", 2, FamiliaPlanta.ERVA, 1);
        Planta venusFlytrap = new Planta("Venus Flytrap", "Venus Flytrap","Brasil",2,FamiliaPlanta.COME_INSETOS,5);

        // Instanciar animais
        Animal gorila = new Animal("Bono", "Gorila Silverback", "Congo", 24, 250, 97, "Uah uah uah! UH UH UH!", AlimentacaoAnimal.OMNIVORO);
        Animal leao = new Animal("Simba", "Leão", "Congo", 8, 180, 90, "Rugido poderoso!", AlimentacaoAnimal.CARNIVORO);
        Animal tigre = new Animal("Shere Khan", "Tigre", "Índia", 10, 200, 85, "Rugido ameaçador!", AlimentacaoAnimal.CARNIVORO);
        Animal elefante = new Animal("Dumbo", "Elefante", "Congo", 15, 5000, 80, "Trombeta alta!", AlimentacaoAnimal.HERBIVORO);
        Animal zebra = new Animal("Ziggy", "Zebra", "Congo", 5, 300, 75, "Relincho característico!", AlimentacaoAnimal.HERBIVORO);
        Animal macaco = new Animal("Curioso", "Macaco", "Brasil", 6, 10, 60, "Grito agudo!", AlimentacaoAnimal.OMNIVORO);
        Animal jaguar = new Animal("Juno", "Jaguar", "Brasil", 7, 80, 88, "Rugido furtivo!", AlimentacaoAnimal.CARNIVORO);
        Animal crocodilo = new Animal("Snappy", "Crocodilo", "Congo", 12, 300, 75, "Rugido profundo!", AlimentacaoAnimal.CARNIVORO);
        Animal papagaio = new Animal("Colorido", "Papagaio", "Brasil", 3, 1, 70, "Canto melódico!", AlimentacaoAnimal.OMNIVORO);
        Animal cobra = new Animal("Slytherin", "Cobra", "India", 5, 5, 65, "Sibilo sinistro!", AlimentacaoAnimal.CARNIVORO);
        Animal orangotango = new Animal("Rusty", "Orangotango", "Bornéu", 9, 70, 92, "Grito melancólico!", AlimentacaoAnimal.OMNIVORO);
        Animal rinoceronte = new Animal("Rocky", "Rinoceronte", "Congo", 20, 2000, 78, "Bufar poderoso!", AlimentacaoAnimal.HERBIVORO);
        Animal girafa = new Animal("Stretch", "Girafa", "Congo", 10, 1200, 85, "Rugido suave!", AlimentacaoAnimal.HERBIVORO);
        Animal hipopotamo = new Animal("Splash", "Hipopótamo", "Congo", 15, 1800, 75, "Grunhido forte!", AlimentacaoAnimal.HERBIVORO);
        Animal arara = new Animal("Rainbow", "Arara", "Brasil", 4, 2, 68, "Grito vibrante!", AlimentacaoAnimal.OMNIVORO);
        Animal lobo = new Animal("Luna", "Lobo", "Canadá", 6, 35, 80, "Uivo misterioso!", AlimentacaoAnimal.CARNIVORO);
        Animal panda = new Animal("Bamboo", "Panda", "China", 9, 150, 75, "Rugido fofo!", AlimentacaoAnimal.HERBIVORO);
        Animal tucano = new Animal("Tango", "Tucano", "Peru", 2, 0.5, 65, "Grito exótico!", AlimentacaoAnimal.OMNIVORO);
        Animal leopardo = new Animal("Leona", "Leopardo", "Angola", 5, 60, 85, "Rugido ágil!", AlimentacaoAnimal.CARNIVORO);
        Animal canguru = new Animal("Kang", "Canguru", "Austrália", 4, 50, 70, "Salto distintivo!", AlimentacaoAnimal.HERBIVORO);

        // Instanciar insetos
        Inseto mosca = new Inseto("Mosca Chata", "Mosca da Fruta", "Portugal",0,false);
        Inseto viuvaNegra= new Inseto("Aranha Viuva Negra", "Viuva Negra", "Australia",1,true);
        Inseto besouro = new Inseto("Besouro Gigante", "Besouro", "Brasil", 2, false);
        Inseto formiga = new Inseto("Formiga Cortadeira", "Formiga", "Argentina", 0, false);
        Inseto libelula = new Inseto("Libélula Azul", "Libélula", "Estados Unidos", 1, false);
        Inseto abelha = new Inseto("Abelha Rainha", "Abelha", "França", 3, true);
        Inseto borboleta = new Inseto("Borboleta Monarca", "Borboleta", "México", 0, false);
        Inseto escorpiao = new Inseto("Escorpião Amarelo", "Escorpião", "África do Sul", 4, true);

        // Instanciar meio
        MeioAmbiente amazonia = new MeioAmbiente("Floresta Amazónia", 2000);

        // Adicionar plantas ao meio ambiente
        amazonia.addSerVivo(acacia1);
        amazonia.addSerVivo(rose1);
        amazonia.addSerVivo(sunflower1);
        amazonia.addSerVivo(lavender1);
        amazonia.addSerVivo(oak1);
        amazonia.addSerVivo(tulip1);
        amazonia.addSerVivo(mint1);
        amazonia.addSerVivo(pine1);
        amazonia.addSerVivo(daisy1);
        amazonia.addSerVivo(basil1);
        amazonia.addSerVivo(maple1);
        amazonia.addSerVivo(orchid1);
        amazonia.addSerVivo(thyme1);
        amazonia.addSerVivo(fir1);
        amazonia.addSerVivo(marigold1);
        amazonia.addSerVivo(eucalyptus1);
        amazonia.addSerVivo(thistle1);
        amazonia.addSerVivo(venusFlytrap);

        // Adicionar animais ao meio ambiente
        amazonia.addSerVivo(gorila);
        amazonia.addSerVivo(leao);
        amazonia.addSerVivo(tigre);
        amazonia.addSerVivo(elefante);
        amazonia.addSerVivo(zebra);
        amazonia.addSerVivo(macaco);
        amazonia.addSerVivo(jaguar);
        amazonia.addSerVivo(crocodilo);
        amazonia.addSerVivo(papagaio);
        amazonia.addSerVivo(cobra);
        amazonia.addSerVivo(orangotango);
        amazonia.addSerVivo(rinoceronte);
        amazonia.addSerVivo(girafa);
        amazonia.addSerVivo(hipopotamo);
        amazonia.addSerVivo(arara);
        amazonia.addSerVivo(lobo);
        amazonia.addSerVivo(panda);
        amazonia.addSerVivo(tucano);
        amazonia.addSerVivo(leopardo);
        amazonia.addSerVivo(canguru);

        // Adicionar insetos ao meio ambiente
        amazonia.addSerVivo(mosca);
        amazonia.addSerVivo(viuvaNegra);
        amazonia.addSerVivo(besouro);
        amazonia.addSerVivo(formiga);
        amazonia.addSerVivo(libelula);
        amazonia.addSerVivo(abelha);
        amazonia.addSerVivo(borboleta);
        amazonia.addSerVivo(escorpiao);

        amazonia.simulador(40);

    }
}
