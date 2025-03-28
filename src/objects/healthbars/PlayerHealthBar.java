package objects.healthbars;

import objects.entities.Entity;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class PlayerHealthBar extends HealthBar {

    public PlayerHealthBar() {
        super(50, 50, 200, 30, Color.red, Color.darkGray);
    }

    public void render(Graphics g){
        g.setColor(color2);
        g.fillRect(x,y,w,h);
        g.setColor(color1);
        g.fillRect(x,y,w * Entity.getPercentHealth(),h);
    }

    public void collisions(){

    }

    public void collisions(){

    }
}
