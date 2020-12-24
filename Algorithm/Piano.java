package Algorithm;

 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
 
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
 
class instrument extends JFrame implements ActionListener{
    JFrame f;
    // 생성자
    public instrument() {
        // 프레임 생성
        f = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);
        
        JMenu mnuFile = new JMenu("Instrument");
        JMenuItem mnu1 = new JMenuItem("Piano");     
        JMenuItem mnu2 = new JMenuItem("Drum");
        mnu1.addActionListener(this);
        mnu2.addActionListener(this);
        mnuFile.add(mnu1);
        mnuFile.add(mnu2);
        menuBar.add(mnuFile);
        
        // TODO Auto-generated constructor stub
        f.setSize(main.SCREEN_WIDTH, main.SCREEN_HEIGHT);
        f.setTitle("Instrument");
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    // 이벤트 리스너
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals("Drum")) {
            new Drum();
            f.dispose();
        }
        if (e.getActionCommand().equals("Piano")) {
            new Piano();
            f.dispose();
        }
    }
}
 
class Piano extends JFrame implements ActionListener{
    JFrame f;
    // 생성자
    public Piano() {
        // 프레임 생성
        f = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);
        
        JMenu mnuFile = new JMenu("Menu");
        JMenuItem mnu1 = new JMenuItem("Main");     
        mnu1.addActionListener(this);
        mnuFile.add(mnu1);
        menuBar.add(mnuFile);
        
        // TODO Auto-generated constructor stub
        f.setSize(main.SCREEN_WIDTH, main.SCREEN_HEIGHT);
        f.setTitle("Piano");
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    // 이벤트 리스너
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals("Main")) {
            new instrument();
            f.dispose();
        }
    }
}
 
class Drum extends JFrame implements ActionListener{
    JFrame f;
    // 생성자
    public Drum() {
        // 프레임 생성
        f = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);
        
        JMenu mnuFile = new JMenu("Menu");
        JMenuItem mnu1 = new JMenuItem("Main");     
        mnu1.addActionListener(this);
        mnuFile.add(mnu1);
        menuBar.add(mnuFile);
        
        // TODO Auto-generated constructor stub
        f.setSize(main.SCREEN_WIDTH, main.SCREEN_HEIGHT);
        f.setTitle("Drum");
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    // 이벤트 리스너
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals("Main")) {
            new instrument();
            f.dispose();
        }
    }
    
}
