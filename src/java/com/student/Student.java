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

public class Student {
      
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


private List<Student>slt=new ArrayList<>();

    
    public Student() {
    }

    public Student(int id, String name, String forhname, String mname, String adds, String phn, String gdphn, String depart, String attendeces, String media, String ssessn, String dob, String gender, String religeonn, String img, String year) {
        this.id = id;
        this.name = name;
        this.forhname = forhname;
        this.mname = mname;
        this.adds = adds;
        this.phn = phn;
        this.gdphn = gdphn;
        this.depart = depart;
        this.attendeces = attendeces;
        this.media = media;
        this.ssessn = ssessn;
        this.dob = dob;
        this.gender = gender;
        this.religeonn = religeonn;
        this.img = img;
        this.year = year;
    }



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
    
    public void view() {
         ConnectionClass con = new ConnectionClass();
        try {  
            PreparedStatement ps = con.getConn().prepareStatement("select * from student");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student sl = new Student(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16));
                slt.add(sl);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getSlt() {
        return slt;
    }

    public void setSlt(List<Student> slt) {
        this.slt = slt;
    }

 
}

    
    
    
    
    
    
    
    

