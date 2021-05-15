public class Player {
    
    private String name;
    private int hp;
    private int mp;
    private int baseAtk;
    private int baseMag;
    private int hPotions;
    private int mPotions;
    
    public Player(String name, int hp, int mp, int baseAtk, int baseMag, int hPotions, int mPotions){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.baseAtk = baseAtk;
        this.baseMag = baseMag;
        this.hPotions = hPotions;
        this.mPotions = mPotions;
    }

    public String toString(){
        String result = "Player : \"" + this.name + "\"\n";
        result = result + "Hp - " + this.hp + "\n";
        result = result + "Mp - " + this.mp + "\n";
        result = result + "Atk - " + this.baseAtk + "\n";
        result = result + "Mag - " + this.baseMag + "\n";
        result = result + "Health potions held - " + this.hPotions + "\n";
        result = result + "Mana potions held - " + this.mPotions + "\n";

        return result;
    }

    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    public int getMp(){
        return this.mp;
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

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int newHp){
        this.hp = newHp;
    }

    public void setMp(int newMp){
        this.mp = newMp;
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

  }