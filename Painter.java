import java.awt.*;
  
public class Painter
{
    public void paintVeritcalLines(Graphics g){
       int x1 = 0;
       int x2 = 0;
       
        while(x1 <= 700 && x2 <= 700){
            int red = (int)(256 * Math.random());
        int green = (int)(256 * Math.random());
        int blue = (int)(256 * Math.random());
            g.setColor(new Color(red, green, blue));
            g.drawLine(x1, 0, x2, 700);
            x1 += 15;
            x2 += 15;
        }
        
    }
    
    
    public void paintHorizontalLines(Graphics g){
       int y1 = 0;
       int y2 = 0;
        while(y1 <= 700 && y2 <= 700){
            int red = (int)(256 * Math.random());
        int green = (int)(256 * Math.random());
        int blue = (int)(256 * Math.random());
            g.setColor(new Color(red, green, blue));
            g.drawLine(0, y1, 700, y2);
            y1+=15;
            y2+=15;
        }
        

    }
      
     
    public void paintLineGrid(Graphics g){
        int x1 = 0;
        int x2 = 0;
        while(x1 <= 700 && x2 <= 700){
            int red = (int)(256 * Math.random());
        int green = (int)(256 * Math.random());
        int blue = (int)(256 * Math.random());
            g.setColor(new Color(red, green, blue));
            g.drawLine(x1, 0, x2, 700);
            x1 += 15;
            x2 += 15;
        }
        int y1 = 0;
        int y2 = 0;
        while(y1 <= 700 && y2 <= 700){
            int red = (int)(256 * Math.random());
        int green = (int)(256 * Math.random());
        int blue = (int)(256 * Math.random());
            g.setColor(new Color(red, green, blue));
            g.drawLine(0, y1, 700, y2);
            y1+=15;
            y2+=15;
        }
    }

    public void paintBoxGrid(Graphics g){
        int y= 0;
        for(int row = 0; row <= 700; row++){
            int x = 0;
            for(int col = 0; col<= 700; col++){
                int red = (int)(256 * Math.random());
                int green = (int)(256 * Math.random());
                int blue = (int)(256 * Math.random());
                g.setColor(new Color(red, green, blue));
                g.fillRect(x,y,5,5);
                x+=5;
            }
            y+=5;
        }
    }
    
    public void paintCornerWeb(Graphics g){
       int x1 = 0;
       int y2 = 700;
      while(x1 >= 0 && y2 >= 0){
       int red = (int)(256 * Math.random());
       int green = (int)(256 * Math.random());
       int blue = (int)(256 * Math.random());
       g.setColor(new Color(red, green, blue));
       g.drawLine(x1,0,0, y2);
       x1+=15;
       y2-=15;
            
        }
        
        
    }
    
    public void paintDreamCatcher(Graphics g){
       int x1 = 0;
       int y1 = 350;
       int x2 = 700;
       int y2 = 350;
          while(x1 <= 350){
            int red = (int)(256 * Math.random());
            int green = (int)(256 * Math.random());
            int blue = (int)(256 * Math.random());
            g.setColor(new Color(red, green, blue));
            g.drawLine(x1,350,350, y1);
            int a = (int)(256 * Math.random());
            int b = (int)(256 * Math.random());
            int c = (int)(256 * Math.random());
            g.setColor(new Color(a, b, c));
            g.drawLine(x1,350,350, y2);
            int d = (int)(256 * Math.random());
            int e = (int)(256 * Math.random());
            int f = (int)(256 * Math.random());
            g.setColor(new Color(d, e, f));
            g.drawLine(x2,350,350, y2);
            int h = (int)(256 * Math.random());
            int i = (int)(256 * Math.random());
            int j = (int)(256 * Math.random());
            g.setColor(new Color(h, i, j));
            g.drawLine(x2,350,350, y1);
            x1+=15;
            y1+=15;
            x2-=15;
            y2-=15;
            
        }

    }
    
    public void paintBowTie(Graphics g){
        int y = 250;
        int d = 0;
        int l = 300;
        int e = 300;
        int r = 250;
        
        

    }
    
    public void paintCrissCross(Graphics g){
        
      
    }
    public void paintAmericanFlag(Graphics g){
        
    }
    
    public void paintZoom(Graphics g){
        int x1= 350;
        int y1= 350;
        int x2, y2;
        int r = 3500;
        for(int theta = 0; theta < 360; theta += 5){
       int red = (int)(256 * Math.random());
       int green = (int)(256 * Math.random());
       int blue = (int)(256 * Math.random());
       g.setColor(new Color(red, green, blue));
       int deltax = (int)(r* Math.cos(theta * Math.PI/180));
       x2 = 350 + deltax;
       int a = (int)(256 * Math.random());
       int b = (int)(256 * Math.random());
       int c = (int)(256 * Math.random());
       g.setColor(new Color(a, b, c));
       int deltay = (int)(r* Math.sin(theta *Math.PI/180));
       y2=350-deltay;
       g.drawLine(x1,y1,x2,y2);
        }
    }
    
    public void paintBullsEye(Graphics g){
        

    }
    
    public void paintBump(Graphics g){
        

    }
    
    public void paintSnowFlake(Graphics g){
        


    }
    
    public void paintSnowFall(Graphics g){
        int z = 0;
        int y = 1;
        int x = 12;
        while(z < 1000){
        int red = (int)(256 * Math.random());
        int green = (int)(256 * Math.random());
        int blue = (int)(256 * Math.random());
        g.setColor(new Color(red, green, blue));    
        g.fillRect(x,y,1,1);
        y= (int)(700 * (Math.random()));
        x = (int) (700 *  Math.random());
       z = z +1;
        
            }
        }
        
    public void paintRedRange(Graphics g){
        int color;
        color = 1;
        int x;
        x =1;
        while( x <=255){
            g.setColor(new Color (x,0,0));
            g.drawLine(x, 0, x, 700);
            x= x + 1;
            color = color + 1;
            
        }
        
    }
    
    
    public void paintShadeRange(Graphics g){
        int a = 255;
        int x = 1;
        while( x <=255){
            g.setColor(new Color (a, a, a));
            g.drawLine(x, 0 , x, 255);
            a =a - 1;
            x++;
            

            
        }
    }
    
    public void paintColorChart(Graphics g){
        
    }
    
    
    public void paintTubular2(Graphics g){

    }
    
    
    public void paintBrickWall(Graphics g){
        
    }
    
    
    public void paintPaperStack(Graphics g){
        int x=0;
        int y = 0;

        while(x<=200){
            g.fillRect(x,y,300,500);
            g.setColor(Color.WHITE);
            x+=2;
            y+=2;
            g.fillRect(x,y,300,500);
            g.setColor(Color.GRAY);
            x+=2;
            y+=2;
            
        } 
}
    
    public void paintSuprise(Graphics g){
        int x=0;
        int y = 0;
        while(x<=200){
            g.fillRect(x,y,300,500);
            int red = (int)(256 * Math.random());
            int green = (int)(256 * Math.random());
            int blue = (int)(256 * Math.random());
            g.setColor(new Color(red, green, blue));
            x+=2;
            y+=2;
            g.fillRect(x,y,300,500);
            g.setColor(new Color(red, green, blue));
            x+=2;
            y+=2;


    }
    
}
    public void paintPatchWork(Graphics g){
        
    }
    
    
    public void paintChains(Graphics g){
        

    }
    
    
    public void paintWallPaper70s(Graphics g){
       int x1 = 0;
       int x2 = 0;
       int x3 = 0;
       int x4 = 0;
       int x5 = 0;
       int x6 = 0;
       int x7 = 0;
       int x8 = 0;
       int x9 = 0;
        while(x1 < 700 && x2 <= 700){
        int red = (int)(256 * Math.random());
        int green = (int)(256 * Math.random());
        int blue = (int)(256 * Math.random());
            g.setColor(new Color(red, green, blue));
            g.fillRect(x1, 0, 50, 700);
            x1 += 50;
            x2 += 50;
       
}
       while(x3 <= 600 && x3 >= 0){
        int reddd = (int)(256 * Math.random());
        int greennn = (int)(256 * Math.random());
        int blueee = (int)(256 * Math.random());
        g.setColor(new Color(reddd, greennn, blueee));
        g.fillOval(0,x3,100,100);
        x3 += 100;
        }
        while(x4 <= 600 && x4 >= 0){
        int eddd = (int)(256 * Math.random());
        int reennn = (int)(256 * Math.random());
        int lueee = (int)(256 * Math.random());
        g.setColor(new Color(eddd, reennn, lueee));
        g.fillOval(100,x4,100,100);
        x4 += 100;


}
while(x5 <= 600 && x5 >= 0){
        int eddd = (int)(256 * Math.random());
        int reennn = (int)(256 * Math.random());
        int lueee = (int)(256 * Math.random());
        g.setColor(new Color(eddd, reennn, lueee));
        g.fillOval(200,x5,100,100);
        x5 += 100;


}
while(x6<= 600 && x6 >= 0){
        int eddd = (int)(256 * Math.random());
        int reennn = (int)(256 * Math.random());
        int lueee = (int)(256 * Math.random());
        g.setColor(new Color(eddd, reennn, lueee));
        g.fillOval(300,x6,100,100);
        x6 += 100;


}
while(x7<= 600 && x7 >= 0){
        int eddd = (int)(256 * Math.random());
        int reennn = (int)(256 * Math.random());
        int lueee = (int)(256 * Math.random());
        g.setColor(new Color(eddd, reennn, lueee));
        g.fillOval(400,x7,100,100);
        x7 += 100;


}

while(x8<= 600 && x8 >= 0){
        int eddd = (int)(256 * Math.random());
        int reennn = (int)(256 * Math.random());
        int lueee = (int)(256 * Math.random());
        g.setColor(new Color(eddd, reennn, lueee));
        g.fillOval(500,x8,100,100);
        x8 += 100;


}
while(x9<= 600 && x9 >= 0){
        int eddd = (int)(256 * Math.random());
        int reennn = (int)(256 * Math.random());
        int lueee = (int)(256 * Math.random());
        g.setColor(new Color(eddd, reennn, lueee));
        g.fillOval(600,x9,100,100);
        x9 += 100;


}
}
    public void paintTiledFloor(Graphics g){
        
    }
    
    
    public void paintSpiral(Graphics g){
        
    }
    
    
    public void paintSinCurve(Graphics g){
        
            
    }
    
    
    public void paintTubular3(Graphics g){
        

    }
    
    
}
