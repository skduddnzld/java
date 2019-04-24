import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();

	public KeyCodeEx() {
		setTitle("F1키: 초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300, 150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void KeyPressed(KeyEvent e) {
			Container contentPane = (Container) e.getSource();
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력됨");

			if (e.getKeyChar() == '%')
				contentPane.setBackground(Color.yellow);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.gray);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}

}
