/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher.info;

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

public class Showall {
      
private int id;
private String name;
private String forhname;
private String mname;
private String dob;
private String gender;
private String religeonn;

    public Showall(int id, String name, String forhname, String mname, String dob, String gender, String religeonn, String bloodGroup, String image, String deparment, String designation) {
        this.id = id;
        this.name = name;
        this.forhname = forhname;
        this.mname = mname;
        this.dob = dob;
        this.gender = gender;
        this.religeonn = religeonn;
        this.bloodGroup = bloodGroup;
        this.image = image;
        this.deparment = deparment;
        this.designation = designation;
    }
private String bloodGroup;
private String image;
private String deparment;
private String designation;

private List<Showall> lst=new ArrayList<>();


    public Showall() {
    }

    public Showall(int id, String name, String forhname, String mname, String dob, String gender, String religeonn, String bloodGroup, String image, String deparment) {
        this.id = id;
        this.name = name;
        this.forhname = forhname;
        this.mname = mname;
        this.dob = dob;
        this.gender = gender;
        this.religeonn = religeonn;
        this.bloodGroup = bloodGroup;
        this.image = image;
        this.deparment = deparment;
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

  

    public List<Showall> getLst() {
        return lst;
    }

    public void setLst(List<Showall> lst) {
        this.lst = lst;
    }
    
    
  public void view() {
         ConnectionClass con = new ConnectionClass();
        try {  
            PreparedStatement ps = con.getConn().prepareStatement("select * from teacher_info");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Showall sl = new Showall(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
                lst.add(sl);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    
    
    
    
    
    
    
    

