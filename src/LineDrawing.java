import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.setLineWidth(4);
		w.moveTo(0, 0);
		while (true) {
		w.waitForMouseClick();// vänta tills användaren klickar på en musknapp
		int x = w.getMouseX();
		int y = w.getMouseY();
		w.lineTo (x,y);// rita en linje till den punkt där användaren klickade
		}
	}
}
