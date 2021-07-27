package Tomerge;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FishingMain extends JFrame implements MouseListener, MouseMotionListener, KeyListener {

    private JTextField test;
    JPanel pan = new JPanel();
    JLabel label = new JLabel();
    JLabel label1 = new JLabel("좌클릭(유지/떼기) => 캐스팅 / 낚아올리기   Esc =>나가기");

    Image image1 = new ImageIcon("img/casting.gif").getImage().getScaledInstance(404, 271, 0);
    Image image2 = new ImageIcon("img/fishing.gif").getImage().getScaledInstance(404, 271, 0);
    Image image3 = new ImageIcon("img/success.gif").getImage().getScaledInstance(404, 271, 0);
    Image result = new ImageIcon("img/1.PNG").getImage().getScaledInstance(404, 271, 0);


    public FishingMain() {
        super("낚시 게임");

        setBounds(300, 300, 500, 400);
        test = new JTextField(0);


        pan.addMouseListener(this);
        pan.addMouseMotionListener(this);
        test.addKeyListener(this);


        label.setIcon(new ImageIcon(image1));

        add(test);
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
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==27){
            exit(e);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // 마우스로 클릭한 상태가 지속될 때 감지
        if (e.getButton() == 1) {
            casting(e);
        }else if (e.getButton() == 2) {
            setResult(e);
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
       //exit(e);


    }


    public static void main(String[] args) {
        new FishingMain();
    }

    public void casting(MouseEvent e) {
        label.setIcon(new ImageIcon(image2));
    }

    public void exit(KeyEvent e) {
        dispose();
        new FishingResult();
    }

    public void success(MouseEvent e) {
        label.setIcon(new ImageIcon(image3));
        label1.setText("휠 버튼 => 잡은 물고기 보기  우클릭 => 리캐스팅   Esc =>나가기");
    }

    public void setResult(MouseEvent e) {
        label.setIcon(new ImageIcon(result));  //여기에 잡은 물고기 사진이랑 제원?
        label1.setText("우클릭 => 리캐스팅  Esc =>나가기");//그리고 여기에 다른 컴포넌트 띄우면서
    }

    public void recasting(MouseEvent e) {
        label.setIcon(new ImageIcon(image1));
        label1.setText("좌클릭(유지/떼기) => 캐스팅 / 낚아올리기   Esc =>나가기");

    }


}