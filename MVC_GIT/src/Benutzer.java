import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Benutzer extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Benutzer frame = new Benutzer();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Benutzer(Daten daten) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(164, 65, 114, 19);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		JButton btn_add = new JButton("add");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//daten.addInListe(textFieldName.getText());
				//hallo.schleife();
			}
		});
		btn_add.setBounds(161, 116, 117, 25);
		contentPane.add(btn_add);
	}
}
