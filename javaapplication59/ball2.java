package javaapplication59;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
public class ball2 {
	Image img;
	public int x = 0;
	public int y= (int) ((Math.random()*300)+20);
	public int count = 0;
	ball2(){
                String imageLocation = "car2.png";
                URL imageURL = this.getClass().getResource(imageLocation);
		img = Toolkit.getDefaultToolkit().getImage(imageURL);
		runner.start();
	}
	Thread runner = new Thread(new Runnable() {
            public void run() {
		while(true){
                    x +=3;
                    if(x >= 1100){
			img = null;
			runner = null;
			x = -500;
			y = -500;
                    }
                    try{
			runner.sleep(30);//ความเร็ว
                    }catch(InterruptedException e){}
                }
            }
	});
	
	public Image getImage(){
            return img;
	}
	
	public int getX(){
            return x;
	}
	public int getY(){
            return y;
	}
	public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,45,45));
	}
}

/*public class ball2 extends ball1{
    Image img;
    public int x = 0;
	public int y= (int) ((Math.random()*300)+20);
	public int count = 0;
    ball2(){
        String imageLocation = "TATA.png";
        URL imageURL1 = this.getClass().getResource(imageLocation);
        img = Toolkit.getDefaultToolkit().getImage(imageURL1);
        runner.start();
    }
    Thread runner = new Thread(new Runnable() {
	public void run() {
            while(true){
		x += 1;
		if(x >= 1100){
                    img = null;
                    runner = null;
                    x = -500;
                    y = -500;
                }
                try{
                    runner.sleep(30);
                }catch(InterruptedException e){}
            }
	}
    });

    public Image getImage(){
	return img;
    }
}*/
