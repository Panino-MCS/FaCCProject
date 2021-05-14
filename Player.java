public class Player {
    
    private int hp;
    private int mp;
    
    public Player(int hp, int mp){
        this.hp = hp;
        this.mp = mp;
    }

    public int getHp(){
        return this.hp;
    }

    public int getMp(){
        return this.mp;
    }

    public void setHp(int newHp){
        this.hp = newHp;
    }

    public void setMp(int newMp){
        this.mp = newMp;
    }

  }