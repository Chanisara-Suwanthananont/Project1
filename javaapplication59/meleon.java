package javaapplication59;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import sun.net.www.content.image.png;
public class meleon{
    public ImageIcon[]im = new ImageIcon[1];
    public int x;
    public int y;
    public int count = 0;
     public int distanceP;
     public int x2;
     public int y2;
    meleon(){
        for(int i=0;i<im.length;i++){
            im[i] = new ImageIcon(this.getClass().getResource((1)+".png"));
	}
    }
     meleon(int x,int y){
        for(int i=0;i<im.length;i++){
            String imageLocation = "b"+(i+1)+".png";
            im[i] = new ImageIcon(this.getClass().getResource(imageLocation));
	}
            this.x=x;
            this.y=y;
    }
    public Rectangle2D getbound(){
    	return (new Rectangle2D.Double(x,y,30,30));
    }
}
    
