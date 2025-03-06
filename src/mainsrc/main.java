package mainsrc;

import test.*;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class main {


    public static void main(String[] args) {

        TV tv = new TV();
        JFrame jf = new JFrame("TV채널 조정");

        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 방향키를 눌렀을 때 채널을 올리거나 내림
                if (e.getKeyCode() == KeyEvent.VK_UP) {  // 위쪽 화살표
                    tv.chUp();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {  // 아래쪽 화살표
                    tv.chDown();
                }
            }



        });
        jf.setSize(400, 200);  // 프레임 크기 설정
        jf.setVisible(true);    // 프레임을 화면에 표시
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 창 닫기
    }
}
