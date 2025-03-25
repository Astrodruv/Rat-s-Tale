package objects.entities.player;

import objects.entities.Entity;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public class Player extends Entity {

    public Player(float x, float y, float xSpeed, float ySpeed, int health, int attackDamage, Image image) {
        super(x, y, xSpeed, ySpeed, health, attackDamage, image);
    }

    public void render(Graphics g){
        image.draw(x,y);
    }
}
