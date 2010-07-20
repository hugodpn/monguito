package com.vvcode.monguito.ui;

import com.vvcode.monguito.controllers.MonguitoController;
import com.vvcode.monguito.controllers.QueryController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MonguitoUI extends javax.swing.JFrame {

    private MonguitoController monguitoController;

    public MonguitoUI() {
        initComponents();
        initMongoDbController();
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);


        btnGenerateData.setVisible(false);

        lblObjectID.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        toolRefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDbSelected = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDataBases = new javax.swing.JList();
        btnNewDataBase = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCollectionSelected = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCollections = new javax.swing.JList();
        btnNew = new javax.swing.JButton();
        btnTruncate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnGenerateData = new javax.swing.JButton();
        btnRemoveInsert = new javax.swing.JButton();
        btnRemoveDataBase = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstResponse = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lstSkip = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lstLimit = new javax.swing.JComboBox();
        lblSkipTitle = new javax.swing.JLabel();
        lblSkip = new javax.swing.JLabel();
        lblLimitTitle = new javax.swing.JLabel();
        lblLimit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblObjectID = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        tbExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        tbConfigurate = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        tbAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MongoDB GUI Tool (Alfa Version)");

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        toolRefresh.setText("Refresh");
        toolRefresh.setFocusable(false);
        toolRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolRefreshActionPerformed(evt);
            }
        });
        jToolBar1.add(toolRefresh);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("DB:");

        lblDbSelected.setFont(new java.awt.Font("Dialog", 0, 10));
        lblDbSelected.setForeground(new java.awt.Color(204, 0, 0));
        lblDbSelected.setText("DBSelected");

        lstDataBases.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
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

        btnNewDataBase.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnNewDataBase.setText("N");
        btnNewDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDataBaseActionPerformed(evt);
            }
        });

        jLabel2.setText("Coll.:");

        lblCollectionSelected.setFont(new java.awt.Font("Dialog", 0, 10));
        lblCollectionSelected.setForeground(new java.awt.Color(204, 0, 0));
        lblCollectionSelected.setText("CollSelected");

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

        btnNew.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnNew.setText("N");
        btnNew.setToolTipText("New Collection");
        btnNew.setEnabled(false);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnTruncate.setFont(new java.awt.Font("Dialog", 1, 10));
        btnTruncate.setText("T");
        btnTruncate.setToolTipText("Truncate Collection (Remove and Create)");
        btnTruncate.setEnabled(false);
        btnTruncate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruncateActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnRemove.setText("R");
        btnRemove.setToolTipText("Remove Collection");
        btnRemove.setEnabled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Dialog", 1, 10));
        btnFind.setText("Find");
        btnFind.setEnabled(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("Add field in selected collection.");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnGenerateData.setFont(new java.awt.Font("Dialog", 1, 10));
        btnGenerateData.setText("Tmp data");
        btnGenerateData.setEnabled(false);
        btnGenerateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateDataActionPerformed(evt);
            }
        });

        btnRemoveInsert.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnRemoveInsert.setText("Remove");
        btnRemoveInsert.setToolTipText("Remove field selected from collection.");
        btnRemoveInsert.setEnabled(false);
        btnRemoveInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveInsertActionPerformed(evt);
            }
        });

        btnRemoveDataBase.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnRemoveDataBase.setText("R");
        btnRemoveDataBase.setEnabled(false);
        btnRemoveDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDataBaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblDbSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNewDataBase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveDataBase)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCollectionSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRemoveInsert, 0, 0, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addGap(3, 3, 3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTruncate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)
                                .addGap(23, 23, 23)
                                .addComponent(btnGenerateData, 0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDbSelected)
                    .addComponent(jLabel2)
                    .addComponent(lblCollectionSelected))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveInsert)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewDataBase)
                    .addComponent(btnNew)
                    .addComponent(btnTruncate)
                    .addComponent(btnRemove)
                    .addComponent(btnGenerateData)
                    .addComponent(btnRemoveDataBase))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstResponse.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lstResponse.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstResponse.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstResponseValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstResponse);

        jLabel3.setText("Count:");

        lblCount.setForeground(new java.awt.Color(204, 0, 0));
        lblCount.setText("0");

        jLabel5.setText("Skip:");

        lstSkip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));

        jLabel6.setText("Limit:");

        lstLimit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15", "30", "60", "120", "200" }));

        lblSkipTitle.setText("Skip:");

        lblSkip.setForeground(new java.awt.Color(0, 0, 153));
        lblSkip.setText("0");

        lblLimitTitle.setText("Limit:");

        lblLimit.setForeground(new java.awt.Color(0, 0, 153));
        lblLimit.setText("0");

        jLabel7.setText("OID:");

        lblObjectID.setFont(new java.awt.Font("Dialog", 1, 10));
        lblObjectID.setForeground(new java.awt.Color(0, 51, 153));
        lblObjectID.setText("ObjectID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lstLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblObjectID, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSkipTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLimitTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lstSkip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lstLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLimit)
                    .addComponent(lblLimitTitle)
                    .addComponent(lblSkip)
                    .addComponent(lblSkipTitle)
                    .addComponent(lblCount)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(lblObjectID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jLabel4.setText("Messges...");
        jToolBar2.add(jLabel4);

        jMenu1.setText("File");

        tbExit.setText("Exit");
        tbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbExitActionPerformed(evt);
            }
        });
        jMenu1.add(tbExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        tbConfigurate.setText("Configurate");
        tbConfigurate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbConfigurateActionPerformed(evt);
            }
        });
        jMenu2.add(tbConfigurate);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        tbAbout.setText("About");
        tbAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAboutActionPerformed(evt);
            }
        });
        jMenu3.add(tbAbout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void tbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_tbExitActionPerformed

    private void lstDataBasesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDataBasesValueChanged

        if (evt.getValueIsAdjusting()) {
            String db = monguitoController.getDataBases().get(lstDataBases.getSelectedIndex());
            lblDbSelected.setText(db);
            monguitoController.refreshCollections(db);
            lstCollections.setListData(monguitoController.getCollections().toArray());
            btnFind.setEnabled(false);
            btnTruncate.setEnabled(false);
            btnRemove.setEnabled(false);
            btnAdd.setEnabled(false);
            btnNew.setEnabled(true);
            lblCollectionSelected.setText("");
            lblObjectID.setText("");
            String[] tmp = new String[0];
            lstResponse.setListData(tmp);
            btnRemoveDataBase.setEnabled(true);
            btnRemoveInsert.setEnabled(true);
            btnRemoveInsert.setEnabled(false);
        }

    }//GEN-LAST:event_lstDataBasesValueChanged

    private void lstCollectionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCollectionsValueChanged

        if (evt.getValueIsAdjusting()) {
            String collection = monguitoController.getCollections().get(lstCollections.getSelectedIndex());
            lblCollectionSelected.setText(collection);
            btnFind.setEnabled(true);
            btnTruncate.setEnabled(true);
            btnRemove.setEnabled(true);
            btnAdd.setEnabled(true);
            btnRemoveInsert.setEnabled(false);
        }

    }//GEN-LAST:event_lstCollectionsValueChanged

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        String collection = monguitoController.getCollections().get(lstCollections.getSelectedIndex());

        int limit = Integer.parseInt(lstLimit.getSelectedItem().toString());
        int skip = Integer.parseInt(lstSkip.getSelectedItem().toString());
        int count = monguitoController.find(collection, skip, limit);

        lblCount.setText(Integer.toString(count));
        lstResponse.setListData(monguitoController.getResponse().toArray());


        List<String> lstModel = new ArrayList<String>();
        lstModel.add("0");
        int tmp = limit;
        int skipTmp = 0;
        while (tmp < count) {
            skipTmp++;
            lstModel.add(Integer.toString(skipTmp));
            tmp += limit;
        }
        lstSkip.setModel(new javax.swing.DefaultComboBoxModel(lstModel.toArray()));

        lblSkip.setText(Integer.toString(skip));
        lblLimit.setText(Integer.toString(limit));

        if (skipTmp >= skip) {
            lstSkip.setSelectedIndex(skip);
        }

    }//GEN-LAST:event_btnFindActionPerformed

    private void tbAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAboutActionPerformed

        AboutDialogUI aboutDialogUI = new AboutDialogUI(this, true);
        aboutDialogUI.setVisible(true);

    }//GEN-LAST:event_tbAboutActionPerformed

    private void tbConfigurateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbConfigurateActionPerformed

        ConfigurationsUI configurationsUI = new ConfigurationsUI(this, true);
        configurationsUI.setVisible(true);
        toolRefresh.setEnabled(true);

    }//GEN-LAST:event_tbConfigurateActionPerformed

    private void toolRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolRefreshActionPerformed

        initMongoDbController();
        btnRemoveDataBase.setEnabled(false);
//        toolRefresh.setEnabled(false);

    }//GEN-LAST:event_toolRefreshActionPerformed

    private void btnTruncateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruncateActionPerformed

        int answer = JOptionPane.showConfirmDialog(this, "Are you sure?\nRemove and Create the collection.",
                "TRUNCATE", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            String collection = monguitoController.getCollections().get(lstCollections.getSelectedIndex());
            monguitoController.truncate(collection);
            updateCollections();
        }

    }//GEN-LAST:event_btnTruncateActionPerformed

    private void btnGenerateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateDataActionPerformed
        QueryController controller = new QueryController();
        controller.excecuteQuery();
    }//GEN-LAST:event_btnGenerateDataActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure?",
                "REMOVE collection", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            String collection = monguitoController.getCollections().get(lstCollections.getSelectedIndex());
            monguitoController.remove(collection);
            updateCollections();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        String collection = JOptionPane.showInputDialog(this, "Collection Name:",
                "New Collection", JOptionPane.PLAIN_MESSAGE);

        System.out.println(collection);
        if (collection != null && monguitoController.validateCollectionName(collection)) {
            monguitoController.createCollection(collection);
            updateCollections();
        } else if (collection != null) {
            JOptionPane.showMessageDialog(this, "Name collection invalid",
                    "Invalid name", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnNewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        AddUI addUI = new AddUI(this, true, monguitoController, (String) lstCollections.getSelectedValue());
        addUI.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void lstResponseValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstResponseValueChanged
        try {
            String objID = monguitoController.getObjectId(lstResponse.getSelectedIndex());
            lblObjectID.setText(objID);
            btnRemoveInsert.setEnabled(true);
        } catch (Exception e) {
            lblObjectID.setText("no-id");
        }

    }//GEN-LAST:event_lstResponseValueChanged

    private void btnRemoveInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveInsertActionPerformed

        int selectedIndex = lstResponse.getSelectedIndex();
        String collection = monguitoController.getCollections().get(lstCollections.getSelectedIndex());
        monguitoController.removeCollectionField(selectedIndex, collection);
        btnRemoveInsert.setEnabled(false);

    }//GEN-LAST:event_btnRemoveInsertActionPerformed

    private void btnNewDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDataBaseActionPerformed

        String db = JOptionPane.showInputDialog(this, "Data Base Name:",
                "New Data Base", JOptionPane.PLAIN_MESSAGE);

        if (db != null && monguitoController.validateCollectionName(db)) {
            monguitoController.createDataBase(db);
            initMongoDbController();
        } else if (db != null) {
            JOptionPane.showMessageDialog(this, "Name data base is invalid",
                    "Invalid name", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnNewDataBaseActionPerformed

    private void btnRemoveDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDataBaseActionPerformed

        int answer = JOptionPane.showConfirmDialog(this, "Are you sure?",
                "REMOVE data base", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            String dbSelected = monguitoController.getDataBases().get(lstDataBases.getSelectedIndex());
            monguitoController.removeDB(dbSelected);
            initMongoDbController();
            btnRemoveDataBase.setEnabled(false);
        }

    }//GEN-LAST:event_btnRemoveDataBaseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MonguitoUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnGenerateData;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNewDataBase;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRemoveDataBase;
    private javax.swing.JButton btnRemoveInsert;
    private javax.swing.JButton btnTruncate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblCollectionSelected;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblDbSelected;
    private javax.swing.JLabel lblLimit;
    private javax.swing.JLabel lblLimitTitle;
    private javax.swing.JLabel lblObjectID;
    private javax.swing.JLabel lblSkip;
    private javax.swing.JLabel lblSkipTitle;
    private javax.swing.JList lstCollections;
    private javax.swing.JList lstDataBases;
    private javax.swing.JComboBox lstLimit;
    private javax.swing.JList lstResponse;
    private javax.swing.JComboBox lstSkip;
    private javax.swing.JMenuItem tbAbout;
    private javax.swing.JMenuItem tbConfigurate;
    private javax.swing.JMenuItem tbExit;
    private javax.swing.JButton toolRefresh;
    // End of variables declaration//GEN-END:variables

    private void initMongoDbController() {

        try {
            monguitoController = new MonguitoController();

            lblDbSelected.setText("");
            lstDataBases.setListData(monguitoController.getDataBases().toArray());

            lblCollectionSelected.setText("");
            lstCollections.setListData(monguitoController.getCollections().toArray());

            lstResponse.setListData(monguitoController.getResponse().toArray());

        } catch (Exception exception) {

            JOptionPane.showMessageDialog(this, exception.toString(),
                    "DB connection", JOptionPane.ERROR_MESSAGE);

            lblDbSelected.setText("");
            lstDataBases.setListData((new ArrayList<String>()).toArray());
            lblCollectionSelected.setText("");
            lstCollections.setListData((new ArrayList<String>()).toArray());
            lstResponse.setListData((new ArrayList<String>()).toArray());

        }
    }

    private void updateCollections() {
        monguitoController.refreshCollections((String) lstDataBases.getSelectedValue());
        lstCollections.setListData(monguitoController.getCollections().toArray());
        btnFind.setEnabled(false);
        btnRemove.setEnabled(false);
        btnTruncate.setEnabled(false);
        btnAdd.setEnabled(false);
        lblCollectionSelected.setText("");
        lblObjectID.setText("");
    }
}
