import java.util.Random;
public class Die {
    private int faceValue;
    public void roll() {
        Random rd = new Random();
        faceValue = rd.nextInt(6) + 1;
    }
    public int getFaceValue() {
        return faceValue;
    }
}
