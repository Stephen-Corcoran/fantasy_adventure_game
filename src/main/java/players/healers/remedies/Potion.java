package players.healers.remedies;

public class Potion extends Remedies {

    private int healAmount;

    public Potion(int amount) {
        super(amount);
        this.healAmount = 10;
    }

    public int getHealAmount(){
        return healAmount;
    }
}