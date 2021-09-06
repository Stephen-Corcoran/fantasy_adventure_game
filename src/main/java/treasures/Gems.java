package treasures;

public class Gems extends Treasure{

    private int value;

    public Gems(int amount) {
        super(amount);
        this.value = 10;
    }

    public int getValue(){
        return value;
    }
}
