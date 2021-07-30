package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class UpgradeRod extends JFrame implements KeyListener{

    private JTextField test;

    public UpgradeRod() {
        super("낚시 게임");
        setBounds(300, 300, 300, 150);

        // 1. 이벤트 등록을 위한 컴포넌트 만들기
        test = new JTextField(20);

        // 2. 생성한 컴포넌트에 이벤트 발생 감지
        test.addKeyListener(this);

        // 3. 컨테이너에 해당 컴포넌드 등록
        add(test);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UpgradeRod();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }



    // 실행 확인 메소드
    public void display(String eventName, KeyEvent e) {

    }

}