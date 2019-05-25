import java.awt.*; 
public class BarGraphWriter {
  private int x, y, x1, x2, x3, x4, x5, x6 ;//daklarimi i ndryshoreve te fushes x, y, x1, ... , x6
  public void setAxes(int x_pos, int y_pos, String top_label, int y_height, int bars, Graphics g){//konstruktimi i metodes setAxes qe merr parametrat x_pos, y_pos,top_label, y_height and Graphics g
      g.drawLine(x_pos, y_pos, x_pos+(bars*55+(bars-1)*10),y_pos);//drawLine eshte metode e gatshme nga klasa Graphics, qe ne kornize vizaton nje vije te drejte me fillim ne piken(x_pos, y_pos dhe mbarim ne (x_pos+250,y_pos)
      g.drawLine(x_pos, y_pos, x_pos, y_pos-y_height);
      g.drawString(top_label, x_pos-15, y_pos-y_height);//drawString eshte po ashtu metode e gatshme nga klasa Graphics qe ne kornize vizaton tekstin top_label ne poziten (x_pos-15,y_pos-y_height)
      g.drawString("0",x_pos-15, y_pos+5);
      x = x_pos; y = y_pos;//inicializimi i variablave te fushes x dhe y vlerat e variablave lokale te metodes x_pos dhe y_pos respektivisht
      }
  public void setBar1(String label, int height, Color c, Graphics g){
      g.drawString(label,x+5,y+15);
      g.drawString((height/3)+"",x+20,y-height-15);
      g.setColor(c);//setColor eshte metode e klases Graphics dhe sherben qe pendes vizatuese t'i caktojme ngjyren e deshiruar
      g.fillRect(x, y-height, 55, height);//fillRect eshte metode e klases Graphics e cila ne kornize e vizaton katerkendeshin e ngjyrosur me dimensione 55 dhe height  ne poziten fillestare (x, y-height)
      x1 = x+65;
      }
  public void setBar2(String label1, int height, Color c, Graphics g){
      g.setColor(Color.black);
      g.drawString(label1,x1+10,y+15);
      g.drawString((height/3)+"",x1+20,y-height-15);
      g.setColor(c);
      g.fillRect(x1, y-height, 55, height);
      x2 = x1+65;
      }
  public void setBar3(String label2, int height, Color c, Graphics g){
      g.setColor(Color.black);
      g.drawString(label2,x2+10,y+15);
      g.drawString((height/3)+"",x2+20,y-height-15);
      g.setColor(c);
      g.fillRect(x2, y-height, 55, height);
      x3 = x2+65;
      }
  public void setBar4(String label3, int height, Color c, Graphics g){
      g.setColor(Color.black);
      g.drawString(label3,x3+10,y+15);
      g.drawString((height/3)+"",x3+20,y-height-15);
      g.setColor(c);
      g.fillRect(x3, y-height, 55, height);
      x4 = x3+65;
      }
  public void setBar5(String label4, int height, Color c, Graphics g){
      g.setColor(Color.black);
      g.drawString(label4,x4+10,y+15);
      g.drawString((height/3)+"",x4+20,y-height-15);
      g.setColor(c);
      g.fillRect(x4, y-height, 55, height);
      x5 = x4+65;
      }
  public void setBar6(String label5, int height, Color c, Graphics g){
      g.setColor(Color.black);
      g.drawString(label5,x5+10,y+15);
      g.drawString((height/3)+"",x5+20,y-height-15);
      g.setColor(c);
      g.fillRect(x5, y-height, 55, height);
      }
}
