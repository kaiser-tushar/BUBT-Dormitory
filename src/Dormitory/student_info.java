
package Dormitory;
import java.sql.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.*;
import java.util.Vector;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.JList;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.lang.String;
import java.sql.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.util.Date;

public class student_info extends javax.swing.JFrame {
     Connection con;
     Statement stmt;
     ResultSet rs;
    PreparedStatement pst;
    ResultSetMetaData md;
    String search_per="s_id";
    String search_aca="s_id";

    /** Creates new form frame4 */
    public student_info() {
        initComponents();

        this.buttonGroup1.add(sid);
        this.buttonGroup1.add(sname);
        this.buttonGroup1.add(sname1);
        this.buttonGroup1.add(sdep);
        this.buttonGroup1.add(sint);
        this.buttonGroup1.add(sid1);
        this.buttonGroup1.add(sdep1);
        this.buttonGroup1.add(sint1);
        this.buttonGroup1.add(sroom);
         con= connect.DB();
        academicinfo();
        personalinfo();
    }

     public void personalinfo(){
     String[] colNames ={"ID","Name","Father's Name","Mother's Name","Address","Contact No."};
    try{
        //connect();
        String sql="select * from per_info";
        DefaultTableModel model=new  DefaultTableModel();
         jTable1.setModel(model);
         stmt=con.createStatement();
        PreparedStatement ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
       model.setColumnIdentifiers(colNames);
         while (rs.next()) {
              String[] rowData = new String[10];
        for (int i = 1; i <= 6; i++) {
          rowData[i - 1] = rs.getString(i);
         }
        model.addRow(rowData);
      }
    }

    catch(Exception ca)
   {
   JOptionPane.showMessageDialog(null, "per_info "+ca);
   }

}


     public void academicinfo(){
            String[] colNames ={"ID","Name","Department","Intake","Section","Gender","Entry Date","Floor No.","Room No."};
    try{
       // connect();
        String sql="select * from aca_hos";
        DefaultTableModel model=new  DefaultTableModel();
         jTable2.setModel(model);
        stmt=con.createStatement();
        PreparedStatement ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        model.setColumnIdentifiers(colNames);
         while (rs.next()) {
              String[] rowData = new String[15];
       for (int i = 1; i <= 9; i++) {
          rowData[i - 1] = rs.getString(i);
         }
        model.addRow(rowData);
      }
    }

    catch(Exception ca)
   {
   JOptionPane.showMessageDialog(null, "aca_hos "+ca);
   }

}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sid1 = new javax.swing.JCheckBox();
        sname1 = new javax.swing.JCheckBox();
        sdep1 = new javax.swing.JCheckBox();
        sroom = new javax.swing.JCheckBox();
        sint1 = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sid = new javax.swing.JCheckBox();
        sname = new javax.swing.JCheckBox();
        sdep = new javax.swing.JCheckBox();
        sint = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student's  Information");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Andalus", 3, 22));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ACADEMIC AND HOSTEL INFORMATION");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(270, 10, 450, 33);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search For :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(230, 90, 130, 20);

        jTextField2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel2.add(jTextField2);
        jTextField2.setBounds(370, 90, 163, 22);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton5.setForeground(new java.awt.Color(0, 0, 51));
        jButton5.setText("Search");
        jButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(550, 90, 60, 25);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(0, 120, 1000, 310);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton6.setForeground(new java.awt.Color(0, 0, 51));
        jButton6.setText("Back");
        jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(470, 450, 79, 30);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton7.setForeground(new java.awt.Color(0, 0, 51));
        jButton7.setText("logout");
        jButton7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(660, 450, 73, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel6.setText("Search By:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(250, 50, 90, 30);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        sid1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sid1.setText(" ID");
        sid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sid1MouseClicked(evt);
            }
        });

        sname1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sname1.setText(" Name");
        sname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sname1ActionPerformed(evt);
            }
        });

        sdep1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sdep1.setText(" Dept.");
        sdep1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdep1MouseClicked(evt);
            }
        });

        sroom.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sroom.setText(" Room no.");
        sroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sroomMouseClicked(evt);
            }
        });

        sint1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sint1.setText(" Intake");
        sint1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sint1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sid1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sname1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sdep1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sint1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sroom, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sname1)
                        .addComponent(sid1))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sdep1)
                        .addComponent(sint1)
                        .addComponent(sroom)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(340, 50, 440, 30);

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton8.setText("Reset");
        jButton8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(280, 450, 80, 30);

        jTabbedPane1.addTab("Academic And Hostel Information", jPanel2);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search For :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(255, 110, 110, 21);

        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(370, 110, 187, 22);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, "", null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Father's Name", "Mother's Name", "Addrees", "Contact No"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 137, 1010, 301);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(570, 110, 67, 25);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("Reset");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 457, 67, 27);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton3.setForeground(new java.awt.Color(0, 0, 51));
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(421, 456, 70, 29);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton4.setForeground(new java.awt.Color(0, 0, 51));
        jButton4.setText("Exit");
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(598, 457, 66, 27);

        jLabel1.setFont(new java.awt.Font("Andalus", 3, 22));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT PERSONAL INFORMATION");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 10, 423, 47);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel5.setText("Search by:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 60, 90, 40);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        sid.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sid.setText(" ID");
        sid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidMouseClicked(evt);
            }
        });

        sname.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sname.setText(" Name");
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        sdep.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sdep.setText(" Dept.");
        sdep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdepMouseClicked(evt);
            }
        });

        sint.setFont(new java.awt.Font("Times New Roman", 1, 14));
        sint.setText(" Intake");
        sint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sintMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sname)
                .addGap(20, 20, 20)
                .addComponent(sdep, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdep)
                    .addComponent(sint)
                    .addComponent(sid)
                    .addComponent(sname))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(350, 60, 310, 40);

        jTabbedPane1.addTab(" Personal Information", jPanel1);

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        jMenu1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jMenu1.setText("File");

        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Bill");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Complains");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jMenu2.setText("Edit");

        jMenuItem5.setText("Delete");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Update admin");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Update bill");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1038)/2, (screenSize.height-598)/2, 1038, 598);
    }// </editor-fold>//GEN-END:initComponents
      public void show_academic(String sql){
            String[] colNames ={"ID","Name","Department","Intake","Section","Gender","Entry Date","Floor No.","Room No."};
    try{
       // connect();
        //String sql="select * from aca_hos";
        DefaultTableModel model=new  DefaultTableModel();
         jTable2.setModel(model);
        stmt=con.createStatement();
        PreparedStatement ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        model.setColumnIdentifiers(colNames);
         while (rs.next()) {
              String[] rowData = new String[15];
       for (int i = 1; i <= 9; i++) {
          rowData[i - 1] = rs.getString(i);
         }
        model.addRow(rowData);
      }
    }

    catch(Exception ca)
   {
   JOptionPane.showMessageDialog(null, "aca_hos "+ca);
   }

}
    public void show_per(String sql)
    {
             String[] colNames ={"ID","Name","Father's Name","Mother's Name","Address","Contact No."};
        try{
            //connect();
            //String sql="select * from per_info";
            DefaultTableModel model=new  DefaultTableModel();
            jTable1.setModel(model);
            stmt=con.createStatement();
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            model.setColumnIdentifiers(colNames);
            while (rs.next())
            {
                  String[] rowData = new String[10];
                for (int i = 1; i <= 6; i++)
                {
                    rowData[i - 1] = rs.getString(i);
                }
                model.addRow(rowData);
            }
        }

        catch(Exception ca)
       {
       JOptionPane.showMessageDialog(null, "per_info "+ca);
       }

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        manager_panel k=new manager_panel();
        k.setVisible(true);
        dispose();// TODO add your handling code here:

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int p=JOptionPane.showConfirmDialog(null,"Do you want to Logout ","Update",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
        frame1 k =new frame1();
        k.setVisible(true);
        dispose();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        manager_panel k=new manager_panel();
        k.setVisible(true);
        dispose();// TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int p=JOptionPane.showConfirmDialog(null,"Do you want to Logout ","Update",JOptionPane.YES_NO_OPTION);
        if(p==0) {
            frame1 k =new frame1();
            k.setVisible(true);
            dispose();
        }        // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    private void sidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidMouseClicked
        search_per="s_id";
    }//GEN-LAST:event_sidMouseClicked

    private void sdepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdepMouseClicked
        search_per="department";
    }//GEN-LAST:event_sdepMouseClicked

    private void sintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sintMouseClicked
        search_per="intake";
    }//GEN-LAST:event_sintMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if( search_per.equals("s_id"))
       {
           show_per("select * from per_info where s_id like '%"+jTextField1.getText()+"%'");
       }
       else if(search_per.equals("s_name"))
       {
           show_per("select * from per_info where s_name like '%"+jTextField1.getText()+"%'");

           //show_per("select * from per_info where room='"+jTextField1.getText()+"'");
       }
       else if(search_per.equals("intake"))
       {
           show_per("select * from per_info where s_id in (select s_id from aca_hos where intake='"+jTextField1.getText()+"')");
           
           //show_per("select * from per_info where room='"+jTextField1.getText()+"'");
       }
       else if(search_per.equals("department"))
       {
              show_per("select * from per_info where s_id in (select s_id from aca_hos where department='"+jTextField1.getText()+"')");
          
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sid1MouseClicked
        search_aca="s_id";
    }//GEN-LAST:event_sid1MouseClicked

    private void sdep1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdep1MouseClicked
        search_aca="department";
    }//GEN-LAST:event_sdep1MouseClicked

    private void sint1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sint1MouseClicked
       search_aca="intake";
    }//GEN-LAST:event_sint1MouseClicked

    private void sroomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sroomMouseClicked
       search_aca="room";
    }//GEN-LAST:event_sroomMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if( search_aca.equals("s_id"))
       {
           show_academic("select * from aca_hos where s_id like '%"+jTextField2.getText()+"%'");
       }
       else if(search_aca.equals("room"))
       {
            show_academic("select * from aca_hos where room='"+jTextField2.getText()+"'");
       }
        else if(search_aca.equals("s_name"))
       {
            show_academic("select * from aca_hos where s_name like '%"+jTextField2.getText()+"%'");
       }
       else if(search_aca.equals("department"))
       {
            show_academic("select * from aca_hos where department='"+jTextField2.getText()+"'");
       }
        else if(search_aca.equals("intake"))
       {
            show_academic("select * from aca_hos where intake='"+jTextField2.getText()+"'");
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
         search_per="s_name";
        
    }//GEN-LAST:event_snameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        personalinfo();
         jTextField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sname1ActionPerformed
         search_aca="s_name";
    }//GEN-LAST:event_sname1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextField2.setText("");
         academicinfo();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
per_info k=new per_info();
k.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
bill_option k=new bill_option();
k.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
complain_frame k= new complain_frame();
k.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
exit();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
delete_panel k=new delete_panel();
k.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
update_admin k=new update_admin();
k.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
update_bill k=new update_bill();
k.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed
  public void exit(){
  int result=JOptionPane.showConfirmDialog(null, "Do You want to Log Out ?", "Log Out Panel", JOptionPane.YES_NO_CANCEL_OPTION);
       if(result==0)
       {
           JOptionPane.showMessageDialog(null, "Log Out Successfully","System wil exit",JOptionPane.PLAIN_MESSAGE);
           System.exit(0);
       }
       else if(result==1)
       {
           JOptionPane.showMessageDialog(null, "Log Out to exit","Can not Exit",JOptionPane.PLAIN_MESSAGE);
       }


}
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox sdep;
    private javax.swing.JCheckBox sdep1;
    private javax.swing.JCheckBox sid;
    private javax.swing.JCheckBox sid1;
    private javax.swing.JCheckBox sint;
    private javax.swing.JCheckBox sint1;
    private javax.swing.JCheckBox sname;
    private javax.swing.JCheckBox sname1;
    private javax.swing.JCheckBox sroom;
    // End of variables declaration//GEN-END:variables

}
