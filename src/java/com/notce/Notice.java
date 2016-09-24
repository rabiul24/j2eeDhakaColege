/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notce;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
@ManagedBean
public class Notice implements Serializable{
    
    
    private int id;
    private String classSuuspendNotice;
    private String examNotice;
    private String rcenImportentNotice;
    private String date;
   private String rightMsg;
   private String wrmas;
   private String selectDate;
   
     private List<Notice> vewList =new ArrayList<Notice>();
            
    public Notice(int id, String classSuuspendNotice, String examNotice, String rcenImportentNotice, String date) {
        this.id = id;
        this.classSuuspendNotice = classSuuspendNotice;
        this.examNotice = examNotice;
        this.rcenImportentNotice = rcenImportentNotice;
        this.date = date;
    }

    public Notice() {
    }

    public Notice(String date) {
        this.date = date;
    }
    


    
    public String doSave(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement pstmt=con.prepareStatement("insert into notice values(?,?,?,?,?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, classSuuspendNotice);
            pstmt.setString(3, examNotice);
            pstmt.setString(4, rcenImportentNotice);
        
            pstmt.setString(5, date);
        
          
                    
            int i = pstmt.executeUpdate();
            if(i>0){
                
           
               return rightMsg="add successful";
            }else{
              wrmas="not success";
              return wrmas;
            }
        
        } catch (Exception e) {
             
           
        }    
    
    
    
    return wrmas;
    }
    public List <String> getLoad(){
        List<String> dateList=new ArrayList<String>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement pstmt=con.prepareStatement("select * from  notice ");
           // pstmt.setString(1, date);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
            Notice nt=new Notice(rs.getString(5));
            dateList.add(nt.getDate());
            
           
            }
        
        } catch (Exception e) {
         
        }    
    
    return dateList;
        
    }
    
    public void allChange(){

try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("select * from notice where date=?");
            ps.setString(1, selectDate);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                setId(rs.getInt("notice_sl"));
                setClassSuuspendNotice(rs.getString("class_susspend_notice"));
                setExamNotice(rs.getString("exam_notice"));
                setRcenImportentNotice(rs.getString("recent_impotant_notice"));
               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

}
    public void recentChange(){

try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("select * from notice where date=?");
            ps.setString(1, selectDate);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                setRcenImportentNotice(rs.getString("recent_impotant_notice"));
               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

}
public void doUpdate(){
    try {
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("update notice set notice_sl=?, class_susspend_notice=?, exam_notice=?, recent_impotant_notice=? where date=?");
            ps.setInt(1, id);
            ps.setString(2, classSuuspendNotice);
            ps.setString(3,examNotice);
            ps.setString(4, rcenImportentNotice);
            ps.setString(5, selectDate);
          
           int n=ps.executeUpdate();
           
           if(n>0){
                
           
                rightMsg=" update successful";
            }else{
              wrmas="not success";
              
            }
        
    } catch (Exception e) {
    }

}
public void doDelete(){
    try {
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("delete from notice where date=?");
            
            ps.setString(1, selectDate);
          
           int n=ps.executeUpdate();
           if(n>0){
                
           
             rightMsg="delete successful";
            }else{
              wrmas="not success";
             
            }
        
    } catch (Exception e) {
    }
}
 public void view() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("select * from notice");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Notice st = new Notice(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                vewList.add(st);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassSuuspendNotice() {
        return classSuuspendNotice;
    }

    public void setClassSuuspendNotice(String classSuuspendNotice) {
        this.classSuuspendNotice = classSuuspendNotice;
    }

    public String getExamNotice() {
        return examNotice;
    }

    public void setExamNotice(String examNotice) {
        this.examNotice = examNotice;
    }

    public String getRcenImportentNotice() {
        return rcenImportentNotice;
    }

    public void setRcenImportentNotice(String rcenImportentNotice) {
        this.rcenImportentNotice = rcenImportentNotice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   

    public String getWrmas() {
        return wrmas;
    }

    public void setWrmas(String wrmas) {
        this.wrmas = wrmas;
    }

    public String getRightMsg() {
        return rightMsg;
    }

    public void setRightMsg(String rightMsg) {
        this.rightMsg = rightMsg;
    }

    public String getSelectDate() {
        return selectDate;
    }

    public void setSelectDate(String selectDate) {
        this.selectDate = selectDate;
    }

    public List<Notice> getVewList() {
        return vewList;
    }

    public void setVewList(List<Notice> vewList) {
        this.vewList = vewList;
    }

    
    
    
}
