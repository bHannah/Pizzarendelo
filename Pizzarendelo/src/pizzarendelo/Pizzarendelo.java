package pizzarendelo;

import javax.swing.JOptionPane;

public class Pizzarendelo extends javax.swing.JFrame {

    public Pizzarendelo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        hatter = new javax.swing.JPanel();
        cim = new javax.swing.JPanel();
        cimszoveg = new javax.swing.JLabel();
        pizzateszta = new javax.swing.JPanel();
        pizzatesztaszoveg = new javax.swing.JLabel();
        sima = new javax.swing.JRadioButton();
        gluten = new javax.swing.JRadioButton();
        teljes = new javax.swing.JRadioButton();
        meret = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p24es = new javax.swing.JRadioButton();
        p32es = new javax.swing.JRadioButton();
        p55os = new javax.swing.JRadioButton();
        egyebfeltet = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sajt = new javax.swing.JCheckBox();
        parmezan = new javax.swing.JCheckBox();
        bacon = new javax.swing.JCheckBox();
        oliva = new javax.swing.JCheckBox();
        kukorica = new javax.swing.JCheckBox();
        jalap = new javax.swing.JCheckBox();
        reklam = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        valasztek = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Margherita = new javax.swing.JRadioButton();
        hawaii = new javax.swing.JRadioButton();
        bolognese = new javax.swing.JRadioButton();
        carbonara = new javax.swing.JRadioButton();
        sonkas = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        megjegyzes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        megj = new javax.swing.JTextField();
        fizetesimod = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fizetes = new javax.swing.JComboBox<>();
        kep = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        megse = new javax.swing.JButton();
        megrendeles = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        darabszam = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        jTextField2.setText("darabszám");

        jComboBox3.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Rendelés");
        setIconImages(getIconImages());
        setResizable(false);

        hatter.setBackground(new java.awt.Color(255, 255, 255));
        hatter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 220, 220)));

        cim.setBackground(new java.awt.Color(255, 204, 204));
        cim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cim.setPreferredSize(new java.awt.Dimension(184, 42));

        cimszoveg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cimszoveg.setForeground(new java.awt.Color(102, 102, 102));
        cimszoveg.setText("Rendelj Pizzát!");

        javax.swing.GroupLayout cimLayout = new javax.swing.GroupLayout(cim);
        cim.setLayout(cimLayout);
        cimLayout.setHorizontalGroup(
            cimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cimszoveg, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cimLayout.setVerticalGroup(
            cimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cimszoveg, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pizzateszta.setBackground(new java.awt.Color(255, 234, 234));
        pizzateszta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        pizzatesztaszoveg.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        pizzatesztaszoveg.setText("Válassz pizzatésztát");

        sima.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup1.add(sima);
        sima.setSelected(true);
        sima.setText("Sima");

        gluten.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup1.add(gluten);
        gluten.setText("Gluténmentes");

        teljes.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup1.add(teljes);
        teljes.setText("Teljeskiőrlésű");

        javax.swing.GroupLayout pizzatesztaLayout = new javax.swing.GroupLayout(pizzateszta);
        pizzateszta.setLayout(pizzatesztaLayout);
        pizzatesztaLayout.setHorizontalGroup(
            pizzatesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pizzatesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pizzatesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pizzatesztaszoveg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sima)
                    .addComponent(gluten)
                    .addComponent(teljes))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        pizzatesztaLayout.setVerticalGroup(
            pizzatesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pizzatesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pizzatesztaszoveg)
                .addGap(18, 18, 18)
                .addComponent(sima)
                .addGap(18, 18, 18)
                .addComponent(gluten)
                .addGap(18, 18, 18)
                .addComponent(teljes)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        meret.setBackground(new java.awt.Color(255, 234, 234));
        meret.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("Válassz méretet");

        p24es.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup2.add(p24es);
        p24es.setText("24 cm");

        p32es.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup2.add(p32es);
        p32es.setSelected(true);
        p32es.setText("32 cm");
        p32es.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p32esActionPerformed(evt);
            }
        });

        p55os.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup2.add(p55os);
        p55os.setText("55 cm");
        p55os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p55osActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout meretLayout = new javax.swing.GroupLayout(meret);
        meret.setLayout(meretLayout);
        meretLayout.setHorizontalGroup(
            meretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(meretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p24es)
                    .addComponent(p32es)
                    .addComponent(p55os))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        meretLayout.setVerticalGroup(
            meretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meretLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(p24es)
                .addGap(18, 18, 18)
                .addComponent(p32es)
                .addGap(18, 18, 18)
                .addComponent(p55os)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        egyebfeltet.setBackground(new java.awt.Color(255, 234, 234));
        egyebfeltet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Egyéb feltét hozzáadása");

        sajt.setBackground(new java.awt.Color(255, 234, 234));
        sajt.setText("Sajt");

        parmezan.setBackground(new java.awt.Color(255, 234, 234));
        parmezan.setText("Parmezán");

        bacon.setBackground(new java.awt.Color(255, 234, 234));
        bacon.setText("Bacon");

        oliva.setBackground(new java.awt.Color(255, 234, 234));
        oliva.setText("Olivabogyó");

        kukorica.setBackground(new java.awt.Color(255, 234, 234));
        kukorica.setText("Kukorica");

        jalap.setBackground(new java.awt.Color(255, 234, 234));
        jalap.setText("Jalapeno");

        javax.swing.GroupLayout egyebfeltetLayout = new javax.swing.GroupLayout(egyebfeltet);
        egyebfeltet.setLayout(egyebfeltetLayout);
        egyebfeltetLayout.setHorizontalGroup(
            egyebfeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(egyebfeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(egyebfeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(egyebfeltetLayout.createSequentialGroup()
                        .addGroup(egyebfeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sajt)
                            .addComponent(parmezan)
                            .addComponent(bacon))
                        .addGap(33, 33, 33)
                        .addGroup(egyebfeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jalap)
                            .addComponent(kukorica)
                            .addComponent(oliva))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        egyebfeltetLayout.setVerticalGroup(
            egyebfeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(egyebfeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(egyebfeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sajt)
                    .addComponent(oliva))
                .addGap(18, 18, 18)
                .addGroup(egyebfeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parmezan)
                    .addComponent(kukorica))
                .addGap(18, 18, 18)
                .addGroup(egyebfeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bacon)
                    .addComponent(jalap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reklam.setBackground(new java.awt.Color(255, 234, 234));
        reklam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel11.setText("Árlista:");

        jLabel6.setText("24 cm Pizza");

        jLabel7.setText("32 cm Pizza");

        jLabel8.setText("55 cm Pizza");

        jLabel12.setText("1600  ft");

        jLabel18.setText("2400 ft");

        jLabel19.setText("3600 ft");

        javax.swing.GroupLayout reklamLayout = new javax.swing.GroupLayout(reklam);
        reklam.setLayout(reklamLayout);
        reklamLayout.setHorizontalGroup(
            reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reklamLayout.createSequentialGroup()
                .addGroup(reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reklamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reklamLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reklamLayout.createSequentialGroup()
                                .addGroup(reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(76, 76, 76)
                                .addGroup(reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)))
                            .addGroup(reklamLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel12)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reklamLayout.setVerticalGroup(
            reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reklamLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(reklamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        valasztek.setBackground(new java.awt.Color(255, 234, 234));
        valasztek.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Válogass pizzáink közül");

        Margherita.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup3.add(Margherita);
        Margherita.setText("Margherita");

        hawaii.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup3.add(hawaii);
        hawaii.setText("Hawaii");

        bolognese.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup3.add(bolognese);
        bolognese.setText("Bolognese");
        bolognese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bologneseActionPerformed(evt);
            }
        });

        carbonara.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup3.add(carbonara);
        carbonara.setText("Carbonara");

        sonkas.setBackground(new java.awt.Color(255, 234, 234));
        buttonGroup3.add(sonkas);
        sonkas.setText("Sonkás");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel13.setText("(paradicsomszósz, paradicsomkarika, mozzarella)");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel14.setText("(paradicsomszósz, sonka, ananász, kukorica, mozzarella)");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel15.setText("(bolognai ragu, mozzarella)");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel16.setText("(carbonara alap, bacon, mozzarella)");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel17.setText("(paradicsomszósz, sonka, mozzarella)");

        javax.swing.GroupLayout valasztekLayout = new javax.swing.GroupLayout(valasztek);
        valasztek.setLayout(valasztekLayout);
        valasztekLayout.setHorizontalGroup(
            valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valasztekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(valasztekLayout.createSequentialGroup()
                        .addGroup(valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Margherita)
                            .addComponent(hawaii)
                            .addComponent(bolognese)
                            .addComponent(carbonara)
                            .addComponent(sonkas))
                        .addGap(27, 27, 27)
                        .addGroup(valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        valasztekLayout.setVerticalGroup(
            valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valasztekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Margherita)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hawaii)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bolognese)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carbonara)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(valasztekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sonkas)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        megjegyzes.setBackground(new java.awt.Color(255, 234, 234));
        megjegyzes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Megjegyzés:");

        megj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout megjegyzesLayout = new javax.swing.GroupLayout(megjegyzes);
        megjegyzes.setLayout(megjegyzesLayout);
        megjegyzesLayout.setHorizontalGroup(
            megjegyzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(megjegyzesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(megjegyzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(megjegyzesLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(megj))
                .addContainerGap())
        );
        megjegyzesLayout.setVerticalGroup(
            megjegyzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(megjegyzesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(megj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        fizetesimod.setBackground(new java.awt.Color(255, 234, 234));
        fizetesimod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Válassz fizetési módot:");

        fizetes.setBackground(new java.awt.Color(255, 204, 204));
        fizetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz fizetési módot", "Készpénz", "Bankkártya", "SZÉP-kártya" }));

        javax.swing.GroupLayout fizetesimodLayout = new javax.swing.GroupLayout(fizetesimod);
        fizetesimod.setLayout(fizetesimodLayout);
        fizetesimodLayout.setHorizontalGroup(
            fizetesimodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fizetesimodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fizetesimodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fizetes, 0, 220, Short.MAX_VALUE)
                    .addGroup(fizetesimodLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fizetesimodLayout.setVerticalGroup(
            fizetesimodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fizetesimodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fizetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kep.setBackground(new java.awt.Color(255, 234, 234));
        kep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzarendelo/pngegg.png"))); // NOI18N

        javax.swing.GroupLayout kepLayout = new javax.swing.GroupLayout(kep);
        kep.setLayout(kepLayout);
        kepLayout.setHorizontalGroup(
            kepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kepLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(16, 16, 16))
        );
        kepLayout.setVerticalGroup(
            kepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        megse.setBackground(new java.awt.Color(255, 234, 234));
        megse.setText("Mégse");
        megse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megseActionPerformed(evt);
            }
        });

        megrendeles.setBackground(new java.awt.Color(255, 204, 204));
        megrendeles.setText("Megrendelem!");
        megrendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megrendelesActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 234, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel10.setText("Darabszám:");

        darabszam.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(darabszam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(darabszam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 234, 234));
        jButton1.setText("Végösszeg");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hatterLayout = new javax.swing.GroupLayout(hatter);
        hatter.setLayout(hatterLayout);
        hatterLayout.setHorizontalGroup(
            hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hatterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cim, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                    .addGroup(hatterLayout.createSequentialGroup()
                        .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hatterLayout.createSequentialGroup()
                                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valasztek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(hatterLayout.createSequentialGroup()
                                        .addComponent(pizzateszta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(meret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(egyebfeltet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(megjegyzes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fizetesimod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(hatterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(megse, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reklam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(hatterLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(megrendeles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        hatterLayout.setVerticalGroup(
            hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hatterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pizzateszta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(meret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(egyebfeltet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reklam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(hatterLayout.createSequentialGroup()
                        .addComponent(megjegyzes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fizetesimod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(valasztek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hatterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(megse)
                    .addComponent(megrendeles)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hatter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p32esActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p32esActionPerformed

    }//GEN-LAST:event_p32esActionPerformed

    private void p55osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p55osActionPerformed

    }//GEN-LAST:event_p55osActionPerformed

    private void bologneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bologneseActionPerformed

    }//GEN-LAST:event_bologneseActionPerformed

    private void megrendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megrendelesActionPerformed
        boolean nincsPizzaValasztva = Margherita.isSelected() == false && hawaii.isSelected() == false
                && bolognese.isSelected() == false && carbonara.isSelected() == false && sonkas.isSelected() == false;
        String uzenet, cim = "FIGYELEM! ";
        int ikonTipus;
        int fizmod = fizetes.getSelectedIndex();
        if (nincsPizzaValasztva) {
            cim += "Hiányos rendelés!";
            uzenet = "Nincs Pizzafajta választva";
            ikonTipus = 0;
        } else if (fizmod == 0){
            cim += "Hiányos rendelés";
            uzenet = "Nincs kiválasztott fizetési mód!";
            ikonTipus = 0;
        }
        else{
            cim += "Sikeres Megrendelés!";
            uzenet = "Sikeres megrendelés!:)";
            ikonTipus = 1;
        }
        JOptionPane.showMessageDialog(null, uzenet, cim, ikonTipus);
    }//GEN-LAST:event_megrendelesActionPerformed

    private void megseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megseActionPerformed

        JOptionPane.showMessageDialog(null, "Sajnáljuk, hogy nem minket választottál!");
    }//GEN-LAST:event_megseActionPerformed

    private void megjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megjActionPerformed

    }//GEN-LAST:event_megjActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int darab = (int) darabszam.getValue();
        int osszeg = 0;
        int p24 = 1600;
        int p32 = 2400;
        int p55 = 3600;
        boolean extra1 = sajt.isSelected();
        boolean extra2 = kukorica.isSelected();
        boolean extra3 = parmezan.isSelected();
        boolean extra4 = oliva.isSelected();
        boolean extra5 = bacon.isSelected();
        boolean extra6 = jalap.isSelected();

        if (Margherita.isSelected() == false && hawaii.isSelected() == false
                && bolognese.isSelected() == false && carbonara.isSelected() == false && sonkas.isSelected() == false) {
            osszeg += 0;
        } else if (p24es.isSelected()) {
            osszeg += p24;
        } else if (p32es.isSelected()) {
            osszeg += p32;
        } else if (p55os.isSelected()) {
            osszeg += p55;
        }
        int fizmod = fizetes.getSelectedIndex();
        
        if (extra1 == true){
            osszeg += 150;
        }
        if (extra2 == true){
            osszeg += 150;
        }
        if (extra3 == true){
            osszeg += 150;
        }
        if (extra4 == true){
            osszeg += 150;
        }
        if (extra5 == true){
            osszeg += 150;
        }
        if (extra6 == true){
            osszeg += 150;
        }
        
        if (gluten.isSelected()){
            osszeg += 200;
        };
        if (teljes.isSelected()){
            osszeg += 200;
        };
        
        
        String fajta = "";
        if (Margherita.isSelected() == true){
            fajta = "Margherita";
        }
        else if (hawaii.isSelected() == true){
            fajta = "Hawaii";
        }
        else if (bolognese.isSelected() == true){
            fajta = "Bolognese";
        }
        else if (carbonara.isSelected() == true){
            fajta = "Carbonara";
        }
        else if (sonkas.isSelected() == true){
            fajta = "Sonkás";
        }
        
        String extra = "";
         if (extra1 == true){
            extra += " Sajt";
        }
        if (extra2 == true){
            extra += " Kukorica";
        }
        if (extra3 == true){
            extra += " Parmezán";
        }
        if (extra4 == true){
            extra += " Olivabogyó";
        }
        if (extra5 == true){
            extra += " Bacon";
        }
        if (extra6 == true){
            extra += " Jalapeno";
        }
        
        String meret = "";
        if (p24es.isSelected()){
            meret = "24 cm";
        }
        if (p32es.isSelected()){
            meret = "32 cm";
        }
        if (p55os.isSelected()){
            meret = "55 cm";
        }
        
        String teszta = ""; 
        if (gluten.isSelected()){
            teszta = " Gluténmentes";
        };
        if (teljes.isSelected()){
            teszta = " Teljeskiőrlésű";
        };
        if (sima.isSelected()){
            teszta = " Sima";
        };
        
        String megjegyzes = megj.getText();
        String pizza = "";
        if (darab > 1){
            pizza = "pizzák";
        };
        if (darab == 1) {
            pizza = "pizza";
        };
        
        String fizetes = "";
        String uzenet = "";
        String title ="";
        if (fizmod == 0) {
            title = "Hiba!";
            uzenet = "Nincs kiválasztott fizetési mód"; 
        } else {
            if (fizmod == 1) {
                title = "Gratulálunk!";
                fizetes = "Készpénz";
                uzenet = "A rendelésed: " + "\n" + darab +"db "+ fajta + "\n" + "Méret: " + meret + "\n" +  "Tészta:" + teszta + "\n" + "Extra:" + extra + "\n" + "A kiválasztott " + pizza + " ára: " + (osszeg * darab) + " ft" + "\n" + "Fizetési mód: " + fizetes + "\n" + "Megjegyzésed: " + megjegyzes;
            }
            else if (fizmod == 2) {
                title = "Gratulálunk!";
                fizetes = "Bankkártya";
                uzenet =  "A rendelésed: " + "\n" + darab +"db "+ fajta + "\n" + "Méret: " + meret + "\n" + "Tészta:" + teszta +  "\n" + "Extra:" + extra + "\n" + "A kiválasztott " + pizza + " ára: " + (osszeg * darab) +  " ft" +"\n" + "Fizetési mód: " + fizetes + "\n" + "Megjegyzésed: " + megjegyzes;
            }
            else if (fizmod == 3) {
                title = "Gratulálunk!";
                fizetes = "SZÉP-kártya";
                uzenet =  "A rendelésed: " + "\n" + darab +"db "+ fajta + "\n" + "Méret: " + meret + "\n" +  "Tészta:" + teszta +  "\n" + "Extra:" + extra + "\n" + "A kiválasztott " + pizza + " ára: " + (osszeg * darab) + " ft" + "\n" + "Fizetési mód: " + fizetes + "\n" + "Megjegyzésed: " + megjegyzes;
            }
        }
        
        JOptionPane.showMessageDialog(null, uzenet, title, 1);

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizzarendelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Margherita;
    private javax.swing.JCheckBox bacon;
    private javax.swing.JRadioButton bolognese;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton carbonara;
    private javax.swing.JPanel cim;
    private javax.swing.JLabel cimszoveg;
    private javax.swing.JSpinner darabszam;
    private javax.swing.JPanel egyebfeltet;
    private javax.swing.JComboBox<String> fizetes;
    private javax.swing.JPanel fizetesimod;
    private javax.swing.JRadioButton gluten;
    private javax.swing.JPanel hatter;
    private javax.swing.JRadioButton hawaii;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox jalap;
    private javax.swing.JPanel kep;
    private javax.swing.JCheckBox kukorica;
    private javax.swing.JTextField megj;
    private javax.swing.JPanel megjegyzes;
    private javax.swing.JButton megrendeles;
    private javax.swing.JButton megse;
    private javax.swing.JPanel meret;
    private javax.swing.JCheckBox oliva;
    private javax.swing.JRadioButton p24es;
    private javax.swing.JRadioButton p32es;
    private javax.swing.JRadioButton p55os;
    private javax.swing.JCheckBox parmezan;
    private javax.swing.JPanel pizzateszta;
    private javax.swing.JLabel pizzatesztaszoveg;
    private javax.swing.JPanel reklam;
    private javax.swing.JCheckBox sajt;
    private javax.swing.JRadioButton sima;
    private javax.swing.JRadioButton sonkas;
    private javax.swing.JRadioButton teljes;
    private javax.swing.JPanel valasztek;
    // End of variables declaration//GEN-END:variables
}
