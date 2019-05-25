import javax.swing.*;
import java.awt.*;// importimi i klasave te javax.swing dhe java.awt 
public class MakeChangeWithGraph extends JPanel {//klasa jonw MakeChangeWithGraph i trashegon vetite e klases JPanel, qe te mund te vizatojme ne te
   BarGraphWriter grafi = new BarGraphWriter();//instancimi i klases BarGraphWriter ne klasen tone ne menyre qe te mund ti perdorim metodat e BarGraphWriter
   private int bars = 4, width = bars*55 + (bars-1)*10 + 60, height = 300; //deklarimi i ndryshores se fushes width
   public MakeChangeWithGraph(){//konstruktimi i konstruktorit te klases MakeChangeWithGraph
      JFrame korniza = new JFrame();
      korniza.getContentPane().add(this);
      korniza.setTitle("Make Change");//caktimi i titullit te kornizes sone me ane te metodes setTitle nga klasa JFrame
      korniza.setSize(width,height);//caktimi i madhesise se kornizes me ane te metodes setSize nga klasa JFrame
      korniza.setVisible(true);//caktimi i shikueshmerise se kornizes me ane te metodes setVisible nga klasa JFrame
   }
   String dollarStr = JOptionPane.showInputDialog("How many dollars do you have? ");//me ane te metodes showInputDialog nga JOptionPane kerkohet me hyrje interaktive nga shfrytezuesi sasia e dolareve
   String centStr = JOptionPane.showInputDialog("How many cents do you have");
   int dollars = new Integer(dollarStr).intValue();//kthimi i nga string ne int i hyrjes interaktive te marre ne rreshtin 13 me ane te metodes intValue nga Integer
   int cents = new Integer(centStr).intValue();
   int money = dollars*100 + cents ;// deklarimi dhe inicializimi i variables money me vleren dollars*100 + cents
   int quarters = money/25;
   int dimes = (money % 25)/10;
   int nickles =((money % 25)%10)/5;
   int pennies =((money % 25)%10)%5;
   public void paintComponent(Graphics g){//konstruktimi i kornizes permes paintComponent
      grafi.setAxes(20,230,"60",180,4,g);//thirrja e metodes setAxes nga klasa BarGraphWriter permes objektit grafi
      grafi.setBar1("Quarters",quarters*3,Color.red,g);
      grafi.setBar2("Dimes",dimes*3,Color.white,g);
      grafi.setBar3("Nickles",nickles*3,Color.blue,g);
      grafi.setBar4("Pennies",pennies*3,Color.yellow,g);
   }
public static void main(String[] args){
      new MakeChangeWithGraph();
   }   
}