package inserir.excluir.linhas.ui;

import inserir.excluir.linhas.model.Contato;
import inserir.excluir.linhas.model.ContatoTableModel;
import javax.swing.JOptionPane;

public class JCadastro extends javax.swing.JFrame {

    private final ContatoTableModel modelo = new ContatoTableModel();

    public JCadastro() {
        initComponents();
        setTitle("Cadastro de contatos");
        setLocationRelativeTo(null);
        jtb1.setModel(modelo);
        jtb1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtb1.setAutoCreateRowSorter(true);
        jBrem.addActionListener(evt -> removerContato());
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtend = new javax.swing.JTextField();
        jttel = new javax.swing.JTextField();
        jBadc = new javax.swing.JButton();
        jBrem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome :");

        jLabel2.setText("Endereço :");

        jLabel3.setText("Telefone :");

        jBadc.setText("Adicionar");
        jBadc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadcActionPerformed(evt);
            }
        });

        jBrem.setText("Remover");

        jtb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jtb1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jttel, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtnome)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBadc)
                                .addGap(47, 47, 47)
                                .addComponent(jBrem))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtend, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBadc)
                        .addComponent(jBrem)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBadcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadcActionPerformed
        String nome = jtnome.getText().trim();
        String end = jtend.getText().trim();
        String tel = jttel.getText();
        
        if (nome.isEmpty() || end.isEmpty() || tel.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Preencha nome, endereço e telefone.",
                    "Dados incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        modelo.adicionar(new Contato(nome, end, tel.trim()));
        jtnome.setText("");
        jtend.setText("");
        jttel.setText("");
        
        jtnome.requestFocus();
    }//GEN-LAST:event_jBadcActionPerformed
    private void removerContato() {
        int linhaSelecionada = jtb1.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um contato para remover.",
                    "Nenhum contato selecionado", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        modelo.remover(jtb1.convertRowIndexToModel(linhaSelecionada));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadc;
    private javax.swing.JButton jBrem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb1;
    private javax.swing.JTextField jtend;
    private javax.swing.JTextField jtnome;
    private javax.swing.JTextField jttel;
    // End of variables declaration//GEN-END:variables
}
