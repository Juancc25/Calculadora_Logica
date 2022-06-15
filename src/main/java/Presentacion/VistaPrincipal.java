package Presentacion;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaPrincipal extends javax.swing.JFrame {

    private final Modelo modelo;
    private Controlador control;
    
    public VistaPrincipal(Modelo m) {
        modelo = m;
        initComponents();
        asignarEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        CajaExpresion = new javax.swing.JTextField();
        BotonLimpiar = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonP = new javax.swing.JButton();
        BotonS = new javax.swing.JButton();
        BotonQ = new javax.swing.JButton();
        BotonR = new javax.swing.JButton();
        BotonNegacion = new javax.swing.JButton();
        BotonConjuncion = new javax.swing.JButton();
        BotonDisyuncion = new javax.swing.JButton();
        BotonCondicional = new javax.swing.JButton();
        BotonBicondicional = new javax.swing.JButton();
        BotonAbrirParent = new javax.swing.JButton();
        BotonAfirmacion = new javax.swing.JButton();
        BotonCerrarParent = new javax.swing.JButton();
        BotonMovDer = new javax.swing.JButton();
        BotonMovIzq = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Lógica");
        setBounds(new java.awt.Rectangle(100, 100, 343, 429));
        setResizable(false);
        setSize(new java.awt.Dimension(343, 429));
        getContentPane().setLayout(new java.awt.CardLayout());

        panelPrincipal.setBackground(new java.awt.Color(102, 102, 102));

        BotonLimpiar.setBackground(new java.awt.Color(153, 163, 164));
        BotonLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(203, 67, 53));
        BotonLimpiar.setText("AC");

        BotonIgual.setBackground(new java.awt.Color(153, 163, 164));
        BotonIgual.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonIgual.setForeground(new java.awt.Color(30, 132, 73));
        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });

        BotonP.setBackground(new java.awt.Color(153, 163, 164));
        BotonP.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonP.setForeground(new java.awt.Color(33, 97, 140));
        BotonP.setText("P");

        BotonS.setBackground(new java.awt.Color(153, 163, 164));
        BotonS.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonS.setForeground(new java.awt.Color(33, 97, 140));
        BotonS.setText("S");

        BotonQ.setBackground(new java.awt.Color(153, 163, 164));
        BotonQ.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonQ.setForeground(new java.awt.Color(33, 97, 140));
        BotonQ.setText("Q");

        BotonR.setBackground(new java.awt.Color(153, 163, 164));
        BotonR.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonR.setForeground(new java.awt.Color(33, 97, 140));
        BotonR.setText("R");

        BotonNegacion.setBackground(new java.awt.Color(153, 163, 164));
        BotonNegacion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonNegacion.setForeground(new java.awt.Color(108, 52, 131));
        BotonNegacion.setText("~");

        BotonConjuncion.setBackground(new java.awt.Color(153, 163, 164));
        BotonConjuncion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonConjuncion.setForeground(new java.awt.Color(108, 52, 131));
        BotonConjuncion.setText("^");

        BotonDisyuncion.setBackground(new java.awt.Color(153, 163, 164));
        BotonDisyuncion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonDisyuncion.setForeground(new java.awt.Color(108, 52, 131));
        BotonDisyuncion.setText("v");

        BotonCondicional.setBackground(new java.awt.Color(153, 163, 164));
        BotonCondicional.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonCondicional.setForeground(new java.awt.Color(108, 52, 131));
        BotonCondicional.setText("→");

        BotonBicondicional.setBackground(new java.awt.Color(153, 163, 164));
        BotonBicondicional.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonBicondicional.setForeground(new java.awt.Color(108, 52, 131));
        BotonBicondicional.setText("↔");

        BotonAbrirParent.setBackground(new java.awt.Color(153, 163, 164));
        BotonAbrirParent.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonAbrirParent.setForeground(new java.awt.Color(108, 52, 131));
        BotonAbrirParent.setText("(");

        BotonAfirmacion.setBackground(new java.awt.Color(153, 163, 164));
        BotonAfirmacion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonAfirmacion.setForeground(new java.awt.Color(108, 52, 131));
        BotonAfirmacion.setText("+");

        BotonCerrarParent.setBackground(new java.awt.Color(153, 163, 164));
        BotonCerrarParent.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotonCerrarParent.setForeground(new java.awt.Color(108, 52, 131));
        BotonCerrarParent.setText(")");

        BotonMovDer.setBackground(new java.awt.Color(153, 163, 164));
        BotonMovDer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonMovDer.setForeground(new java.awt.Color(33, 47, 61));
        BotonMovDer.setText("Derecha");

        BotonMovIzq.setBackground(new java.awt.Color(153, 163, 164));
        BotonMovIzq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonMovIzq.setForeground(new java.awt.Color(33, 47, 61));
        BotonMovIzq.setText("Izquierda");

        BotonBorrar.setBackground(new java.awt.Color(153, 163, 164));
        BotonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(203, 67, 53));
        BotonBorrar.setText("DEL");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(BotonMovIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonMovDer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CajaExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                    .addComponent(BotonR, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BotonS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BotonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(BotonNegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonConjuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonDisyuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonCondicional, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(BotonBicondicional, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAbrirParent, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonCerrarParent, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(CajaExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConjuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDisyuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCondicional, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBicondicional, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAbrirParent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCerrarParent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMovDer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMovIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        getContentPane().add(panelPrincipal, "Principal");

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        getContentPane().add(panelTabla, "panelTabla");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonIgualActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbrirParent;
    private javax.swing.JButton BotonAfirmacion;
    private javax.swing.JButton BotonBicondicional;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonCerrarParent;
    private javax.swing.JButton BotonCondicional;
    private javax.swing.JButton BotonConjuncion;
    private javax.swing.JButton BotonDisyuncion;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMovDer;
    private javax.swing.JButton BotonMovIzq;
    private javax.swing.JButton BotonNegacion;
    private javax.swing.JButton BotonP;
    private javax.swing.JButton BotonQ;
    private javax.swing.JButton BotonR;
    private javax.swing.JButton BotonS;
    private javax.swing.JTextField CajaExpresion;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTabla;
    // End of variables declaration//GEN-END:variables

    public Modelo getModelo(){
        return modelo;
    }
    
    public Controlador getControl(){
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    public JButton getBotonAbrirParent() {
        return BotonAbrirParent;
    }

    public JButton getBotonAfirmacion() {
        return BotonAfirmacion;
    }

    public JButton getBotonBicondicional() {
        return BotonBicondicional;
    }

    public JButton getBotonBorrar() {
        return BotonBorrar;
    }

    public JButton getBotonCerrarParent() {
        return BotonCerrarParent;
    }

    public JButton getBotonCondicional() {
        return BotonCondicional;
    }

    public JButton getBotonConjuncion() {
        return BotonConjuncion;
    }

    public JButton getBotonDisyuncion() {
        return BotonDisyuncion;
    }

    public JButton getBotonIgual() {
        return BotonIgual;
    }

    public JButton getBotonLimpiar() {
        return BotonLimpiar;
    }

    public JButton getBotonMovDer() {
        return BotonMovDer;
    }

    public JButton getBotonMovIzq() {
        return BotonMovIzq;
    }

    public JButton getBotonNegacion() {
        return BotonNegacion;
    }

    public JButton getBotonP() {
        return BotonP;
    }

    public JButton getBotonQ() {
        return BotonQ;
    }

    public JButton getBotonR() {
        return BotonR;
    }

    public JButton getBotonS() {
        return BotonS;
    }

    public JTextField getCajaExpresion() {
        return CajaExpresion;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public JPanel getPanelTabla() {
        return panelTabla;
    }
    
    private void asignarEventos(){
        BotonIgual.addActionListener(getControl());
    }
    
}


