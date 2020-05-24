/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import claseConectar.conectar;
/**
 *
 * @author Lester Monterroso
 */
public class GenerarReportes {
     
    public void reportecliente(){
    Connection conect4 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           conect4 = DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","");
        } catch (Exception e) {
        }
        claseConectar.conectar conectar = new claseConectar.conectar();
      
        try {
           //JasperReports reporte = (JasperReports) JRLoader.loadObject("reportesFacturas.jasper");
          // JasperPrint print = JasperFillManager.fillReport(reporte, null,conectar.conexion());
          // JasperViewer vv = new JasperViewer(print,false);
          // vv.setTitle("ReporteCliente");
           //vv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al mostrar el reporte"+e);
        }
    
    }
    
    
    
}
