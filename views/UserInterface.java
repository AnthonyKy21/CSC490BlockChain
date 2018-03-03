package views;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Anthony Ky <AK838275@wcupa.edu>
 */
public class UserInterface extends javax.swing.JFrame {

  public JTextArea getOutputArea() {
    return outputArea;
  }

  public JTextArea getInputArea() {
    return inputArea;
  }

  public JTextField getUsernameField() {
    return usernameField;
  }

  public JTextField getHostField() {
    return hostField;
  }

  public JTextField getPortField() {
    return portField;
  }

  public JButton getConnectButton() {
    return connectButton;
  }

  public JButton getDisconnectButton() {
    return disconnectButton;
  }

  public JButton getSendButton() {
    return sendButton;
  }

  public UserInterface() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    outputArea = new javax.swing.JTextArea();
    sendButton = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    inputArea = new javax.swing.JTextArea();
    portField = new javax.swing.JTextField();
    portLabel = new javax.swing.JLabel();
    hostField = new javax.swing.JTextField();
    hostLabel = new javax.swing.JLabel();
    connectButton = new javax.swing.JButton();
    disconnectButton = new javax.swing.JButton();
    usernameLabel = new javax.swing.JLabel();
    usernameField = new javax.swing.JTextField();
    menuBar = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setLayout(new java.awt.BorderLayout());

    outputArea.setEditable(false);
    outputArea.setColumns(20);
    outputArea.setRows(5);
    jScrollPane1.setViewportView(outputArea);

    sendButton.setText("Send");
    sendButton.setPreferredSize(new java.awt.Dimension(100, 100));

    inputArea.setColumns(20);
    inputArea.setRows(5);
    jScrollPane2.setViewportView(inputArea);

    portLabel.setText("Port Number");

    hostLabel.setText("Hostname");

    connectButton.setText("Connect");

    disconnectButton.setText("Disconnect");

    usernameLabel.setText("Username");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
          .addComponent(jScrollPane2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(hostLabel)
          .addComponent(hostField, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
          .addComponent(portField)
          .addComponent(portLabel)
          .addComponent(connectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(disconnectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(usernameField)
          .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(usernameLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(hostLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(hostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(portLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23)
            .addComponent(connectButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(disconnectButton)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
          .addComponent(jScrollPane2))
        .addGap(0, 0, Short.MAX_VALUE))
    );

    jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    jMenu1.setText("File");
    menuBar.add(jMenu1);

    jMenu2.setText("Edit");
    menuBar.add(jMenu2);

    setJMenuBar(menuBar);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton connectButton;
  private javax.swing.JButton disconnectButton;
  private javax.swing.JTextField hostField;
  private javax.swing.JLabel hostLabel;
  private javax.swing.JTextArea inputArea;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JTextArea outputArea;
  private javax.swing.JTextField portField;
  private javax.swing.JLabel portLabel;
  private javax.swing.JButton sendButton;
  private javax.swing.JTextField usernameField;
  private javax.swing.JLabel usernameLabel;
  // End of variables declaration//GEN-END:variables
}