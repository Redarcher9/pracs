import java.awt.*;
import java.applet.*;

public class Smiley extends Applet {
	
public void paint(Graphics g)
{
	g.drawOval(60,60,200,200);
	g.fillOval(90,120,50,20);
	g.fillOval(190,120,50,20);
	g.drawLine(165,125,165,175);
	g.drawArc(148,106,100,100,-39,-120);



}


}