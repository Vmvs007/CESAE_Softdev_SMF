import Enums.AlimentacaoAnimal;
import Enums.FamiliaPlanta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MeioAmbiente {
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    /**
     * Método Construtor de Meio Ambiente
     *
     * @param nome Nome do Meio
     * @param agua Quantidade de Água presente no Meio
     */
    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>();
    }

    public void addSerVivo(SerVivo serVivoNovo) {
        this.seres.add(serVivoNovo);
    }

    /**
     * Método para uma planta beber água
     *
     * @param indexPlanta Index da planta que irá beber
     * @return True se bebeu || False se morreu de sede
     */
    public boolean plantaBebe(int indexPlanta) {

        // Criar objeto temporário: "plantaAtual" com a planta sorteada
        Planta plantaAtual = (Planta) this.seres.get(indexPlanta);

        System.out.print(plantaAtual.getNome() + " vai tentar beber água: ");

        // Detetar a família da planta para poder beber a quantidade de água adequada
        switch (plantaAtual.getFamilia()) {
            case ARVORE:
                if (this.agua > 1) { // Caso tenha água suficiente para árvore beber
                    System.out.println("Sucesso");
                    this.agua--; // Remove 1L de água
                    return true;
                } else {
                    System.out.println("Água Indisponivel... Morreu de sede");
                    this.seres.remove(plantaAtual); // Planta morre e é removida do Array "seres"
                    return false;
                }


            case ERVA:
                if (this.agua > 0.25) { // Caso tenha água suficiente para erva beber
                    System.out.println("Sucesso");
                    this.agua -= 0.25; // Remove 0.25L de água
                    return true;
                } else {
                    System.out.println("Água Indisponivel... Morreu de sede");
                    this.seres.remove(plantaAtual); // Planta morre e é removida do Array "seres"
                    return false;
                }


            case FLOR:
                if (this.agua > 0.1) { // Caso tenha água suficiente para flor beber
                    System.out.println("Sucesso");
                    this.agua -= 0.1; // Remove 0.1L de água
                    return true;
                } else {
                    System.out.println("Água Indisponivel... Morreu de sede");
                    this.seres.remove(plantaAtual); // Planta morre e é removida do Array "seres"
                    return false;
                }

        }

        return false; // Return genérico (inalcansável)
    }

    /**
     * Método para uma planta comer um inseto
     *
     * @param indexPlanta Index da planta que vai comer
     * @return True se comeu || False se não comeu e morreu de fome
     */
    public boolean plantaComeInsetos(int indexPlanta) {
        Planta plantaAtual = (Planta) this.seres.get(indexPlanta);

        // Array que vai guardar todos os indexes de todos os insetos
        ArrayList<Integer> indexInsetos = new ArrayList<Integer>();

        // Ciclo que vai iterar array de seres
        for (int i = 0; i < this.seres.size(); i++) {
            // Caso o elemento atual seja inseto
            if (this.seres.get(i) instanceof Inseto) {
                // Guarda no Array de indexes, o index atual
                indexInsetos.add(i);
            }
        }

        // Analisar o tamanho do array resultante
        if (indexInsetos.size() == 0) {
            // Caso seja 0, a planta não consegue comer e morre
            this.seres.remove(indexPlanta);
            return false;
        } else {
            // Sortear um index de um inseto
            int insetoSorteado = new Random().nextInt(0, indexInsetos.size());

            // Remover o inseto sorteado (comido)
            this.seres.remove(insetoSorteado);
            return true;
        }
    }

    /**
     * Método para um planta abanar com o Vento
     *
     * @param indexPlanta
     */
    public void plantaAbanaComVento(int indexPlanta) {
        System.out.println("Está muito vento");
    }

    public void animalFazBarulho(int indexAnimal) {
        System.out.println(((Animal) this.seres.get(indexAnimal)).getBarulho());
    }

    public void animalMovimenta(int indexAnimal) {
        System.out.println("O " + ((Animal) this.seres.get(indexAnimal)).getNome() + " movimentou-se");
    }

    /**
     * Método para um animal beber água
     *
     * @param indexAnimal Index do animal que vai tentar beber
     * @return True se bebey || False se não bebeu e morreu de sede
     */
    public boolean animalBebe(int indexAnimal) {

        // Criar objeto temporário: "animalAtual" com o animal sorteado

        Animal animalAtual = (Animal) this.seres.get(indexAnimal);

        System.out.print(animalAtual.getNome() + " vai tentar beber água: ");

        // Perceber qual a qunatidade de agua que vai tentar beber
        double aguaBeber = animalAtual.getPeso() * 0.025;

        // Perceber se há água suficiente
        if (this.agua >= aguaBeber) { // Tem água suficiente
            // Remove a água bebida
            this.agua -= aguaBeber;
            return true;
        } else { // Não tem água suficiente, animal morre de sede
            this.seres.remove(indexAnimal);
            return false;
        }
    }

    /**
     * Método para um animal se alimentar
     *
     * @param indexAnimal Index do animal que vai comer
     * @return True se comeu || False se não comeu e morreu de fome
     */
    public boolean animalCome(int indexAnimal) {
        Animal animalAtual = (Animal) this.seres.get(indexAnimal);
        boolean comeu = false;

        this.seres.remove(animalAtual);

        if (animalAtual.getDieta().equals(AlimentacaoAnimal.HERBIVORO)) {
            comeu = animalHerbivoroCome(indexAnimal);
        }

        if (animalAtual.getDieta().equals(AlimentacaoAnimal.CARNIVORO)) {
            comeu = animalCarnivoroCome(indexAnimal);
        }

        if (animalAtual.getDieta().equals(AlimentacaoAnimal.OMNIVORO)) {
            comeu = animalOmnivoroCome(indexAnimal);
        }

        // Volta a adicionar ao Array o animal atual
        this.seres.add(animalAtual);
        return comeu;
    }

    public boolean animalHerbivoroCome(int indexAnimal) {
        int indexPlantaAComer = sortearPlanta();
        return animalComePlanta(indexAnimal, indexPlantaAComer);
    }

    /**
     * Método para um herbivoro comer
     *
     * @param indexAnimal
     * @return
     */
    public boolean animalComePlanta(int indexAnimal, int presaSorteada) {


        Animal animalAtual = (Animal) this.seres.get(indexAnimal);

        // Perceber se há plantas no array
        if (presaSorteada == -1) {
            // Não há plantas
            return false;
        } else {
            // Há plantas para comer
            Planta plantaAComer = (Planta) this.seres.get(presaSorteada);

            // Analisar a inteligencia do animal vs mecanismo de defesa da planta
            switch (plantaAComer.getGrauDefesa()) {
                case 0: // Todos os animais podem comer
                    this.seres.remove(presaSorteada);
                    return true;

                case 1: // Apenas animais com 20 ou mais
                    if (animalAtual.getInteligencia() >= 20) {
                        // Animal teve inteligencia para comer
                        return true;
                    } else {
                        // Animal não teve inteligencia para comer
                        return false;
                    }

                case 2: // Apenas animais com 40 ou mais
                    if (animalAtual.getInteligencia() >= 40) {
                        // Animal teve inteligencia para comer
                        return true;
                    } else {
                        // Animal não teve inteligencia para comer
                        return false;
                    }

                case 3: // Apenas animais com 60 ou mais
                    if (animalAtual.getInteligencia() >= 60) {
                        // Animal teve inteligencia para comer
                        return true;
                    } else {
                        // Animal não teve inteligencia para comer
                        return false;
                    }

                case 4: // Apenas animais com 80 ou mais
                    if (animalAtual.getInteligencia() >= 80) {
                        // Animal teve inteligencia para comer
                        return true;
                    } else {
                        // Animal não teve inteligencia para comer
                        return false;
                    }

                case 5: // Apenas animais com 95 ou mais
                    if (animalAtual.getInteligencia() >= 95) {
                        // Animal teve inteligencia para comer
                        return true;
                    } else {
                        // Animal não teve inteligencia para comer
                        return false;
                    }
            }
        }
        return false;  // Return genérico (inalcansável)
    }

    public boolean animalCarnivoroCome(int indexAnimal) {
        // Array que vai guardar todos os indexes de todas os animais e insetos
        ArrayList<Integer> indexAnimaisInsetos = new ArrayList<Integer>();

        // Ciclo que vai iterar array de seres
        for (int i = 0; i < this.seres.size(); i++) {
            // Caso o elemento atual seja animal ou inseto
            if (this.seres.get(i) instanceof Animal || this.seres.get(i) instanceof Inseto) {
                // Guarda no Array de indexes, o index atual
                indexAnimaisInsetos.add(i);
            }
        }

        // Analisar se há animais ou insetos no array
        if (indexAnimaisInsetos.size() > 0) {

            // Sortear um index de um animal ou inseto
            int presaSorteada = new Random().nextInt(0, indexAnimaisInsetos.size());

            // Se for animal
            if (this.seres.get(presaSorteada) instanceof Animal) {
                return animalComeAnimal(indexAnimal, presaSorteada);
            }

            // Se for inseto
            if (this.seres.get(presaSorteada) instanceof Inseto) {
                return animalComeInseto(indexAnimal, presaSorteada);
            }


        } else {
            // Não há comida
            return false;
        }

        return false;  // Return genérico (inalcansável)
    }


    public boolean animalComeAnimal(int indexPredador, int indexPresa) {
        double capacidadePredador, capacidadePresa;

        Animal predador = (Animal) this.seres.get(indexPredador);
        Animal presa = (Animal) this.seres.get(indexPresa);

        capacidadePredador = predador.getPeso() + (predador.getInteligencia() * 2.5);
        capacidadePresa = predador.getPeso() + (predador.getInteligencia() * 2.5);

        // Avaliar se o predador tem capacidade de comer a presa
        if (capacidadePredador >= capacidadePresa) {
            // Come a presa
            this.seres.remove(indexPresa);
            predador.setFome(false);
            return true;

        } else {
            // Nao tem capacidade
            return false;
        }

    }

    public boolean animalComeInseto(int indexPredador, int indexPresa) {

        Animal predador = (Animal) this.seres.get(indexPredador);
        Inseto presa = (Inseto) this.seres.get(indexPresa);

        // Analisar se o inseto é venenoso
        if (presa.isVenenoso()) {
            // Caso seja venenoso
            this.seres.remove(indexPredador);
            return false;
        } else {
            // Animal come o inseto
            this.seres.remove(indexPresa);
            predador.setFome(false);
            return true;
        }
    }

    public boolean animalOmnivoroCome(int indexAnimal) {
        // Analisar se há plantas, animais ou insetos no array
        if (this.seres.size() > 0) {

            // Sortear um index de um animal ou inseto
            int presaSorteada = new Random().nextInt(0, this.seres.size());

            // Se for planta
            if (this.seres.get(presaSorteada) instanceof Planta) {
                return animalComePlanta(indexAnimal, presaSorteada);
            }

            // Se for animal
            if (this.seres.get(presaSorteada) instanceof Animal) {
                return animalComeAnimal(indexAnimal, presaSorteada);
            }

            // Se for inseto
            if (this.seres.get(presaSorteada) instanceof Inseto) {
                return animalComeInseto(indexAnimal, presaSorteada);
            }


        }
        // Não há comida
        return false;

    }


    /**
     * Método para um inseto chatear com um barulho aleatório
     */
    public void insetoChateia() {
        int barulhoInseto = new Random().nextInt(0, 2);

        switch (barulhoInseto) {
            case 0:
                System.out.println("Bzzzz Bzzzz");
                break;

            case 1:
                System.out.println("Tic tic tic tic");
                break;

            case 2:
                System.out.println("Psssssssss");
                break;
        }
    }

    /**
     * Método que simula dias no Meio Ambiente
     *
     * @param diasSimular Dias a Simular
     */
    public void simulador(int diasSimular) {

        // Ciclo vai correr uma vez para cada dia - Controlo de dias
        for (int diaAtual = 1; diaAtual <= diasSimular; diaAtual++) {

            comecaDia();

            // O dia desenvolve...
            // 0 = manhã | 1 = tarde | 2 = noite
            for (int momentoDia = 0; momentoDia < 3; momentoDia++) {

                switch (momentoDia) {
                    case 0: // Manhã
                        System.out.println("\n\n*** Manhã ***");
                        break;

                    case 1: // Tarde
                        System.out.println("\n\n*** Tarde ***");
                        break;

                    case 2: // Noite
                        System.out.println("\n\n*** Noite ***");
                        break;

                }
                momentoDia();
            }

            // Acaba o dia
            System.out.println("\n** Dia Prestes a Terminar **");
            //fimDoDia();

        }

    }

    /**
     * Método que imprime todos os seres vivos
     */
    public void imprimirSeresVivos() {
        int contador = 0;
        for (SerVivo serVivoAtual : this.seres) {

            System.out.println("\nSer [" + contador + "]: ");

            // Verificar o tipo de ser vivo

            // Se for planta
            if (serVivoAtual instanceof Planta) {
                Planta plantaImprimir = (Planta) serVivoAtual;
                plantaImprimir.exibirDetalhes();
            }

            // Se for animal
            if (serVivoAtual instanceof Animal) {
                Animal animalImprimir = (Animal) serVivoAtual;
                animalImprimir.exibirDetalhes();
            }

            // Se for inseto
            if (serVivoAtual instanceof Inseto) {
                Inseto insetoImprimir = (Inseto) serVivoAtual;
                insetoImprimir.exibirDetalhes();
            }

            contador++;
        }
    }

    /**
     * Método que coloca todos os animais com fome
     */
    public void tudoComFome() {

        // Ciclo que vai iterar array de seres
        for (int i = 0; i < this.seres.size(); i++) {
            // Caso o elemento atual seja animal
            if (this.seres.get(i) instanceof Animal) {
                // Guarda no Array de indexes, o index atual
                ((Animal) this.seres.get(i)).setFome(true);
            }
        }
    }

    /**
     * Método que comeca um dia (imprime seres que estão vivos e passa todos os animais a esfomeados)
     */
    public void comecaDia() {
        System.out.println("\n* * * * * Um novo dia começa no " + this.nome + " * * * * *\n");

        tudoComFome();

        System.out.println("* * * Seres com vida * * *");

        imprimirSeresVivos();
    }


    /**
     * Método que termina um dia (dá oportunidade aos animais com fome de comerem)
     */
    public void fimDoDia() {

        Collections.shuffle(this.seres);

        ArrayList<Integer> animaisMortos = new ArrayList<>();

        // Ciclo que vai iterar para cada animal esfomeado
        for (SerVivo serVivoAtual : this.seres) {

           if(serVivoAtual instanceof Animal){

               Animal animalAtual = (Animal) serVivoAtual;

               if(animalAtual.isFome()){
                   // Está com fome
                   System.out.print("Está com fome e vai comer (Index no array seres:" +this.seres.indexOf(animalAtual) +"): ");
                   animalAtual.exibirDetalhes();
                   System.out.println();

                   // Verificar se desta vez o animal consegue comer
                   if (animalCome(this.seres.indexOf(animalAtual))) {
                       // Caso coma
                   } else {
                       // Caso não coma, morre de fome
                       animaisMortos.add(this.seres.indexOf(animalAtual));
                   }

               }
           }
        }

        for (Integer indexAnimalMorto :animaisMortos){
            this.seres.remove(indexAnimalMorto);
        }

    }

    /**
     * Método para controlar acontecimentos de um momento de um dia
     */
    public void momentoDia() {
        //Escolhe aleatóriamente o acontecimento
        int acontecimento = new Random().nextInt(1, 4);

        switch (acontecimento) {
            case 1: // Planta
                System.out.println("* Planta *");
                acaoPlanta();
                break;

            case 2: // Animal
                System.out.println("* Animal *");
                acaoAnimal();
                break;

            case 3: // Inseto
                System.out.println("* Inseto *");
                acaoInseto();
                break;

            case 4: // Catástrofe
                System.out.println("* Catástrofe *");
                acaoCatastrofe();
                break;

        }
    }

    /**
     * Método para quando uma planta tem ação
     */
    public void acaoPlanta() {

        int indexPlantaSorteada = sortearPlanta();

        if (indexPlantaSorteada == -1) {
            System.out.println("Não há plantas para ter esta ação");
        } else {

            Planta plantaSorteada = (Planta) this.seres.get(indexPlantaSorteada);

            // Variável para sortear uma ação
            int acaoSorteada;

            // Sortear uma ação: BeberAgua, Comer Inseto, Abanar com Vento
            if (plantaSorteada.getFamilia().equals(FamiliaPlanta.COME_INSETOS)) {
                // Se for come insetos pode invocar 3 métodos
                acaoSorteada = new Random().nextInt(0, 2);
            } else {
                // Se não for come insetos pode invocar 2 métodos
                acaoSorteada = new Random().nextInt(0, 1);
            }

            switch (acaoSorteada) {
                case 0: // Beber Água
                    plantaBebe(indexPlantaSorteada);
                    break;

                case 1: // Abanar com vento
                    plantaAbanaComVento(indexPlantaSorteada);
                    break;

                case 2: // Comer Insetos
                    plantaComeInsetos(indexPlantaSorteada);
                    break;
            }
        }

    }

    /**
     * Método que devolve um index de uma planta aleatória
     *
     * @return Index de uma planta || -1 se não houver plantas
     */
    public int sortearPlanta() {
        // Array que vai guardar todos os indexes de todas as plantas
        ArrayList<Integer> indexPlantas = new ArrayList<Integer>();

        // Ciclo que vai iterar array de seres
        for (int i = 0; i < this.seres.size(); i++) {
            // Caso o elemento atual seja planta
            if (this.seres.get(i) instanceof Planta) {
                // Guarda no Array de indexes, o index atual
                indexPlantas.add(i);
            }
        }

        // Analisar se há planta no array
        if (indexPlantas.size() > 0) {
            // Sortear um index de uma planta
            int plantaSorteada = new Random().nextInt(0, indexPlantas.size());

            return indexPlantas.get(plantaSorteada);
        } else {
            return -1;
        }

    }

    /**
     * Método para quando um animal tem ação
     */
    public void acaoAnimal() {

        int indexAnimalSorteado = sortearAnimal();

        if (indexAnimalSorteado == -1) {
            System.out.println("Não há animais para ter esta ação");
        } else {

            // Variável para sortear uma ação
            int acaoSorteada = new Random().nextInt(0, 3);

            switch (acaoSorteada) {
                case 0: // Beber Água
                    animalBebe(indexAnimalSorteado);
                    break;

                case 1: // Comer
                    animalCome(indexAnimalSorteado);
                    break;

                case 2: // Fazer barulho
                    animalFazBarulho(indexAnimalSorteado);
                    break;

                case 3: // Movimentar
                    animalMovimenta(indexAnimalSorteado);
                    break;
            }
        }
    }


    /**
     * Método que devolve um index de um animal aleatório
     *
     * @return Index de um animal || -1 se não houver animais
     */
    public int sortearAnimal() {
        // Array que vai guardar todos os indexes de todas as plantas
        ArrayList<Integer> indexAnimais = new ArrayList<Integer>();

        // Ciclo que vai iterar array de seres
        for (int i = 0; i < this.seres.size(); i++) {
            // Caso o elemento atual seja animal
            if (this.seres.get(i) instanceof Animal) {
                // Guarda no Array de indexes, o index atual
                indexAnimais.add(i);
            }
        }

        // Analisar se há animal no array
        if (indexAnimais.size() > 0) {
            // Sortear um index de um animal
            int animalSorteado = new Random().nextInt(0, indexAnimais.size());

            return indexAnimais.get(animalSorteado);
        } else {
            return -1;
        }

    }

    /**
     * Método para quando um inseto tem ação
     */
    public void acaoInseto() {
        insetoChateia();
    }

    /**
     * Método que devolve um index de um inseto aleatório
     *
     * @return Index de um inseto || -1 se não houver insetos
     */
    public int sortearInseto() {
        // Array que vai guardar todos os indexes de todas os insetos
        ArrayList<Integer> indexInsetos = new ArrayList<Integer>();

        // Ciclo que vai iterar array de seres
        for (int i = 0; i < this.seres.size(); i++) {
            // Caso o elemento atual seja inseto
            if (this.seres.get(i) instanceof Inseto) {
                // Guarda no Array de indexes, o index atual
                indexInsetos.add(i);
            }
        }

        // Analisar se há inseto no array
        if (indexInsetos.size() > 0) {
            // Sortear um index de um animal
            int insetoSorteado = new Random().nextInt(0, indexInsetos.size());

            return indexInsetos.get(insetoSorteado);
        } else {
            return -1;
        }
    }

    /**
     * Método para quando acontece catástrofe
     */
    public void acaoCatastrofe() {
        // Variável para sortear uma ação
        int acaoSorteada = new Random().nextInt(0, 2);

        switch (acaoSorteada) {
            case 0: // Seca
                seca();
                break;

            case 1: // Chuva
                chuva();
                break;

            case 2: // Erupção Vulcânica
                erupacaoVulcanica();
                break;

        }
    }

    /**
     * Método para quando seca (água para metade)
     */
    public void seca() {
        this.agua /= 2;
    }

    /**
     * Método para quando chove (água para dobro)
     */
    public void chuva() {
        this.agua *= 2;
    }

    /**
     * Método para quando existe erupcao vulcanica (morrem metade das plantas e metade dos animais)
     */
    public void erupacaoVulcanica() {

        int contadorAnimais = 0, contadorPlantas = 0;

        // Ciclo que vai percorrer o array de seres
        for (SerVivo serAtual : this.seres) {

            if (serAtual instanceof Animal) { // Se for animal
                contadorAnimais++; // Incrementa o contador
            }

            if (serAtual instanceof Planta) { // Se for planta
                contadorPlantas++; // Incrementa o contador
            }
        }

        int contadorAnimaisRemover = contadorAnimais / 2;
        int contadorPlantasRemover = contadorPlantas / 2;

        // Ciclo que vai executar o número de animais a remover
        for (int i = 0; i < contadorAnimaisRemover; i++) {
            this.seres.remove(sortearAnimal());
        }

        // Ciclo que vai executar o número de plantas a remover
        for (int i = 0; i < contadorPlantasRemover; i++) {
            this.seres.remove(sortearPlanta());
        }
    }
}
