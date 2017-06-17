import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class SimpleWindowExample {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "Drawing Window");
		w.setLineWidth (10);
		w.setLineColor(java.awt.Color.GREEN);
		w.moveTo(100, 100);
		w.lineTo(150, 100);
		w.setLineWidth(20);
		w.setLineColor(java.awt.Color.RED);
		w.moveTo(50, 200);
		w.lineTo(150, 300);
		w.setLineWidth (5);
		w.setLineColor(java.awt.Color.YELLOW);
		Square sq = new Square(20, 20,30);
		sq = new Square(20, 10, 40);
		sq.draw(w);
		

	}
}
