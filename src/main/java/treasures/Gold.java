package treasures;

public class Gold extends Treasure{

    private int value;

    public Gold(int amount) {
        super(amount);
        this.value = 1;
    }

    public int getValue(){
        return value;
    }
}