package assn05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

public class DrawGraphics {
	BouncingBox box;

	ArrayList<BouncingBox> boxes = new ArrayList<>(3);

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		box = new BouncingBox(200, 50, Color.RED);
		box.setMovementVector(50, -50);

		BouncingBox greenBox = new BouncingBox(10, 10, Color.GREEN);
		greenBox.setMovementVector(10, 32);
		BouncingBox yellowBox = new BouncingBox(100, 100, Color.YELLOW);
		yellowBox.setMovementVector(30, -21);
		BouncingBox blueBox = new BouncingBox(200, 200, Color.BLUE);
		blueBox.setMovementVector(-2, 99);

		boxes.add(greenBox);
		boxes.add(yellowBox);
		boxes.add(blueBox);

	}

	/**
	 * Draw the contents of the window on surface. Called 20 times per second.
	 */
	public void draw(Graphics surface) {
		surface.drawLine(50, 50, 250, 250);
		box.draw(surface);

		for (BouncingBox b : boxes)
			b.draw(surface);

		 Graphics2D g2 = (Graphics2D) surface;
		
		 g2.draw(new RoundRectangle2D.Double(250, 250, 20, 20, 10, 10));
		 g2.draw(new Rectangle2D.Double(30, 30, 20, 20));
		 	
		 
		 
	}
}