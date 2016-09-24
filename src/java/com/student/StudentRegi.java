/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Rabiul
 */
@ManagedBean
@SessionScoped
public class StudentRegi {
    
    private String id;
    private String name;
    private String pass;
    private String phon;
    private String date;
    private String ermsg;
    public StudentRegi() {
    }
    
    public String doInsert(){
    
        String result = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement pstmt=con.prepareStatement("insert into student_account values(?,?,?,?,?)");
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, pass);
            pstmt.setString(4, phon);
            pstmt.setString(5, date);
            
            int i = pstmt.executeUpdate();
            if(i>0){
                result ="Loginpage?faces-redirect=true";
                return result;
            }else{
              ermsg="invalid registrstion";
          return ermsg;
            }
        
        } catch (Exception e) {
            
           
        }
//       result = "student_resitrationForm?faces-redirect=true";
//             return result;
   ermsg="invalid registrstion";
    return ermsg;    
         
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getErmsg() {
        return ermsg;
    }

    public void setErmsg(String ermsg) {
        this.ermsg = ermsg;
    }
    
    
    
}
