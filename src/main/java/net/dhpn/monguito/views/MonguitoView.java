package net.dhpn.monguito.views;

import com.mongodb.DBObject;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import net.dhpn.monguito.controllers.MonguitoController;
import net.dhpn.monguito.entities.Configuration;
import net.dhpn.monguito.entities.Connection;
import net.dhpn.monguito.entities.Filter;
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

        popMenuObjectFound = new javax.swing.JPopupMenu();
        popMenuDelete = new javax.swing.JMenuItem();
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
        chkFilter = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableFilter = new javax.swing.JTable();
        btnClearFilter = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
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
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbConnections = new javax.swing.JComboBox();
        btnConnect = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuConnections = new javax.swing.JMenuItem();
        menuPreferences = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        popMenuObjectFound.setInheritsPopupMenu(true);

        popMenuDelete.setText("Destroy");
        popMenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMenuDeleteActionPerformed(evt);
            }
        });
        popMenuObjectFound.add(popMenuDelete);

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

        btnDbNew.setFont(new java.awt.Font("Dialog", 1, 10));
        btnDbNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/add.png"))); // NOI18N
        btnDbNew.setToolTipText("New Data Base");
        btnDbNew.setEnabled(false);
        btnDbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDbNewActionPerformed(evt);
            }
        });

        btnDbDestroy.setFont(new java.awt.Font("Dialog", 1, 10));
        btnDbDestroy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/delete.png"))); // NOI18N
        btnDbDestroy.setToolTipText("Destroy Data Base");
        btnDbDestroy.setEnabled(false);
        btnDbDestroy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDbDestroyActionPerformed(evt);
            }
        });

        btnCollectionNew.setFont(new java.awt.Font("Dialog", 1, 10));
        btnCollectionNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/add.png"))); // NOI18N
        btnCollectionNew.setToolTipText("New Collection");
        btnCollectionNew.setEnabled(false);
        btnCollectionNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionNewActionPerformed(evt);
            }
        });

        btnCollectionTruncate.setFont(new java.awt.Font("Dialog", 1, 10));
        btnCollectionTruncate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/delete_page.png"))); // NOI18N
        btnCollectionTruncate.setToolTipText("Truncate Collection - (Remove and Create)");
        btnCollectionTruncate.setEnabled(false);
        btnCollectionTruncate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionTruncateActionPerformed(evt);
            }
        });

        btnCollectionDestroy.setFont(new java.awt.Font("Dialog", 1, 10));
        btnCollectionDestroy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/delete.png"))); // NOI18N
        btnCollectionDestroy.setToolTipText("Destroy Collection");
        btnCollectionDestroy.setEnabled(false);
        btnCollectionDestroy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionDestroyActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Dialog", 1, 10));
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/search.png"))); // NOI18N
        btnFind.setText("Find");
        btnFind.setToolTipText("Find last skip");
        btnFind.setEnabled(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        chkFilter.setFont(new java.awt.Font("Dialog", 1, 10));
        chkFilter.setText("Filter");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkFilter))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkFilter))
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

        tableFilter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Element", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tableFilter);
        tableFilter.getColumnModel().getColumn(1).setPreferredWidth(250);

        btnClearFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/promotion.png"))); // NOI18N
        btnClearFilter.setText("Clear");
        btnClearFilter.setToolTipText("Clear Filter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClearFilter)
                .addContainerGap(511, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Filter", jPanel2);

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Element", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableInfo);
        tableInfo.getColumnModel().getColumn(0).setResizable(false);
        tableInfo.getColumnModel().getColumn(0).setPreferredWidth(30);
        tableInfo.getColumnModel().getColumn(1).setResizable(false);
        tableInfo.getColumnModel().getColumn(1).setPreferredWidth(250);

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/promotion.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("Clear Information");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear)
                .addContainerGap(511, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Information", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstObjectsFound.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lstObjectsFound.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstObjectsFound.setToolTipText("null");
        lstObjectsFound.setMinimumSize(null);
        lstObjectsFound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstObjectsFoundMouseClicked(evt);
            }
        });
        lstObjectsFound.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstObjectsFoundValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstObjectsFound);

        btnObjectNew.setFont(new java.awt.Font("Dialog", 1, 10));
        btnObjectNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/add.png"))); // NOI18N
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
        btnObjectEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/edit.png"))); // NOI18N
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
        btnObjectDestroy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/delete.png"))); // NOI18N
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
        cmbLimit.setEnabled(false);
        cmbLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel4.setText("Limit:");

        cmbSkip.setFont(new java.awt.Font("Dialog", 1, 10));
        cmbSkip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));
        cmbSkip.setEnabled(false);
        cmbSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSkipActionPerformed(evt);
            }
        });

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
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
        btnConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/dhpn/monguito/icons/24x24/refresh.png"))); // NOI18N
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

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setAlignmentX(0.1F);
        jPanel8.setAlignmentY(0.1F);
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jSplitPane1.setDividerLocation(800);

        jPanel6.setAlignmentX(0.1F);
        jPanel6.setAlignmentY(0.1F);
        jPanel6.setLayout(new java.awt.CardLayout());

        lblMessage.setText("Messages here....");
        jPanel6.add(lblMessage, "card2");

        jSplitPane1.setLeftComponent(jPanel6);

        jPanel5.setLayout(new java.awt.CardLayout());
        jPanel5.add(jProgressBar1, "card2");

        jSplitPane1.setRightComponent(jPanel5);

        jPanel8.add(jSplitPane1);

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
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
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

            buttons(true, false, false, false, false, false, false, false, false, false, false);

        } catch (Exception e) {

            monguitoController.resetRequest();
            buttons(false, false, false, false, false, false, false, false, false, false, false);

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

        buttons(true, true, true, false, false, false, false, false, false, false, false);

    }//GEN-LAST:event_lstDataBasesValueChanged

    private void lstCollectionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCollectionsValueChanged

        buttons(true, true, true, true, true, true, false, false, true, true, true);

    }//GEN-LAST:event_lstCollectionsValueChanged

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        List<Filter> filters = getFilter();

        monguitoController.findLastSkip((String) lstCollections.getSelectedValue(),
                Integer.parseInt((String) cmbLimit.getSelectedItem()), filters);

        refreshObjectsFound();
        refreshSkip();
        buttons(true, true, true, true, true, true, false, false, true, true, true);

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

        monguitoController.findLastSkip((String) lstCollections.getSelectedValue(),
                Integer.parseInt((String) cmbLimit.getSelectedItem()), getFilter());

        refreshObjectsFound();
        refreshSkip();
    }//GEN-LAST:event_btnObjectNewActionPerformed

    private void btnObjectDestroyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjectDestroyActionPerformed

        deleteObjectFound();

    }//GEN-LAST:event_btnObjectDestroyActionPerformed

    private void btnObjectEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjectEditActionPerformed

        editObject();

    }//GEN-LAST:event_btnObjectEditActionPerformed

    private void lstObjectsFoundValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstObjectsFoundValueChanged

        try {

            String message = "";

            showInformation(monguitoController.getObject((String) lstObjectsFound.getSelectedValue()));
            buttons(true, true, true, true, true, true, true, true, true, true, true);

            DBObject obj = monguitoController.getObject((String) lstObjectsFound.getSelectedValue());
            String oid = obj.get("_id").toString();
            
            String toDate = oid.substring(0, 8);
            Long lDate = Long.parseLong(toDate, 16);
            message += "Timestamp: " + new Date(lDate * 1000) + "  -  ";

            String toMachine = oid.substring(0,14);

            Long lMachine = Long.parseLong(toMachine, 16);
            message += "Machine: " + Long.toOctalString(lMachine);

            lstObjectsFound.setToolTipText(message);


        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_lstObjectsFoundValueChanged

    private void cmbSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSkipActionPerformed

        monguitoController.find((String) lstCollections.getSelectedValue(),
                Integer.parseInt((String) cmbLimit.getSelectedItem()),
                Integer.parseInt((String) cmbSkip.getSelectedItem()), getFilter());
        refreshObjectsFound();

    }//GEN-LAST:event_cmbSkipActionPerformed

    private void cmbLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimitActionPerformed


        int limit = Integer.parseInt((String) cmbLimit.getSelectedItem());
        monguitoController.setSelectedLimit(limit);
        monguitoController.calculateSkip();
        refreshSkip();

    }//GEN-LAST:event_cmbLimitActionPerformed

    private void lstObjectsFoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstObjectsFoundMouseClicked

        popMenuObjectFound.setVisible(false);

        if (monguitoController.getObjectsFound().size() > 0) {
            if (evt.getClickCount() == 2 && lstObjectsFound.getSelectedValue() != null) {
                editObject();
            }
        }

        if (evt.getButton() == MouseEvent.BUTTON3 && lstObjectsFound.getSelectedValue() != null) {
            popMenuObjectFound.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
            popMenuDelete.setSelected(true);
            popMenuObjectFound.setVisible(true);
        }


    }//GEN-LAST:event_lstObjectsFoundMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        for (int i = 0; i < tableInfo.getRowCount(); i++) {
            tableInfo.getModel().setValueAt(null, i, 0);
            tableInfo.getModel().setValueAt(null, i, 1);
        }

    }//GEN-LAST:event_btnClearActionPerformed

    private void popMenuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMenuDeleteActionPerformed

        popMenuObjectFound.setVisible(false);
        deleteObjectFound();

    }//GEN-LAST:event_popMenuDeleteActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearFilter;
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
    private javax.swing.JCheckBox chkFilter;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
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
    private javax.swing.JMenuItem popMenuDelete;
    private javax.swing.JPopupMenu popMenuObjectFound;
    private javax.swing.JTable tableFilter;
    private javax.swing.JTable tableInfo;
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
                + " - Total objects found: " + monguitoController.getCountObjectsFound());
    }

    private void refreshSkip() {

        cmbSkip.setModel(new javax.swing.DefaultComboBoxModel(monguitoController.getListSkip().toArray()));

        if (monguitoController.getCalculatedSkip() >= monguitoController.getSelectedSkip()) {
            cmbSkip.setSelectedIndex(monguitoController.getSelectedSkip());
        }
    }

    private void buttons(boolean dbNew, boolean dbDestroy, boolean collNew, boolean collTruncate,
            boolean collDestroy, boolean objNew, boolean objEdit, boolean objDestroy, boolean find,
            boolean limit, boolean skip) {

        btnDbNew.setEnabled(dbNew);
        btnDbDestroy.setEnabled(dbDestroy);
        btnCollectionNew.setEnabled(collNew);
        btnCollectionTruncate.setEnabled(collTruncate);
        btnCollectionDestroy.setEnabled(collDestroy);
        btnObjectNew.setEnabled(objNew);
        btnObjectEdit.setEnabled(objEdit);
        btnObjectDestroy.setEnabled(objDestroy);
        btnFind.setEnabled(find);
        cmbLimit.setEnabled(limit);
        cmbSkip.setEnabled(skip);

    }

    private void editObject() {
        String strJson = monguitoController.getObjectsFound().get(lstObjectsFound.getSelectedIndex());
        EditObjectView editObjectView = new EditObjectView(this, true, monguitoController, strJson);
        editObjectView.setVisible(true);

        monguitoController.find((String) lstCollections.getSelectedValue(),
                Integer.parseInt((String) cmbLimit.getSelectedItem()),
                Integer.parseInt((String) cmbSkip.getSelectedItem()), getFilter());

        refreshObjectsFound();
        buttons(true, true, true, true, true, true, false, false, true, true, true);
    }

    private void showInformation(DBObject object) {

        for (int i = 0; i < tableInfo.getRowCount(); i++) {

            if (tableInfo.getModel().getValueAt(i, 0) != null) {
                tableInfo.getModel().setValueAt(monguitoController.showValue(object, (String) tableInfo.getModel().getValueAt(i, 0)), i, 1);

            }
        }


    }

    private List<Filter> getFilter() {
        if (chkFilter.isSelected()) {

            List<Filter> filters = new ArrayList<Filter>();

            for (int i = 0; i < tableFilter.getRowCount(); i++) {

                if (tableFilter.getModel().getValueAt(i, 0) != null
                        && !tableFilter.getModel().getValueAt(i, 0).equals("")
                        && tableFilter.getModel().getValueAt(i, 1) != null
                        && !tableFilter.getModel().getValueAt(i, 1).equals("")) {

                    Filter f = new Filter();
                    f.setKey((String) tableFilter.getModel().getValueAt(i, 0));
                    f.setValue((String) tableFilter.getModel().getValueAt(i, 1));

                    filters.add(f);

                }
            }

            return filters;

        } else {
            return null;
        }

    }

    private void deleteObjectFound() {
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure?",
                "Destroy object", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {

            String strJson = monguitoController.getObjectsFound().get(lstObjectsFound.getSelectedIndex());
            monguitoController.destroyObject(strJson);

            refreshSkip();

            monguitoController.findLastSkip((String) lstCollections.getSelectedValue(),
                    Integer.parseInt((String) cmbLimit.getSelectedItem()), getFilter());

            refreshObjectsFound();
            refreshSkip();
            buttons(true, true, true, true, true, true, false, false, true, true, true);
        }
    }
}
