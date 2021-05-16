public class Enemy {
    
    private String name;
    private int maxHp;
    private int actualHp;
    private int atk1;
    private int atk2;
    private int atk3;
    private int rewardGold;

    public Enemy(String name, int hp, int atk1, int atk2, int atk3, int rewardGold){
        this.name = name;
        this.maxHp = hp;
        this.actualHp = hp;
        this.atk1 = atk1;
        this.atk2 = atk2;
        this.atk3 = atk3;
        this.rewardGold = rewardGold;
    }

    public String fightStatus(){
        String result = "";
        result = result + "Name: " + this.name + "\n";
        result = result + "Hp: " + this.actualHp + "/" + this.maxHp + "\n";
        return result;
    }

    public void action(Player p){
        System.out.println("The " + this.name + " performs his action!\n");
        int atk = getRandomNumber(0, 100);
        int dmg = 0;
        if(atk < 50){
            dmg = this.atk1;
            System.out.println("It's a weak attack! It dealt " + dmg + " damage!\n");
        } else if (atk < 80){
            dmg = getRandomNumber(this.atk1, this.atk2 + 1);
            System.out.println("It's a strong attack! It dealt " + dmg + " damage!\n");
        } else {
            dmg = getRandomNumber(this.atk2, this.atk3 + 1);
            System.out.println("It was a critical attack! It dealt " + dmg + " damage!\n");
        }
        p.setActualHp(p.getActualHp() - dmg);
    }

    public String getName(){
        return this.name;
    }

    public int getMaxHp(){
        return this.maxHp;
    }

    public int getActualHp(){
        return this.actualHp;
    }

    public int getAtk1(){
        return this.atk1;
    }

    public int getAtk2(){
        return this.atk2;
    }

    public int getAtk3(){
        return this.atk3;
    }

    public int getRewardGold(){
        return this.rewardGold;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMaxHp(int maxHp){
        this.maxHp = maxHp;
    }

    public void setActualHp(int actualHp){
        this.actualHp = actualHp;
    }

    public void setAtk1(int atk1){
        this.atk1 = atk1;
    }

    public void setAtk2(int atk2){
        this.atk2 = atk2;
    }

    public void setAtk3(int atk3){
        this.atk3 = atk3;
    }

    public void setRewardGold(int rewardGold){
        this.rewardGold = rewardGold;
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
