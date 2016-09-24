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


/**
 *
 * @author PARVES
 */
@ManagedBean
@SessionScoped
public class PaymentInfo {

   


   
   

    private String rollNum;
    private String transactionid;
    private String phone;
    private String ammount;

    public PaymentInfo(String rollNum, String transactionid, String phone, String ammount) {
        this.rollNum = rollNum;
        this.transactionid = transactionid;
        this.phone = phone;
        this.ammount = ammount;
    }
    private String errorMsg;

     public String getRollNum() {
        return rollNum;
    }
    
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
    public PaymentInfo(String phone, String ammount) {
        this.phone = phone;
        this.ammount = ammount;
    }
   

   
 

    public PaymentInfo() {
    }



    public String dovew() {

      
        try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
             PreparedStatement pstmt =con.prepareStatement("select * from hosteladd  where roll_number=? and transaction_id =?");
                  
            pstmt.setString(1, rollNum);
            pstmt.setString(2, transactionid);
              
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
               setRollNum(rs.getString("roll_number"));
               setTransactionid(rs.getString("transaction_id"));
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
