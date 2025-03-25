import objects.GameObject;
import org.newdawn.slick.Image;

public abstract class Entity extends GameObject {
    protected static int curHealth;
    protected static int maxHealth;
    protected int attackDamage;
    protected float xSpeed;
    protected float ySpeed;
    protected Image image;

    public Entity(float x, float y, float xSpeed, float ySpeed, int health, int attackDamage, Image image) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        maxHealth = health;
        curHealth = maxHealth;
        this.attackDamage = attackDamage;
        this.image = image;
    }

    public static float getPercentHealth(){
        return (float) curHealth / maxHealth;
    }
  
      public void takeDamage(int amount){
        if(curHealth > 0) {
            curHealth = curHealth - amount;
        }
    }
  
}



