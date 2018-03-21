package exercise3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class luas extends JFrame {

	private JPanel contentPane;
	private JTextField vJari;
	private JTextField vHasil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					luas frame = new luas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public luas() {
		
	    final Lingkaran Dihitung ;
	    Dihitung = new Lingkaran ();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		vJari = new JTextField();
		vJari.setBounds(145, 49, 86, 20);
		contentPane.add(vJari);
		vJari.setColumns(10);
		
		JButton btnLuas = new JButton("Luas");
		btnLuas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dihitung.setJari(Integer.parseInt(vJari.getText().toString()));
				
				vHasil.setText(String.valueOf(Dihitung.getJumlah()));
			}
		});
		btnLuas.setBounds(142, 80, 89, 23);
		contentPane.add(btnLuas);
		
		vHasil = new JTextField();
		vHasil.setBounds(142, 118, 86, 20);
		contentPane.add(vHasil);
		vHasil.setColumns(10);
	}

}
