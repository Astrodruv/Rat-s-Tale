package objects.entities;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public abstract class Entity
{
    protected int maxHealth;
    protected int curHealth;
    public boolean attack;

    public int xSpeed;
    public int ySpeed;

    public Image image;


    public Entity()
    {

    }

    public void takeDamage(int amount)
    {
        if(curHealth > 0) {
            curHealth = curHealth - amount;
        }
    }

    public void render(Graphics g)
    {

    }




}
