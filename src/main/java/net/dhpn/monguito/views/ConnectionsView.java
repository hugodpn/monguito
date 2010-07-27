package net.dhpn.monguito.views;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.dhpn.monguito.entities.Configuration;
import net.dhpn.monguito.entities.Connection;
import net.dhpn.monguito.utils.ConfigurationUtil;

public class ConnectionsView extends javax.swing.JDialog {

    private Configuration configuration;
    private boolean isEditable;
    private ConfigurationUtil configurationUtil;

    public ConnectionsView(java.awt.Frame parent, boolean modal, Configuration configuration) {
        super(parent, modal);
        initComponents();
        configurationUtil = new ConfigurationUtil();
        this.configuration = configuration;
        isEditable = false;
        refreshConnections();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstConnections = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHost = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnNewConnection = new javax.swing.JButton();
        btnRemoveConnection = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Connections");
        setResizable(false);

        lstConnections.setFont(new java.awt.Font("Dialog", 1, 10));
        lstConnections.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstConnections.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstConnectionsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstConnections);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Connection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel2.setText("Host:");

        jLabel3.setText("Port:");

        txtHost.setEnabled(false);

        txtPort.setEnabled(false);

        jLabel4.setText("Name:");

        txtName.setEnabled(false);

        btnSave.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/accept.png")); // NOI18N
        btnSave.setToolTipText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/block.png")); // NOI18N
        btnCancel.setToolTipText("Cancel");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPort)
                            .addComponent(txtHost)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnNewConnection.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnNewConnection.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/add.png")); // NOI18N
        btnNewConnection.setToolTipText("Add Connection");
        btnNewConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewConnectionActionPerformed(evt);
            }
        });

        btnRemoveConnection.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnRemoveConnection.setIcon(new javax.swing.ImageIcon("/home/hugo/dev/j2se/monguito/src/main/java/net/dhpn/monguito/icons/24x24/delete.png")); // NOI18N
        btnRemoveConnection.setEnabled(false);
        btnRemoveConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveConnectionActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Dialog", 1, 10));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnRemoveConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-435)/2, (screenSize.height-314)/2, 435, 314);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_btnCloseActionPerformed

    private void lstConnectionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstConnectionsValueChanged

        try {

            isEditable = true;
            int i = lstConnections.getSelectedIndex();
            txtName.setText(configuration.getConnections().get(i).getName());
            txtHost.setText(configuration.getConnections().get(i).getHost());
            txtPort.setText(Integer.toString(configuration.getConnections().get(i).getPort()));
            txtHost.setEnabled(true);
            txtPort.setEnabled(true);
            txtName.setEnabled(false);
            btnSave.setEnabled(true);
            btnCancel.setEnabled(true);
            btnRemoveConnection.setEnabled(true);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_lstConnectionsValueChanged

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        cleanWindows();

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnNewConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewConnectionActionPerformed

        isEditable = false;
        txtName.setText("");
        txtHost.setText("");
        txtPort.setText("");
        txtName.setEnabled(true);
        txtHost.setEnabled(true);
        txtPort.setEnabled(true);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnRemoveConnection.setEnabled(false);
        btnNewConnection.setEnabled(false);
        lstConnections.setEnabled(false);

    }//GEN-LAST:event_btnNewConnectionActionPerformed

    private void btnRemoveConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveConnectionActionPerformed

        int answer = JOptionPane.showConfirmDialog(this, "Destroy "
                + lstConnections.getSelectedValue().toString() + " connection",
                "Are you sure?", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            configuration.getConnections().remove(lstConnections.getSelectedIndex());
            configurationUtil.save(configuration);
            cleanWindows();
        }

    }//GEN-LAST:event_btnRemoveConnectionActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed


        try {

            if (!isEditable) {
                Connection connection = new Connection();
                connection.setName(txtName.getText());
                connection.setHost(txtHost.getText());
                connection.setPort(Integer.parseInt(txtPort.getText()));

                if (!configurationUtil.exist(connection.getName(), configuration)) {
                    configuration.getConnections().add(connection);
                    configurationUtil.save(configuration);
                } else {
                    JOptionPane.showMessageDialog(this, "You can not repit connection name",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            } else {
                configurationUtil.update(txtName.getText(), txtHost.getText(),
                        Integer.parseInt(txtPort.getText()), configuration);
            }

            cleanWindows();

        } catch (NumberFormatException numberException) {
            JOptionPane.showMessageDialog(this, "Port should be integer", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSaveActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNewConnection;
    private javax.swing.JButton btnRemoveConnection;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstConnections;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables

    private void refreshConnections() {
        List<String> connections = new ArrayList<String>();
        for (Connection conn : configuration.getConnections()) {
            connections.add(conn.getName());
        }

        lstConnections.setListData(connections.toArray());
    }

    private void cleanWindows() {
        isEditable = false;
        txtName.setText("");
        txtHost.setText("");
        txtPort.setText("");
        txtName.setEnabled(false);
        txtHost.setEnabled(false);
        txtPort.setEnabled(false);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnRemoveConnection.setEnabled(false);
        btnNewConnection.setEnabled(true);
        lstConnections.setEnabled(true);
        refreshConnections();
    }
}
