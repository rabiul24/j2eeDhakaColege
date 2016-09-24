/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student;

import com.student.*;
import com.connection.ConnectionClass;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Rabiul
 */


@ManagedBean

public class ViwStudent {
      
private int id;
private String name;
private String forhname;
private String mname;
private String adds;
private String phn;
private String gdphn;
private String depart;
private String attendeces;
private String media;
private String ssessn;
private String dob;
private String gender;
private String religeonn;
private String img;
private String year;
private String nid;
private String presentAdd;

    private String rightMsg;
   private String ermsg;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForhname() {
        return forhname;
    }

    public void setForhname(String forhname) {
        this.forhname = forhname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getGdphn() {
        return gdphn;
    }

    public void setGdphn(String gdphn) {
        this.gdphn = gdphn;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getAttendeces() {
        return attendeces;
    }

    public void setAttendeces(String attendeces) {
        this.attendeces = attendeces;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getSsessn() {
        return ssessn;
    }

    public void setSsessn(String ssessn) {
        this.ssessn = ssessn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReligeonn() {
        return religeonn;
    }

    public void setReligeonn(String religeonn) {
        this.religeonn = religeonn;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
      public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPresentAdd() {
        return presentAdd;
    }

    public void setPresentAdd(String presentAdd) {
        this.presentAdd = presentAdd;
    }

    
    public void view() {
         ConnectionClass con = new ConnectionClass();
        try {  
            PreparedStatement ps = con.getConn().prepareStatement("select * from student where id=7255;");
            //ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                setId(rs.getInt("id"));
                setName(rs.getString("name"));
                setForhname(rs.getString("father_name"));
                setMname(rs.getString("Mather_name"));
                setDob(rs.getString("dob"));
                setPhn(rs.getString("phone"));
                setNid(rs.getString("nId"));
                setGender(rs.getString("gender"));
                setReligeonn(rs.getString("religion"));
                setImg(rs.getString("image"));
                setPresentAdd(rs.getString("PresentAdd"));
                setAdds(rs.getString("address"));
                setGdphn(rs.getString("gairdian_phone"));
                setDepart(rs.getString("department"));
                setMedia(rs.getString("media"));
                setYear(rs.getString("year"));
                setSsessn(rs.getString("seesion"));
                setAttendeces(rs.getString("Attendencs"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String doUpdate() {
        String result="";
         ConnectionClass con = new ConnectionClass();
        try {
  PreparedStatement ps = con.getConn().prepareStatement("update student  set name=?, father_name=?, Mather_name=?, dob=?, phone=?,"
          + " nId=?, religion=?,  PresentAdd=?, address=?, gairdian_phone=?, media=?, year=?, seesion=? where id=7255;");
           ps.setString(1, name);
           ps.setString(2, forhname);
           ps.setString(3,mname);
           ps.setString(4, dob);
           ps.setString(5, phn);
           ps.setString(6, nid);
           ps.setString(7, religeonn);
//           ps.setString(8, img);
           ps.setString(8, presentAdd);
           ps.setString(9, adds);
           ps.setString(10, gdphn );
           ps.setString(11, media);
           ps.setString(12, year);
           ps.setString(13, ssessn);    
           int n=ps.executeUpdate();
            if(n>0){
               rightMsg="edit success";
               return rightMsg;
            }else{
              ermsg="not edit";
            return ermsg;
            }
   
            

        } catch (Exception e) {
            e.printStackTrace();
        }
         return ermsg;
    }

    public String getErmsg() {
        return ermsg;
    }

    public void setErmsg(String ermsg) {
        this.ermsg = ermsg;
    }

    public String getRightMsg() {
        return rightMsg;
    }

    public void setRightMsg(String rightMsg) {
        this.rightMsg = rightMsg;
    }

  
 
}

    
    
    
    
    
    
    
    

