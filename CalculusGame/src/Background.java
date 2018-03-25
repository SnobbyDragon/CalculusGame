
import java.awt.Graphics;

import com.madgag.gif.fmsware.GifDecoder;

public class Background extends Thing {
	
	private static GifDecoder background = new GifDecoder("Background.gif");
	private int frame;

	public Background() {
		super(0, 0);
		// TODO Auto-generated constructor stub
		frame = 0;
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		int n = frame%background.getFrameCount();
		window.drawImage(background.getFrame(n), getXPos(), getYPos(), null);
		frame++;
		if (frame == background.getFrameCount()) {
			frame = 0;
		}
	}
}
