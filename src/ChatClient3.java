import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient3 extends Frame{

    TextArea taContent = new TextArea();
    TextField tfTxt = new TextField();

    public static void main(String[] args){
        ChatClient3 cc = new ChatClient3();
        cc.launchFrame();
    }

    public void launchFrame(){
        setLocation(400,300);
        setSize(300,300);
        add(taContent, BorderLayout.NORTH);
        add(tfTxt,BorderLayout.SOUTH);
        pack();
        this.addWindowListener(new WindowAdapter() {// 匿名类
            public void windowClosing(WindowEvent arg0){  //You can close this Window
                System.exit(0);
            }
        });
        setVisible(true);
    }
}
