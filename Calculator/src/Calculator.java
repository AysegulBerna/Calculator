import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.text.JTextComponent;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtHesap;
	private JTextComponent lblCalculations;
	private String sign;
	private double calculatedValue;
	private boolean isDecimal = false;
	double sayi1, sayi2, sonuc;
	int islem;
	double cikis;
	private boolean zerodisp;
	private boolean decdisp;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setType(Type.POPUP);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 10, 412, 74);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(5, 5));

		txtHesap = new JTextField();
		txtHesap.setEditable(false);
		txtHesap.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHesap.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(txtHesap);
		txtHesap.setColumns(10);

		JLabel lblCalculations = new JLabel("");
		lblCalculations.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCalculations.setForeground(new Color(0, 128, 0));
		lblCalculations.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCalculations.setBounds(10, 84, 412, 22);
		contentPane.add(lblCalculations);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 104, 412, 377);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "0");
			}
		});
		button_0.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_0.setBounds(171, 305, 69, 60);
		panel_1.add(button_0);

		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "1");
				zerodisp = true;
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_1.setBounds(93, 232, 69, 60);
		panel_1.add(button_1);

		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "2");
				zerodisp = true;
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_2.setBounds(171, 232, 69, 60);
		panel_1.add(button_2);

		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "3");
				zerodisp = true;
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_3.setBounds(252, 232, 69, 60);
		panel_1.add(button_3);

		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "4");
				zerodisp = true;
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_4.setBounds(93, 159, 69, 60);
		panel_1.add(button_4);

		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "5");
				zerodisp = true;
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_5.setBounds(171, 159, 69, 60);
		panel_1.add(button_5);

		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "6");
				zerodisp = true;
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_6.setBounds(252, 159, 69, 60);
		panel_1.add(button_6);

		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "7");
				zerodisp = true;
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_7.setBounds(93, 86, 69, 60);
		panel_1.add(button_7);

		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "8");
				zerodisp = true;
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_8.setBounds(171, 86, 69, 60);
		panel_1.add(button_8);

		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!zerodisp && !decdisp) {
					txtHesap.setText(null);
				}
				txtHesap.setText(txtHesap.getText() + "9");
				zerodisp = true;
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		button_9.setBounds(252, 86, 69, 60);
		panel_1.add(button_9);

		JButton btnSign = new JButton("\u00B1");
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = txtHesap.getText();

				if (!value.contains("-"))
					txtHesap.setText("-" + value);
				else
					try {
						txtHesap.setText(value.split("-")[1]);
					} catch (IndexOutOfBoundsException e1) {
						txtHesap.setText("");
					}
				decdisp = true;
				cikis = 0;
			}
		});
		btnSign.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnSign.setBounds(93, 305, 69, 60);
		panel_1.add(btnSign);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				toplamaActionPerformed(e);
			}
		});

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				bolmeActionPerformed(e);

			}
		});

		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carpmaActionPerformed(e);

			}
		});
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMulti.setBounds(333, 86, 69, 60);
		panel_1.add(btnMulti);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cikarmaActionPerformed(e);
			}
		});

		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnMinus.setBounds(333, 159, 69, 60);
		panel_1.add(btnMinus);

		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnDiv.setBounds(333, 13, 69, 60);
		panel_1.add(btnDiv);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnPlus.setBounds(333, 232, 69, 60);
		panel_1.add(btnPlus);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				esittirActionPerformed(e);
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnEqual.setBounds(333, 305, 69, 60);
		panel_1.add(btnEqual);

		JButton btnComma = new JButton(".");
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!decdisp) {
					txtHesap.setText(txtHesap.getText() + ".");
					decdisp = true;
				}

			}
		});

		btnComma.setVerticalAlignment(SwingConstants.TOP);
		btnComma.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnComma.setBounds(252, 305, 69, 60);
		panel_1.add(btnComma);

		JButton btnPow = new JButton("x²");
		btnPow.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtHesap.getText().length() > 0)
					calculatedValue = Double.parseDouble(txtHesap.getText());
				square(calculatedValue);

			}
		});

		btnPow.setIcon(null);
		Image img = new ImageIcon(this.getClass().getResource("/uzeri1.png")).getImage();
		btnPow.setBounds(12, 86, 69, 60);
		panel_1.add(btnPow);

		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatedValue = Double.parseDouble(txtHesap.getText());
				sqrtRoot(calculatedValue);
			}
		});

		btnSqrt.setIcon(null);
		btnSqrt.setBounds(12, 232, 69, 60);
		panel_1.add(btnSqrt);

		JButton btnXDiv = new JButton("1/x");
		btnXDiv.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnXDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sayi2 = Double.parseDouble(String.valueOf(txtHesap.getText()));
				cikis = 1 / sayi2;

				if (cikis > -100000000 && cikis < 100000000) {
					if ((int) cikis == cikis) {
						// for you, StackOverflowException
						txtHesap.setText(Integer.toString((int) cikis));
					} else {

						txtHesap.setText(String.valueOf(cikis));
					}
				} else {
					txtHesap.setText("Error");
				}

				cikis = 0;
				islem = 0;
			}
		});

		btnXDiv.setBounds(12, 305, 69, 60);
		panel_1.add(btnXDiv);

		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = txtHesap.getText().length();
				int number = txtHesap.getText().length() - 1;
				String store;

				if (length > 0) {

					StringBuilder back = new StringBuilder(txtHesap.getText());
					back.deleteCharAt(number);
					store = back.toString();
					txtHesap.setText(store);

				}
			}
		});

		btnDelete.setIcon(new ImageIcon("C:\\Users\\Asus\\Desktop\\Projects\\Calculator2\\Images\\back.png"));
		btnDelete.setBounds(252, 13, 69, 60);
		panel_1.add(btnDelete);

		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHesap.setText("0");
				txtHesap.setText(null);
				zerodisp = false;
				decdisp = false;
				sayi1 = 0;
				sayi2 = 0;
				cikis = 0;

			}
		});

		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnCancel.setBounds(171, 13, 69, 60);
		panel_1.add(btnCancel);

		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yuzdeActionPerformed(e);

			}
		});

		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnPercentage.setBounds(93, 13, 69, 60);
		panel_1.add(btnPercentage);

		JButton buttonCube = new JButton("x³");
		buttonCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi2 = Double.parseDouble(String.valueOf(txtHesap.getText()));
				cikis = sayi2 * sayi2 * sayi2;

				if (cikis > -1000000000 && cikis < 100000000) {
					if ((int) cikis == cikis) {
						// for you, StackOverflowException
						txtHesap.setText(Integer.toString((int) cikis));
					} else {
						String.valueOf(cikis);
						txtHesap.setText(String.valueOf(cikis));
					}
				} else {
					txtHesap.setText("Error");
				}

				cikis = 0;
				islem = 0;
			}
		});
		buttonCube.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonCube.setBounds(12, 159, 69, 60);
		panel_1.add(buttonCube);

	}
	public void storeCalculatedValue(String sign) {
		String value = txtHesap.getText();
		calculatedValue = Double.parseDouble(value);

		lblCalculations.setText(value + " " + sign);
		txtHesap.setText("");

	}

	private void esittirActionPerformed(ActionEvent evt) {// GEN-FIRST:event_equalsActionPerformed

		sayi2 = Double.parseDouble(String.valueOf(txtHesap.getText()));

		if (islem == 0) {
			cikis = sayi2;
			txtHesap.setText(String.valueOf(sayi2));
		}

		if (islem == 1) {
			cikis = sayi1 + sayi2;
			txtHesap.setText(txtHesap.getText() + String.valueOf(sayi2));
		}

		if (islem == 2) {
			cikis = sayi1 - sayi2;
			txtHesap.setText(txtHesap.getText() + String.valueOf(sayi2));
		}

		if (islem == 3) {
			cikis = sayi1 * sayi2;
			txtHesap.setText(txtHesap.getText() + String.valueOf(sayi2));
		}

		if (islem == 4) {
			cikis = sayi1 / sayi2;
			txtHesap.setText(txtHesap.getText() + String.valueOf(sayi2));
		}

		if (islem == 5) {
			cikis = sayi1 * sayi2 / 100;
			txtHesap.setText(txtHesap.getText() + String.valueOf(sayi2) + ")");
		}

		if (cikis > -100000000 && cikis < 100000000) {

			if ((int) cikis == cikis) {
				// for you, StackOverflowException
				txtHesap.setText(Integer.toString((int) cikis));
			} else {
				String.valueOf(cikis);
				txtHesap.setText(String.valueOf(cikis));
			}

		} else

		{
			txtHesap.setText("Error");
		}

		sayi1 = 0;
		sayi2 = 0;
		cikis = 0;

		islem = 0;
		decdisp = false;
		zerodisp = false;

	}

	private void toplamaActionPerformed(ActionEvent e) {
		if (islem == 0) {
			sayi1 = Double.parseDouble(txtHesap.getText());
		} else {
			sayi2 = Double.parseDouble(txtHesap.getText());
		}

		if (islem == 1) {
			sayi1 = sayi1 + sayi2;
		}

		if (islem == 2) {
			sayi1 = sayi1 - sayi2;
		}

		if (islem == 3) {
			sayi1 = sayi1 * sayi2;
		}

		if (islem == 4) {
			sayi1 = sayi1 / sayi2;
		}

		if (islem == 5) {
			sayi1 = sayi1 * sayi2 / 100;
		}

		txtHesap.setText("0");
		txtHesap.setText(String.valueOf(sayi1));
		txtHesap.setText("+");
		islem = 1;
		sign="+";
		decdisp = false;
		zerodisp = false;

	}

	private void cikarmaActionPerformed(ActionEvent e) {// GEN-FIRST:event_subtractActionPerformed
		if (islem == 0) {
			sayi1 = Double.parseDouble(txtHesap.getText());
		} else {
			sayi2 = Double.parseDouble(txtHesap.getText());
		}

		if (islem == 1) {
			sayi1 = sayi1 + sayi2;
		}

		if (islem == 2) {
			sayi1 = sayi1 - sayi2;
		}

		if (islem == 3) {
			sayi1 = sayi1 * sayi2;
		}

		if (islem == 4) {
			sayi1 = sayi1 / sayi2;
		}

		if (islem == 5) {
			sayi1 = sayi1 * sayi2 / 100;
		}

		txtHesap.setText("0");
		txtHesap.setText(String.valueOf(sayi1));
		txtHesap.setText("-");
		sign="-";
		islem = 2;
		decdisp = false;
		zerodisp = false;

	}

	private void carpmaActionPerformed(ActionEvent e) {
		if (islem == 0) {
			sayi1 = Double.parseDouble(txtHesap.getText());
		} else {
			sayi2 = Double.parseDouble(txtHesap.getText());
		}

		if (islem == 1) {
			sayi1 = sayi1 + sayi2;
		}

		if (islem == 2) {
			sayi1 = sayi1 - sayi2;
		}

		if (islem == 3) {
			sayi1 = sayi1 * sayi2;
		}

		if (islem == 4) {
			sayi1 = sayi1 / sayi2;
		}

		if (islem == 5) {
			sayi1 = sayi1 * sayi2 / 100;
		}

		txtHesap.setText("0");
		txtHesap.setText(String.valueOf(sayi1));
		txtHesap.setText("*");

		islem = 3;
		sign="*";
		decdisp = false;
		zerodisp = false;

	}

	private void bolmeActionPerformed(ActionEvent e) {// GEN-FIRST:event_divideActionPerformed
		if (islem == 0) {
			sayi1 = Double.parseDouble(String.valueOf(txtHesap.getText()));
		} else {
			sayi2 = Double.parseDouble(String.valueOf(txtHesap.getText()));
		}

		if (islem == 1) {
			sayi1 = sayi1 + sayi2;
		}

		if (islem == 2) {
			sayi1 = sayi1 - sayi2;
		}

		if (islem == 3) {
			sayi1 = sayi1 * sayi2;
		}

		if (islem == 4) {
			sayi1 = sayi1 / sayi2;
		}

		if (islem == 5) {
			sayi1 = sayi1 * sayi2 / 100;
		}

		txtHesap.setText("0");
		txtHesap.setText(String.valueOf(sayi1));
		txtHesap.setText("/");

		islem = 4;
		sign="/";
		decdisp = false;
		zerodisp = false;
	}

	private void yuzdeActionPerformed(ActionEvent evt) {// GEN-FIRST:event_percentActionPerformed
		sayi1 = Double.parseDouble(String.valueOf(txtHesap.getText()));
		txtHesap.setText("0");
		txtHesap.setText(String.valueOf(sayi1));
		txtHesap.setText("%");

		decdisp = false;
		zerodisp = false;
		islem = 5;
	}// GEN-LAST:event_percentActionPerformed

	private void temizleActionPerformed(ActionEvent e) {// GEN-FIRST:event_resetActionPerformed
		txtHesap.setText(null);
		txtHesap.setText("0");

		sayi1 = 0;
		sayi2 = 0;
		cikis = 0;
	}

	public void sqrtRoot(double a) {

		txtHesap.setText(Double.toString(Math.sqrt(a)));
	}

	public void square(double a) {
		txtHesap.setText(Double.toString(a *= a));
	}
}
