import java.util.Random;
public class dados {
    Random random = new Random();
    public int d20(){
        return random.nextInt(20);
    }
}
