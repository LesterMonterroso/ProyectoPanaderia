
package Formulario;

import claseConectar.conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import Animacion.Animacion;
import Reportes.GenerarReportes;

import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.base.JRBaseStaticText;
import net.sf.jasperreports.engine.base.JRBaseParagraph;
import net.sf.jasperreports.engine.JRParagraphContainer;


public class ventanaadmin extends javax.swing.JFrame {

    /** Creates new form Principal */
    public ventanaadmin() {
     
      this.setExtendedState(MAXIMIZED_BOTH);
      this.setVisible(true);
        
        initComponents();
       this.setIconImage( new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpescritorio = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblusu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        CBOReportes = new javax.swing.JComboBox();
        jpmenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblcusuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblfacturar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblmproductos = new javax.swing.JLabel();
        lblmclientes = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblcproducto = new javax.swing.JLabel();
        lblfactura = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jpeventos = new javax.swing.JDesktopPane() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(java.awt.Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas");
        setMinimumSize(size());
        setName("JFrame1"); // NOI18N
        setSize(new java.awt.Dimension(0, 0));

        jdpescritorio.setBackground(new java.awt.Color(255, 255, 255));
        jdpescritorio.setMinimumSize(size());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setAlignmentX(0.0F);

        lblusu.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Usuario Conectado:");

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bar-menu_icon-icons.com_70305 (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        CBOReportes.setBackground(new java.awt.Color(0, 102, 102));
        CBOReportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CBOReportes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reportes", "Reporte Clientes", "Reporte Productos", "Reporte Ventas", "Ventas Por Cliente" }));
        CBOReportes.setToolTipText("");
        CBOReportes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        CBOReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBOReportesMouseClicked(evt);
            }
        });
        CBOReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CBOReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1319, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblusu)
                .addGap(329, 329, 329))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusu, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBOReportes)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jpmenu.setBackground(java.awt.Color.lightGray);
        jpmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Ventas");
        jpmenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 230, 60));

        lblcusuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblcusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/person_icon-icons.com_50075.png"))); // NOI18N
        lblcusuario.setText("    Clientes");
        lblcusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcusuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcusuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcusuarioMouseExited(evt);
            }
        });
        jpmenu.add(lblcusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 270, 50));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Administrador");
        jpmenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 60));

        lblfacturar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblfacturar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sale_4396.png"))); // NOI18N
        lblfacturar.setText("Realizar Venta");
        lblfacturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfacturarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfacturarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblfacturarMouseExited(evt);
            }
        });
        jpmenu.add(lblfacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 270, 50));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Mantenimiento");
        jpmenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 60));

        lblmproductos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblmproductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productapplication_producto_3010.png"))); // NOI18N
        lblmproductos.setText("Productos");
        lblmproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblmproductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblmproductosMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmproductosMouseClicked(evt);
            }
        });
        jpmenu.add(lblmproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 270, 50));

        lblmclientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblmclientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_84308.png"))); // NOI18N
        lblmclientes.setText("    Clientes");
        lblmclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmclientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblmclientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblmclientesMouseExited(evt);
            }
        });
        jpmenu.add(lblmclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 50));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Consultas");
        jpmenu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 60));

        lblcproducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblcproducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bread_food_3206.png"))); // NOI18N
        lblcproducto.setText("    Productos");
        lblcproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcproductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcproductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcproductoMouseExited(evt);
            }
        });
        jpmenu.add(lblcproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, 50));

        lblfactura.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblfactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/invoice_icon_128337.png"))); // NOI18N
        lblfactura.setText("    Ventas");
        lblfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfacturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblfacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblfacturaMouseExited(evt);
            }
        });
        jpmenu.add(lblfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 270, 50));

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group-profile-users_icon-icons.com_73540.png"))); // NOI18N
        lbluser.setText("Usuarios");
        lbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbluserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbluserMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbluserMouseClicked(evt);
            }
        });
        jpmenu.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 50));

        jpeventos.setBackground(new java.awt.Color(255, 255, 255));
        jpeventos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jpeventosLayout = new javax.swing.GroupLayout(jpeventos);
        jpeventos.setLayout(jpeventosLayout);
        jpeventosLayout.setHorizontalGroup(
            jpeventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1745, Short.MAX_VALUE)
        );
        jpeventosLayout.setVerticalGroup(
            jpeventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jdpescritorioLayout = new javax.swing.GroupLayout(jdpescritorio);
        jdpescritorio.setLayout(jdpescritorioLayout);
        jdpescritorioLayout.setHorizontalGroup(
            jdpescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jdpescritorioLayout.createSequentialGroup()
                .addComponent(jpmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpeventos))
        );
        jdpescritorioLayout.setVerticalGroup(
            jdpescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpescritorioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdpescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpmenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                    .addComponent(jpeventos)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpescritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblcusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcusuarioMouseClicked
ConsultasClientes clientes= new ConsultasClientes();
    jpeventos.add(clientes);
    clientes.show();  
    // TODO add your handling code here:
    }//GEN-LAST:event_lblcusuarioMouseClicked

    private void lblfacturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfacturarMouseClicked
Factura fac= new Factura();
    jpeventos.add(fac);
    fac.show();        // TODO add your handling code here:
    }//GEN-LAST:event_lblfacturarMouseClicked

    private void lblmproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmproductosMouseClicked
 IngresoProductos ip= new IngresoProductos();
    jpeventos.add(ip);
    ip.show();        // TODO add your handling code here:
    }//GEN-LAST:event_lblmproductosMouseClicked

    private void lblmclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmclientesMouseClicked
// TODO add your handling code here:
    IngresoCliente cli= new IngresoCliente();
    jpeventos.add(cli);
    cli.show();        // TODO add your handling code here:
    }//GEN-LAST:event_lblmclientesMouseClicked

    private void lblcproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcproductoMouseClicked
ConsultasProductos productos= new ConsultasProductos();
    jpeventos.add(productos);
    productos.show();        // TODO add your handling code here:
    }//GEN-LAST:event_lblcproductoMouseClicked

    private void lblmproductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmproductosMouseExited
     this.lblmproductos.setOpaque(true);
lblmproductos.setBackground(java.awt.Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_lblmproductosMouseExited

    private void lblmclientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmclientesMouseExited
     this.lblmclientes.setOpaque(true);
lblmclientes.setBackground(java.awt.Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_lblmclientesMouseExited

    private void lblcproductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcproductoMouseExited
     this.lblcproducto.setOpaque(true);
lblcproducto.setBackground(java.awt.Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_lblcproductoMouseExited

    private void lblcusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcusuarioMouseExited
     this.lblcusuario.setOpaque(true);
lblcusuario.setBackground(java.awt.Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_lblcusuarioMouseExited

    private void lblfacturarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfacturarMouseExited
     this.lblfacturar.setOpaque(true);
lblfacturar.setBackground(java.awt.Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_lblfacturarMouseExited

    private void lblmproductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmproductosMouseEntered
this.lblmproductos.setOpaque(true);
lblmproductos.setBackground(java.awt.Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_lblmproductosMouseEntered

    private void lblmclientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmclientesMouseEntered
this.lblmclientes.setOpaque(true);
lblmclientes.setBackground(java.awt.Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_lblmclientesMouseEntered

    private void lblcproductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcproductoMouseEntered
this.lblcproducto.setOpaque(true);
lblcproducto.setBackground(java.awt.Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_lblcproductoMouseEntered

    private void lblcusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcusuarioMouseEntered
this.lblcusuario.setOpaque(true);
lblcusuario.setBackground(java.awt.Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_lblcusuarioMouseEntered

    private void lblfacturarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfacturarMouseEntered
this.lblfacturar.setOpaque(true);
lblfacturar.setBackground(java.awt.Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_lblfacturarMouseEntered

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       int posicion = jpmenu.getX();
       if (posicion > -1 && jpmenu.isVisible()==true){
       Animacion.mover_izquierda(0, -300, 2, 2, jpmenu);
       jpmenu.setVisible(false);
       }else if (posicion > -1 && jpmenu.isVisible()==false){
        Animacion.mover_derecha(-300, 0, 2, 2, jpmenu);
        jpmenu.setVisible(true);
       }else {
        Animacion.mover_derecha(-300, 0, 2, 2, jpmenu);
        jpmenu.setVisible(true);
       }
    }//GEN-LAST:event_jButton2MouseClicked

    private void lblfacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfacturaMouseClicked
ConsultasFacturas factura= new ConsultasFacturas();
    jpeventos.add(factura);
    factura.show();         // TODO add your handling code here:
    }//GEN-LAST:event_lblfacturaMouseClicked

    private void lblfacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfacturaMouseEntered
this.lblfactura.setOpaque(true);
lblfactura.setBackground(java.awt.Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_lblfacturaMouseEntered

    private void lblfacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfacturaMouseExited
  this.lblfactura.setOpaque(true);
lblfactura.setBackground(java.awt.Color.lightGray);        // TODO add your handling code here:
    }//GEN-LAST:event_lblfacturaMouseExited

    private void CBOReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOReportesActionPerformed
String reporte = CBOReportes.getSelectedItem().toString();
if ((CBOReportes.getSelectedItem().toString()).equals("Reporte Clientes")){

try {
            claseConectar.conectar conexionr = new claseConectar.conectar();
        Connection cc = conexionr.conexion();
        
         JasperReport reporteCli = null;
            String path = "src/Reportes/ReporteClientes.jasper";
        reporteCli = (JasperReport) JRLoader.loadObjectFromFile(path);
        
        JasperPrint jprint = JasperFillManager.fillReport(reporteCli, null, cc);
        
         JasperViewer view = new JasperViewer(jprint, false);
         view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         view.setTitle("Reporte Clientes");
          view.setVisible(true);
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
}else if ((CBOReportes.getSelectedItem().toString()).equals("Reporte Productos")){
 try {
            claseConectar.conectar conexionr = new claseConectar.conectar();
        Connection cc = conexionr.conexion();
        
         JasperReport reportePro = null;
            String path = "src/Reportes/ReporteProducto.jasper";
        reportePro = (JasperReport) JRLoader.loadObjectFromFile(path);
        
        JasperPrint jprint = JasperFillManager.fillReport(reportePro, null, cc);
        
         JasperViewer view = new JasperViewer(jprint, false);
         view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         view.setTitle("Reporte Productos");
          view.setVisible(true);
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }


}else if ((CBOReportes.getSelectedItem().toString()).equals("Reporte Ventas")){
try {
            claseConectar.conectar conexionr = new claseConectar.conectar();
        Connection cc = conexionr.conexion();
        
         JasperReport reporteVen = null;
            String path = "src/Reportes/ReporteVentas.jasper";
        reporteVen = (JasperReport) JRLoader.loadObjectFromFile(path);
        
        JasperPrint jprint = JasperFillManager.fillReport(reporteVen, null, cc);
        
         JasperViewer view = new JasperViewer(jprint, false);
         view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         view.setTitle("Reporte Ventas");
          view.setVisible(true);
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }


}else if ((CBOReportes.getSelectedItem().toString()).equals("Ventas Por Cliente")){
try {
            claseConectar.conectar conexionr = new claseConectar.conectar();
        Connection cc = conexionr.conexion();
        
         JasperReport reporteVenCli = null;
            String path = "src/Reportes/ProductosCliente.jasper";
            Map parametros = new HashMap();
            String name = JOptionPane.showInputDialog("Ingrese el codigo Cliente");
            parametros.put("Cliente",name);
        reporteVenCli = (JasperReport) JRLoader.loadObjectFromFile(path);
        
        JasperPrint jprint = JasperFillManager.fillReport(reporteVenCli, parametros, cc);
        
         JasperViewer view = new JasperViewer(jprint, false);
         view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         view.setTitle("Reporte Ventas por Cliente");
          view.setVisible(true);
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }//Ventas Por Cliente


}
        

// TODO add your handling code here:
    }//GEN-LAST:event_CBOReportesActionPerformed

    private void CBOReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBOReportesMouseClicked
     

// TODO add your handling code here:
    }//GEN-LAST:event_CBOReportesMouseClicked

    private void lbluserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbluserMouseClicked
usuarios ipu= new usuarios();
    jpeventos.add(ipu);
    ipu.show();  
        
// TODO add your handling code here:
    }//GEN-LAST:event_lbluserMouseClicked

    private void lbluserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbluserMouseEntered
this.lbluser.setOpaque(true);
lbluser.setBackground(java.awt.Color.GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_lbluserMouseEntered

    private void lbluserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbluserMouseExited
 this.lbluser.setOpaque(true);
lbluser.setBackground(java.awt.Color.lightGray); 
        // TODO add your handling code here:
    }//GEN-LAST:event_lbluserMouseExited
Connection conect2 = null;
 public Connection conexions()
    {
      try {
             
           //Cargamos MySQL
           Class.forName("com.mysql.jdbc.Driver");
           conect2 = DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","");
           } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect2;
}
           
           
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
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ventanaadmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBOReportes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jdpescritorio;
    public static javax.swing.JDesktopPane jpeventos;
    private javax.swing.JPanel jpmenu;
    private javax.swing.JLabel lblcproducto;
    private javax.swing.JLabel lblcusuario;
    private javax.swing.JLabel lblfactura;
    private javax.swing.JLabel lblfacturar;
    private javax.swing.JLabel lblmclientes;
    private javax.swing.JLabel lblmproductos;
    private javax.swing.JLabel lbluser;
    public static javax.swing.JLabel lblusu;
    // End of variables declaration//GEN-END:variables
 


}
