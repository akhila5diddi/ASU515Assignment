package hacs;

import hacs.UserInfoItem.USER_TYPE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @author mjfindler
 * @version 2.0
 * <p>
 * Update to Java 8
 */

public class Login extends JDialog {

    boolean m_bExit = false;
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JButton loginButton = new JButton();
    JButton buttonExit = new JButton();
    JTextField UserNameText = new JTextField();
    JPasswordField PasswordText = new JPasswordField();
    JRadioButton StudentRadio = new JRadioButton();
    JRadioButton InstructorRadio = new JRadioButton();
    ButtonGroup buttonGroup1 = new ButtonGroup();
    ////// Attributes Added By me
    private String UserBox = null;
    private USER_TYPE UserType = USER_TYPE.Student; // default to Student

    public Login() {
        try {
            jbInit();
            setSize(300, 300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        jLabel1.setText("userName");
        jLabel1.setBounds(new Rectangle(26, 52, 80, 18));
        jLabel2.setText("Password");
        jLabel2.setBounds(new Rectangle(23, 119, 80, 18));
        loginButton.setText("login");
        loginButton.setBounds(new Rectangle(31, 212, 85, 28));
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginButton_actionPerformed(e);
            }
        });
        buttonExit.setText("Exit");
        buttonExit.setBounds(new Rectangle(180, 211, 97, 28));
        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonExit_actionPerformed(e);
            }
        });
        UserNameText.setBounds(new Rectangle(119, 52, 144, 22));
        PasswordText.setBounds(new Rectangle(118, 119, 147, 22));
        StudentRadio.setSelected(true);
        StudentRadio.setText("Student");
        StudentRadio.setBounds(new Rectangle(37, 164, 103, 26));
        InstructorRadio.setText("Instructor");
        InstructorRadio.setBounds(new Rectangle(177, 162, 103, 26));
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(loginButton, null);
        this.getContentPane().add(buttonExit, null);
        this.getContentPane().add(UserNameText, null);
        this.getContentPane().add(PasswordText, null);
        this.getContentPane().add(StudentRadio, null);
        this.getContentPane().add(InstructorRadio, null);
        buttonGroup1.add(StudentRadio);
        buttonGroup1.add(InstructorRadio);
    }

    void loginButton_actionPerformed(ActionEvent e) {
        BufferedReader file;
        m_bExit = false;
        System.out.println("login clicked");
        try {
            if (StudentRadio.isSelected() == true)//// student
            {
                UserType = USER_TYPE.Student; /// 0 for student
                file = new BufferedReader(new FileReader("StuInfo.txt"));
            } else// instructor
            {
                UserType = USER_TYPE.Instructor; // 1 for instructor
                file = new BufferedReader(new FileReader("InsInfor.txt"));
            }
            UserBox = UserNameText.getText();
            String PasswordBox = new String(PasswordText.getPassword());
            String LoginName = null;
            String aline = null, UserName = null, Password = null;
            while ((aline = file.readLine()) != null) {
                UserName = getUserName(aline);
                Password = getPassword(aline);
                if (UserName.compareTo(UserBox) == 0 && Password.compareTo(PasswordBox) == 0)
                    LoginName = UserName;
            }
            if (LoginName != null) {
                this.setVisible(false);
            }
        } catch (Exception ee) {
        }

    }

    /*
     * get the user name from aline userName:Password
     */
    private String getUserName(String aline) {
        int Sep = aline.lastIndexOf(':');
        return aline.substring(0, Sep);
    }

    /*
     * get the password from aline userName:Password
     */
    private String getPassword(String aline) {
        int Sep = aline.lastIndexOf(':');
        return aline.substring(Sep + 1);
    }

    /* after login get the userName of the login interface */
    public String getUserName() {
        return UserBox;
    }

    /* after login get the userType of the login interface */
    public USER_TYPE getUserType() {
        return UserType;
    }

    public boolean isExit() {
        return m_bExit;
    }

    void buttonExit_actionPerformed(ActionEvent e) {
        m_bExit = true;
        setVisible(false);
    }
}