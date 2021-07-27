
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseEventTest extends JFrame implements MouseListener, MouseMotionListener {

    JLabel label = new JLabel();
    JLabel label1 = new JLabel("좌클릭(유지/떼기) => 캐스팅 / 낚아올리기 ");

    Image image1 = new ImageIcon("img/casting.gif").getImage().getScaledInstance(404, 271, 0);
    Image image2 = new ImageIcon("img/fishing.gif").getImage().getScaledInstance(404, 271, 0);
    Image image3 = new ImageIcon("img/success.gif").getImage().getScaledInstance(404, 271, 0);
    Image result = new ImageIcon("img/1.PNG").getImage().getScaledInstance(404, 271, 0);


    public MouseEventTest() {
        super("마우스 이벤트 테스트");

        setBounds(300, 300, 404, 350);

        JPanel pan = new JPanel();
        pan.addMouseListener(this);
        pan.addMouseMotionListener(this);

        label.setIcon(new ImageIcon(image1));

        add(pan);
        pan.add(label);
        pan.add(label1, "South");

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // 마우스가 특정 객체를 끌고 다닐 때 감지

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // 마우스가 움직일 때 감지

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // 마우스로 클릭했을 때 감지

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // 마우스로 클릭한 상태가 지속될 때 감지
        if (e.getButton() == 1) {
            casting(e);
        }else if (e.getButton() == 2) {
            exit(e);
        }else if(e.getButton() == 3){
            recasting(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // 마우스가 클릭에서 해방되었을 때 감지 (손 떼었을 때)
        if (e.getButton() == 1) {
            success(e);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // 마우스가 특정 객체 안에 들어왔을 때
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // 마우스가 특정 객체에서 벗어날 때


    }

    /*public void display(String eventName, MouseEvent e) {
        System.out.println(
                eventName + " : "
                        + "[x] : " + e.getX()
                        + "[y] : " + e.getY()
                        + "[clickType] : " + e.getClickCount()
                        + "[clickBtn] : " + e.getButton()           //0 아이들 1좌 2중간 3우
        );
    }*/

    public static void main(String[] args) {
        new MouseEventTest();
    }

    public void casting(MouseEvent e) {
        label.setIcon(new ImageIcon(image2));

    }

    public void withdraw(MouseEvent e) {
        label.setIcon(new ImageIcon(image1));
        label1.setText("조작법 : 좌클릭(유지/떼기) => 캐스팅 / 낚아올리기");
    }

    public void success(MouseEvent e) {
        label.setIcon(new ImageIcon(image3));
        label1.setText("휠 버튼 => 잡은 물고기 보기  우클릭 => 리캐스팅");
    }

    public void exit(MouseEvent e) {
        label.setIcon(new ImageIcon(result));                           //여기에 잡은 물고기 사진이랑 제원?
        label1.setText("우클릭 => 리캐스팅  마우스 화면출입 =>나가기(미구현)");//그리고 여기에 다른 컴포넌트 띄우면서
    }

    public void recasting(MouseEvent e) {
        label.setIcon(new ImageIcon(image1));
        label1.setText("조작법 : 좌클릭(유지/떼기) => 캐스팅 / 낚아올리기");

    }


}