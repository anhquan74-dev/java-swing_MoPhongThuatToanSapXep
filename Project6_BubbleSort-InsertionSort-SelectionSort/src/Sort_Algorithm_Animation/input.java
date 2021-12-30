package Sort_Algorithm_Animation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class input extends JDialog {
	private input ip;
	private homeFrm home;
	private final JPanel contentPanel = new JPanel();
	private JTextField soluongPT;
	private JTextField giatri;
	protected int a[];
	protected int size;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			input dialog = new input(homeFrm, rootPaneCheckingEnabled);
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public void createArray(String str) {
		String[] s = str.split("\\s");

		a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
	}

	public input(java.awt.Frame parent, boolean modal) {

		super(parent, modal);
		setResizable(false);
		setTitle("Nhập dữ liệu cho mảng");
		ip = this;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		home = (homeFrm) parent;
		{
			JLabel lblNewLabel = new JLabel("Nh\u1EADp s\u1ED1 l\u01B0\u1EE3ng ph\u1EA7n t\u1EED c\u1EE7a m\u1EA3ng: ");
			lblNewLabel.setBounds(45, 43, 212, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			soluongPT = new JTextField();
			soluongPT.setBounds(267, 31, 35, 29);
			contentPanel.add(soluongPT);
			soluongPT.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nh\u1EADp m\u1EA3ng");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(179, 87, 93, 29);
			contentPanel.add(lblNewLabel_1);
		}
		{
			giatri = new JTextField();
			giatri.setBounds(33, 127, 366, 29);
			contentPanel.add(giatri);
			giatri.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel(
					"( M\u1ED7i ph\u1EA7n t\u1EED c\u00E1ch nhau m\u1ED9t kho\u1EA3ng tr\u1ED1ng \"  \" )");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
			lblNewLabel_2.setBounds(99, 167, 282, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton nhapmang = new JButton("Nh\u1EADp m\u1EA3ng");
				nhapmang.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int sl = 0;
						var str = giatri.getText();

						try {
							sl = Integer.parseInt(soluongPT.getText());
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(rootPane, "Nhập sai! Hãy nhập lại!");
						}

						String[] s = str.split("\\s");

						if (s.length != sl) {
							JOptionPane.showMessageDialog(rootPane, "Nhập sai! Hãy nhập lại!");
						} else {
							size = Integer.parseInt(soluongPT.getText());
							createArray(giatri.getText());
							home.setArray(a);
							home.setSize(size);
							JOptionPane.showMessageDialog(rootPane, "Đã nhập mảng thành công");
							ip.dispose();
						}

					}
				});
				nhapmang.setActionCommand("OK");
				buttonPane.add(nhapmang);
				getRootPane().setDefaultButton(nhapmang);
			}
		}
	}

}
