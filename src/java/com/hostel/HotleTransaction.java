/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hostel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PARVES
 */
@ManagedBean
@SessionScoped
public class HotleTransaction {

    public String getRollNum() {
        return rollNum;
    }


   
   

    private String rollNum;
    private String transactionid;
    private String phone;
    private String ammount;
    private String errorMsg;

    
    
    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    public HotleTransaction(String phone, String ammount) {
        this.phone = phone;
        this.ammount = ammount;
    }
   

   
 

    public HotleTransaction() {
    }



    public String dovew() {

      
        try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
             PreparedStatement pstmt =con.prepareStatement("select phone , amount from hosteladd  where roll_number=? and transaction_id =?");
                  
            pstmt.setString(1, rollNum);
            pstmt.setString(2, transactionid);
              
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
               setPhone(rs.getString("phone"));
               setAmmount(rs.getString("amount"));
                String path = "/jsfpage/HostelAdmissionOnline_1.xhtml?faces-redirect=true";
                return path;
            }else{
             errorMsg = "Plese Correct Roll Number and Transaction Id Input";
             return errorMsg;
            
            }

        } catch (Exception e) {
             errorMsg = "Plese Correct Roll Number and Transaction Id Input";
            
        }
 return errorMsg;
      
    }

    
    
  
   

}
