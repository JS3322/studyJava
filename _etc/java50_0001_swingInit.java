package _etc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class java50_0001_swingInit extends JFrame {

    JTextField textField = new JTextField("name", 10); //텍스트 써져있는 textfield생성
    JPasswordField passwordField = new JPasswordField(8);
    JTextArea textArea = new JTextArea(3, 25);
    JButton button = new JButton("OK");
    public java50_0001_swingInit(String title) { // 생성자
        super(title);
        this.add(new JLabel("ID를 입력하시오"));
        this.add(textField);
        this.add(new JLabel("PASSWORD를 입력하시오"));
        this.add(passwordField);
        this.add(textArea);
        this.add(button);
        button.addActionListener(new OKAction());
    }
    public static void main(String[] args) {
        java50_0001_swingInit f = new java50_0001_swingInit("LabelAndTextTest");
        f.setSize(320, 240);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    class OKAction implements ActionListener {
        public void actionPerformed(ActionEvent e) { // 이벤트 처리기
            textArea.setText("name : ");
            textArea.append(textField.getText() + "\n");
            textArea.append("password : " + new String(passwordField.getPassword()));
        }
    }
}
