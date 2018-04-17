/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Logic.Cliente;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author retr0
 */
public class ModificarCliente extends javax.swing.JFrame {

    ArrayList<Cliente> clientes;
    java.awt.List lstAModificar;
    /**
     * Creates new form ModificarCliente
     */
    public ModificarCliente(ArrayList<Cliente> clientes, java.awt.List lstAModificar) {
        this.clientes = clientes;
        this.lstAModificar = lstAModificar;
        /*int i = 0;
        while (i < Clientes.size()){
            cbxIdCliente.addItem(String.valueOf(i));
            i++;
        }*/
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

        pnlModifica = new javax.swing.JPanel();
        lblIDCliente = new javax.swing.JLabel();
        cbxIdCliente = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txfCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txfTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfDirrecion = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCargarIds = new javax.swing.JButton();
        btnCargarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlModifica.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Cliente"));

        lblIDCliente.setText("Id de cliente:");

        cbxIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdClienteActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre: ");

        lblCorreo.setText("Correo: ");

        txfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCorreoActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefono:");

        jLabel2.setText("Direccion:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCargarIds.setText("Cargar ID's");
        btnCargarIds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarIdsActionPerformed(evt);
            }
        });

        btnCargarCampos.setText("Cargar campos");
        btnCargarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModificaLayout = new javax.swing.GroupLayout(pnlModifica);
        pnlModifica.setLayout(pnlModificaLayout);
        pnlModificaLayout.setHorizontalGroup(
            pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModificaLayout.createSequentialGroup()
                        .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfCorreo)
                            .addComponent(txfDirrecion)))
                    .addGroup(pnlModificaLayout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificaLayout.createSequentialGroup()
                        .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlModificaLayout.createSequentialGroup()
                                .addComponent(lblIDCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlModificaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlModificaLayout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCargarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarIds, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlModificaLayout.setVerticalGroup(
            pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDCliente)
                    .addComponent(btnCargarIds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModificaLayout.createSequentialGroup()
                        .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCargarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModificaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlModifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlModifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarIdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarIdsActionPerformed
        // TODO add your handling code here:
        if(clientes.size() != 0){
            String[] ids = new String[clientes.size()];
            for(int i = 0; i < clientes.size(); i++){
                ids[i] = clientes.get(i).getIdCliente();
            }
            cbxIdCliente.setModel(new javax.swing.DefaultComboBoxModel<>(ids));
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe insertar clientes", "Error", 1);
        }
        
    }//GEN-LAST:event_btnCargarIdsActionPerformed

    private void cbxIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxIdClienteActionPerformed

    private void txfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCorreoActionPerformed

    private void btnCargarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarCamposActionPerformed
        // TODO add your handling code here:
        if(cbxIdCliente.getItemCount()!=0){
            String index = (String) cbxIdCliente.getSelectedItem();
            for(int i = 0; i < clientes.size(); i++){
                if(clientes.get(i).getIdCliente().equals(index)){
                    txfNombre.setText(clientes.get(i).getNombre());
                    txfCorreo.setText(clientes.get(i).getCorreo());
                    txfTelefono.setText(clientes.get(i).getTelefono());
                    txfDirrecion.setText(clientes.get(i).getDireccion());
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe cargar los id's", "Error", 1);
        }
    }//GEN-LAST:event_btnCargarCamposActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if(txfNombre.getText().equals("") || txfCorreo.getText().equals("") || txfTelefono.getText().equals("") || txfDirrecion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Alguno de los campos esta vacio", "Error", 1);
        }
        else{
            String index = (String) cbxIdCliente.getSelectedItem();
            String nombre = txfNombre.getText();
            String correo = txfCorreo.getText();
            String telefono = txfTelefono.getText();
            String direccion = txfDirrecion.getText();
            if (!isValidEmail(correo)){
                JOptionPane.showMessageDialog(this, "El correo no tiene un formato adecuado", "Error", 1);
            }
            else if(telefono.length() != 8 || !isInteger(telefono)){
                JOptionPane.showMessageDialog(this, "El numero de telefono no tiene un formato adecuado", "Error", 1);
            }
            else{
                for(int i = 0; i < clientes.size(); i++){
                if(clientes.get(i).getIdCliente().equals(index)){
                    lstAModificar.remove(i);
                    clientes.get(i).modificarCliente(nombre, correo, telefono, direccion);
                    lstAModificar.add(clientes.get(i).toLst(), i);
                    txfNombre.setText("");
                    txfCorreo.setText("");
                    txfTelefono.setText("");
                    txfDirrecion.setText("");
                    break;
                    }   
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private boolean isInteger(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    private boolean isValidEmail(String email){
         // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarCampos;
    private javax.swing.JButton btnCargarIds;
    private javax.swing.JComboBox<String> cbxIdCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlModifica;
    private javax.swing.JTextField txfCorreo;
    private javax.swing.JTextField txfDirrecion;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfTelefono;
    // End of variables declaration//GEN-END:variables
}
