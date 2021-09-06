package players.healers.remedies;

public abstract class Remedies {

    private int amount;

    public Remedies(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}