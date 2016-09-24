/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PARVES
 */
@ManagedBean
@SessionScoped
public class LogInPage {

    private String userId;
    private String userPass;

    private int id;

   


    private HttpSession s;

    private String errorMsg;
    private String loginType;

 
    

   
  //  String sessionUser;

    public LogInPage() {
    }

    public String loginController() {
        String pageController = "";

        if (loginType.matches("Admin")) {
            pageController = adminLogin();
        }
        if (loginType.matches("Teacher")) {
            pageController = teacherLogin();
        }

        if (loginType.matches("Student")) {
            pageController = studentLogin();
        }

        

        return pageController;

    }

    public String adminLogin() {

       // s = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
             PreparedStatement pstmt =con.prepareStatement("select * from user_account where id=? and pass =?");
                  
            pstmt.setString(1, userId);
            pstmt.setString(2, userPass);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                setUserId( rs.getString(1)) ;
               
      
                String path = "/jsfpage/UserPage.xhtml?faces-redirect=true";
                return path;
            }else{
            
             errorMsg = "Plese Coorect User Name and passowrd ";
         
             return errorMsg;
           
            
            }

        } catch (Exception e) {
            
          
        }

        String path = "/jsfpage/loginpage.xhtml?faces-redirect=true";
        return path;
       
    }

    
    
    public String teacherLogin() {

        // s = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
             PreparedStatement pstmt=con.prepareStatement("select * from teacher_account where id=? and password =?");
             
            pstmt.setString(1, userId);
            pstmt.setString(2, userPass);
            ResultSet rs = pstmt.executeQuery();

         
            if (rs.next()) {
               // sessionUser = rs.getString(1); 
               // s.setAttribute("sessionId", rs.getInt("id"));
               // s.setAttribute("sessionName", rs.getString("name"));
                String path = "/jsfpage/Teacher_Info.xhtml?faces-redirect=true";
                 
                return path;
            }else{
            
             errorMsg = "Plese Coorect User Name and passowrd ";
             return errorMsg;
            }

        } catch (Exception e) {
 
        }
           String path = "/jsfpage/loginpage.xhtml?faces-redirect=true";
        return path;
    }

 
    public String studentLogin() {

        //s = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement pstmt=con.prepareStatement("select * from student_account where id=? and pass =?");
            pstmt.setString(1, userId);
            pstmt.setString(2, userPass);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
              // sessionUser= rs.getString(1);
               String path = "/jsfpage/OneStudentView.xhtml?faces-redirect=true";
                
                return path;
            }else{
             errorMsg = "Plese Coorect User Name and passowrd ";
             return errorMsg;
            
            }

        } catch (Exception e) {
           
        }
          
     //return errorMsg;
       String path = "/jsfpage/loginpage.xhtml?faces-redirect=true";
        return path;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

//    public String getSessionUser() {
//        return sessionUser;
//    }
//
//    public void setSessionUser(String sessionUser) {
//        this.sessionUser = sessionUser;
//    }

    public HttpSession getS() {
        return s;
    }

    public void setS(HttpSession s) {
        this.s = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

}
