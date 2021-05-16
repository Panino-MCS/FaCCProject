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

  }