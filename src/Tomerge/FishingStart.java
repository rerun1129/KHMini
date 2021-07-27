package Tomerge;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class FishingStart extends JFrame implements KeyListener {

    private JTextField test;
    JLabel label1 = new JLabel();
    Image image1 = new ImageIcon("img/start.PNG")
            .getImage().getScaledInstance(921, 398, 0);


    public FishingStart() {
        super("낚시 게임");
        setBounds(300, 300, 950, 450);


        label1.setIcon(new ImageIcon(image1));


        // 1. 이벤트 등록을 위한 컴포넌트 만들기
        test = new JTextField(0);

        // 2. 생성한 컴포넌트에 이벤트 발생 감지
        test.addKeyListener(this);

        // 3. 컨테이너에 해당 컴포넌드 등록

        add(test);
        add(label1);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FishingStart();

    }

    @Override
    public void keyTyped(KeyEvent e) {                  //인터페이스 오류 방지


    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {               //인터페이스 오류 방지
        switch (e.getKeyCode()){
            case 32 :
                start(e);
                break;
            case 27 :
                exit(e);
                break;
        }

    }


    // 실행 확인 메소드


    public void start(KeyEvent e) {
        dispose();
        new FishingMain();
    }
    public void exit(KeyEvent e) {
        dispose();

    }
}

















