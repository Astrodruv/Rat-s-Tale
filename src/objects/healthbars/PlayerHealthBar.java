package objects.healthbars;

import objects.entities.Entity;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class PlayerHealthBar extends HealthBar {

    public PlayerHealthBar(float x, float y, float w, float h, Color color1, Color color2) {
        super(x, y, w, h, color1, color2);
    }

    public void render(Graphics g){
        g.setColor(color2);
        g.drawRect(x,y,w,h);
        g.setColor(color1);
        g.drawRect(x,y,w * Entity.getPercentHealth(),h);
    }

    public void collisions(){

    }
}
