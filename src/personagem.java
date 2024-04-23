public class personagem {
    int Hp;
    public int Stamina;
    public String nome;


    public personagem(int Hp, int Estamina, String nome){
        this.Hp = Hp;
        this.Stamina = Estamina;
        this.nome = nome;
    }

    public void hp(){
        Hp -= 5;
    }
    public void Stamina(){
        Stamina -= 20;
    }

}
