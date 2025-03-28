package objects.entities;

import objects.GameObject;
import objects.platforms.Platform;
import org.newdawn.slick.Image;

public abstract class Entity extends GameObject {
    protected static int curHealth;
    protected static int maxHealth;
    protected int attackDamage;
    protected float xSpeed;
    protected float ySpeed;
    protected Image image;
    protected Image rightFacingImage;

    public Entity(float x, float y, float xSpeed, float ySpeed, int health, int attackDamage, Image image) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        maxHealth = health;
        curHealth = maxHealth;
        this.attackDamage = attackDamage;
        this.image = image;
        rightFacingImage = image;

        w = image.getWidth();
        h = image.getHeight();

    }

    public static float getPercentHealth(){ // Change this later to be applicable each individual entity being tracked
//        return (float) curHealth / maxHealth;
        return 0.75f;
    }

    public float damages(int amount)
    {
        return curHealth = curHealth - amount;
    }


}
