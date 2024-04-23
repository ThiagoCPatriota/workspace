public class monstro {
    public String nome;
    public String Arma;
    int Hp;


    public monstro(int Hp, String Arma, String nome){
        this.Hp = Hp;
        this.Arma = Arma;
        this.nome = nome;
    }


    public void hp(){
        Hp -= 10;
    }
}
