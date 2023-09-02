
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Main extends javax.swing.JFrame {

    private int id = 0;
    

    public Main() {
        initComponents();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Ds_Marca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ds_modelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Ds_anio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Ds_venta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ds_Colorcarro = new javax.swing.JButton();
        Ds_GenerarVehiculo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Ds_Nombrevendedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Ds_DineroGenerado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Ds_Carrosvendidos = new javax.swing.JSpinner();
        Ds_GenerarVendedores = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Ds_Edadcliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Ds_Cantcarroscomprados = new javax.swing.JSpinner();
        Ds_NombreCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Ds_GenerarClientes = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Ds_Sueldodisp = new javax.swing.JTextField();
        Ds_Profesioncliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Ds_ListarClientes = new javax.swing.JComboBox<>();
        Ds_listarVendedores = new javax.swing.JComboBox<>();
        Ds_Listarvehiculos = new javax.swing.JComboBox<>();
        Ds_generarventa = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arbol2 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        Arbol = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ds_modificartexto = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        Ds_modificar = new javax.swing.JButton();
        Ds_Guardarmod = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Ds_Marca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ds_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ds_MarcaActionPerformed(evt);
            }
        });

        jLabel1.setText("Marca");

        jLabel2.setText("Seleccione un color");

        Ds_modelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setText("Modelo");

        Ds_anio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Anio");

        Ds_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setText("Precio de venta");

        jLabel6.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Agregar Vehiculos ");

        Ds_Colorcarro.setBackground(new java.awt.Color(255, 255, 255));
        Ds_Colorcarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ds_Colorcarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ds_ColorcarroMouseClicked(evt);
            }
        });

        Ds_GenerarVehiculo.setText("Generar");
        Ds_GenerarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ds_GenerarVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ds_GenerarVehiculoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ds_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ds_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ds_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Ds_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Ds_Colorcarro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGap(164, 164, 164))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(Ds_GenerarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ds_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ds_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ds_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ds_Colorcarro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ds_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(Ds_GenerarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        jTabbedPane1.addTab("Vehiculos", jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Agregar Vendedores ");

        Ds_Nombrevendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ds_NombrevendedorActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        jLabel9.setText("Cantidad de carros vendidos");

        jLabel10.setText("Cantidad de dinero generado");

        Ds_GenerarVendedores.setText("Generar");
        Ds_GenerarVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ds_GenerarVendedoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ds_Nombrevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ds_Carrosvendidos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ds_DineroGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(242, 242, 242)))
                .addGap(352, 352, 352))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(Ds_GenerarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_Nombrevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_Carrosvendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_DineroGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(Ds_GenerarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        jTabbedPane1.addTab("Vendedor", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Agregar Clientes");

        jLabel12.setText("Cantidad de carros comprados");

        jLabel13.setText("Edad");

        Ds_NombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ds_NombreClienteActionPerformed(evt);
            }
        });

        jLabel14.setText("Nombre");

        Ds_GenerarClientes.setText("Generar");
        Ds_GenerarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ds_GenerarClientesMouseClicked(evt);
            }
        });

        jLabel15.setText("Sueldo disponible");

        Ds_Profesioncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ds_ProfesionclienteActionPerformed(evt);
            }
        });

        jLabel17.setText("Profesion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Ds_Edadcliente)
                                    .addComponent(Ds_Cantcarroscomprados, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(Ds_NombreCliente)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ds_Profesioncliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ds_Sueldodisp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(Ds_GenerarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_Cantcarroscomprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_Edadcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_Profesioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_Sueldodisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Ds_GenerarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        Ds_generarventa.setText("Generar");
        Ds_generarventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ds_generarventaMouseClicked(evt);
            }
        });

        jLabel16.setText("Listzr vehiculos");

        jLabel18.setText("Listar Clientes");

        jLabel19.setText("Listar Vendedores");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ds_Listarvehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(Ds_ListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(Ds_listarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(Ds_generarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ds_listarVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_ListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ds_Listarvehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(Ds_generarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        jTabbedPane1.addTab("Venta", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jScrollPane1.setViewportView(Arbol2);

        jScrollPane2.setViewportView(Arbol);

        jButton1.setText("Crear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jtree", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        Ds_modificartexto.setColumns(20);
        Ds_modificartexto.setRows(5);
        jScrollPane3.setViewportView(Ds_modificartexto);

        jLabel20.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Modificar");

        Ds_modificar.setText("Abrir");
        Ds_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ds_modificarMouseClicked(evt);
            }
        });

        Ds_Guardarmod.setText("Guardar");
        Ds_Guardarmod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ds_GuardarmodMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 277, Short.MAX_VALUE)
                .addComponent(Ds_Guardarmod, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(Ds_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(372, 372, 372))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ds_modificar)
                    .addComponent(Ds_Guardarmod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ds_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ds_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ds_MarcaActionPerformed

    private void Ds_ColorcarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ds_ColorcarroMouseClicked
        Ds_Colorcarro.setBackground(
                JColorChooser.showDialog(
                        this, "Seleccione un color",
                        Color.yellow)
        );
    }//GEN-LAST:event_Ds_ColorcarroMouseClicked

    private void Ds_GenerarVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ds_GenerarVehiculoMouseClicked

        String marc, model;
        int anio;
        double precio;
        Color color;

        marc = Ds_Marca.getText();
        model = Ds_modelo.getText();
        anio = Integer.parseInt(Ds_anio.getText());
        precio = Double.parseDouble(Ds_venta.getText());
        color = Ds_Colorcarro.getBackground();
        id += 1;

        Vehiculo v = new Vehiculo(marc, model, color, anio, precio, id);

        Vehiculos.add(v);

        for (int i = 0; i < Vehiculos.size(); i++) {
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) Ds_Listarvehiculos.getModel();
            Vehiculo temp = (Vehiculo) Vehiculos.get(i);
            modelo.addElement(temp);
            Ds_Listarvehiculos.setModel(modelo);
        }

        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivos de Texto")) {
                    fichero
                            = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);
                if (Vehiculos.size() == 0) {
                    bw.write("[\n");
                    bw.write(v.toString());
                    bw.write("\n]\n");
                } else {
                    bw.write("\n[\n");
                    bw.write(v.toString());
                    bw.write("\n]\n");
                }
                bw.flush();
                JOptionPane.showMessageDialog(this,
                        "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }

        Ds_Marca.setText("");
        Ds_Colorcarro.setBackground(Color.WHITE);
        Ds_anio.setText("");
        Ds_modelo.setText("");
        Ds_venta.setText("");
    }//GEN-LAST:event_Ds_GenerarVehiculoMouseClicked

    private void Ds_NombrevendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ds_NombrevendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ds_NombrevendedorActionPerformed

    private void Ds_GenerarVendedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ds_GenerarVendedoresMouseClicked

        String nombre = Ds_Nombrevendedor.getText();
        int cant = (int) Ds_Carrosvendidos.getValue();
        double din = Double.parseDouble(Ds_DineroGenerado.getText());

        Vendedor x = new Vendedor(nombre, cant, din);

        Vendedores.add(x);

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) Ds_listarVendedores.getModel();
        int maxElementos = Math.min(100, Vendedores.size());

        for (int i = 0; i < maxElementos; i++) {
            Vendedor temp = (Vendedor) Vendedores.get(i);
            modelo.addElement(temp);
        }

        Ds_listarVendedores.setModel(modelo);

        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivos de Texto")) {
                    fichero
                            = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);
                if (Vendedores.size() == 0) {
                    bw.write("[\n");
                    bw.write(x.toString());
                    bw.write("\n]\n");
                } else {
                    bw.write("\n[\n");
                    bw.write(x.toString());
                    bw.write("\n]\n");
                }
                bw.flush();
                JOptionPane.showMessageDialog(this,
                        "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }

        Ds_Carrosvendidos.setValue(0);
        Ds_DineroGenerado.setText("");
        Ds_Nombrevendedor.setText("");


    }//GEN-LAST:event_Ds_GenerarVendedoresMouseClicked

    private void Ds_NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ds_NombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ds_NombreClienteActionPerformed

    private void Ds_ProfesionclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ds_ProfesionclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ds_ProfesionclienteActionPerformed

    private void Ds_GenerarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ds_GenerarClientesMouseClicked

        String nombre, profesion;
        int edad, cant;
        double sueldo;

        nombre = Ds_NombreCliente.getText();
        profesion = Ds_Profesioncliente.getText();
        edad = Integer.parseInt(Ds_Edadcliente.getText());
        cant = (int) Ds_Cantcarroscomprados.getValue();
        sueldo = Double.parseDouble(Ds_Sueldodisp.getText());

        Cliente c = new Cliente(nombre, edad, profesion, cant, sueldo);

        Clientes.add(c);

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) Ds_ListarClientes.getModel();
        int maxClientes = Math.min(Clientes.size(), 10);
        for (int i = 0; i < maxClientes; i++) {
            Cliente temp = (Cliente) Clientes.get(i);
            modelo.addElement(temp);
        }

        Ds_ListarClientes.setModel(modelo);

        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivos de Texto")) {
                    fichero
                            = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);
                if (Clientes.size() == 0) {
                    bw.write("[\n");
                    bw.write(c.toString());
                    bw.write("\n]\n");
                } else {
                    bw.write("\n[\n");
                    bw.write(c.toString());
                    bw.write("\n]\n");
                }
                bw.flush();
                JOptionPane.showMessageDialog(this,
                        "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }

        Ds_NombreCliente.setText("");
        Ds_Edadcliente.setText("");
        Ds_Profesioncliente.setText("");
        Ds_Carrosvendidos.setValue(0);
        Ds_Sueldodisp.setText("");


    }//GEN-LAST:event_Ds_GenerarClientesMouseClicked

    private void Ds_generarventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ds_generarventaMouseClicked

        int in = Ds_Listarvehiculos.getSelectedIndex();
        Vehiculo V = (Vehiculo) Vehiculos.get(in);

        double p = V.getPrecio();

        int in2 = Ds_ListarClientes.getSelectedIndex();
        Cliente C = (Cliente) Clientes.get(in2);

        int in3 = Ds_listarVendedores.getSelectedIndex();
        Vendedor v = (Vendedor) Vendedores.get(in3);

        Ventas.add(new Venta(v, C, p, V));

        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivos de Texto")) {
                    fichero
                            = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);
                if (Vendedores.size() == 0) {
                    bw.write("[\n");
                    bw.write(v.toString());
                    bw.write("\n]\n");
                } else {
                    bw.write("\n[\n");
                    bw.write(v.toString());
                    bw.write("\n]\n");
                }
                bw.flush();
                JOptionPane.showMessageDialog(this,
                        "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }


    }//GEN-LAST:event_Ds_generarventaMouseClicked

    private void Ds_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ds_modificarMouseClicked

        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        Ds_modificartexto.setText("");
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter(
                            "Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2
                    = new FileNameExtensionFilter(
                            "Imagenes", "jpg", "png", "bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                Ds_modificartexto.setText("");
                while ((linea = br.readLine()) != null) {
                    Ds_modificartexto.append(linea);
                    Ds_modificartexto.append("\n");
                }
            } //fin if

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }


    }//GEN-LAST:event_Ds_modificarMouseClicked

    private void Ds_GuardarmodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ds_GuardarmodMouseClicked
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivos de Texto")) {
                    fichero
                            = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                bw.write(Ds_modificartexto.getText());
                Ds_modificartexto.setText("");
                bw.flush();
                JOptionPane.showMessageDialog(this,
                        "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_Ds_GuardarmodMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        DefaultTreeModel m = (DefaultTreeModel) Arbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode VehiculosA;

        for (Object Vehiculo : Vehiculos) {
            VehiculosA = new DefaultMutableTreeNode(Vehiculo);
        }

        m.reload();


    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Arbol;
    private javax.swing.JTree Arbol2;
    private javax.swing.JSpinner Ds_Cantcarroscomprados;
    private javax.swing.JSpinner Ds_Carrosvendidos;
    private javax.swing.JButton Ds_Colorcarro;
    private javax.swing.JTextField Ds_DineroGenerado;
    private javax.swing.JTextField Ds_Edadcliente;
    private javax.swing.JButton Ds_GenerarClientes;
    private javax.swing.JButton Ds_GenerarVehiculo;
    private javax.swing.JButton Ds_GenerarVendedores;
    private javax.swing.JButton Ds_Guardarmod;
    private javax.swing.JComboBox<String> Ds_ListarClientes;
    private javax.swing.JComboBox<String> Ds_Listarvehiculos;
    private javax.swing.JTextField Ds_Marca;
    private javax.swing.JTextField Ds_NombreCliente;
    private javax.swing.JTextField Ds_Nombrevendedor;
    private javax.swing.JTextField Ds_Profesioncliente;
    private javax.swing.JTextField Ds_Sueldodisp;
    private javax.swing.JTextField Ds_anio;
    private javax.swing.JButton Ds_generarventa;
    private javax.swing.JComboBox<String> Ds_listarVendedores;
    private javax.swing.JTextField Ds_modelo;
    private javax.swing.JButton Ds_modificar;
    private javax.swing.JTextArea Ds_modificartexto;
    private javax.swing.JTextField Ds_venta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    ArrayList Vehiculos = new ArrayList();
    ArrayList Vendedores = new ArrayList();
    ArrayList Clientes = new ArrayList();
    ArrayList Ventas = new ArrayList();
}
