import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner scam = new Scanner(System.in);
        dados dados = new dados();
        menu menu = new menu();
        personagem perso = new personagem(15, 100, "");
        monstro monstro = new monstro(15, "Chifres", "Fabio Novaes");     
        int resultmenu = menu.menuprincipal();
        int i = 1;
        if(resultmenu == 1){
            System.out.println("Olá jogador, estamos quase pronto para iniciar a aventura: Dark and Darkness!, como deveriamos chama-lo:  ");
            perso.nome = scam.nextLine();
            System.out.println(
                    "Começando a aventura! \n" +
                    "A única coisa que "+perso.nome+" se lembra é que está sozinho...\n" +
                    "Você não sabe o porque, mas sabe que nesse momento se encontra em perigo.\n" +
                    "Você decidiu entrar nessa caverna para se aventurar junto com seus amigos... Nessa caverna fria, escura e mortal...\n" +
                    "E na tentativa de acha-los e fugir dessa escuridão, você se levanta e se depara com dois caminhos possiveis para prosseguir: \n\n" + 
                    "Direita (1): Um caminho onde o som de água e goteiras são predominates.\n" +
                    "Esquerda (2): Você obseva no chão pegadas seguindo essa direção.\n\n"
                    );
                    int opcao = scam.nextInt();
                    
                    if (opcao == 2){
                        perso.Stamina();
                        System.out.println("Você perdeu 20 de Stamina, Agora sua Stamina total é: " + perso.Stamina +"\n\n\n"+
                        "Finalmente você chega no outro lado da bifurcação...\n" +
                        "Mas seguido de um silencio, você escuta gritos na qual te deixa arrepiado dos pés a cabeça.\n" +
                        "Novamente você se encontra em outra bifurcação, mas onde uma deveria háver passo, há apenas sangue\n\n" +
                        "Direita (1): Um caminho coberto por sangue, você acredita ser de seus amigos...\n" +
                        "Esquerda (2): Um outro caminho alternativo, na tentativa de achar a saída..."
                        );
                        opcao = scam.nextInt();

                        if (opcao == 1){
                            perso.Stamina();
                            System.out.println("Você perdeu 10 de Stamina, Agora sua Stamina total é: " + perso.Stamina+"\n\n\n"+
                            "Desesperado ao escutar os gritos, você vai atrás de seus amigos...\n\n" +
                            "Mas, você ver que cometeu um erro, um que custar sua vida, VOCÊ NÃO VEIO COM SEUS AMIGOS.\n\n" +
                            "Então porque desses gritos?\n\n" + 
                            "Com os olhos marejados você olha para cima\n\n" +
                            "E se depera com um monstro enorme, um monstro capaz de copiar a voz humana...\n" +
                            "E com suas espadas em mão, você se prepara para lutar!\n"+ "Você saca sua espada e se prepara:");

                            while(true){
                                int d20inimigo = dados.d20();
                                int d20aliado = dados.d20();
                                System.out.println("_______________________________________________");
                                System.out.println("RODADA: "+ i);
                            System.out.println("Ataque (1): Tenta causar danos a seu inimigo\n" );
                            int ataque = scam.nextInt();
                                if (ataque == 1 && d20aliado >= d20inimigo){
                                    System.out.println("Você acertou e causou danos a seu inimigo\n\n");
                                    monstro.hp();
                                    System.out.println("vida atual do monstro: "+ monstro.Hp);
                                    
                                }
                                else{
                                    System.out.println("O inimigo esquivou");


                                }
                                d20inimigo = dados.d20();
                                d20aliado = dados.d20();
                                if(d20inimigo >= d20aliado){
                                    perso.hp();
                                    System.out.println("O monstro tentou revidar mas: ");
                                    System.out.println("O inimigo te ataca e te acerta em cheio, você leva 5 de dano");
                                    System.out.println("Sua vida Atual: "+ perso.Hp);
                                    
                                }
                                else{
                                    System.out.println("O monstro tentou revidar mas: ");
                                    System.out.println("Você esquivou");
                                    System.out.println("Sua vida Atual: "+ perso.Hp);
                                    
                                }
                                if (monstro.Hp <= 0){
                                    System.out.println("_______________________________________________");
                                    System.out.println("Você derrotou o monstro parabéns!");
                                    System.out.println("_______________________________________________");

                                    break;
                                } else if(perso.Hp <= 0){
                                    System.out.println("_______________________________________________");
                                    System.out.println("Você morreu!");
                                    System.out.println("_______________________________________________");

                                    break;
                                }
                                i++;
                            }
                        }else if(opcao == 2){
                            perso.Stamina();
                            System.out.println("Você corre e ignora tudo que está a sua volta, você não quer aceitar que todos que você gostavam estão mortos...\n" +
                            "Você no fim, consegue ver uma luz no fim do tunel, felizmente, não é a morte...\n" +
                            "OBRIGADO POR JOGAR!")
                        ;}
                    
                    }
                    else if(opcao == 1){
                        perso.Stamina();
                        System.out.println("você começa a ir em direção ao som de água e nela você encontra a saída, porém, entre ela e você exite uma grande cascata de água\n" + 
                        "Ela não parece muito alta para se pular, você pensa que seus amigos vieram por aqui, talvez se sua cabeça não estivesse doendo, você podia ter um melhor raciocinio antes de pular..." +
                        "Veja pelo lado bom, você saiu vivo!, bem não foi completamente inteiro... mas vivo."
                        );
                    }

        }           
    scam.close();
    }
    
}
