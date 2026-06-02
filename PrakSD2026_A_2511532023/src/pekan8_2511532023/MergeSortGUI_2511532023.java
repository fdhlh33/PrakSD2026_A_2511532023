package pekan8_2511532023;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MergeSortGUI_2511532023 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_2023;
	private JLabel[] labelArray_2023;
	private JButton stepButton_2023, resetButton_2023, setButton_2023;
	private JTextField inputField_2023;
	private JPanel panelArray_2023;
	private JTextArea stepArea_2023;
	
	private Queue<int[]> mergeQueue_2023 = new LinkedList<>();
	private boolean isMerging_2023 = false;
	private boolean copying_2023 = false;
	private int stepCount_2023 = 1;
	
	private int left_2023, mid_2023, right_2023;
	private int i_2023, j_2023, k_2023;
	private int[] temp_2023;

	
	/**
	 * Create the frame.
	 */
	public MergeSortGUI_2511532023() {
		setTitle("Merge Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Panel input
		JPanel inputPanel_2023 = new JPanel(new FlowLayout());
		inputField_2023 = new JTextField(30);
		setButton_2023 = new JButton("Set Array");
		inputPanel_2023.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_2023.add(inputField_2023);
		inputPanel_2023.add(setButton_2023);
		
		// Panel array visual
		panelArray_2023 = new JPanel();
		panelArray_2023.setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel_2023 = new JPanel();
		stepButton_2023 = new JButton("Langkah Selanjutnya");
		resetButton_2023 = new JButton("Reset");
		stepButton_2023.setEnabled(false);
		controlPanel_2023.add(stepButton_2023);
		controlPanel_2023.add(resetButton_2023);
		
		// Area teks untuk log langkah-langkah
		stepArea_2023 = new JTextArea(8, 60);
		stepArea_2023.setEditable(false);
		stepArea_2023.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(stepArea_2023);
		
		// Tambahkan panel ke frame
		add(inputPanel_2023, BorderLayout.NORTH);
		add(panelArray_2023, BorderLayout.CENTER);
		add(controlPanel_2023, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		// Event Set Array
		setButton_2023.addActionListener(e -> setArrayFromInput_2023());
		
		// Event Langkah Selanjutnya
		stepButton_2023.addActionListener(e -> performStep_2023());
		
		// Event Reset
		resetButton_2023.addActionListener(e -> reset_2023()); }
		
		private void setArrayFromInput_2023() {
			String text_2023 = inputField_2023.getText().trim();
			if (text_2023.isEmpty()) return;
			String[] parts = text_2023.split(",");
			array_2023 = new int[parts.length];
			
			try {
				for (int i_2023 = 0; i_2023 < parts.length; i_2023++) {
					array_2023[i_2023] = Integer.parseInt(parts[i_2023].trim()); }
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukkan hanya angka! ",
						"Error", JOptionPane.ERROR_MESSAGE);
				return;	}
			
			labelArray_2023 = new JLabel[array_2023.length];
			panelArray_2023.removeAll();
			
			for (int i_2023 = 0; i_2023 < array_2023.length; i_2023++) {
				labelArray_2023[i_2023] = new JLabel(String.valueOf(array_2023[i_2023]));
				labelArray_2023[i_2023].setFont(new Font("Arial", Font.BOLD, 24));
				labelArray_2023[i_2023].setOpaque(true);
				labelArray_2023[i_2023].setBackground(Color.WHITE);
				labelArray_2023[i_2023].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelArray_2023[i_2023].setPreferredSize(new Dimension(50, 50));
				labelArray_2023[i_2023].setHorizontalAlignment(SwingConstants.CENTER);
				panelArray_2023.add(labelArray_2023[i_2023]);
			}
			mergeQueue_2023.clear();
			generateMergeSteps_2023(0, array_2023.length - 1);
			stepButton_2023.setEnabled(true);
			stepArea_2023.setText("");
			stepCount_2023 = 1;
			isMerging_2023 = false;
			copying_2023 = false;
			
			panelArray_2023.revalidate();
			panelArray_2023.repaint(); }
		private void generateMergeSteps_2023(int l_2023, int r_2023) {
			if (l_2023 < r_2023) {
				int m_2023 = (l_2023 + r_2023) / 2;
				generateMergeSteps_2023(l_2023, m_2023);
				generateMergeSteps_2023(m_2023 + 1, r_2023);
				mergeQueue_2023.add(new int[] {l_2023, m_2023, r_2023});	}	}

		private void performStep_2023() {
		    resetHighlights_2023();
		    
			if (!isMerging_2023 && !mergeQueue_2023.isEmpty()) {
				int[] range_2023 = mergeQueue_2023.poll();
				left_2023 = range_2023[0];
				mid_2023 = range_2023[1];
				right_2023 = range_2023[2];
				temp_2023 = new int[right_2023 - left_2023 + 1];
				i_2023 = left_2023;
				j_2023 = mid_2023 + 1;
				k_2023 = 0;
				copying_2023 = false;
				isMerging_2023 = true;
				stepArea_2023.append("Langkah " + stepCount_2023++ +
					": Mulai merge dari " + left_2023 + " ke " + right_2023 + "\n");
				return;	}
			
			if (isMerging_2023 && !copying_2023) {
				if (i_2023 <= mid_2023 && j_2023 <= right_2023) {
					labelArray_2023[i_2023].setBackground(Color.CYAN);
					labelArray_2023[j_2023].setBackground(Color.CYAN);
					if (array_2023[i_2023] <= array_2023[j_2023]) {
						temp_2023[k_2023++] = array_2023[i_2023++];
					} else {
						temp_2023[k_2023++] = array_2023[j_2023++];
					}
					stepArea_2023.append("Langkah " + stepCount_2023++ + ": Bandingkan dan salin elemen\n");
					return;
				} else if (i_2023 <= mid_2023) {
					temp_2023[k_2023++] = array_2023[i_2023++];
					stepArea_2023.append("Langkah " + stepCount_2023++ + ": Salin sisa kiri\n");
					return;
				} else if (j_2023 <= right_2023) {
					temp_2023[k_2023++] = array_2023[j_2023++];
					stepArea_2023.append("Langkah " + stepCount_2023++ + ": Salin sisa kanan\n");
					return;
				} else {
					copying_2023 = true;
					k_2023 = 0;
					return;	}	}
			
			if (copying_2023 && k_2023 < temp_2023.length) {
				array_2023[left_2023 + k_2023] = temp_2023[k_2023];
				labelArray_2023[left_2023 + k_2023].setText(String.valueOf(temp_2023[k_2023]));
				labelArray_2023[left_2023 + k_2023].setBackground(Color.GREEN); // Typo: sebelumnya setBackgound
				k_2023++;
				stepArea_2023.append("Langkah " + stepCount_2023++ + ": Tempelkan ke array utama\n");
				return;
			}
			
			if (copying_2023 && k_2023 == temp_2023.length) {
				isMerging_2023 = false;
				copying_2023 = false;
			}
			
			if (mergeQueue_2023.isEmpty() && !isMerging_2023) {
				stepArea_2023.append("Selesai.\n");
				stepButton_2023.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Merge Sort selesai!");	}	}
		
		private void updateLabels_2023() {
		    for (int k_2023 = 0; k_2023 < array_2023.length; k_2023++) {
		        labelArray_2023[k_2023].setText(String.valueOf(array_2023[k_2023]));
		    }
		}
		
		private void resetHighlights_2023() {
			if (labelArray_2023 == null) return;
			for (JLabel label : labelArray_2023) {
				label.setBackground(Color.WHITE);
			}
		}
		private void reset_2023() {
		    inputField_2023.setText("");
		    panelArray_2023.removeAll();
		    panelArray_2023.revalidate();
		    panelArray_2023.repaint();
		    stepArea_2023.setText("");
		    stepButton_2023.setEnabled(false);
		    mergeQueue_2023.clear();
		    isMerging_2023 = false;
		    stepCount_2023 = 1;
		}

		private String arrayToString_2023(int[] arr_2023) {
		    StringBuilder sb_2023 = new StringBuilder();
		    for (int k_2023 = 0; k_2023 < arr_2023.length; k_2023++) {
		        sb_2023.append(arr_2023[k_2023]);
		        if (k_2023 < arr_2023.length - 1) sb_2023.append(", ");
		    }
		    return sb_2023.toString();
		}

		public static void main(String[] args) {
		    SwingUtilities.invokeLater(() -> {
		        MergeSortGUI_2511532023 gui_2023 = new MergeSortGUI_2511532023();
		        gui_2023.setVisible(true);
		    });
		}
	}