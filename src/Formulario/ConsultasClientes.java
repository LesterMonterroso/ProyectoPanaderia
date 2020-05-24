
package Formulario;

import claseConectar.conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ConsultasClientes extends javax.swing.JInternalFrame {
 
    public ConsultasClientes() {
        initComponents();
        txtpi.setEnabled(false);
        Cargarlistaclientes();
    }
    void Cargarlistaclientes()          
    {
        DefaultTableModel modelo= new DefaultTableModel();
        String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","DPI","TELEFONO","NIT","EMAIL","DIRECCION"};
        modelo.setColumnIdentifiers(Titulos);
         this.tbclientes.setModel(modelo);
        try {
            
            String ConsultaSQL="SELECT * FROM cliente";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
              registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("ape_cli");  
                registros[3]=rs.getString("sexo_cli");
                registros[4]=rs.getString("dpi_cli");
                registros[5]=rs.getString("tel_cli");
                registros[6]=rs.getString("nit_cli");
                registros[7]=rs.getString("email_cli");
                registros[8]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rdgenero = new javax.swing.JRadioButton();
        rddpi = new javax.swing.JRadioButton();
        rdtodo = new javax.swing.JRadioButton();
        cbogenero = new javax.swing.JComboBox();
        txtpi = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 153, 153));
        setBorder(null);
        setClosable(true);
        setTitle("CONSULTA DE CLIENTES");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rdgenero.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdgenero);
        rdgenero.setSelected(true);
        rdgenero.setText("Mostrar Clientes por Genero:");
        rdgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdgeneroActionPerformed(evt);
            }
        });

        rddpi.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rddpi);
        rddpi.setText("Buscar Clientes por DPI:");
        rddpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddpiActionPerformed(evt);
            }
        });

        rdtodo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdtodo);
        rdtodo.setText("Mostrar todos los clientes");
        rdtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtodoActionPerformed(evt);
            }
        });

        cbogenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "M", "F" }));

        txtpi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdgenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdtodo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rddpi)
                        .addGap(24, 24, 24)
                        .addComponent(txtpi, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(btnbuscar)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdgenero)
                            .addComponent(cbogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rddpi)
                            .addComponent(txtpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdtodo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbclientes);

        jLabel1.setText("Cantidad de Registros");

        txtcant.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rdgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdgeneroActionPerformed
// TODO add your handling code here:
    if(rdgenero.isSelected()==true)
    {
        
        cbogenero.setSelectedItem(0);
        cbogenero.setEnabled(true);
        txtpi.setEnabled(false);
        txtpi.setText("");
    }
}//GEN-LAST:event_rdgeneroActionPerformed

private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
// TODO add your handling code here:
   String sexo= cbogenero.getSelectedItem().toString();
   String dni=txtpi.getText();
   
   if(rdgenero.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","DPI","TELEFONO","NIT","EMAIL","DIRECCION"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE sexo_cli='"+sexo+"'";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("ape_cli");  
                registros[3]=rs.getString("sexo_cli");
                registros[4]=rs.getString("dpi_cli");
                registros[5]=rs.getString("tel_cli");
                registros[6]=rs.getString("nit_cli");
                registros[7]=rs.getString("email_cli");
                registros[8]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   if(rddpi.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"CODIGO","NOMBRES","APELLIDOS","SEXO","DNI","TELEFONO","RUC","EMAIL","DIRECCION"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE dpi_cli='"+dni+"'";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
              registros[0]=rs.getString("cod_cli");
                registros[1]=rs.getString("nom_cli");
                registros[2]=rs.getString("ape_cli");  
                registros[3]=rs.getString("sexo_cli");
                registros[4]=rs.getString("dpi_cli");
                registros[5]=rs.getString("tel_cli");
                registros[6]=rs.getString("nit_cli");
                registros[7]=rs.getString("email_cli");
                registros[8]=rs.getString("dir_cli");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtcant.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
   if(rdtodo.isSelected()==true)
   {
       Cargarlistaclientes();
   }
   
}//GEN-LAST:event_btnbuscarActionPerformed

private void rddpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddpiActionPerformed
// TODO add your handling code here:
    if(rddpi.isSelected()==true)
    {
        cbogenero.setSelectedIndex(0);
        cbogenero.setEnabled(false);
        txtpi.setEnabled(true);
        txtpi.requestFocus();
    }
}//GEN-LAST:event_rddpiActionPerformed

private void rdtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtodoActionPerformed
// TODO add your handling code here:
    Cargarlistaclientes();
    txtpi.setText("");
    txtpi.setEnabled(false);
}//GEN-LAST:event_rdtodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbogenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rddpi;
    private javax.swing.JRadioButton rdgenero;
    private javax.swing.JRadioButton rdtodo;
    private javax.swing.JTable tbclientes;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtpi;
    // End of variables declaration//GEN-END:variables
conectar cc= new conectar();
Connection cn = cc.conexion();


}
