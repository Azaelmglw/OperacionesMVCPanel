/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Azael_Mendoza
 */
public class ViewOperaciones extends javax.swing.JPanel {

    /**
     * Creates new form ViewOperaciones
     */
    public ViewOperaciones() {
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

        jlb_numero_1 = new javax.swing.JLabel();
        jlb_numero_2 = new javax.swing.JLabel();
        jlb_resultado = new javax.swing.JLabel();
        jbtn_sumar = new javax.swing.JButton();
        jbtn_restar = new javax.swing.JButton();
        jbtn_multiplicar = new javax.swing.JButton();
        jbtn_dividir = new javax.swing.JButton();
        jtf_numero_1 = new javax.swing.JTextField();
        jtf_numero_2 = new javax.swing.JTextField();

        jlb_numero_1.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_numero_1.setText("Numero 1:");

        jlb_numero_2.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_numero_2.setText("Numero 2:");

        jlb_resultado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_resultado.setText("...");

        jbtn_sumar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 18)); // NOI18N
        jbtn_sumar.setText("+");

        jbtn_restar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 18)); // NOI18N
        jbtn_restar.setText("-");

        jbtn_multiplicar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 18)); // NOI18N
        jbtn_multiplicar.setText("x");

        jbtn_dividir.setFont(new java.awt.Font("PakType Naskh Basic", 1, 18)); // NOI18N
        jbtn_dividir.setText("/");

        jtf_numero_1.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N

        jtf_numero_2.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_numero_1)
                                    .addComponent(jlb_numero_2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jbtn_sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_restar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_numero_1)
                    .addComponent(jtf_numero_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_numero_2)
                    .addComponent(jtf_numero_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn_restar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jlb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_dividir;
    public javax.swing.JButton jbtn_multiplicar;
    public javax.swing.JButton jbtn_restar;
    public javax.swing.JButton jbtn_sumar;
    public javax.swing.JLabel jlb_numero_1;
    public javax.swing.JLabel jlb_numero_2;
    public javax.swing.JLabel jlb_resultado;
    public javax.swing.JTextField jtf_numero_1;
    public javax.swing.JTextField jtf_numero_2;
    // End of variables declaration//GEN-END:variables
}
