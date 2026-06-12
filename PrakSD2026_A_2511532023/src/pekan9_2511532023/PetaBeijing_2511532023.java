package pekan9_2511532023;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class PetaBeijing_2511532023 extends JFrame {

    // Struktur Data Graph
    private Map<String, List<String>> graph_2023 = new HashMap<>();
    private Map<String, Point> koordinat_2023 = new HashMap<>();
    private Map<String, Color> warnaNode_2023 = new HashMap<>();
    
    // Komponen GUI
    private JComboBox<String> cbAwal_2023, cbTujuan_2023;
    private JTextArea taHasil_2023;
    private JPanel panelPeta_2023;
    

    // Nama lokasi Wisata Beijing
    private String[] daftarLokasi_2023 = {
        "Tiananmen Square", "Forbidden City", "National Museum", "Beijing Zoo",
        "Temple of Heaven", "Beihai Park", "Yonghe Temple", "Summer Palace",
        "Bird's Nest Stadium", "Great Wall of China"
    };

    public PetaBeijing_2511532023() {
        setTitle("Pencarian Jalur Peta Beijing (BFS & DFS)");
        setSize(850, 650); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inisialisasiData_2023();
        buatGUI_2023();
    }

    private void inisialisasiData_2023() {
        for (String lokasi_2023 : daftarLokasi_2023) {
            graph_2023.put(lokasi_2023, new ArrayList<>());
            warnaNode_2023.put(lokasi_2023, Color.WHITE);
        }

        tambahJalur_2023("Tiananmen Square", "Forbidden City");
        tambahJalur_2023("Tiananmen Square", "National Museum");
        tambahJalur_2023("Tiananmen Square", "Beijing Zoo");
        tambahJalur_2023("Temple of Heaven", "Tiananmen Square");
        tambahJalur_2023("Temple of Heaven", "National Museum");
        tambahJalur_2023("National Museum", "Beijing Zoo");
        tambahJalur_2023("Forbidden City", "Beihai Park");
        tambahJalur_2023("Forbidden City", "Beijing Zoo");
        tambahJalur_2023("Beijing Zoo", "Yonghe Temple");
        tambahJalur_2023("Beihai Park", "Yonghe Temple");
        tambahJalur_2023("Beihai Park", "Summer Palace");
        tambahJalur_2023("Yonghe Temple", "Bird's Nest Stadium");
        tambahJalur_2023("Summer Palace", "Bird's Nest Stadium");
        tambahJalur_2023("Summer Palace", "Great Wall of China");
        tambahJalur_2023("Bird's Nest Stadium", "Great Wall of China");

        koordinat_2023.put("Great Wall of China", new Point(150, 50));
        koordinat_2023.put("Summer Palace", new Point(250, 150));
        koordinat_2023.put("Bird's Nest Stadium", new Point(500, 100));
        koordinat_2023.put("Beihai Park", new Point(300, 250));
        koordinat_2023.put("Yonghe Temple", new Point(600, 200));
        koordinat_2023.put("Forbidden City", new Point(450, 300));
        koordinat_2023.put("Beijing Zoo", new Point(650, 350));
        koordinat_2023.put("Tiananmen Square", new Point(450, 400));
        koordinat_2023.put("National Museum", new Point(600, 450));
        koordinat_2023.put("Temple of Heaven", new Point(450, 500));
    }

    private void tambahJalur_2023(String asal_2023, String tujuan_2023) {
        graph_2023.get(asal_2023).add(tujuan_2023);
        graph_2023.get(tujuan_2023).add(asal_2023);
    }

    private void buatGUI_2023() {
        JPanel panelAtas_2023 = new JPanel();
        panelAtas_2023.setBackground(Color.LIGHT_GRAY);
        
        cbAwal_2023 = new JComboBox<>(daftarLokasi_2023);
        cbTujuan_2023 = new JComboBox<>(daftarLokasi_2023);
        cbTujuan_2023.setSelectedIndex(9);

        JButton btnBFS_2023 = new JButton("BFS");
        JButton btnDFS_2023 = new JButton("DFS");
        JButton btnReset_2023 = new JButton("Reset");

        panelAtas_2023.add(new JLabel("Awal:"));
        panelAtas_2023.add(cbAwal_2023);
        panelAtas_2023.add(new JLabel("Tujuan:"));
        panelAtas_2023.add(cbTujuan_2023);
        panelAtas_2023.add(btnBFS_2023);
        panelAtas_2023.add(btnDFS_2023);
        panelAtas_2023.add(btnReset_2023);

        panelPeta_2023 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g_2023) {
                super.paintComponent(g_2023);
                displayGraph(g_2023);
            }
        };
        panelPeta_2023.setBackground(new Color(245, 245, 235));

        taHasil_2023 = new JTextArea(6, 50);
        taHasil_2023.setEditable(false);
        taHasil_2023.setFont(new Font("Monospaced", Font.PLAIN, 14));
        taHasil_2023.setText("Hasil Pencarian:\nSilakan pilih lokasi dan metode pencarian.");
        JScrollPane scrollPanel_2023 = new JScrollPane(taHasil_2023);

        add(panelAtas_2023, BorderLayout.NORTH);
        add(panelPeta_2023, BorderLayout.CENTER);
        add(scrollPanel_2023, BorderLayout.SOUTH);

        btnBFS_2023.addActionListener(e -> jalankanPencarian_2023("BFS"));
        btnDFS_2023.addActionListener(e -> jalankanPencarian_2023("DFS"));
        btnReset_2023.addActionListener(e -> resetGraph());
    }

    public void displayGraph(Graphics g_2023) {
        g_2023.setFont(new Font("Arial", Font.BOLD, 12));

        g_2023.setColor(Color.BLACK);
        for (String lokasi_2023 : graph_2023.keySet()) {
            Point p1_2023 = koordinat_2023.get(lokasi_2023);
            for (String tetangga_2023 : graph_2023.get(lokasi_2023)) {
                Point p2_2023 = koordinat_2023.get(tetangga_2023);
                g_2023.drawLine(p1_2023.x, p1_2023.y, p2_2023.x, p2_2023.y);
            }
        }

        int r_2023 = 15; 
        for (String lokasi_2023 : daftarLokasi_2023) {
            Point p_2023 = koordinat_2023.get(lokasi_2023);
            
            g_2023.setColor(warnaNode_2023.get(lokasi_2023));
            g_2023.fillOval(p_2023.x - r_2023, p_2023.y - r_2023, r_2023 * 2, r_2023 * 2);
            
            g_2023.setColor(Color.BLACK);
            g_2023.drawOval(p_2023.x - r_2023, p_2023.y - r_2023, r_2023 * 2, r_2023 * 2);
            
            g_2023.drawString(lokasi_2023, p_2023.x - 30, p_2023.y + 30);
        }
    }

    public void resetGraph() {
        for (String lokasi_2023 : daftarLokasi_2023) {
            warnaNode_2023.put(lokasi_2023, Color.WHITE);
        }
        taHasil_2023.setText("Hasil Pencarian:\nMap di-reset.");
        panelPeta_2023.repaint();
    }

    private void jalankanPencarian_2023(String metode_2023) {
        resetGraph(); 
        String awal_2023 = (String) cbAwal_2023.getSelectedItem();
        String tujuan_2023 = (String) cbTujuan_2023.getSelectedItem();

        List<String> nodeDikunjungi_2023 = new ArrayList<>();
        Map<String, String> asalJalur_2023 = new HashMap<>();
        boolean ketemu_2023 = false;

        if (metode_2023.equals("BFS")) {
            ketemu_2023 = BFS(awal_2023, tujuan_2023, nodeDikunjungi_2023, asalJalur_2023);
        } else {
            ketemu_2023 = DFS(awal_2023, tujuan_2023, nodeDikunjungi_2023, asalJalur_2023);
        }

        displayPath(metode_2023, awal_2023, tujuan_2023, nodeDikunjungi_2023, asalJalur_2023, ketemu_2023);
        panelPeta_2023.repaint(); 
    }

    public boolean BFS(String start_2023, String goal_2023, List<String> dikunjungi_2023, Map<String, String> asal_2023) {
        Queue<String> antrean_2023 = new LinkedList<>();
        Set<String> sudahMasuk_2023 = new HashSet<>();

        antrean_2023.add(start_2023);
        sudahMasuk_2023.add(start_2023);

        while (!antrean_2023.isEmpty()) {
            String saatIni_2023 = antrean_2023.poll();
            dikunjungi_2023.add(saatIni_2023);
            warnaNode_2023.put(saatIni_2023, Color.YELLOW); 

            if (saatIni_2023.equals(goal_2023)) {
                return true;
            }

            for (String tetangga_2023 : graph_2023.get(saatIni_2023)) {
                if (!sudahMasuk_2023.contains(tetangga_2023)) {
                    sudahMasuk_2023.add(tetangga_2023);
                    asal_2023.put(tetangga_2023, saatIni_2023); 
                    antrean_2023.add(tetangga_2023);
                }
            }
        }
        return false;
    }

    public boolean DFS(String start_2023, String goal_2023, List<String> dikunjungi_2023, Map<String, String> asal_2023) {
        Stack<String> tumpukan_2023 = new Stack<>();
        Set<String> sudahMasuk_2023 = new HashSet<>();

        tumpukan_2023.push(start_2023);

        while (!tumpukan_2023.isEmpty()) {
            String saatIni_2023 = tumpukan_2023.pop();

            if (!sudahMasuk_2023.contains(saatIni_2023)) {
                sudahMasuk_2023.add(saatIni_2023);
                dikunjungi_2023.add(saatIni_2023);
                warnaNode_2023.put(saatIni_2023, Color.ORANGE); 

                if (saatIni_2023.equals(goal_2023)) {
                    return true;
                }

                for (String tetangga_2023 : graph_2023.get(saatIni_2023)) {
                    if (!sudahMasuk_2023.contains(tetangga_2023)) {
                        asal_2023.put(tetangga_2023, saatIni_2023);
                        tumpukan_2023.push(tetangga_2023);
                    }
                }
            }
        }
        return false;
    }

    public void displayPath(String metode_2023, String awal_2023, String tujuan_2023, List<String> dikunjungi_2023, Map<String, String> asal_2023, boolean ketemu_2023) {
        StringBuilder teks_2023 = new StringBuilder();
        teks_2023.append("Metode: ").append(metode_2023).append("\n");

        if (ketemu_2023) {
            List<String> rute_2023 = new ArrayList<>();
            String step_2023 = tujuan_2023;
            while (step_2023 != null && !step_2023.equals(awal_2023)) {
                rute_2023.add(step_2023);
                step_2023 = asal_2023.get(step_2023);
            }
            rute_2023.add(awal_2023);
            Collections.reverse(rute_2023); 

            for (String lokasiRute_2023 : rute_2023) {
                warnaNode_2023.put(lokasiRute_2023, Color.GREEN);
            }

            teks_2023.append("Jalur Ditemukan : ").append(String.join(" -> ", rute_2023)).append("\n");
        } else {
            teks_2023.append("Jalur TIDAK Ditemukan!\n");
        }

        teks_2023.append("Node Dikunjungi : ").append(String.join(", ", dikunjungi_2023)).append("\n");
        teks_2023.append("Jumlah Node Dieksplorasi : ").append(dikunjungi_2023.size());

        taHasil_2023.setText(teks_2023.toString());
    }

    public static void main(String[] args_2023) {
        SwingUtilities.invokeLater(() -> {
            new PetaBeijing_2511532023().setVisible(true);
        });
    }
}