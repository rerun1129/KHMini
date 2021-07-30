package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FishingResult extends JFrame implements KeyListener {

    private JTextField test;

    public FishingResult() {
        super("낚시 게임");
        setBounds(300, 300, 500, 500);

        // 1. 이벤트 등록을 위한 컴포넌트 만들기
        test = new JTextField(0);

        // 2. 생성한 컴포넌트에 이벤트 발생 감지
        test.addKeyListener(this);

        // 3. 컨테이너에 해당 컴포넌드 등록
        add(test);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FishingResult();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            upgradeRod(e);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


//여기서 몇마리 잡았는지 정산금액이 얼만지 스테이터스 표시해주고 다시 낚시 화면/업그레이드 화면/홈 화면 선택할수있게 함

    // 실행 확인 메소드
    public void upgradeRod(KeyEvent e) {
        dispose();
        new UpgradeRod();

    }

}