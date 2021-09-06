package treasures;

public abstract class Treasure {

    private int amount;

    public Treasure(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}
