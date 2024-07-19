package traffic;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class traffic extends Applet implements Runnable
{
	Thread th;
	int i;
	public void init()
	{
		i=0;
		th=new Thread(this);
		th.start();	
	}
	public void paint(Graphics g)
	{
		i++;
		if(i==1)
		{
			g.setColor(Color.red);
			g.fillOval(10, 20, 30, 40);
		}
		if(i==2)
		{
			g.setColor(Color.green);
			g.fillOval(10, 40, 30, 40);
			
		}
		if(i==3)
		{
		g.setColor(Color.yellow);
		g.fillOval(10, 60, 30, 40);
		}
		if(i==4)
			i=0;
		
	}
	
  public void run()
  {
	  while(true)
	  {
		  try
		  
		  {
			  Thread.sleep(2000);
			  repaint();
		  }catch(Exception e)
		  {
			  System.out.println(e);
		  }
	  }
	  
  }
  public static void main(String arg[])
  {
	  new traffic();
  }
  
  
}

