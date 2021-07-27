package mktest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener {

    private JTextField test;
    JLabel label = new JLabel("alt => 캐스팅");
    JLabel label1 = new JLabel();
    Image image1 = new ImageIcon("img/casting.gif")
            .getImage().getScaledInstance(404, 271, 0);
    Image image2 = new ImageIcon("img/fishing.gif")
            .getImage().getScaledInstance(404, 271, 0);
    Image image3 = new ImageIcon("img/success.gif")
            .getImage().getScaledInstance(404, 271, 0);
    Image result = new ImageIcon("img/1.PNG")
            .getImage().getScaledInstance(404, 271, 0);

    public KeyEventTest() {
        super("낚시 게임");
        setBounds(300, 300, 404, 350);


        label1.setIcon(new ImageIcon(image1));


        // 1. 이벤트 등록을 위한 컴포넌트 만들기
        test = new JTextField(0);

        // 2. 생성한 컴포넌트에 이벤트 발생 감지
        test.addKeyListener(this);

        // 3. 컨테이너에 해당 컴포넌드 등록

        add(test);
        add(label, "South");
        add(label1);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new KeyEventTest();

    }

    @Override
    public void keyTyped(KeyEvent e) {//인터페이스 오류 방지


    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {               //인터페이스 오류 방지
        switch (e.getKeyCode()){
            case 17 :
                withdraw(e);
                break;
            case 18 :
                casting(e);
                break;
            case 16 :
                success(e);
                break;
            case 27 :
                exit(e);
                break;
            case 82 :
                recasting(e);
                break;
        }

    }


    // 실행 확인 메소드
    public void casting(KeyEvent e) {
        label1.setIcon(new ImageIcon(image2));
        label.setText("화면클릭 + ctrl => 준비로 돌아감     화면클릭 + shift => 낚아올리기");
    }

    public void withdraw(KeyEvent e) {
        label1.setIcon(new ImageIcon(image1));
        label.setText("alt => 캐스팅");
    }

    public void success(KeyEvent e) {
        label1.setIcon(new ImageIcon(image3));
        label.setText("esc => 조과확인");
    }

    public void exit(KeyEvent e) {
        label1.setIcon(new ImageIcon(result));          //여기에 잡은 물고기 사진이랑 제원?
        label.setText("r키 => 캐스팅 준비  나가는 키도 준비해야됨"); //그리고 여기에 다른 컴포넌트 띄우면서
    }

    public void recasting(KeyEvent e) {
        label1.setIcon(new ImageIcon(image1));
        label.setText("alt => 캐스팅");
    }
}

















