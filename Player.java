public class Player {
    
    private String name;
    private int maxHp;
    private int maxMp;
    private int actualHp;
    private int actualMp;
    private int baseAtk;
    private int baseMag;
    private int hPotions;
    private int mPotions;
    private int gold;
    
    public Player(String name, int maxHp, int maxMp, int baseAtk, int baseMag, int hPotions, int mPotions, int gold){
        this.name = name;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.actualHp = maxHp;
        this.actualMp = maxMp;
        this.baseAtk = baseAtk;
        this.baseMag = baseMag;
        this.hPotions = hPotions;
        this.mPotions = mPotions;
        this.gold = gold;
    }

    public String toString(){
        String result = "Player : \"" + this.name + "\"\n";
        result = result + "Hp - " + this.actualHp + "/" + this.maxHp + "\n";
        result = result + "Mp - " + this.actualMp + "/" + this.maxMp + "\n";
        result = result + "Atk - " + this.baseAtk + "\n";
        result = result + "Mag - " + this.baseMag + "\n";
        result = result + "Health potions held - " + this.hPotions + "\n";
        result = result + "Mana potions held - " + this.mPotions + "\n";
        result = result + "Gold - " + this.gold + "\n";

        return result;
    }

    public String fightStatus(){
        String result = "";
        result = result + "Player: " + this.name + "\n";
        result = result + "Hp: " + this.actualHp + "/" + this.maxHp + "\n";
        result = result + "Mp: " + this.actualMp + "/" + this.maxMp + "\n";
        result = result + "Health/Mana potion: " + this.hPotions + " / " + this.mPotions + "\n";
        return result;
    }

    public void swingSword(Enemy e){

        int dmg = 0;
        dmg = getRandomNumber(0, this.getBaseAtk());

        System.out.println("You swing your sword to the " + e.getName() + ", dealing " + dmg + " damage.\n");
        e.setActualHp(e.getActualHp() - dmg);

    }

    public void castFire(Enemy e){

        if(this.getActualMp() >= 30){

            int dmg = 0;
            dmg = getRandomNumber((int)(this.getBaseMag()/2), this.getBaseMag());

            System.out.println("You cast a fire ball to the " + e.getName() + ", dealing " + dmg + " damage.\n");
            e.setActualHp(e.getActualHp() - dmg);
            this.setActualMp(this.getActualMp() - 30);
        } else {
            System.out.println("You don't have enought mana to cast a fireball! You lose the turn.\n");
        }
    }

    public void drinkHpPotion(){
        if(this.getHPotions() > 0){
            System.out.println("You drink an health potion, restoring 30 health points.\n");
            this.setActualHp(this.getActualHp() + 30);
            if(this.getActualHp() > this.getMaxHp()){
                this.setActualHp(this.getMaxHp());
            }
            this.setHPotions(this.getHPotions() - 1);
        } else {
            System.out.println("You ran out of health potions! You lose your turn.\n");
        }
    }

    public void drinkMpPotion(){
        if(this.getMPotions() > 0){
            System.out.println("You drink a mana potion, restoring 50 mana points.\n");
            this.setActualMp(this.getActualMp() + 50);
            if(this.getActualMp() > this.getMaxMp()){
                this.setActualMp(this.getMaxMp());
            }
            this.setMPotions(this.getMPotions() - 1);
        } else {
            System.out.println("You ran out of mana potions! You lose your turn.\n");
        }
    }

    public String getName(){
        return this.name;
    }

    public int getMaxHp(){
        return this.maxHp;
    }

    public int getMaxMp(){
        return this.maxMp;
    }

    public int getActualHp(){
        return this.actualHp;
    }

    public int getActualMp(){
        return this.actualMp;
    }

    public int getBaseAtk(){
        return this.baseAtk;
    }

    public int getBaseMag(){
        return this.baseMag;
    }

    public int getHPotions(){
        return this.hPotions;
    }

    public int getMPotions(){
        return this.mPotions;
    }

    public int getGold(){
        return this.gold;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMaxHp(int newHp){
        this.maxHp = newHp;
    }

    public void setMaxMp(int newMp){
        this.maxMp = newMp;
    }

    public void setActualHp(int newHp){
        this.actualHp = newHp;
    }

    public void setActualMp(int newMp){
        this.actualMp = newMp;
    }

    public void setBaseAtk(int baseAtk){
        this.baseAtk = baseAtk;
    }

    public void setBaseMag(int baseMag){
        this.baseMag = baseMag;
    }

    public void setHPotions(int hPotions){
        this.hPotions = hPotions;
    }

    public void setMPotions(int mPotions){
        this.mPotions = mPotions;
    }

    public void setGold(int gold){
        this.gold = gold;
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

  }