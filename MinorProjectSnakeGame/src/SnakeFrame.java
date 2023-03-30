import javax.swing.JFrame;

public class SnakeFrame extends JFrame {
    SnakeFrame(){
        // this class is used to impliment all the functionilty in the window
        this.add(new SnakePanel());
        this.setTitle("Snake");
        // setResizable is used to fixed the size of the window if it false user can't change the size if tre they can.....
        this.setResizable(false);
        //pack is for using all user like linux, window, ios, etc.
        this.pack();
        this.setVisible(true);
    }
}
