import java.awt.Color;
import java.awt.Dimension;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Danilo_Oliveira
 */
public class TelaIni extends javax.swing.JFrame {

    
    
//    ChatUI chat = new ChatUI();

    /**
     * Creates new form Tela
     */
    public TelaIni() {
        initComponents();
        tx.setBackground(new Color(42,52,56));
        jPanelArea.setBackground(new Color(42,52,56));
        tf.setVisible(false);
        lbARQ.setVisible(false);
        btEnviar.setVisible(false);
        
        
       
      //  jPanel1.setSize(180, 474);
      
      
        
       

    }
//     public Tela(String nome) {
//        initComponents();
//        this.nome = nome;    
//      
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst = new javax.swing.JList<>();
        jpanelPerfil = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbPerfil = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btConversar = new javax.swing.JButton();
        tf = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        lbARQ = new javax.swing.JLabel();
        jPanelArea = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tx = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Perfil = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(42, 52, 56));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jScrollPane2.setOpaque(false);

        lst.setBackground(new java.awt.Color(42, 52, 56));
        lst.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lst.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        lst.setForeground(new java.awt.Color(242, 238, 238));
        lst.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nome1", "Nome2", "Nome3", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lst);

        jpanelPerfil.setBackground(new java.awt.Color(29, 31, 43));

        lbIcon.setForeground(new java.awt.Color(254, 254, 254));
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userP.png"))); // NOI18N

        lbPerfil.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        lbPerfil.setForeground(new java.awt.Color(254, 254, 254));
        lbPerfil.setText("Welcome to chat");

        lbNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(254, 254, 254));
        lbNome.setText("NOME");

        javax.swing.GroupLayout jpanelPerfilLayout = new javax.swing.GroupLayout(jpanelPerfil);
        jpanelPerfil.setLayout(jpanelPerfilLayout);
        jpanelPerfilLayout.setHorizontalGroup(
            jpanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelPerfilLayout.createSequentialGroup()
                        .addComponent(lbIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNome))
                    .addComponent(lbPerfil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelPerfilLayout.setVerticalGroup(
            jpanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelPerfilLayout.createSequentialGroup()
                .addGroup(jpanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelPerfilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelPerfilLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNome)
                        .addGap(18, 18, 18)))
                .addComponent(lbPerfil)
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N

        btConversar.setText("Conversar");
        btConversar.setToolTipText("Conversa Grupal");
        btConversar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConversarActionPerformed(evt);
            }
        });

        btEnviar.setText("enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        lbARQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anexo.png"))); // NOI18N
        lbARQ.setToolTipText("Enviar Anexo");

        jScrollPane3.setBackground(new java.awt.Color(129, 184, 211));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 184, 211)));
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setOpaque(false);

        tx.setEditable(false);
        tx.setBackground(new java.awt.Color(129, 184, 211));
        tx.setColumns(20);
        tx.setRows(5);
        tx.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tx.setDisabledTextColor(new java.awt.Color(129, 184, 211));
        tx.setOpaque(false);
        jScrollPane3.setViewportView(tx);

        javax.swing.GroupLayout jPanelAreaLayout = new javax.swing.GroupLayout(jPanelArea);
        jPanelArea.setLayout(jPanelAreaLayout);
        jPanelAreaLayout.setHorizontalGroup(
            jPanelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAreaLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3)
                .addGap(3, 3, 3))
        );
        jPanelAreaLayout.setVerticalGroup(
            jPanelAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAreaLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btConversar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tf, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbARQ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanelArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(jPanelArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnviar)
                    .addComponent(lbARQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConversar))
                .addGap(23, 23, 23))
        );

        Perfil.setText("Perfil");
        Perfil.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jMenuItem3.setText("Editar perfil");
        Perfil.add(jMenuItem3);

        jMenuBar1.add(Perfil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConversarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConversarActionPerformed
        // TODO add your handling code here:
        if (btConversar.getText().equalsIgnoreCase("Conversar")) {
            btConversar.setText("voltar");
            tx.setBackground(Color.WHITE);
            jPanelArea.setBackground(new Color(200, 200, 200));
            tx.setForeground(Color.BLACK);
            tf.setVisible(true);
            btEnviar.setVisible(true);
            lbARQ.setVisible(true);
            //lst.setForeground(new Color(129, 184, 211));            
//            Tela t = new Tela(lbNome.getText());
//            t.show();

        }
        
        else {
            tx.setBackground(new Color(42,52,56));
            tx.setForeground(new Color(42,52,56));
            jpanelPerfil.setBackground(new Color(29,31,43));
            btConversar.setText("Conversar");
            jPanelArea.setBackground(new Color(42,52,56));
            tf.setVisible(false);
            btEnviar.setVisible(false);
            lst.setForeground(new Color(254, 254, 254)); 
            lbARQ.setVisible(false);
            
        }
        //this.dispose();
    }//GEN-LAST:event_btConversarActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        
        String texto = tf.getText();
        if (!texto.isEmpty()) {            
            if(lst.getSelectedValue()!=null){
                sendText(lst.getSelectedValue());
                System.out.println("vou mandar para "+lst.getSelectedValue());
            }
            else{
                sendText();
            }
         
          
        }
    }//GEN-LAST:event_btEnviarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        jPanelArea.setBackground(new Color(42,52,56));
        btConversar.setText("Conversar");
        lst.clearSelection();
        tx.setBackground(new Color(42,52,56));
        tx.setForeground(new Color(42,52,56));
        tf.setVisible(false);
        lbARQ.setVisible(false);
        btEnviar.setVisible(false);
       // lst.setForeground(new Color(254, 254, 254)); 
        //lst.setOpaque(true);
        lbNome.setText(nomeOrigin);
        jpanelPerfil.setBackground(new Color(29,31,43));
        
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void lstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMouseClicked
        // TODO add your handling code here:
        
       // if(!lst.getSelect
        if(!lst.getSelectedValue().isEmpty()){
            
            lbNome.setText(lst.getSelectedValue());
            jpanelPerfil.setBackground(new Color(57,51,129));
            
            tx.setBackground(Color.WHITE);
            jPanelArea.setBackground(new Color(200, 200, 200));
            tx.setForeground(new Color(0, 0, 0));
            tf.setVisible(true);
            lbARQ.setVisible(true);
            btEnviar.setVisible(true);
            btConversar.setText("voltar");
            //lst.setForeground(new Color(129, 184, 211)); 
            //lst.setOpaque(false);
//            TelaConversa conversar = new TelaConversa(lst.getSelectedValue(),nomeOrigin);
//            conversar.show();
//            this.enable(false);
        }
       
    }//GEN-LAST:event_lstMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    JFrame frame;
    private ChatClient client;
    private ChatServerInt server;
    private String nomeTelaLogin;
    private  boolean conectado = false;
    
    

//    public boolean doConnect(String nome) {
//        nomeTelaLogin = nome;
//        //int listaClientes;
////        try {
//        //FDP TA COMENTADO PQ TA RENORNADO NULO
//        // List<ChatClientInt> clientes =  (List<ChatClientInt>) server.getConnected();
//        //Percorre a lista de clientes 
////            if(clientes.size()>0){
////                listaClientes = server.getConnected().size();
////                for (int i = 0; i < listaClientes; i++) {
////                    //verifica se o novo cliente tem o mesmo nome
////                    if (clientes.get(i).getName().equals(nome)) {
////                        //se houver um clinete com o mesmo nome informa a msg 
////                        JOptionPane.showMessageDialog(null, "Já exite um Cliente com esse nome");
////                        break;
////                    } 
////                 }
////            }
////                //senao houver clinte com o mesmo nome
////                else {
//        //verifica se cliente ta conectado
//        if (conectado == false) {
//            //se nao tiver conectado
//            try {
//                client = new ChatClient(nome);
//                //client.setGUI(this);
//                // server=(ChatServerInt)Naming.lookup("rmi://"+ip.getText()+"/myabc");
//                server = (ChatServerInt) Naming.lookup("rmi://localhost/myabc");
//                server.login(client);
//                updateUsers(server.getConnected());
//                conectado = true;
//                lbNome.setText(nome);
//            } catch (Exception e) {
//                e.printStackTrace();
//                JOptionPane.showMessageDialog(frame, "ERROR, we wouldn't connect....");
//            }
//        } //senao se cliente ja tiver conectado
//        else {
//            updateUsers(null);
//            conectado = false;
//        }
////                }
////
//////            }
////        catch (RemoteException ex) {
////            System.err.println("Erro ao conectar"+ex.getMessage());
////        }
//
//        return conectado;
//    }
    public String nomeOrigin;
    public boolean doConnect(String nome) {
        this.nomeOrigin = nome;
        Perfil.setText(nomeOrigin);
        if (isConectado()==false) {
            try {
//                TelaConversa tc = new TelaConversa();
//                conectado = tc.doConnect(nome);
                client = new ChatClient(nome);
                client.setGUI(this);
//    		server=(ChatServerInt)Naming.lookup("rmi://"+ip.getText()+"/myabc");
                server =(ChatServerInt) Naming.lookup("rmi://localhost/myabc");
                server.login(client);
               
               // updateUsers(server.getConnected());
                
//                List<ChatClientInt> listCLIente = getServer().getConnected();
//                for (int i =0; i<listCLIente.size();i++) {
//                    ChatClientInt tmp = (ChatClientInt) listCLIente.get(i);
//                    updateUsers(getServer().getConnected());
//                }
                
                
                int tam = getServer().getConnected().size();
                List<ChatClientInt> listCLIente = null;
                System.out.println("HAAAAAAAA "+tam);
                if(tam>1){
                   
                    listCLIente = getServer().getConnected();
                    int c=0;
                    for (int i =0; i<listCLIente.size();i++) {
                        
                        //ChatClientInt tmp = (ChatClientInt) listCLIente.get(i);
                        updateUsers(getServer().getConnected());
                        
                        if(listCLIente.get(i).getName().equals(client.getName())){
                           
                            System.out.println("Nomes iguais");
                            c++;
                            if(c>1){
                                c++;
                                System.out.println("OPA IGUAL"+c);
                                JOptionPane.showMessageDialog(null, "Cliente já exite com esse nick");
                                server.sair(client);
                                return false;
                            }

                        }
                    }
                   
                }
                else if(tam==1){
                    updateUsers(getServer().getConnected());

                }
                
                
                setConectado(true);
                //tc.getConectado(client, server, conectado);
                System.out.println("[TelaIni]: Clinte Conectou");
                lbNome.setText(nome);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(frame, "ERROR, we wouldn't connect....");
            }
        } 
        else {
            updateUsers(null);
            setConectado(false);
        }
//        TelaConversa tela = new TelaConversa();
//        tela.doConnect(nome);
        return isConectado();
    }
    public void sendText() {
        if (isConectado()==false) {
            JOptionPane.showMessageDialog(frame, "You need to connect first.");           
        }
        String st = tf.getText();
        st = "[" + lbNome.getText()+ "] " + st;
        tf.setText("");
        //Remove if you are going to implement for remote invocation
        try {
            getServer().publish(st);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void sendText(String nome) {        
        if (isConectado()==false) {
            JOptionPane.showMessageDialog(frame, "conecte-se primeiro");           
        }
        String st = tf.getText();
        st = "[" + lbNome.getText()+ "] " + st;
        tf.setText("");
        //Remove if you are going to implement for remote invocation
        try {
            server.publish(nome,st,client);
        } catch (Exception e) {
            System.out.println("Erro ao enviar mensagem "+ e.getMessage());
        }
    }

    public void writeMsg(String st) {
        if (!tx.getText().isEmpty()){
            tx.setBackground(Color.WHITE);
            jPanelArea.setBackground(new Color(240,240,240));
            tx.setForeground(new Color(0, 0, 0));
            tx.setText(tx.getText() + "\n" + st);
        }
        else{
             tx.setText(st);
        }
        
        System.out.println("JOGUEI NO txArea");
    }

    public void updateUsers(List<ChatClientInt> v) {
        DefaultListModel listModel = new DefaultListModel();
        //lst= new JList<>();
        if (v != null) {
            for (int i = 0; i < v.size(); i++) {
                try {
                    String nome = ((ChatClientInt) v.get(i)).getName();
                   
                    if(!client.getName().equals(nome)){
                        listModel.addElement(nome);
                    }
                        
                    
                } catch (Exception e) {
                    e.printStackTrace();
                } 
                lst.setModel(listModel);
            }
        }
        else
            lst.setModel(listModel);
       
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Perfil;
    private javax.swing.JButton btConversar;
    private javax.swing.JButton btEnviar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelArea;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpanelPerfil;
    private javax.swing.JLabel lbARQ;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPerfil;
    private javax.swing.JList<String> lst;
    private javax.swing.JTextField tf;
    private javax.swing.JTextArea tx;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the server
     */
    public ChatServerInt getServer() {
        return server;
    }

    /**
     * @param server the server to set
     */
    public void setServer(ChatServerInt server) {
        this.server = server;
    }

    /**
     * @return the conectado
     */
    public boolean isConectado() {
        return conectado;
    }

    /**
     * @param conectado the conectado to set
     */
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
}
