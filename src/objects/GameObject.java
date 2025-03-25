package objects;

import org.newdawn.slick.Image;

public abstract class GameObject {
    protected Image image;
    protected float x;
    protected float y;

    public GameObject(float x, float y){
        image = null;
        this.x = x;
        this.y = y;
    }
}
