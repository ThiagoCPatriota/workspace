public class personagem {
    int Hp = 15;
    int Estamina = 100;
    public String nome;
    public int hp(int modificacao){
        Hp -=  modificacao;
        return Hp;
    }
    public int Stamina(int modificacao){
        Estamina -=  modificacao;
        return Estamina;
    }
}
