package objects.healthbars;

import engine.Main;
import objects.entities.Entity;
import objects.entities.enemy.boss.attacking.Cockroach;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class CockroachHealthBar extends HealthBar {

    public CockroachHealthBar() {
        super(((float) Main.getScreenWidth() / 2) - 300, 150, 600, 50, Color.gray, Color.darkGray);
    }

    public void render(Graphics g){
        g.setColor(color2);
        g.fillRect(x,y,w,h);
        g.setColor(color1);
        g.fillRect(x,y,w * Entity.getPercentHealth(),h);

        g.setColor(Color.red);
        g.drawString("Boss name here : Boss of the Sewers", x, y + 50);
    }

    public void collisions(){

    }
}
