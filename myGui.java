import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myGui implements ActionListener {
  int  redScore = 0;
  JFrame jf;
  JPanel jp ;
  JButton redButton;
  JLabel redLabel;
  public myGui(){
    jf = new JFrame("My Window");
    jp = new JPanel();
    
    redLabel =  new JLabel("" + redScore);
    jf.setSize(400,400);
    jp.setSize(100,200);
    
    
    
    redButton = new JButton("Red Score");
    
    redButton.setSize(100, 30);
    redButton.addActionListener(this);
    jp.add(redButton);
    jp.add(redLabel);
    jf.add(jp);
    jf.setVisible(true);
  }
  
  
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == redButton){
      
      redScore ++;
      redLabel.setText("" + redScore);
      
    }
    
  }
  
  public static void main(String args[]){
    myGui mg = new myGui(); 
  }
  
  
}