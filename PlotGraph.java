import javax.swing.*;
import java.awt.*;//importimi i klasave te javax.swing dhe java.awt
public class PlotGraph extends JPanel {//klasa jonw PlotGraph i trashegon vetite e klases JPanel, qe te mund te vizatojme ne te
   BarGraphWriter grafi = new BarGraphWriter();//instancimi i klases BarGraphWriter ne klasen tone ne menyre qe te mund ti perdorim metodat e BarGraphWriter
   private int bars = 6, width = bars*55 + (bars-1)*10 + 60 ;//deklarimi dhe inicializimi i ndryshores se fushes width
   String graphTitle = JOptionPane.showInputDialog("Please type the title of your graph: ");//me ane te metodes showInputDialog nga JOptionPane kerkohet me hyrje interaktive nga shfrytezuesi titulli i grafikut
   String largestValue = JOptionPane.showInputDialog("Please type the value of the largest bar you will draw");
   private int largestValueInt = new Integer(largestValue).intValue();//kthimi i nga string ne int i hyrjes interaktive te marre ne rreshtin 7 me ane te metodes intValue nga Integer
   public PlotGraph(){//konstruktimi i konstruktorit te klases PlotGraph
      JFrame korniza = new JFrame();
      korniza.getContentPane().add(this);
      korniza.setTitle(graphTitle);//caktimi i titullit te kornizes sone me ane te metodes setTitle nga klasa JFrame
      korniza.setSize(width,largestValueInt*12);//caktimi i madhesise se kornizes me ane te metodes setSize nga klasa JFrame
      korniza.setVisible(true);//caktimi i shikueshmerise se kornizes me ane te metodes setVisible nga klasa JFrame
   }
   String firstBarName = JOptionPane.showInputDialog("Please type the name of the first bar");
   String firstBarValue = JOptionPane.showInputDialog("Please type the value of the first bar");
   String secondBarName = JOptionPane.showInputDialog("Please type the name of the second bar");
   String secondBarValue = JOptionPane.showInputDialog("Please type the value of the second bar");
   String thirdBarName = JOptionPane.showInputDialog("Please type the name of the third bar");
   String thirdBarValue = JOptionPane.showInputDialog("Please type the value of the third bar");
   String fourthBarName = JOptionPane.showInputDialog("Please type the name of the fourth bar");
   String fourthBarValue = JOptionPane.showInputDialog("Please type the value of the fourth bar");
   String fifthBarName = JOptionPane.showInputDialog("Please type the name of the fifth bar");
   String fifthBarValue = JOptionPane.showInputDialog("Please type the value of the fifth bar");
   String sixthBarName = JOptionPane.showInputDialog("Please type the name of the sixth bar");
   String sixthBarValue = JOptionPane.showInputDialog("Please type the value of the sixth bar");
   int firstBarValueInt = new Integer(firstBarValue).intValue();
   int secondBarValueInt = new Integer(secondBarValue).intValue();
   int thirdBarValueInt = new Integer(thirdBarValue).intValue();
   int fourthBarValueInt = new Integer(fourthBarValue).intValue();
   int fifthBarValueInt = new Integer(fifthBarValue).intValue();
   int sixthBarValueInt = new Integer(sixthBarValue).intValue();
   public void paintComponent(Graphics g){//konstruktimi i kornizes permes paintComponent
      grafi.setAxes(20,220,largestValueInt+"",largestValueInt*3,6,g);//thirrja e metodes setAxes nga klasa BarGraphWriter permes objektit grafi
      grafi.setBar1(firstBarName,firstBarValueInt*3,Color.red,g);
      grafi.setBar2(secondBarName,secondBarValueInt*3,Color.white,g);
      grafi.setBar3(thirdBarName,thirdBarValueInt*3,Color.blue,g);
      grafi.setBar4(fourthBarName,fourthBarValueInt*3,Color.yellow,g);
      grafi.setBar5(fifthBarName,fifthBarValueInt*3,Color.magenta,g);
      grafi.setBar6(sixthBarName,sixthBarValueInt*3,Color.pink,g);
   }
public static void main(String[] args){
      new PlotGraph();
   }   
}