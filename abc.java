import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class abc extends Applet implements ActionListener
{
    int f=0;
    Image img;
    Button b[]=new Button[26];
AudioClip ag;
    public void init()
    {    int a=65;
        
        for(int i=0;i<26;i++)
        {
            b[i]=new Button(""+(char)a);
            a++;
            add(b[i]);
            b[i].addActionListener(this);
        }
        ag=getAudioClip(getCodeBase(),"apple.wav");
                ag.play();

        
    }    
    public void paint(Graphics g)
    {
        Font f1= new Font("Arial",Font.BOLD,100);
        setBackground(Color.black);
        g.setFont(f1);
        g.setColor(Color.yellow);
        if(f==0)
        {
                
                img=getImage(getDocumentBase(),"apple.png");
                
                g.drawString("A/a", 450,300);
                g.drawString("Apple",300,600);
                g.drawImage(img,600,300,this);
        }
        if(f==1)
        {
                img=getImage(getDocumentBase(),"banana.png");
                g.drawString("B/b", 450,300);
                g.drawString("Banana",300,600);
                g.drawImage(img,600,170,this);
        }
        if(f==2)
        {
                img=getImage(getDocumentBase(),"cat.png");
                g.drawString("C/a", 450,300);
                g.drawString("Cat",400,600);
                g.drawImage(img,600,100,this);
        }
        if(f==3)
        {
                img=getImage(getDocumentBase(),"dog.png");
                g.drawString("D/d", 450,250);
                g.drawString("Dog",400,600);
                g.drawImage(img,600,50,this);
        }
        if(f==4)
        {
                img=getImage(getDocumentBase(),"elephant.png");
                g.drawString("E/e", 330,300);
                g.drawString("Elephant",30,570);
                g.drawImage(img,450,150,this);
        }
        if(f==5)
        {
                img=getImage(getDocumentBase(),"fish.png");
                g.drawString("F/f", 400,300);
                g.drawString("Fish",300,600);
                g.drawImage(img,510,50,this);
        }
        if(f==6)
        {
                img=getImage(getDocumentBase(),"grapes.png");
                g.drawString("G/g", 400,300);
                g.drawString("Grapes",200,600);
                g.drawImage(img,520,100,this);
        }
        if(f==7)
        {
                img=getImage(getDocumentBase(),"horse.png");
                g.drawString("H/h", 350,300);
                g.drawString("Horse",200,600);
                g.drawImage(img,500,50,this);
        }
        if(f==8)
        {
                img=getImage(getDocumentBase(),"igloo.png");
                g.drawString("I/i", 450,350);
                g.drawString("Ice Cream",170,550);
                g.drawImage(img,600,240,this);
        }
        if(f==9)
        {
                img=getImage(getDocumentBase(),"joker.png");
                g.drawString("J/j", 450,300);
                g.drawString("Joker",300,600);
                g.drawImage(img,600,220,this);
        }
        if(f==10)
        {
                img=getImage(getDocumentBase(),"kite.png");
                g.drawString("K/k", 400,250);
                g.drawString("Kite",300,600);
                g.drawImage(img,550,90,this);
        }
        if(f==11)
        {
                img=getImage(getDocumentBase(),"lion.png");
                g.drawString("L/l", 450,300);
                g.drawString("Lion",300,600);
                g.drawImage(img,350,250,this);
        }
        if(f==12)
        {
                img=getImage(getDocumentBase(),"mango.png");
                g.drawString("M/m", 250,300);
                g.drawString("Mango",130,600);
                g.drawImage(img,450,240,this);
        }
        if(f==13)
        {
                img=getImage(getDocumentBase(),"nest.png");
                g.drawString("N/n", 450,300);
                g.drawString("Nest",300,600);
                g.drawImage(img,550,240,this);
        }
        if(f==14)
        {
                img=getImage(getDocumentBase(),"owl.png");
                g.drawString("O/o", 450,300);
                g.drawString("Owl",300,600);
                g.drawImage(img,550,120,this);
        }
        if(f==15)
        {
                img=getImage(getDocumentBase(),"peacock.png");
                g.drawString("P/p", 450,300);
                g.drawString("Peacock",300,600);
                g.drawImage(img,600,240,this);
        }
        if(f==16)
        {
                img=getImage(getDocumentBase(),"Queen.png");
                g.drawString("Q/q", 450,300);
                g.drawString("Queen",300,600);
                g.drawImage(img,600,40,this);
        }
        if(f==17)
        {
                img=getImage(getDocumentBase(),"rabbit.png");
                g.drawString("R/r", 450,300);
                g.drawString("Rabbit",300,600);
                g.drawImage(img,670,40,this);
        }
        if(f==18)
        {
                img=getImage(getDocumentBase(),"snake.png");
                g.drawString("S/s", 450,300);
                g.drawString("Snake",300,600);
                g.drawImage(img,600,240,this);
        }
        if(f==19)
        {
                img=getImage(getDocumentBase(),"tiger.png");
                g.drawString("T/t", 450,300);
                g.drawString("Tiger",300,600);
                g.drawImage(img,600,240,this);
        }
        if(f==20)
        {
                img=getImage(getDocumentBase(),"umbrella.png");
                g.drawString("U/u", 450,300);
                g.drawString("Umbrella",300,600);
                g.drawImage(img,600,150,this);
        }
        if(f==21)
        {
                img=getImage(getDocumentBase(),"van.png");
                g.drawString("V/v", 270,300);
                g.drawString("Van",220,600);
                g.drawImage(img,450,200,this);
        }
        if(f==22)
        {
                img=getImage(getDocumentBase(),"watermelon.png");
                g.drawString("W/w", 450,300);
                g.drawString("Watermelon",300,600);
                g.drawImage(img,670,240,this);
        }
        if(f==23)
        {
                img=getImage(getDocumentBase(),"xylophone.png");
                g.drawString("X/x", 450,300);
                g.drawString("Xylophone",300,600);
                g.drawImage(img,600,240,this);
        }
        if(f==24)
        {
                img=getImage(getDocumentBase(),"yak.png");
                g.drawString("Y/y", 450,300);
                g.drawString("Yak",300,600);
                g.drawImage(img,600,120,this);
        }
        if(f==25)
        {
                img=getImage(getDocumentBase(),"zebra.png");
                g.drawString("Z/z", 450,300);
                g.drawString("Zebra",300,600);
                g.drawImage(img,600,210,this);
        }
        
    }
    public void actionPerformed(ActionEvent e)
    {
        for(int i=0;i<26;i++)
        {
        if(e.getSource()==b[i])
        {
            f=i;
            if(i==0)
            {
                System.out.println("Apple");
            }
            repaint();
        }
    }
    }


}
/*<applet code=abc width=300 height=300>
</applet> */