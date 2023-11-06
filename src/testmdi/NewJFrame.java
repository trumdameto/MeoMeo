package testmdi;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class NewJFrame extends javax.swing.JFrame {

    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        dongho();
    }

    private void setButtonMouseEnter(JLabel label) {
        label.setBackground(Color.WHITE);
        label.setCursor(cursor);
    }

    private void setButtonMouseExit(JLabel label) {
        label.setBackground(new Color(0, 204, 102));
    }
    private void setButtonMousePressed(JLabel label) {
        label.setBackground(Color.black);
        label.setForeground(Color.white);
    }
    private void setButtonMouseReleased(JLabel label) {
       label.setBackground(new Color(0, 204, 102));
       label.setForeground(Color.black);
    }

    void dongho() {
        new Timer(1000, new ActionListener() {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(sdf.format(new Date()));
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblHoaDon = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblDoiMatKhau = new javax.swing.JLabel();
        lblKhachHang = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblDongHo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblSanPham.setBackground(new java.awt.Color(0, 204, 102));
        lblSanPham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Fast Moving Consumer Goods.png"))); // NOI18N
        lblSanPham.setText("Sản Phẩm");
        lblSanPham.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSanPhamMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseReleased(evt);
            }
        });

        lblThongKe.setBackground(new java.awt.Color(0, 204, 102));
        lblThongKe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Document.png"))); // NOI18N
        lblThongKe.setText("Thống Kê");
        lblThongKe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongKeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblThongKeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblThongKeMouseReleased(evt);
            }
        });

        lblNhanVien.setBackground(new java.awt.Color(0, 204, 102));
        lblNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Staff.png"))); // NOI18N
        lblNhanVien.setText("Nhân Viên");
        lblNhanVien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNhanVienMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblNhanVienMouseReleased(evt);
            }
        });

        lblHoaDon.setBackground(new java.awt.Color(0, 204, 102));
        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Purchase Order.png"))); // NOI18N
        lblHoaDon.setText("Hóa Đơn");
        lblHoaDon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHoaDonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseReleased(evt);
            }
        });

        lblDangXuat.setBackground(new java.awt.Color(0, 204, 102));
        lblDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logout.png"))); // NOI18N
        lblDangXuat.setText("Đăng Xuất");
        lblDangXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDangXuatMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseReleased(evt);
            }
        });

        lblDoiMatKhau.setBackground(new java.awt.Color(0, 204, 102));
        lblDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDoiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Change.png"))); // NOI18N
        lblDoiMatKhau.setText("Đổi Mật Khẩu");
        lblDoiMatKhau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMouseReleased(evt);
            }
        });

        lblKhachHang.setBackground(new java.awt.Color(0, 204, 102));
        lblKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Customer.png"))); // NOI18N
        lblKhachHang.setText("Khách Hàng");
        lblKhachHang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblKhachHangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblKhachHangMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
            .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 390));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/images.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 180, 82));

        jDesktopPane1.setLayout(new javax.swing.BoxLayout(jDesktopPane1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1070, 640));

        lblDongHo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(255, 255, 255));
        lblDongHo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Square Clock.png"))); // NOI18N
        lblDongHo.setText("00:00:00 AM");
        lblDongHo.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 255, 204)));
        jPanel1.add(lblDongHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseEntered
        // TODO add your handling code here:
        setButtonMouseEnter(lblThongKe);
    }//GEN-LAST:event_lblThongKeMouseEntered

    private void lblSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseEntered
        // TODO add your handling code here:
       setButtonMouseEnter(lblSanPham);
    }//GEN-LAST:event_lblSanPhamMouseEntered

    private void lblNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseEntered
        // TODO add your handling code here:
       setButtonMouseEnter(lblNhanVien);
    }//GEN-LAST:event_lblNhanVienMouseEntered

    private void lblHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseEntered
        // TODO add your handling code here:
        setButtonMouseEnter(lblHoaDon);
    }//GEN-LAST:event_lblHoaDonMouseEntered

    private void lblKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseEntered
        setButtonMouseEnter(lblKhachHang);
    }//GEN-LAST:event_lblKhachHangMouseEntered

    private void lblDoiMatKhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMouseEntered
       setButtonMouseEnter(lblDoiMatKhau);
    }//GEN-LAST:event_lblDoiMatKhauMouseEntered

    private void lblDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseEntered
        // TODO add your handling code here:
        setButtonMouseEnter(lblDangXuat);
    }//GEN-LAST:event_lblDangXuatMouseEntered

    private void lblDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseExited
        setButtonMouseExit(lblDangXuat);
    }//GEN-LAST:event_lblDangXuatMouseExited

    private void lblDoiMatKhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMouseExited
        // TODO add your handling code here:
       setButtonMouseExit(lblDoiMatKhau);
    }//GEN-LAST:event_lblDoiMatKhauMouseExited

    private void lblKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseExited
        // TODO add your handling code here:
       setButtonMouseExit(lblKhachHang);
    }//GEN-LAST:event_lblKhachHangMouseExited

    private void lblHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseExited
        setButtonMouseExit(lblHoaDon);
    }//GEN-LAST:event_lblHoaDonMouseExited

    private void lblNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseExited
        setButtonMouseExit(lblNhanVien);
    }//GEN-LAST:event_lblNhanVienMouseExited

    private void lblSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseExited
        setButtonMouseExit(lblSanPham);
    }//GEN-LAST:event_lblSanPhamMouseExited

    private void lblThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseExited
        setButtonMouseExit(lblThongKe);
    }//GEN-LAST:event_lblThongKeMouseExited

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
//        int choose = JOptionPane.showConfirmDialog(this, "Are you want logout?", "Thông báo", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
//        if (choose == JOptionPane.YES_OPTION) {
//            LoginFrame lgf = new LoginFrame();
//            this.dispose();
//            lgf.setVisible(true);
//        }
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked

    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMousePressed
        setButtonMousePressed(lblThongKe);
    }//GEN-LAST:event_lblThongKeMousePressed

    private void lblThongKeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseReleased
        setButtonMouseReleased(lblThongKe);
    }//GEN-LAST:event_lblThongKeMouseReleased

    private void lblSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMousePressed
        setButtonMousePressed(lblSanPham);
    }//GEN-LAST:event_lblSanPhamMousePressed

    private void lblSanPhamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseReleased
        setButtonMouseReleased(lblSanPham);
    }//GEN-LAST:event_lblSanPhamMouseReleased

    private void lblNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMousePressed
        setButtonMousePressed(lblNhanVien);
    }//GEN-LAST:event_lblNhanVienMousePressed

    private void lblNhanVienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhanVienMouseReleased
        setButtonMouseReleased(lblNhanVien);
    }//GEN-LAST:event_lblNhanVienMouseReleased

    private void lblHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMousePressed
        setButtonMousePressed(lblHoaDon);
    }//GEN-LAST:event_lblHoaDonMousePressed

    private void lblHoaDonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseReleased
              setButtonMouseReleased(lblHoaDon);
    }//GEN-LAST:event_lblHoaDonMouseReleased

    private void lblKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMousePressed
        setButtonMousePressed(lblKhachHang);
    }//GEN-LAST:event_lblKhachHangMousePressed

    private void lblKhachHangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKhachHangMouseReleased
      setButtonMouseReleased(lblKhachHang);
    }//GEN-LAST:event_lblKhachHangMouseReleased

    private void lblDoiMatKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMousePressed
       setButtonMousePressed(lblDoiMatKhau);
    }//GEN-LAST:event_lblDoiMatKhauMousePressed

    private void lblDoiMatKhauMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMouseReleased
       setButtonMouseReleased(lblDoiMatKhau);
    }//GEN-LAST:event_lblDoiMatKhauMouseReleased

    private void lblDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMousePressed
       setButtonMousePressed(lblDangXuat);
    }//GEN-LAST:event_lblDangXuatMousePressed

    private void lblDangXuatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseReleased
        setButtonMouseReleased(lblDangXuat);
    }//GEN-LAST:event_lblDangXuatMouseReleased

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDoiMatKhau;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongKe;
    // End of variables declaration//GEN-END:variables
}
