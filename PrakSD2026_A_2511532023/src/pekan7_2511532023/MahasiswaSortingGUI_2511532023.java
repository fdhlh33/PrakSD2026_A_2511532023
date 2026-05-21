package pekan7_2511532023;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MahasiswaSortingGUI_2511532023 extends JFrame {
    
    private ArrayList<Mahasiswa_2511532023> listAsli_2023 = new ArrayList<>();
    
    private JTextField txtNama_2023, txtNim_2023, txtProdi_2023;
    private JButton btnTambah_2023, btnHapus_2023, btnSort_2023;
    private JComboBox<String> cmbAlgo_2023;
    private JTable tabelData_2023;
    private DefaultTableModel modelTabel_2023;
    private JTextArea txtAreaLog_2023;

    public MahasiswaSortingGUI_2511532023() {
        setTitle("Pengurutan Mahasiswa - 2511532023");
        setSize(500, 650); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8, 8));

        JPanel panelAtas_2023 = new JPanel(new BorderLayout(5, 5));
        JPanel panelForm_2023 = new JPanel(new GridLayout(3, 2, 5, 5));
        panelForm_2023.setBorder(BorderFactory.createTitledBorder("Form Input Mahasiswa"));
        
        panelForm_2023.add(new JLabel(" Nama Mahasiswa: "));
        txtNama_2023 = new JTextField();
        panelForm_2023.add(txtNama_2023);
        
        panelForm_2023.add(new JLabel(" NIM Mahasiswa: "));
        txtNim_2023 = new JTextField();
        panelForm_2023.add(txtNim_2023);
        
        panelForm_2023.add(new JLabel(" Program Studi: "));
        txtProdi_2023 = new JTextField();
        panelForm_2023.add(txtProdi_2023);
        
        JPanel panelTombolData_2023 = new JPanel(new GridLayout(1, 2, 5, 5));
        btnTambah_2023 = new JButton("Tambah Data");
        btnHapus_2023 = new JButton("Hapus Terpilih");
        panelTombolData_2023.add(btnTambah_2023);
        panelTombolData_2023.add(btnHapus_2023);
        
        panelAtas_2023.add(panelForm_2023, BorderLayout.CENTER);
        panelAtas_2023.add(panelTombolData_2023, BorderLayout.SOUTH);

        JPanel panelTengah_2023 = new JPanel(new GridLayout(2, 1, 5, 5));
        
        String[] kolom_2023 = {"Nama", "NIM", "Prodi"};
        modelTabel_2023 = new DefaultTableModel(kolom_2023, 0);
        tabelData_2023 = new JTable(modelTabel_2023);
        JScrollPane scrollTabel_2023 = new JScrollPane(tabelData_2023);
        scrollTabel_2023.setBorder(BorderFactory.createTitledBorder("Daftar Mahasiswa (Data Awal)"));
        panelTengah_2023.add(scrollTabel_2023);
        
        txtAreaLog_2023 = new JTextArea();
        txtAreaLog_2023.setEditable(false);
        txtAreaLog_2023.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollLog_2023 = new JScrollPane(txtAreaLog_2023);
        scrollLog_2023.setBorder(BorderFactory.createTitledBorder("Visualisasi Langkah Sorting"));
        panelTengah_2023.add(scrollLog_2023);

        JPanel panelKontrol_2023 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panelKontrol_2023.setBorder(BorderFactory.createTitledBorder("Pilihan Urutan"));
        
        panelKontrol_2023.add(new JLabel("Algoritma:"));
        String[] pilihanAlgo_2023 = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
        cmbAlgo_2023 = new JComboBox<>(pilihanAlgo_2023);
        panelKontrol_2023.add(cmbAlgo_2023);
        
        btnSort_2023 = new JButton("Mulai Sorting");
        panelKontrol_2023.add(btnSort_2023);

        JPanel panelKontainerUtama_2023 = new JPanel(new BorderLayout(5, 5));
        panelKontainerUtama_2023.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelKontainerUtama_2023.add(panelAtas_2023, BorderLayout.NORTH);
        panelKontainerUtama_2023.add(panelTengah_2023, BorderLayout.CENTER);
        panelKontainerUtama_2023.add(panelKontrol_2023, BorderLayout.SOUTH);
        
        add(panelKontainerUtama_2023);

        btnTambah_2023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_2023 = txtNama_2023.getText().trim();
                String nim_2023 = txtNim_2023.getText().trim();
                String prodi_2023 = txtProdi_2023.getText().trim();
                
                if (!nama_2023.isEmpty() && !nim_2023.isEmpty() && !prodi_2023.isEmpty()) {
                    Mahasiswa_2511532023 mhs_2023 = new Mahasiswa_2511532023(nama_2023, nim_2023, prodi_2023);
                    listAsli_2023.add(mhs_2023);
                    modelTabel_2023.addRow(new Object[]{nama_2023, nim_2023, prodi_2023});
                    
                    txtNama_2023.setText("");
                    txtNim_2023.setText("");
                    txtProdi_2023.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Semua inputan wajib diisi!");
                }
            }
        });

        btnHapus_2023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int barisTerpilih_2023 = tabelData_2023.getSelectedRow();
                if (barisTerpilih_2023 != -1) {
                    listAsli_2023.remove(barisTerpilih_2023);
                    modelTabel_2023.removeRow(barisTerpilih_2023);
                } else {
                    JOptionPane.showMessageDialog(null, "Silakan pilih baris tabel yang ingin dihapus!");
                }
            }
        });

        btnSort_2023.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	// Cek apakah data mhs kosong sebelum diurutkan
                if (listAsli_2023.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data mahasiswa masih kosong!");
                    return;
                }
                
                // Clear log sebelumnya
                txtAreaLog_2023.setText(""); 
                
                // Duplikasi data awal agar urutan data pada tabel tidak berubah 
                ArrayList<Mahasiswa_2511532023> listDuplikat_2023 = new ArrayList<>();
                for (Mahasiswa_2511532023 mhs_2023 : listAsli_2023) {
                    listDuplikat_2023.add(new Mahasiswa_2511532023(
                        mhs_2023.getNama_2023(), 
                        mhs_2023.getNim_2023(), 
                        mhs_2023.getProdi_2023()
                    ));
                }
                
                // Deteksi pilihan algo dari CmbBox dan eksekusi sorting
                String pilihan_2023 = (String) cmbAlgo_2023.getSelectedItem();
                String hasilLog_2023 = "";
                
                if (pilihan_2023.equals("Insertion Sort")) {
                    hasilLog_2023 = Sorting_2511532023.insertionSort_2023(listDuplikat_2023);
                } else if (pilihan_2023.equals("Selection Sort")) {
                    hasilLog_2023 = Sorting_2511532023.selectionSort_2023(listDuplikat_2023);
                } else if (pilihan_2023.equals("Bubble Sort")) {
                    hasilLog_2023 = Sorting_2511532023.bubbleSort_2023(listDuplikat_2023);
                }
                
                // Tampilkan riwayat langkah visualisasi ke JTextArea
                txtAreaLog_2023.setText(hasilLog_2023);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MahasiswaSortingGUI_2511532023().setVisible(true);
            }
        });
    }
}