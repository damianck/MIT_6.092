package assn06;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSprite;
    ArrayList<Bouncer> bouncers = new ArrayList<>();
    
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingSprite = new Bouncer(100, 170, box);
        movingSprite.setMovementVector(3, 1);
        bouncers.add(movingSprite);
        
        box = new Rectangle(15, 20, Color.ORANGE);
        movingSprite = new Bouncer(100, 170, box);
        movingSprite.setMovementVector(-10, 10);
        bouncers.add(movingSprite);
        
        Oval oval = new Oval(25, 25, Color.GREEN);
        movingSprite = new Bouncer(200, 5, oval);
        movingSprite.setMovementVector(-1, 5);
        bouncers.add(movingSprite);
        
        
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        //movingSprite.draw(surface);
    	for(Bouncer b : bouncers){
    		b.draw(surface);
    	}
    }
}
