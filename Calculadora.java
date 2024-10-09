/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calc;


public class Calculadora extends javax.swing.JFrame {

    int valorBotao;
    int valorFinal;
    float numero1, numero2;
    char operacao;
    String valorTemporario;
    public Calculadora() {
        initComponents();
    }
    
    private void limparLeitor(){
        leitor.setText("");
    }
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultado = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        leitor = new javax.swing.JTextField();
        div = new javax.swing.JButton();
        limparTela = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        multi2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 625));
        getContentPane().setLayout(null);

        resultado.setBackground(new java.awt.Color(51, 51, 255));
        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        getContentPane().add(resultado);
        resultado.setBounds(390, 490, 70, 110);

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        getContentPane().add(num6);
        num6.setBounds(260, 250, 70, 60);

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        getContentPane().add(num8);
        num8.setBounds(150, 160, 70, 60);

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        getContentPane().add(num7);
        num7.setBounds(30, 160, 70, 60);

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        getContentPane().add(num3);
        num3.setBounds(260, 340, 70, 60);

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        getContentPane().add(num5);
        num5.setBounds(150, 250, 70, 60);

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        getContentPane().add(num4);
        num4.setBounds(30, 250, 70, 60);

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        getContentPane().add(num1);
        num1.setBounds(30, 340, 70, 60);

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        getContentPane().add(num0);
        num0.setBounds(150, 430, 70, 60);

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        getContentPane().add(num9);
        num9.setBounds(260, 160, 70, 60);

        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });
        getContentPane().add(soma);
        soma.setBounds(390, 150, 70, 60);

        subtracao.setText("-");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });
        getContentPane().add(subtracao);
        subtracao.setBounds(390, 240, 70, 60);

        leitor.setBackground(new java.awt.Color(255, 255, 255));
        leitor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        leitor.setForeground(new java.awt.Color(0, 0, 0));
        leitor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        leitor.setActionCommand("<Not Set>");
        leitor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        leitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leitorActionPerformed(evt);
            }
        });
        leitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                leitorPropertyChange(evt);
            }
        });
        getContentPane().add(leitor);
        leitor.setBounds(50, 30, 390, 60);

        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        getContentPane().add(div);
        div.setBounds(390, 410, 70, 60);

        limparTela.setText("C");
        limparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTelaActionPerformed(evt);
            }
        });
        getContentPane().add(limparTela);
        limparTela.setBounds(30, 120, 70, 23);

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        getContentPane().add(num2);
        num2.setBounds(150, 340, 70, 60);

        multi2.setText("X");
        multi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi2ActionPerformed(evt);
            }
        });
        getContentPane().add(multi2);
        multi2.setBounds(390, 330, 70, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "7";
        leitor.setText(valorTemporario);
        valorFinal = 7;
        //leitor.setText(String.valueOf(valorFinal));
      
        
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "8";
        leitor.setText(valorTemporario);
        valorFinal = 8;
        //leitor.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "9";
        leitor.setText(valorTemporario);
        valorFinal = 9;
       // leitor.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_num9ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "4";
        leitor.setText(valorTemporario);
        valorFinal = 4;
        //leitor.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
         valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "5";
        leitor.setText(valorTemporario);
        valorFinal = 5;
       // leitor.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
         valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "6";
        leitor.setText(valorTemporario);
        valorFinal = 6;
        //leitor.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_num6ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
         valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "1";
        leitor.setText(valorTemporario);
        valorFinal = 1;
        //leitor.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_num1ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "0";
        leitor.setText(valorTemporario);
        
        //leitor.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_num0ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "3";
        leitor.setText(valorTemporario);
        valorFinal = 3;
        //leitor.setText(String.valueOf(valorFinal));
        
    }//GEN-LAST:event_num3ActionPerformed

    private void leitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leitorActionPerformed

    }//GEN-LAST:event_leitorActionPerformed

    private void leitorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_leitorPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_leitorPropertyChange

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed

        operacao = '+';
        numero1 = Float.parseFloat(valorTemporario);
        limparLeitor();
        valorTemporario = "0";
        
        
    }//GEN-LAST:event_somaActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        
        if(operacao == '+'){
            numero2 = Float.parseFloat(valorTemporario);
            float resultadoSoma = numero1 + numero2;
            leitor.setText(String.valueOf(resultadoSoma));
          
            
        }else if(operacao == '-'){
            numero2 = Float.parseFloat(valorTemporario);
            float resultadoSub = numero1 - numero2;
            leitor.setText(String.valueOf(resultadoSub));
          
        }else if(operacao == '*'){
            numero2 = Float.parseFloat(valorTemporario);
            float resultadoMult = numero1 * numero2;
            leitor.setText(String.valueOf(resultadoMult));
        
        }else if(operacao == '/'){
            numero2 = Float.parseFloat(valorTemporario);
            if(numero2 > 0){
              float resultadoDiv = numero1 / numero2;
              leitor.setText(String.valueOf(resultadoDiv));
            }else{
                leitor.setText("Impossivel dividir por 0");
            
            }
            
            
        
        }
        
        
    }//GEN-LAST:event_resultadoActionPerformed

    private void limparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTelaActionPerformed
        limparLeitor();
    }//GEN-LAST:event_limparTelaActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        operacao = '-';
        numero1 = Integer.parseInt(valorTemporario);
        limparLeitor();
        valorTemporario = "0";
  
    }//GEN-LAST:event_subtracaoActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        valorTemporario = leitor.getText();
        valorTemporario = valorTemporario + "2";
        leitor.setText(valorTemporario);
    }//GEN-LAST:event_num2ActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        operacao = '/';
        numero1 = Integer.parseInt(valorTemporario);
        limparLeitor();
        valorTemporario = "0";
    }//GEN-LAST:event_divActionPerformed

    private void multi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi2ActionPerformed
        operacao = '*';
        numero1 = Integer.parseInt(valorTemporario);
        limparLeitor();
        valorTemporario = "0";
    }//GEN-LAST:event_multi2ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton div;
    private javax.swing.JTextField leitor;
    private javax.swing.JButton limparTela;
    private javax.swing.JButton multi2;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton resultado;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtracao;
    // End of variables declaration//GEN-END:variables
}
