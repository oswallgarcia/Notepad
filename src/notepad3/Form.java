
package notepad3;

import FiveCodMover.FiveCodMoverJFrame;
import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;




public class Form extends javax.swing.JFrame {
    
   
      StyledDocument doc;
      Style  estilo;
      
      Font Fuente;
      

    public Form() {
      
        initComponents();
        
        CargarComponentes();
        
        
        doc = WorkArea.getStyledDocument();
        estilo = WorkArea.addStyle("miestilo", null);
        
        DefaultComboBoxModel modelo =(DefaultComboBoxModel) C2.getModel();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();
        
        for(int i = 0; i< fontNames.length; i++){
            
            modelo.addElement(fontNames[i]);
            
            
        }
        C2.setModel(modelo);
        
        
       
     
        
        
    }
    
    

 

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenu5 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane4 = new javax.swing.JScrollPane();
        WorkArea = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        C1 = new javax.swing.JComboBox<>();
        C2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        NewWindow = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        SaveAs = new javax.swing.JMenuItem();
        Print = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Copiar = new javax.swing.JMenuItem();
        Pegar = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Item2 = new javax.swing.JMenuItem();
        item3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Acercade = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        jMenu3.setText("jMenu3");

        jMenu6.setText("jMenu6");

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        jMenuItem3.setText("jMenuItem3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jMenuItem12.setText("jMenuItem12");

        jMenuItem21.setText("jMenuItem21");

        jScrollPane1.setViewportView(jTextPane1);

        jMenu5.setText("jMenu5");

        jMenu11.setText("jMenu11");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WorkArea.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(WorkArea);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 500));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                C1ItemStateChanged(evt);
            }
        });
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        C2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("A");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 50, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ab");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 50, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("N");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 50, -1));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("K");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 50, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 10, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 10, 30));

        jToggleButton1.setBackground(new java.awt.Color(51, 51, 51));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("S");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 30));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setInheritsPopupMenu(true);

        File.setBorder(null);
        File.setForeground(new java.awt.Color(255, 255, 255));
        File.setText("File");
        File.setBorderPainted(false);
        File.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setBackground(new java.awt.Color(51, 51, 51));
        New.setForeground(new java.awt.Color(255, 255, 255));
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        File.add(New);

        NewWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        NewWindow.setBackground(new java.awt.Color(51, 51, 51));
        NewWindow.setForeground(new java.awt.Color(255, 255, 255));
        NewWindow.setText("New Window");
        NewWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewWindowActionPerformed(evt);
            }
        });
        File.add(NewWindow);

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Open.setBackground(new java.awt.Color(51, 51, 51));
        Open.setForeground(new java.awt.Color(255, 255, 255));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        SaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveAs.setBackground(new java.awt.Color(51, 51, 51));
        SaveAs.setForeground(new java.awt.Color(255, 255, 255));
        SaveAs.setText("save as");
        SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
        File.add(SaveAs);

        Print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Print.setBackground(new java.awt.Color(51, 51, 51));
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        File.add(Print);
        File.add(jSeparator1);

        Exit.setBackground(new java.awt.Color(51, 51, 51));
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Edit");
        jMenu2.setBorderPainted(false);

        Copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Copiar.setBackground(new java.awt.Color(51, 51, 51));
        Copiar.setForeground(new java.awt.Color(255, 255, 255));
        Copiar.setText("Copy");
        Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarActionPerformed(evt);
            }
        });
        jMenu2.add(Copiar);

        Pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        Pegar.setBackground(new java.awt.Color(51, 51, 51));
        Pegar.setForeground(new java.awt.Color(255, 255, 255));
        Pegar.setText("Paste");
        Pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PegarActionPerformed(evt);
            }
        });
        jMenu2.add(Pegar);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setText("Cut");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        Eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        Eliminar.setBackground(new java.awt.Color(51, 51, 51));
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Delete");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jMenu2.add(Eliminar);

        jMenuBar1.add(jMenu2);

        jMenu4.setBackground(new java.awt.Color(51, 51, 51));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Mode");

        Item2.setBackground(new java.awt.Color(51, 51, 51));
        Item2.setForeground(new java.awt.Color(255, 255, 255));
        Item2.setText("Darck");
        Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item2ActionPerformed(evt);
            }
        });
        jMenu4.add(Item2);

        item3.setBackground(new java.awt.Color(51, 51, 51));
        item3.setForeground(new java.awt.Color(255, 255, 255));
        item3.setText("Light");
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });
        jMenu4.add(item3);

        jMenuBar1.add(jMenu4);

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Help");
        jMenu1.setBorderPainted(false);

        Acercade.setBackground(new java.awt.Color(51, 51, 51));
        Acercade.setForeground(new java.awt.Color(255, 255, 255));
        Acercade.setText("About");
        Acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercadeActionPerformed(evt);
            }
        });
        jMenu1.add(Acercade);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt); // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void NewWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewWindowActionPerformed
        Form f = new Form();
        f.setVisible(true);
        f.setLocationRelativeTo(null);// TODO add your handling code here:

    }//GEN-LAST:event_NewWindowActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
    if (evt.getSource() == Print)
        {
            
            
            try
            {
                boolean completar = WorkArea.print();

                if (completar)
                {

                    JOptionPane.showMessageDialog(null, "Impresion terminada", "Informacion", JOptionPane.INFORMATION_MESSAGE);

                } else
                {

                    JOptionPane.showMessageDialog(null, "Impresion", "Impresora", JOptionPane.ERROR_MESSAGE);

                }
            } catch (PrinterException ex)
            {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
        
    }//GEN-LAST:event_PrintActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarActionPerformed
       WorkArea.copy();//Aplicamos el metodo Copiar al TextArea
       JOptionPane.showMessageDialog(null, "Texto Copiado");//Mandamos un Mensaje de Confirmacion   
    }//GEN-LAST:event_CopiarActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed

        if (evt.getSource() == New)
        {

            if (WorkArea.getText().equals(""))//Validacion de Texto 
            {

            } else
            {

                int x = JOptionPane.showConfirmDialog(this, "¿Quieres Guardar el archivo?"); //Dialogo de Confirmacion Si/No/Cancelar Se almacena en variable 

                if (x == JOptionPane.YES_OPTION) //Si la selecion es "Si" entonces ejecuta lo siguiente
                {

                    JFileChooser fc = new JFileChooser(); //Objeto de la clase JFileChooser

                    int seleccion = fc.showSaveDialog(this);//Abrimos la ventana y Guardamos la opcion seleccionada por el usuario en la variable 

                    if (seleccion == JFileChooser.APPROVE_OPTION) //Si el usuario pulsa en aceptar 
                    {

                        File fichero = fc.getSelectedFile();//Selecciona el fichero 

                        try (FileWriter fw = new FileWriter(fichero))//Ecribimos dentro del fichero 
                        {

                            fw.write(WorkArea.getText());//Se Obtiene el texto de area de trabajo y se escribe en el fichero 

                            JOptionPane.showMessageDialog(null, "Archivo Leido");//Mensaje de Archivo leido 

                        } catch (IOException ex)
                        {
                            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex); //Control de errores 
                        }

                    }

                }

                WorkArea.setText("");

            }

        }


    }//GEN-LAST:event_NewActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        if (evt.getSource() == Open)
        {

            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Todos los Archivos", "html","txt","pdf","docx","xml");//Obtenemos los archivos segun su extension y se almacena en filtro

            JFileChooser fc = new JFileChooser();//Creamos el objeto de la clase JFileChooser 
            fc.setFileFilter(filtro);//Fijamos el filtro en el objeto fc
            fc.showOpenDialog(null);//Se abre la ventana de abrir archivo con el filtro 
            File archivo = fc.getSelectedFile();//obtenemos el archivo seleccionado para despues abrirlo 
            try
            {

                FileReader fr = new FileReader(archivo);//Creamos un objeto de la clase FileReader y pasamos como parametro el archivo 
                BufferedReader br = new BufferedReader(fr);//Creamos un objeto y lee el archivo que se paso como parametro 
                String texto = "";
                String linea = "";

                //Algoritmo 
                while (((linea = br.readLine()) != null))//linea = lo que haya leido del archivo, Mientras Linea sea diferente a vacio que se ejecute las siguientes instrucciones 
                {

                    texto += linea + "\n";// texto = texto + Linea + Salto de linea 

                }

                WorkArea.setText(texto);//Fijamos el texto en Area de trabajo 
                JOptionPane.showMessageDialog(null, "Archivo Leido");//Mandamos un mensaje de confirmacion 

            } catch (IOException ex)
            {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);//control de errores 
            }

        }// TODO add your handling code here:
    }//GEN-LAST:event_OpenActionPerformed

    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsActionPerformed

        if (evt.getSource() == SaveAs)
            
            
        {
            
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Todos los Archivos", "txt");

            JFileChooser fc = new JFileChooser(); //Objeto de la clase JFileChooser

            int seleccion = fc.showSaveDialog(this);//Abrimos la ventana y Guardamos la opcion seleccionada por el usuario en la variable 

            if (seleccion == JFileChooser.APPROVE_OPTION)//Si el usuario pulsa en aceptar 
            {

                File fichero = fc.getSelectedFile();//Selecciona el fichero 

                try (FileWriter fw = new FileWriter(fichero))//Ecribimos dentro del fichero 
                {

                    fw.write(WorkArea.getText());//Se Obtiene el texto de area de trabajo y se escribe en el fichero 

                    JOptionPane.showMessageDialog(null, "Archivo Leido");//Mandamos un mensaje de confirmacion 

                } catch (IOException ex)
                {
                    Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);//control de errores 
                }

            }

        } // TODO add your handling code here:
    }//GEN-LAST:event_SaveAsActionPerformed

    private void PegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PegarActionPerformed
             WorkArea.paste();//Aplicamos el metodo Pegar al TextArea
            JOptionPane.showMessageDialog(null, "Texto Pegado");//Mandamos un Mensaje de Confirmacion 
    }//GEN-LAST:event_PegarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
            WorkArea.setText("");//Limpiamos el area de trabajo 
            JOptionPane.showMessageDialog(null, "Texto Eliminado");//Mandamos un Mensaje de Confirmacion 

    }//GEN-LAST:event_EliminarActionPerformed

    private void AcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercadeActionPerformed
    
        JOptionPane.showMessageDialog(null,"Its version 1.0");
        

    }//GEN-LAST:event_AcercadeActionPerformed

    private void Item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item2ActionPerformed
                 

        WorkArea.setBackground(new Color(51,51,51));
        WorkArea.setForeground(new Color(255,255,255));

            
    }//GEN-LAST:event_Item2ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
                WorkArea.setBackground(new Color(255,255,255));
                WorkArea.setForeground(Color.BLACK);// TODO add your handling code here:
    }//GEN-LAST:event_item3ActionPerformed

    private void C1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_C1ItemStateChanged
     
        Font f = WorkArea.getFont();
        WorkArea.setFont(new Font(f.getName(),Font.PLAIN,Integer.parseInt(String.valueOf(C1.getSelectedItem()))));


    }//GEN-LAST:event_C1ItemStateChanged

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        StyleConstants.setFontFamily(estilo, C2.getSelectedItem().toString());
        
        doc.setCharacterAttributes(WorkArea.getSelectionStart(),WorkArea.getSelectionEnd() - WorkArea.getSelectionStart(),WorkArea.getStyle("miestilo"),true);
    }//GEN-LAST:event_C2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{
        
            StyleConstants.setForeground(estilo, JColorChooser.showDialog(this,"Selecciona Color", Color.RED));
        
        doc.setCharacterAttributes(WorkArea.getSelectionStart(),WorkArea.getSelectionEnd() - WorkArea.getSelectionStart(),WorkArea.getStyle("miestilo"),true);
        
        
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         try{
        
            StyleConstants.setBackground(estilo, JColorChooser.showDialog(this,"Selecciona Color", Color.RED));
        
        doc.setCharacterAttributes(WorkArea.getSelectionStart(),WorkArea.getSelectionEnd() - WorkArea.getSelectionStart(),WorkArea.getStyle("miestilo"),true);
        
        
        }catch(Exception ex){
            
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try{

            StyleConstants.setBold(estilo, true);

            doc.setCharacterAttributes(WorkArea.getSelectionStart(),WorkArea.getSelectionEnd() - WorkArea.getSelectionStart(),WorkArea.getStyle("miestilo"),true);

        }catch(Exception ex){

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try{

            StyleConstants.setItalic(estilo, true);

            doc.setCharacterAttributes(WorkArea.getSelectionStart(),WorkArea.getSelectionEnd() - WorkArea.getSelectionStart(),WorkArea.getStyle("miestilo"),true);

        }catch(Exception ex){

        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        try{

            StyleConstants.setUnderline(estilo, true);

            doc.setCharacterAttributes(WorkArea.getSelectionStart(),WorkArea.getSelectionEnd() - WorkArea.getSelectionStart(),WorkArea.getStyle("miestilo"),true);

        }catch(Exception ex){

        }// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        WorkArea.cut();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
        private void CargarComponentes() {
        
        
            for(int i = 10; i<=72; i++){
            
            C1.addItem(String.valueOf(i));
            
        }
        
        
        }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Acercade;
    private javax.swing.JComboBox<String> C1;
    private javax.swing.JComboBox<String> C2;
    private javax.swing.JMenuItem Copiar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem Item2;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem NewWindow;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Pegar;
    private javax.swing.JMenuItem Print;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JTextPane WorkArea;
    private javax.swing.JMenuItem item3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    // End of variables declaration//GEN-END:variables

}
