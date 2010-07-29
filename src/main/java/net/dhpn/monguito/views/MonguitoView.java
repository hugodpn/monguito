package net.dhpn.monguito.views;

import javax.swing.JOptionPane;
import net.dhpn.monguito.controllers.MonguitoController;
import net.dhpn.monguito.entities.Configuration;
import net.dhpn.monguito.entities.Connection;
import net.dhpn.monguito.utils.ConfigurationUtil;

public class MonguitoView extends javax.swing.JFrame {

    private Configuration configuration;
    private ConfigurationUtil configurationUtil;
    private MonguitoController monguitoController;

    public MonguitoView(Configuration configuration) {
        initComponents();
        this.setExtendedState(this.getExtendedState() | MAXIMIZED_BOTH);
        this.configuration = configuration;
        configurationUtil = new ConfigurationUtil();
        monguitoController = new MonguitoController();
        refreshWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDataBases = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCollections = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        btnDbNew = new javax.swing.JButton();
        btnDbDestroy = new javax.swing.JButton();
        btnCollectionNew = new javax.swing.JButton();
        btnCollectionTruncate = new javax.swing.JButton();
        btnCollectionDestroy = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstObjectsFound = new javax.swing.JList();
        btnObjectNew = new javax.swing.JButton();
        btnObjectEdit = new javax.swing.JButton();
        btnObjectDestroy = new javax.swing.JButton();
        cmbLimit = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbSkip = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jToolBar5 = new javax.swing.JToolBar();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbConnections = new javax.swing.JComboBox();
        btnConnect = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuConnections = new javax.swing.JMenuItem();
        menuPreferences = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monguito - Mongo GUI Tool (BETA)");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lstDataBases.setFont(new java.awt.Font("Dialog", 1, 10));
        lstDataBases.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstDataBases.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDataBasesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDataBases);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel1.setText("DBs:");

        lstCollections.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lstCollections.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstCollections.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCollectionsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstCollections);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel3.setText("Collections:");

        btnDbNew.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnDbNew.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/add.png")); // NOI18N
        btnDbNew.setToolTipText("New Data Base");
        btnDbNew.setEnabled(false);
        btnDbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDbNewActionPerformed(evt);
            }
        });

        btnDbDestroy.setFont(new java.awt.Font("Dialog", 1, 10));
        btnDbDestroy.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/delete.png")); // NOI18N
        btnDbDestroy.setToolTipText("Destroy Data Base");
        btnDbDestroy.setEnabled(false);
        btnDbDestroy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDbDestroyActionPerformed(evt);
            }
        });

        btnCollectionNew.setFont(new java.awt.Font("Dialog", 1, 10));
        btnCollectionNew.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/add.png")); // NOI18N
        btnCollectionNew.setToolTipText("New Collection");
        btnCollectionNew.setEnabled(false);
        btnCollectionNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionNewActionPerformed(evt);
            }
        });

        btnCollectionTruncate.setFont(new java.awt.Font("Dialog", 1, 10));
        btnCollectionTruncate.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/delete_page.png")); // NOI18N
        btnCollectionTruncate.setToolTipText("Truncate Collection - (Remove and Create)");
        btnCollectionTruncate.setEnabled(false);
        btnCollectionTruncate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionTruncateActionPerformed(evt);
            }
        });

        btnCollectionDestroy.setFont(new java.awt.Font("Dialog", 1, 10));
        btnCollectionDestroy.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/delete.png")); // NOI18N
        btnCollectionDestroy.setToolTipText("Destroy Collection");
        btnCollectionDestroy.setEnabled(false);
        btnCollectionDestroy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionDestroyActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/search.png")); // NOI18N
        btnFind.setText("Find");
        btnFind.setToolTipText("Find");
        btnFind.setEnabled(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDbNew, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDbDestroy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnCollectionNew, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCollectionTruncate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCollectionDestroy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFind)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDbDestroy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCollectionNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCollectionTruncate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCollectionDestroy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDbNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Information", jPanel3);

        jPanel2.setFont(new java.awt.Font("Dialog", 0, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Filter", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstObjectsFound.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lstObjectsFound.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstObjectsFound.setMinimumSize(null);
        lstObjectsFound.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstObjectsFoundValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstObjectsFound);

        btnObjectNew.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnObjectNew.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/add.png")); // NOI18N
        btnObjectNew.setToolTipText("New Object");
        btnObjectNew.setEnabled(false);
        btnObjectNew.setMaximumSize(new java.awt.Dimension(54, 34));
        btnObjectNew.setMinimumSize(new java.awt.Dimension(54, 34));
        btnObjectNew.setPreferredSize(new java.awt.Dimension(54, 34));
        btnObjectNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectNewActionPerformed(evt);
            }
        });

        btnObjectEdit.setFont(new java.awt.Font("Dialog", 1, 10));
        btnObjectEdit.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/edit.png")); // NOI18N
        btnObjectEdit.setToolTipText("Edit Object");
        btnObjectEdit.setEnabled(false);
        btnObjectEdit.setMaximumSize(new java.awt.Dimension(54, 34));
        btnObjectEdit.setMinimumSize(new java.awt.Dimension(54, 34));
        btnObjectEdit.setPreferredSize(new java.awt.Dimension(54, 34));
        btnObjectEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectEditActionPerformed(evt);
            }
        });

        btnObjectDestroy.setFont(new java.awt.Font("Dialog", 1, 10));
        btnObjectDestroy.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/delete.png")); // NOI18N
        btnObjectDestroy.setToolTipText("Destroy Object");
        btnObjectDestroy.setEnabled(false);
        btnObjectDestroy.setMaximumSize(new java.awt.Dimension(54, 34));
        btnObjectDestroy.setMinimumSize(new java.awt.Dimension(54, 34));
        btnObjectDestroy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjectDestroyActionPerformed(evt);
            }
        });

        cmbLimit.setFont(new java.awt.Font("Dialog", 1, 10));
        cmbLimit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "30", "60", "100", "200", "1000" }));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel4.setText("Limit:");

        cmbSkip.setFont(new java.awt.Font("Dialog", 1, 10));
        cmbSkip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel5.setText("Skip:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnObjectNew, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnObjectEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnObjectDestroy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 782, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnObjectNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(btnObjectEdit, 0, 0, Short.MAX_VALUE)
                        .addComponent(btnObjectDestroy, 0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLimit, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(cmbSkip, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jToolBar5.setFloatable(false);
        jToolBar5.setRollover(true);

        jSplitPane2.setDividerLocation(600);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblMessage.setText("Messages here....");
        jPanel5.add(lblMessage);

        jSplitPane2.setLeftComponent(jPanel5);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        jPanel6.add(jProgressBar1);

        jSplitPane2.setRightComponent(jPanel6);

        jToolBar5.add(jSplitPane2);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setAlignmentX(0.2F);
        jPanel7.setAlignmentY(0.2F);
        jPanel7.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel2.setText("Connection: ");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 13);

        cmbConnections.setFont(new java.awt.Font("Dialog", 1, 10));
        cmbConnections.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(cmbConnections);
        cmbConnections.setBounds(90, 2, 210, 30);

        btnConnect.setFont(new java.awt.Font("Dialog", 1, 10));
        btnConnect.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/refresh.png")); // NOI18N
        btnConnect.setToolTipText("Connect");
        btnConnect.setFocusable(false);
        btnConnect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConnect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });
        jPanel7.add(btnConnect);
        btnConnect.setBounds(303, 2, 50, 30);

        menuBar.setFont(new java.awt.Font("Dialog", 1, 10));

        menuFile.setText("File");

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        menuConnections.setText("Connections");
        menuConnections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConnectionsActionPerformed(evt);
            }
        });
        menuEdit.add(menuConnections);

        menuPreferences.setText("Preferences");
        menuPreferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPreferencesActionPerformed(evt);
            }
        });
        menuEdit.add(menuPreferences);

        menuBar.add(menuEdit);

        menuHelp.setText("Help");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar5, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollectionNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectionNewActionPerformed

        String collectionName = JOptionPane.showInputDialog(this, "Collection Name:",
                "New", JOptionPane.PLAIN_MESSAGE);

        if (collectionName != null && monguitoController.validateCollectionName(collectionName)) {
            monguitoController.createCollection(collectionName);
            monguitoController.refreshCollections((String) lstDataBases.getSelectedValue());
            refreshCollections();
        } else if (collectionName != null) {
            JOptionPane.showMessageDialog(this, "Name collection invalid",
                    "Invalid name", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCollectionNewActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed

        Connection connection = configurationUtil.getConnection(
                cmbConnections.getSelectedItem().toString(), configuration);

        try {
            monguitoController.connectTo(connection);
            monguitoController.refreshDataBases();

            buttons(true, false, false, false, false, false, false, false, false);

        } catch (Exception e) {

            monguitoController.resetRequest();
            buttons(false, false, false, false, false, false, false, false, false);

            JOptionPane.showMessageDialog(this, "Error to connect " + connection.getName() + ".",
                    "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        refreshWindow();

    }//GEN-LAST:event_btnConnectActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed

        System.exit(0);

    }//GEN-LAST:event_menuExitActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed

        AboutView aboutView = new AboutView(this, true);
        aboutView.setVisible(true);

    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuConnectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConnectionsActionPerformed

        ConnectionsView connectionsView = new ConnectionsView(this, true, configuration);
        connectionsView.setVisible(true);
        refreshConnections();

    }//GEN-LAST:event_menuConnectionsActionPerformed

    private void menuPreferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPreferencesActionPerformed

        PreferencesView preferencesView = new PreferencesView(this, true, configuration);
        preferencesView.setVisible(true);

    }//GEN-LAST:event_menuPreferencesActionPerformed

    private void lstDataBasesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDataBasesValueChanged

        monguitoController.refreshCollections((String) lstDataBases.getSelectedValue());
        refreshCollections();

        buttons(true, true, true, false, false, false, false, false, false);

    }//GEN-LAST:event_lstDataBasesValueChanged

    private void lstCollectionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCollectionsValueChanged

        buttons(true, true, true, true, true, true, false, false, true);

    }//GEN-LAST:event_lstCollectionsValueChanged

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed


        monguitoController.find((String) lstCollections.getSelectedValue(),
                Integer.parseInt((String) cmbLimit.getSelectedItem()),
                Integer.parseInt((String) cmbSkip.getSelectedItem()));
        refreshObjectsFound();
        refreshSkip();
        buttons(true, true, true, true, true, true, false, false, true);

    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDbNewActionPerformed

        String db = JOptionPane.showInputDialog(this, "Data Base Name:",
                "New", JOptionPane.PLAIN_MESSAGE);

        if (db != null && monguitoController.validateCollectionName(db)) {
            monguitoController.createDataBase(db);
            monguitoController.refreshDataBases();
            refreshDataBases();
        } else if (db != null) {
            JOptionPane.showMessageDialog(this, "Name data base is invalid",
                    "Invalid name", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnDbNewActionPerformed

    private void btnDbDestroyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDbDestroyActionPerformed

        String dataBaseSelected = monguitoController.getDataBases().get(lstDataBases.getSelectedIndex());
        int answer = JOptionPane.showConfirmDialog(this, "do you want destroy "
                + dataBaseSelected + " data base?", "Are you sure?", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            monguitoController.destroyDataBase(dataBaseSelected);
            monguitoController.refreshDataBases();
            refreshDataBases();
        }


    }//GEN-LAST:event_btnDbDestroyActionPerformed

    private void btnCollectionDestroyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectionDestroyActionPerformed

        String collectionName = (String) lstCollections.getSelectedValue();
        int answer = JOptionPane.showConfirmDialog(this, "Do you want destroy "
                + collectionName + " collection?", "Are you sure?", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            String collection = monguitoController.getCollections().get(lstCollections.getSelectedIndex());
            monguitoController.destroyCollection(collection);
            monguitoController.refreshCollections((String) lstDataBases.getSelectedValue());
            refreshCollections();
        }

    }//GEN-LAST:event_btnCollectionDestroyActionPerformed

    private void btnCollectionTruncateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectionTruncateActionPerformed

        int answer = JOptionPane.showConfirmDialog(this, "Are you sure?\nRemove and Create the collection.",
                "Truncate", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            String collectionName = monguitoController.getCollections().get(lstCollections.getSelectedIndex());
            monguitoController.truncateCollection(collectionName);
            monguitoController.refreshCollections((String) lstDataBases.getSelectedValue());
            refreshCollections();
        }

    }//GEN-LAST:event_btnCollectionTruncateActionPerformed

    private void btnObjectNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjectNewActionPerformed

        monguitoController.setCollectionIndex(lstCollections.getSelectedIndex());
        AddObjectView addObjectView = new AddObjectView(this, true, monguitoController);
        addObjectView.setVisible(true);

        refreshSkip();

        monguitoController.find((String) lstCollections.getSelectedValue(),
                Integer.parseInt((String) cmbLimit.getSelectedItem()),
                monguitoController.getListSkip().size() - 1);

        refreshObjectsFound();
    }//GEN-LAST:event_btnObjectNewActionPerformed

    private void btnObjectDestroyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjectDestroyActionPerformed

        int answer = JOptionPane.showConfirmDialog(this, "Are you sure?",
                "Destroy object", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {

            String strJson = monguitoController.getObjectsFound().get(lstObjectsFound.getSelectedIndex());
            monguitoController.destroyObject(strJson);

            refreshSkip();

            monguitoController.find((String) lstCollections.getSelectedValue(),
                    Integer.parseInt((String) cmbLimit.getSelectedItem()),
                    monguitoController.getListSkip().size() - 1);

            refreshObjectsFound();
            buttons(true, true, true, true, true, true, false, false, true);
        }

    }//GEN-LAST:event_btnObjectDestroyActionPerformed

    private void btnObjectEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjectEditActionPerformed

        String strJson = monguitoController.getObjectsFound().get(lstObjectsFound.getSelectedIndex());
        EditObjectView editObjectView = new EditObjectView(this, true, monguitoController, strJson);
        editObjectView.setVisible(true);

        monguitoController.find((String) lstCollections.getSelectedValue(),
                Integer.parseInt((String) cmbLimit.getSelectedItem()),
                Integer.parseInt((String) cmbSkip.getSelectedItem()));

        refreshObjectsFound();
        buttons(true, true, true, true, true, true, false, false, true);

    }//GEN-LAST:event_btnObjectEditActionPerformed

    private void lstObjectsFoundValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstObjectsFoundValueChanged

        buttons(true, true, true, true, true, true, true, true, true);

    }//GEN-LAST:event_lstObjectsFoundValueChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectionDestroy;
    private javax.swing.JButton btnCollectionNew;
    private javax.swing.JButton btnCollectionTruncate;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDbDestroy;
    private javax.swing.JButton btnDbNew;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnObjectDestroy;
    private javax.swing.JButton btnObjectEdit;
    private javax.swing.JButton btnObjectNew;
    private javax.swing.JComboBox cmbConnections;
    private javax.swing.JComboBox cmbLimit;
    private javax.swing.JComboBox cmbSkip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JList lstCollections;
    private javax.swing.JList lstDataBases;
    private javax.swing.JList lstObjectsFound;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuConnections;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuPreferences;
    // End of variables declaration//GEN-END:variables

    private void refreshConnections() {

        cmbConnections.removeAllItems();

        for (Connection conn : configuration.getConnections()) {
            cmbConnections.addItem(conn.getName());
        }

    }

    private void refreshWindow() {
        refreshConnections();
        refreshDataBases();
        refreshCollections();
        refreshObjectsFound();
    }

    private void refreshDataBases() {
        lstDataBases.setListData(monguitoController.getDataBases().toArray());
        refreshAllways();
    }

    private void refreshCollections() {
        lstCollections.setListData(monguitoController.getCollections().toArray());
        btnFind.setEnabled(false);
        refreshAllways();
    }

    private void refreshObjectsFound() {
        lstObjectsFound.setListData(monguitoController.getObjectsFound().toArray());
        refreshAllways();
    }

    private void refreshAllways() {
        lblMessage.setText("Total: " + monguitoController.getCountTotalObjects()
                + " - Total ojbects found: " + monguitoController.getCountObjectsFound());
    }

    private void refreshSkip() {

        cmbSkip.setModel(new javax.swing.DefaultComboBoxModel(monguitoController.getListSkip().toArray()));

        if (monguitoController.getCalculatedSkip() >= monguitoController.getSelectedSkip()) {
            cmbSkip.setSelectedIndex(monguitoController.getSelectedSkip());
        }
    }

    private void buttons(boolean dbNew, boolean dbDestroy, boolean collNew, boolean collTruncate,
            boolean collDestroy, boolean objNew, boolean objEdit, boolean objDestroy, boolean find) {

        btnDbNew.setEnabled(dbNew);
        btnDbDestroy.setEnabled(dbDestroy);
        btnCollectionNew.setEnabled(collNew);
        btnCollectionTruncate.setEnabled(collTruncate);
        btnCollectionDestroy.setEnabled(collDestroy);
        btnObjectNew.setEnabled(objNew);
        btnObjectEdit.setEnabled(objEdit);
        btnObjectDestroy.setEnabled(objDestroy);
        btnFind.setEnabled(find);

    }
}
