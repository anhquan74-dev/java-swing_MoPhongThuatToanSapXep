package Sort_Algorithm_Animation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class homeFrm extends JFrame {

	private homeFrm home;

	private JTextField soluong;
	private JTextField mang;
	private JTextField min;
	private JTextField max;

	private int size;
	private int arr[];

	private JRadioButton insertionRadio;
	private JRadioButton selectionRadio;
	private JRadioButton bubbleRadio;

	private DefaultListModel<String> model;
	private JList<String> displayCode;

	private DefaultListModel<String> model2;
	private JList<String> mophong;

	private JTextField time;
	private JTextField ketqua;

	private JLabel hienthiMang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homeFrm frame = new homeFrm();
					frame.setVisible(true);
					frame.setSize(1364, 768);
					;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	// set size
	public void setSize(int s) {
		size = s;
	}

	// set Array
	public void setArray(int a[]) {
		arr = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
	}

	// Hien thi mang
	public String displayArray(int arr[]) {
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				s = s + arr[i] + "       ";
			} else {
				s = s + arr[i];
			}
		}
		return s;
	}

	// Them code vao Jlist displayCode
	public void addBubbleSortGiam() {
		model.addElement("public void BubbleSortGiam(int a[]) {");
		model.addElement("    int size = a.length;");
		model.addElement("    for (int i = 0; i < size - 1; i++) {");
		model.addElement("        for (int j = size - 1; j > i; j--) {");
		model.addElement("            if (arr[j] > arr[j - 1]) {");
		model.addElement("                swap(arr[j], arr[j - 1]);");
		model.addElement("            }");
		model.addElement("        }");
		model.addElement("    }");
		model.addElement("}");
	}

	public void addBubbleSortTang() {
		model.addElement("public void BubbleSortTang(int a[]) {");
		model.addElement("    int size = a.length;");
		model.addElement("    for (int i = 0; i < size - 1; i++) {");
		model.addElement("        for (int j = size - 1; j > i; j--) {");
		model.addElement("            if (arr[j] < arr[j - 1]) {");
		model.addElement("                swap(arr[j], arr[j - 1]);");
		model.addElement("            }");
		model.addElement("        }");
		model.addElement("    }");
		model.addElement("}");
	}

	public void addInsertionSortGiam() {
		model.addElement("public void InsertionSortGiam(int a[]) {");
		model.addElement("    int size = a.length;");
		model.addElement("    for (int i = 1; i < size; i++) {");
		model.addElement("        int temp = a[i];");
		model.addElement("        int j = i - 1;");
		model.addElement("        while ((j >= 0) && (a[j] < temp)) {");
		model.addElement("            a[j + 1] = a[j];");
		model.addElement("        	  j--;");
		model.addElement("        }");
		model.addElement("        a[j + 1] = temp;");
		model.addElement("    }");
		model.addElement("}");
	}

	public void addInsertionSortTang() {
		model.addElement("public void InsertionSortTang(int a[]) {");
		model.addElement("    int size = a.length;");
		model.addElement("    for (int i = 1; i < size; i++) {");
		model.addElement("        int temp = a[i];");
		model.addElement("        int j = i - 1;");
		model.addElement("        while ((j >= 0) && (a[j] > temp)) {");
		model.addElement("            a[j + 1] = a[j];");
		model.addElement("        	  j--;");
		model.addElement("        }");
		model.addElement("        a[j + 1] = temp;");
		model.addElement("    }");
		model.addElement("}");
	}

	public void addSelectionGiam() {
		model.addElement("public void SelectionGiam(int a[]) {");
		model.addElement("    int n = a.length;");
		model.addElement("    for (int i = 0; i < n - 1; i++) {");
		model.addElement("        int max_idx = i;");
		model.addElement("        for (int j = i + 1; j < n; j++)");
		model.addElement("            if (a[j] > a[max_idx]){");
		model.addElement("                max_idx = j;");
		model.addElement("            }");
		model.addElement("        }");
		model.addElement("        if (max_idx != i) {");
		model.addElement("        	  swap(a[i], a[max_idx]);");
		model.addElement("        }");
		model.addElement("    }");
		model.addElement("}");
	}

	public void addSelectionTang() {
		model.addElement("public void SelectionTang(int a[]) {");
		model.addElement("    int n = a.length;");
		model.addElement("    for (int i = 0; i < n - 1; i++) {");
		model.addElement("        int min_idx = i;");
		model.addElement("        for (int j = i + 1; j < n; j++)");
		model.addElement("            if (a[j] < a[min_idx]){");
		model.addElement("                min_idx = j;");
		model.addElement("            }");
		model.addElement("        }");
		model.addElement("        if (min_idx != i) {");
		model.addElement("        	  swap(a[i], a[min_idx]);");
		model.addElement("        }");
		model.addElement("    }");
		model.addElement("}");
	}

	// kiem tra dau vao co hop le hay khong
	public boolean checkInput(String s) {
		if (s.length() == 0) {
			return false;
		}

		if (s.charAt(0) == '-') {
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) < '0' || s.charAt(i) > '9') {
					return false;
				}
			}
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) < '0' || s.charAt(i) > '9') {
					return false;
				}
			}
		}

		return true;
	}

	// Thuat toan sap xep
	public void BubbleSortGiam(int a[]) {
		long start = System.currentTimeMillis();
		int count = 1;
		int size = a.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = size - 1; j > i; j--) {
				if (a[j] > a[j - 1]) {
					if (count < 10) {
						model2.addElement("Bước 0" + String.valueOf(count) + ":     " + "Với i = " + i + " | j = " + j
								+ ":      " + "arr[" + String.valueOf(j) + "] > arr[" + String.valueOf(j - 1) + "] ("
								+ String.valueOf(a[j]) + " > " + String.valueOf(a[j - 1]) + ")   ->   swap(arr["
								+ String.valueOf(j) + "], arr[" + String.valueOf(j - 1) + "])");
					} else {
						model2.addElement("Bước " + String.valueOf(count) + ":     " + "Với i = " + i + " | j = " + j
								+ ":      " + "arr[" + String.valueOf(j) + "] > arr[" + String.valueOf(j - 1) + "] ("
								+ String.valueOf(a[j]) + " > " + String.valueOf(a[j - 1]) + ")   ->   swap(arr["
								+ String.valueOf(j) + "], arr[" + String.valueOf(j - 1) + "])");
					}
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					count++;
					model2.addElement("------------");
					model2.addElement(" ");
					model2.addElement("-> Mảng:    " + displayArray(a));
					model2.addElement(" ");
					model2.addElement(" ");
				}
			}
		}

		long end = System.currentTimeMillis();
		long t = end - start;
		time.setText(String.valueOf(t));
	}

	public void BubbleSortTang(int a[]) {
		long start = System.currentTimeMillis();
		int size = a.length;
		int count = 1;
		for (int i = 0; i < size - 1; i++) {
			for (int j = size - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					if (count < 10) {
						model2.addElement("Bước 0" + String.valueOf(count) + ":     " + "Với i = " + i + " | j = " + j
								+ ":      " + "arr[" + String.valueOf(j) + "] < arr[" + String.valueOf(j - 1) + "] ("
								+ String.valueOf(a[j]) + " < " + String.valueOf(a[j - 1]) + ")   ->   swap(arr["
								+ String.valueOf(j) + "], arr[" + String.valueOf(j - 1) + "])");
					} else {
						model2.addElement("Bước " + String.valueOf(count) + ":     " + "Với i = " + i + " | j = " + j
								+ ":      " + "arr[" + String.valueOf(j) + "] < arr[" + String.valueOf(j - 1) + "] ("
								+ String.valueOf(a[j]) + " < " + String.valueOf(a[j - 1]) + ")   ->   swap(arr["
								+ String.valueOf(j) + "], arr[" + String.valueOf(j - 1) + "])");
					}
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					count++;
					model2.addElement("------------");
					model2.addElement(" ");
					model2.addElement("-> Mảng:    " + displayArray(a));
					model2.addElement(" ");
					model2.addElement(" ");
				}
			}
		}
		long end = System.currentTimeMillis();
		long t = end - start;
		time.setText(String.valueOf(t));
	}

	public void InsertionSortGiam(int a[]) {
		long start = System.currentTimeMillis();
		int size = a.length;
		int count = 1;
		for (int i = 1; i < size; i++) {
			boolean flag = false;
			int temp = a[i];
			int j = i - 1;
			if (a[j] < temp) {
				flag = true;
			}
			while ((j >= 0) && (a[j] < temp)) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
			if (flag == true) {
				if (count < 10) {
					model2.addElement("Bước 0" + String.valueOf(count) + ":     Di chuyển a[" + (i) + "] = " + temp
							+ " vào vị trí " + (j + 1) + ".");
				} else {
					model2.addElement("Bước " + String.valueOf(count) + ":     Di chuyển a[" + (i) + "] = " + temp
							+ " vào vị trí " + (j + 1) + ".");
				}
				model2.addElement("------------");
				model2.addElement(" ");
				model2.addElement("-> Mảng:    " + displayArray(a));
				model2.addElement(" ");
				model2.addElement(" ");
				count++;
			}

		}
		long end = System.currentTimeMillis();
		long t = end - start;
		time.setText(String.valueOf(t));
	}

	public void InsertionSortTang(int a[]) {
		long start = System.currentTimeMillis();
		int size = a.length;
		int count = 1;
		for (int i = 1; i < size; i++) {
			boolean flag = false;
			int temp = a[i];
			int j = i - 1;
			if (a[j] > temp) {
				flag = true;
			}
			while ((j >= 0) && (a[j] > temp)) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
			if (flag == true) {
				if (count < 10) {
					model2.addElement("Bước 0" + String.valueOf(count) + ":     Di chuyển a[" + i + "] = " + temp
							+ " vào vị trí " + (j + 1) + ".");
				} else {
					model2.addElement("Bước " + String.valueOf(count) + ":     Di chuyển a[" + i + "] = " + temp
							+ " vào vị trí " + (j + 1) + ".");
				}
				model2.addElement("------------");
				model2.addElement(" ");
				model2.addElement("-> Mảng:    " + displayArray(a));
				model2.addElement(" ");
				model2.addElement(" ");
				count++;
			}

		}
		long end = System.currentTimeMillis();
		long t = end - start;
		time.setText(String.valueOf(t));
	}

	public void SelectionGiam(int a[]) {
		long start = System.currentTimeMillis();
		int n = a.length;
		int count = 1;
		for (int i = 0; i < n - 1; i++) {

			int max_idx = i;

			for (int j = i + 1; j < n; j++) {
				if (a[j] > a[max_idx]) {
					max_idx = j;
				}
			}
			if (max_idx != i) {
				if (count < 10) {
					model2.addElement("Bước 0" + String.valueOf(count) + ":     " + "Với i = " + i + " | max_idx = "
							+ max_idx + ":    swap(arr[" + String.valueOf(i) + "], arr[" + String.valueOf(max_idx)
							+ "])" + "    <=>    swap(" + String.valueOf(a[i]) + ", " + String.valueOf(a[max_idx])
							+ ")");
				} else {
					model2.addElement("Bước " + String.valueOf(count) + ":     " + "Với i = " + i + " | max_idx = "
							+ max_idx + ":    swap(arr[" + String.valueOf(i) + "], arr[" + String.valueOf(max_idx)
							+ "])" + "    <=>    swap(" + String.valueOf(a[i]) + ", " + String.valueOf(a[max_idx])
							+ ")");
				}
				int temp = a[i];
				a[i] = a[max_idx];
				a[max_idx] = temp;
				model2.addElement("------------");
				model2.addElement(" ");
				model2.addElement("-> Mảng:    " + displayArray(a));
				model2.addElement(" ");
				model2.addElement(" ");
				count++;
			}

		}
		long end = System.currentTimeMillis();
		long t = end - start;
		time.setText(String.valueOf(t));
	}

	public void SelectionTang(int a[]) {
		long start = System.currentTimeMillis();
		int n = a.length;
		int count = 1;
		for (int i = 0; i < n - 1; i++) {

			int min_idx = i;

			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min_idx]) {
					min_idx = j;
				}
			}

			if (min_idx != i) {
				if (count < 10) {
					model2.addElement("Bước 0" + String.valueOf(count) + ":     " + "Với i = " + i + " | min_idx = "
							+ min_idx + ":    swap(arr[" + String.valueOf(i) + "], arr[" + String.valueOf(min_idx)
							+ "])" + "    <=>    swap(" + String.valueOf(a[i]) + ", " + String.valueOf(a[min_idx])
							+ ")");
				} else {
					model2.addElement("Bước " + String.valueOf(count) + ":     " + "Với i = " + i + " | min_idx = "
							+ min_idx + ":    swap(arr[" + String.valueOf(i) + "], arr[" + String.valueOf(min_idx)
							+ "])" + "    <=>    swap(" + String.valueOf(a[i]) + ", " + String.valueOf(a[min_idx])
							+ ")");
				}
				int temp = a[i];
				a[i] = a[min_idx];
				a[min_idx] = temp;
				model2.addElement("------------");
				model2.addElement(" ");
				model2.addElement("-> Mảng:    " + displayArray(a));
				model2.addElement(" ");
				model2.addElement(" ");
				count++;
			}

		}
		long end = System.currentTimeMillis();
		long t = end - start;
		time.setText(String.valueOf(t));
	}

	// ham khoi tao
	public homeFrm() {
		setResizable(false);
		getContentPane().setBackground(new Color(211, 211, 211));
		setTitle("Mô phỏng thuật toán sắp xếp");
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"D\u1EEF li\u1EC7u \u0111\u1EA7u v\u00E0o", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		panel.setBounds(10, 54, 628, 203);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"Nh\u1EADp s\u1ED1 l\u01B0\u1EE3ng ph\u1EA7n t\u1EED c\u1EE7a m\u1EA3ng (t\u1ED1i \u0111a 10 ph\u1EA7n t\u1EED): ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(45, 45, 331, 14);
		panel.add(lblNewLabel);

		soluong = new JTextField();
		soluong.setBounds(386, 38, 44, 29);
		soluong.setColumns(10);
		panel.add(soluong);

		JLabel lblNhpGiTr = new JLabel("C\u00E1c ph\u1EA7n t\u1EED c\u1EE7a m\u1EA3ng:");
		lblNhpGiTr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNhpGiTr.setBounds(45, 133, 252, 14);
		panel.add(lblNhpGiTr);

		mang = new JTextField();
		mang.setBounds(45, 158, 448, 34);
		mang.setColumns(10);
		panel.add(mang);

		JLabel lblNewLabel_2 = new JLabel("Min:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(71, 87, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Max:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(212, 87, 46, 14);
		panel.add(lblNewLabel_2_1);

		min = new JTextField();
		min.setBounds(95, 80, 44, 29);
		panel.add(min);
		min.setColumns(10);

		max = new JTextField();
		max.setColumns(10);
		max.setBounds(249, 80, 44, 29);
		panel.add(max);

		// bat su kien cho button Random
		JButton randomMang = new JButton("Random");
		randomMang.setForeground(SystemColor.desktop);
		randomMang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rd = new Random();
				String slStr = soluong.getText();
				String minStr = min.getText();
				String maxStr = max.getText();

				if (checkInput(slStr) == true && checkInput(minStr) == true && checkInput(maxStr) == true) {
					int slInt = Integer.parseInt(slStr);
					int minInt = Integer.parseInt(minStr);
					int maxInt = Integer.parseInt(maxStr);
					if (slInt <= 0 || slInt > 10 || minInt > maxInt) {
						JOptionPane.showMessageDialog(getContentPane(), "Invalid input");
					} else {
						size = slInt;
						arr = new int[size];
						for (int i = 0; i < size; i++) {
							arr[i] = minInt + rd.nextInt(maxInt - minInt);
						}
						mang.setText(displayArray(arr));
						hienthiMang.setText(displayArray(arr));
					}
				} else {
					JOptionPane.showMessageDialog(getContentPane(), "Invalid input");
				}

			}
		});
		randomMang.setBounds(363, 83, 110, 23);
		panel.add(randomMang);

		// bat su kien cho button Nhập lại
		JButton refresh = new JButton("Nhập lại");
		refresh.setForeground(Color.BLACK);
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soluong.setText("");
				min.setText("");
				max.setText("");
				mang.setText("");
				hienthiMang.setText("");
				time.setText("");
				model.clear();
				displayCode.setModel(model);
				model2.clear();
				mophong.setModel(model2);
				ketqua.setText("");
				size = 0;
				arr = new int[size];

			}
		});
		refresh.setBounds(363, 117, 110, 23);
		panel.add(refresh);

		home = this;

		// bat su kien cho nut nhap tay
		JButton nhaptay = new JButton("Nhập tay");
		nhaptay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				input formInput = new input(home, rootPaneCheckingEnabled);
				formInput.setVisible(true);
				setState(3);

				size = formInput.size;
				setArray(formInput.a);
				mang.setText(displayArray(formInput.a));
			}
		});
		nhaptay.setBounds(495, 83, 89, 23);
		panel.add(nhaptay);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(
						new TitledBorder(
								new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
										new Color(160, 160, 160)),
								"", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)),
						"L\u1EF1a ch\u1ECDn gi\u1EA3i thu\u1EADt", TitledBorder.LEADING, TitledBorder.TOP, null,
						new Color(0, 0, 0)));
		panel_1.setBounds(10, 268, 628, 167);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("L\u1EF1a ch\u1ECDn thu\u1EADt to\u00E1n: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(44, 35, 124, 14);
		panel_1.add(lblNewLabel_1);

		///////////// 3 lua chon
		bubbleRadio = new JRadioButton("Bubble Sort");
		bubbleRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bubbleRadio.isSelected()) {
					selectionRadio.setSelected(false);
					insertionRadio.setSelected(false);
				}
			}
		});
		bubbleRadio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bubbleRadio.setBounds(74, 59, 109, 23);
		panel_1.add(bubbleRadio);

		selectionRadio = new JRadioButton("Selection Sort");
		selectionRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectionRadio.isSelected()) {
					bubbleRadio.setSelected(false);
					insertionRadio.setSelected(false);
				}
			}
		});
		selectionRadio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		selectionRadio.setBounds(74, 85, 109, 23);
		panel_1.add(selectionRadio);

		insertionRadio = new JRadioButton("Insertion Sort");
		insertionRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (insertionRadio.isSelected()) {
					bubbleRadio.setSelected(false);
					selectionRadio.setSelected(false);
				}
			}
		});
		insertionRadio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		insertionRadio.setBounds(74, 111, 109, 23);
		panel_1.add(insertionRadio);
		//////////////

		// bat su kien cho button Sắp xếp tăng dần
		JButton sapxeptangdan = new JButton("S\u1EAFp x\u1EBFp t\u0103ng d\u1EA7n");
		sapxeptangdan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hienthiMang.setText(displayArray(arr));
				model.clear();
				displayCode.setModel(model);
				model2.clear();
				mophong.setModel(model2);
				if (bubbleRadio.isSelected() && mang.getText() != "") {
					addBubbleSortTang();
					BubbleSortTang(arr);
					ketqua.setText(displayArray(arr));
				}
				if (selectionRadio.isSelected() && mang.getText() != "") {
					addSelectionTang();
					SelectionTang(arr);
					ketqua.setText(displayArray(arr));
				}
				if (insertionRadio.isSelected() && mang.getText() != "") {
					addInsertionSortTang();
					InsertionSortTang(arr);
					ketqua.setText(displayArray(arr));
				}
			}
		});
		sapxeptangdan.setForeground(Color.BLACK);
		sapxeptangdan.setBounds(358, 60, 170, 23);
		panel_1.add(sapxeptangdan);

		// bat su kien cho nut Sắ[ xếp giảm dần
		JButton sapxepgiamdan = new JButton("S\u1EAFp x\u1EBFp gi\u1EA3m d\u1EA7n");
		sapxepgiamdan.setForeground(Color.BLACK);
		sapxepgiamdan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hienthiMang.setText(displayArray(arr));
				model.clear();
				displayCode.setModel(model);
				model2.clear();
				mophong.setModel(model2);
				if (bubbleRadio.isSelected() && mang.getText() != "") {
					addBubbleSortGiam();
					BubbleSortGiam(arr);
					ketqua.setText(displayArray(arr));
				}
				if (selectionRadio.isSelected() && mang.getText() != "") {
					addSelectionGiam();
					SelectionGiam(arr);
					ketqua.setText(displayArray(arr));
				}
				if (insertionRadio.isSelected() && mang.getText() != "") {
					addInsertionSortGiam();
					InsertionSortGiam(arr);
					ketqua.setText(displayArray(arr));
				}
			}
		});
		sapxepgiamdan.setBounds(358, 112, 170, 23);
		panel_1.add(sapxepgiamdan);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(
				new TitledBorder(
						new TitledBorder(
								new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
										new Color(160, 160, 160)),
								"", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)),
						"Code Java", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 437, 628, 272);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JScrollPane sc = new JScrollPane();
		sc.setBounds(10, 22, 608, 234);
		panel_2.add(sc);

		model = new DefaultListModel<>();
		displayCode = new JList<String>(model);
		sc.setViewportView(displayCode);
		displayCode.setFont(new Font("Consolas", Font.PLAIN, 15));

		JLabel lblNewLabel_3 = new JLabel(
				"M\u00D4 PH\u1ECENG THU\u1EACT TO\u00C1N S\u1EAEP X\u1EBEP B\u1EB0NG JAVA SWING");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(422, 11, 692, 38);
		getContentPane().add(lblNewLabel_3);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(
				new TitledBorder(
						new TitledBorder(
								new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255),
										new Color(160, 160, 160)),
								"", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)),
						"M\u00F4 ph\u1ECFng thu\u1EADt to\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null,
						new Color(0, 0, 0)));
		panel_3.setBounds(648, 54, 690, 514);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JScrollPane scr = new JScrollPane();
		scr.setBounds(10, 71, 670, 432);
		panel_3.add(scr);

		model2 = new DefaultListModel<>();
		mophong = new JList<String>(model2);
		scr.setViewportView(mophong);
		mophong.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblNewLabel_5 = new JLabel("Mảng:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_5.setBounds(10, 43, 53, 14);
		panel_3.add(lblNewLabel_5);

		hienthiMang = new JLabel("...");
		hienthiMang.setForeground(Color.RED);
		hienthiMang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		hienthiMang.setBounds(78, 40, 448, 20);
		panel_3.add(hienthiMang);

		JLabel lblNewLabel_4 = new JLabel("Mảng sau khi sắp xếp: ");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(932, 622, 250, 24);
		getContentPane().add(lblNewLabel_4);

		ketqua = new JTextField();
		ketqua.setBackground(SystemColor.activeCaption);
		ketqua.setHorizontalAlignment(SwingConstants.CENTER);
		ketqua.setForeground(Color.BLACK);
		ketqua.setFont(new Font("Tahoma", Font.BOLD, 11));
		ketqua.setBounds(793, 645, 414, 27);
		getContentPane().add(ketqua);
		ketqua.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Thời gian thực hiện: ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(793, 590, 184, 14);
		getContentPane().add(lblNewLabel_6);

		time = new JTextField();
		time.setFont(new Font("Tahoma", Font.PLAIN, 12));
		time.setBounds(987, 583, 55, 28);
		getContentPane().add(time);
		time.setColumns(10);

		JLabel lblNewLabel_6_1 = new JLabel("milisecond");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(1043, 590, 83, 14);
		getContentPane().add(lblNewLabel_6_1);
	}
}
