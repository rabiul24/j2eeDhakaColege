/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author PARVES
 */
@ManagedBean
@SessionScoped
public class TraineeChangePassword {

    private String id;
    private String currPassword;
    private String newPassword;
    private String confPassword;

    private String message;

    private String demoResult = "no";
    

    public TraineeChangePassword() {

    }

    public void doChange() {

        if (newPassword.matches(confPassword)) {
            doCheck();
            if (demoResult.matches("yes")) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
             PreparedStatement pstmt =con.prepareStatement("update user_account set pass =? where userId=? ");
                    pstmt.setString(1, newPassword);
                    pstmt.setString(2, id);

                    int i = pstmt.executeUpdate();
                    if (i > 0) {
                        this.message = "successfully changed";
                        this.demoResult = "no";
                    }

                    
                } catch (Exception e) {
                    this.message = "changing failed";
                }
            }else{
                this.message = "rong user id or password";
            }
            
        } else {
            this.message = "password do not match";
        }

    }

    public void doCheck() {
        try {
           Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
             PreparedStatement pstmt =con.prepareStatement("select * from user_account where userId =? and pass=?");
            pstmt.setString(1, id);
            pstmt.setString(2, currPassword);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                this.demoResult = "yes";
            }
            
        } catch (Exception e) {
//            this.demoResult = "no";
            this.message = "rong user id or password";
            
        }
    }

    public String getCurrPassword() {
        return currPassword;
    }

    public void setCurrPassword(String currPassword) {
        this.currPassword = currPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDemoResult() {
        return demoResult;
    }

    public void setDemoResult(String demoResult) {
        this.demoResult = demoResult;
    }

}
