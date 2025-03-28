package objects.entities.player;

import engine.Main;
import engine.states.sewer.Sewer;
import objects.GameObject;
import objects.entities.Entity;
import objects.platforms.Platform;
import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;
import ui.images.ImageRenderer;

import static engine.states.start.TitleScreen.gc;


public class Player extends Entity {

    private boolean facingRight;
    private boolean inAir;
    private boolean jump;
    private float xAccel;
    private float yAccel;

    public Player() {
        super(0,400,5,25,100,50, ImageRenderer.ratIdle);
        facingRight = true;
        inAir = false;
        jump = false;
        xAccel = 0;
        yAccel = 0;
    }

    public void render(Graphics g){
        g.setColor(Color.white);
        g.drawString("In Air: " + inAir, 175, 200);
        g.drawString("Jump? " + jump, 175, 225);

        image.draw(x,y);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta){
        movement(gc);
    }

    public void movement(GameContainer gc){
        Input input = gc.getInput();

        if (input.isKeyDown(Input.KEY_W)){

        }
        if (input.isKeyDown(Input.KEY_S)){

        }
        if (input.isKeyDown(Input.KEY_D)){
            x = x + (xSpeed + xAccel);
            facingRight = true;
        }
        if (input.isKeyDown(Input.KEY_A)){
            x = x - (xSpeed + xAccel);
            facingRight = false;
        }

        carryMomentum(gc);
        collisions();
        if (jump){
            jump();
        }
    }

    public void jump(){
        y = y - (ySpeed + yAccel);
        yAccel -= 1.125f;
    }

    public void collisions() {
        boolean isCollidingWithPlatformTop = false;
        boolean isCollidingWithPlatformBottom = false;

        for (GameObject o : Sewer.levelObjects) {
            if (o instanceof Platform && collidesWithBottomOf(o)){
                isCollidingWithPlatformBottom = true;
                y = o.getY() + h;
            }
            else if (o instanceof Platform && collidesWithTopOf(o)){
                isCollidingWithPlatformTop = true;
                y = o.getY() - h;
                yAccel = 0;
                if (inAir) {
                    jump = false;
                }
                inAir = false;
            }
        }

        if (isCollidingWithPlatformBottom){
            inAir = true;
            ySpeed = 0;
            yAccel -= 1.125f;
        }
        else if (!isCollidingWithPlatformTop){
            inAir = true;
            if (!jump) {
                y -= yAccel;
                yAccel -= 1.125f;
            }
        }
        else{
            inAir = false;
            ySpeed = 25;
        }
    }

    public void carryMomentum(GameContainer gc){
        Input input = gc.getInput();

        if (input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_A)) {
            xAccel += 0.075f;
        }
        else {
            if (xAccel > 0){
                xAccel -= 0.075f;
            }
            if (xAccel < 0){
                xAccel = 0;
            }
        }

        if (facingRight) x += xAccel;
        else x -= xAccel;
    }

    public void keyPressed(int key, char c){
        if (key == Input.KEY_D && !facingRight){
            image = rightFacingImage;
            xAccel = 0;
        }
        if (key == Input.KEY_A && facingRight){
            xAccel = 0;
            image = image.getFlippedCopy(true, false);
        }
        if (key == Input.KEY_W && !inAir && !jump){
            jump = true;
        }
    }


}
