package players.healers.remedies;

public class Herbs extends Remedies {

    private int healAmount;

    public Herbs(int amount) {
        super(amount);
        this.healAmount = 5;
    }

    public int getHealAmount(){
        return healAmount;
    }
}
