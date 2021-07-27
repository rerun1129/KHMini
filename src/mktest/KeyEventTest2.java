package mktest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventTest2 extends JFrame implements KeyListener{

    private JTextField test;

    public KeyEventTest2() {
        super("키입력 테스트");
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
        new KeyEventTest2();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        display("Key Typed", e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        display("Key Pressed", e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        display("Key Released", e);

    }

    public void sampleMethod(){
        System.out.println("--- 10자 이내 작성 금지");
        if((test.getText().length())>10){
            System.out.println("10자 초과!");
        }else {
            System.out.println("10자 이내 더 작성하세요.");
        }
    }



    // 실행 확인 메소드
    public void display(String eventName, KeyEvent e) {
        char ch = e.getKeyChar();
        int keyNum = e.getKeyCode();

        String modifier = e.isControlDown() +", " + e.isAltDown() + ", " + e.isShiftDown();
        System.out.println("이벤트명 : " + eventName);
        System.out.println("["+keyNum +"]:" + ch);
        System.out.println("특수 키 여부 : " + modifier);
    }

}