import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
  
public class PasalubongShop extends JFrame 
{
   JLabel biko,bibingka,putomaya,chicharon ,torta,ampaw,piyaya ,cash,tot,change,wel,m1,m;
   JLabel biko1,bibingka1,putomaya1,chicharon1,torta1,ampaw1,piyaya1 ,cash1,tot1,change1,menu,rem1,rem,sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8;
   JTextField bikoT, bibingkaT,putomayaT,chicharonT ,tortaT,ampawT,piyayaT ,cashT,totT,changeT;
   JButton exit,buy,calculate;
   calHandler cH;
   exHandler eH;
   buyHandler bH;
   buttonHandler butH;
   JPanel p1,p2,p3,p4,p5;
   JRadioButton r1,r2,r3;
   ButtonGroup bg;
   Color currentColor = Color.black;
   Container c;
   double n1,n2,n3,n4,n5,n6,n7,ncash;
   double total = 0.00;
   double changeAmount = 0.00;
    
   public PasalubongShop()
   {
      super("Pasalubong Shop");
      addWindowListener(new NewWindowAdapter());
    
      rem = new JLabel("ENTER NUMBER OF GOODS YOU ");
      rem1 = new JLabel("WANT TO PURCHASE ");  
      menu = new JLabel("                    *********************MENU **********************");
      menu.setForeground(Color.blue);
   
      sp1 = new JLabel("");
      wel =  new JLabel ("                          WELCOME TO MY PASALUBONG SHOP");
      wel.setForeground(Color.red);
      sp2 = new  JLabel("");
      biko1 = new JLabel("                    *                      Biko = P10                                      *");               
      sp3 = new  JLabel("");
      bibingka1 = new JLabel("                   *                      Bibingka = P15                               *");    
      sp4 = new  JLabel("");
      putomaya1 = new JLabel("                   *                            Putomaya = P7                          *");    
      sp5 = new  JLabel("");
      chicharon1 = new JLabel("                   *                         Chicharon = P20                          *");  
      sp6 = new  JLabel("");
      torta1 = new JLabel("                   *                            Torta = P8                                   *");          
      sp7 = new  JLabel("");
      ampaw1 = new JLabel("                   *                             Ampaw = P25                           *");          
      sp8 = new  JLabel("");
      piyaya1 = new JLabel("                   *                            Piyaya = P10                               *");      
      
      m = new JLabel("How many times did you visit my shop?");
      
      
      m1 = new JLabel("");
      m1.setForeground(Color.pink);
      exit = new JButton("Exit");
      eH = new exHandler(); 
      exit.addActionListener(eH);
    
      bH = new buyHandler();
      buy = new JButton("Buy Now");
      buy.addActionListener(bH);
     
      calculate = new JButton("CALCULATE");
      cH = new calHandler();
      calculate.addActionListener(cH);
     
      bg = new ButtonGroup();  
     
      r1 = new JRadioButton("Once");
      butH = new buttonHandler();
      r1.addItemListener(butH);
      r2 = new JRadioButton("Twice");
      butH = new buttonHandler();
      r2.addItemListener(butH);
      r3 = new JRadioButton("Many Times");
      butH = new buttonHandler();
      r3.addItemListener(butH);
   
      bg.add(r1);
      bg.add(r2);
      bg.add(r3);
   
      biko = new JLabel("Biko:");          bikoT = new JTextField (13);     
      bibingka = new JLabel("Bibingka:");   bibingkaT = new JTextField (13);  
      putomaya = new JLabel("Putomaya:");  putomayaT  = new JTextField (13);  
      chicharon = new JLabel("Chicharon:");chicharonT  = new JTextField (13);  
      torta = new JLabel("Torta :");       tortaT  = new JTextField (13);  
      ampaw = new JLabel("Ampaw:");        ampawT  = new JTextField (13);  
      piyaya = new JLabel("Piyaya:");      piyayaT  = new JTextField (13);  
      tot= new JLabel("Total:");            totT  = new JTextField (13); 
      cash = new JLabel("Cash:");           cashT  = new JTextField (13);  
      change = new JLabel("Change:");       changeT  = new JTextField (13);  
     
      biko.setVisible(false);       bikoT.setVisible(false);
      bibingka.setVisible(false);     bibingkaT.setVisible(false);
      putomaya.setVisible(false);      putomayaT.setVisible(false);
      chicharon.setVisible(false); chicharonT.setVisible(false);
      torta.setVisible(false);    tortaT.setVisible(false);
      ampaw.setVisible(false);      ampawT.setVisible(false);
      piyaya.setVisible(false);         piyayaT.setVisible(false);
      tot.setVisible(false);      totT.setVisible(false);
      cash.setVisible(false);      cashT.setVisible(false);
      change.setVisible(false);   changeT.setVisible(false); 
              
         
     
      p3 = new JPanel();
      p3.setLayout(new GridLayout(11,2));
      p3.setBackground(Color.pink); 
      p3.add(rem); p3.add(rem1); 
      p3.add(biko);       p3.add(bikoT);       
      p3.add(bibingka);   p3.add(bibingkaT);
      p3.add(putomaya);   p3.add(putomayaT);
      p3.add(chicharon);  p3.add(chicharonT); 
      p3.add(torta);      p3.add(tortaT);  
      p3.add(ampaw);      p3.add(ampawT); 
      p3.add(piyaya);     p3.add(piyayaT); 
      p3.add(tot);        p3.add(totT);
      p3.add(cash);       p3.add(cashT);
      p3.add(change);     p3.add(changeT);
      totT.setEditable(false);
      changeT.setEditable(false);
     
   
      p4 = new JPanel();
      setLayout(new FlowLayout());
      p4.add(calculate);
      p4.add(exit); 
      
   
      setLayout(new BorderLayout());
      add(p3, BorderLayout.NORTH);
      add(p4, BorderLayout.SOUTH);
     
     
      p3.setVisible(false);
      p4.setVisible(false);
       
      menu.setVisible(true);
      sp1.setVisible(true);
      wel.setVisible(true);
      sp2.setVisible(true);
      biko1.setVisible(true);
      sp3.setVisible(true);
      bibingka1.setVisible(true); 
      sp4.setVisible(true);
      putomaya1.setVisible(true);
      sp5.setVisible(true);
      chicharon1.setVisible(true);
      sp6.setVisible(true);
      torta1.setVisible(true); 
      sp7.setVisible(true);
      ampaw1.setVisible(true); 
      sp8.setVisible(true);
      piyaya1.setVisible(true); 
      m.setVisible(true);
      r1.setVisible(true);
      r2.setVisible(true);
      r3.setVisible(true);
      m1.setVisible(true);
          
     
      p1 = new JPanel();
      p1.setLayout(new GridLayout(22,0));
     
      p1.add(wel);
      p1.add(sp1); 
      p1.add(menu); 
      p1.add(sp2);
      p1.add(biko1);        
      p1.add(sp3);
      p1.add(bibingka1); 
      p1.add(sp4);
      p1.add(putomaya1); 
      p1.add(sp5);
      p1.add(chicharon1);   
      p1.add(sp6);
      p1.add(torta1);  
      p1.add(sp7);
      p1.add(ampaw1); 
      p1.add(sp8);
      p1.add(piyaya1); 
      p1.add(m);
      p1.add(r1);
      p1.add(r2);
      p1.add(r3);
      p1.add(m1);
   
      p1.setVisible(true);
   
      p2 = new JPanel();
      p2.setLayout(new FlowLayout());
      p2.setBackground(Color.magenta);
      p2.add(buy);
      p2.add(exit);
      p2.add(calculate);
      calculate.setVisible(false);
    
      setLayout(new BorderLayout());
      add(p2, BorderLayout.SOUTH);
      add(p1, BorderLayout.NORTH);
      add(p3, BorderLayout.CENTER);
      p3.setVisible(false);     
     
      setSize(450,600);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
    
   }  
   private class buyHandler implements ActionListener
   {        
      public void actionPerformed(ActionEvent ae)
      {
      
      
         if(ae.getSource()== buy)
         {          
            rem.setVisible(true); rem1.setVisible(true);
            biko.setVisible(true);       bikoT.setVisible(true);
            bibingka.setVisible(true);     bibingkaT.setVisible(true);
            putomaya.setVisible(true);      putomayaT.setVisible(true);
            chicharon.setVisible(true); chicharonT.setVisible(true);
            torta.setVisible(true);    tortaT.setVisible(true);
            ampaw.setVisible(true);      ampawT.setVisible(true);
            piyaya.setVisible(true);         piyayaT.setVisible(true);
            cash.setVisible(true);      cashT.setVisible(true);
            tot.setVisible(true);      totT.setVisible(true);
            change.setVisible(true);  changeT.setVisible(true);  
            calculate.setVisible(true);  calculate.setVisible(true);
            exit.setVisible(false);
            p3.setVisible(true);  p4.setVisible(true);
                 
         
            menu.setVisible(false);
            sp1.setVisible(false);
            biko1.setVisible(false);    
            bibingka1.setVisible(false);   
            putomaya1.setVisible(false);     
            chicharon1.setVisible(false); 
            torta1.setVisible(false);    
            ampaw1.setVisible(false);     
            piyaya1.setVisible(false);         
            buy.setVisible(false);
            p1.setVisible(false);p2.setVisible(true);
            return;
         
         }
      }   
   }    
   private class calHandler implements ActionListener
   {  
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getSource() == calculate)
         {
              
            try{
            /*  n1 = Double.parseDouble(bikoT.getText());
            n2 = Double.parseDouble(bibingkaT.getText());
            n3 = Double.parseDouble(putomayaT.getText());
            n4 = Double.parseDouble(chicharonT.getText());
            n5 = Double.parseDouble(tortaT.getText());
            n6 = Double.parseDouble(ampawT.getText());
            n7 = Double.parseDouble(piyayaT.getText());
            ncash = Double.parseDouble(cashT.getText());
            */
               String str = ae.getActionCommand();
               String h1 = bikoT.getText();
               String h2 = bibingkaT.getText();
               String h3 = putomayaT.getText();
               String h4 = chicharonT.getText();
               String h5 = tortaT.getText();
               String h6 = ampawT.getText();
               String h7 = piyayaT.getText();
            
               String hcash = cashT.getText();
            
               ncash = Double.parseDouble(cashT.getText());       
               if("".equals(h1)){
                  n1 = 0.0;
               }
               else{
                  n1 = Double.parseDouble(bikoT.getText());
               }
               if("".equals(h2)){
                  n2 = 0.0;
               }
               else{
                  n2 = Double.parseDouble(bibingkaT.getText());
               }
               if("".equals(h3)){
                  n3 = 0.0;
               }
               else{
                  n3 = Double.parseDouble(putomayaT.getText());
               }
             
               if("".equals(h4))
               {
                  n4 = 0.0;
               }
               else{
                  n4 = Double.parseDouble(chicharonT.getText()); 
               }
               if("".equals(h5))
               {
                  n5 = 0.0;
               }
               else{ 
                  n5 = Double.parseDouble(tortaT.getText());
               
               }
               if("".equals(h6))
               {
                  n6 = 0.0;
               }
               else{ 
                  n6 = Double.parseDouble(ampawT.getText());      
               
               }
               if("".equals(h7))
               {
                  n7 = 0.0;
               }
               else{ 
                  n7 = Double.parseDouble(piyayaT.getText()); 
               }
               if("".equals(hcash))
               {
                  ncash = 0.0;
               }
               else{ 
                  ncash = Double.parseDouble(cashT.getText());     
               }
             
               total = ((n1*10)+(n2*15)+(n3*7)+(n4*20)+(n5*8)+(n6*25)+(n7*10));
               totT.setText(total+"");
               ncash = ncash -total;
            
               if(ncash >= total)
               {
                  changeT.setText(ncash+"");
               }
               else{
                  JOptionPane.showMessageDialog(null,"Your cash must be greater than total amount of purchase","WARNING MESSAGE!",JOptionPane.WARNING_MESSAGE);                 
               }
            
            }
            
            catch(NumberFormatException e)
            {
               JOptionPane.showMessageDialog(null,"Invalid Input");
            }   
            catch(Exception e)
            {
               JOptionPane.showMessageDialog(null,"Error");
            }       
         }
      }
   }
    
  
    
   private class exHandler implements ActionListener
   {  
      public void actionPerformed(ActionEvent ae)
      {
      
         if(ae.getSource() == exit)
         {
            System.exit(0);
         
         }
      } 
   }

   private class buttonHandler implements ItemListener
   {
      public void itemStateChanged(ItemEvent e)
      {
         if(e.getSource() == r1)
            m1.setText("Welcome and Enjoy :)");
         if(e.getSource() == r2)
            m1.setText("Thank you for coming again :)");
         if(e.getSource() == r3)
            m1.setText("Thank you for being my regular customer :)");
      
      }
   
   
   
   }
   public double total(double n1,double n2,double n3,double n4, double n5,double n6,double n7)
   {
      return (n1*10)+(n2*15)+(n3*7)+(n4*20)+(n5*8)+(n6*25)+(n7*10);
   }
   public double changeAmount(double total, double ncash)
   {
      return ncash - total;
   }
   public static void main(String args [])
   {
      PasalubongShop  l =new PasalubongShop();
      l.setVisible(true);
      l.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }//end of main
  
   class NewWindowAdapter extends WindowAdapter
   {
      public void windowClosing(WindowEvent we)
      {
         JOptionPane.showMessageDialog(null,"THANK YOU AND COME AGAIN :)!!. HAVE A NICE DAY!! ","GOODBYE COSTUMERS ^_^" ,JOptionPane.PLAIN_MESSAGE);
         System.exit(0);
      }
   
   }
}