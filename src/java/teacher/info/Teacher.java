/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher.info;

import com.connection.ConnectionClass;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;

@ManagedBean


public class Teacher implements Serializable{

     
   

   
private int id;
private String name;
private String forhname;
private String mname;
private Date dob;
private String gender;
private String religeonn;
private String bloodGroup;
private Part file;
private String path;
private String imageName;
private String deparment;
private String designation;







 public void upload() {
        // getting path which contain file

//getting absulate path of my application 
        ServletContext context = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        path = context.getRealPath("/");
        path = path.substring(0, path.indexOf("\\build"));
        path = path + "\\web\\resources\\teacher\\";
        try {
            InputStream is = file.getInputStream();


            byte[] data = new byte[is.available()];

            //    OutputStream out = new FileOutputStream(image + file.getSubmittedFileName());
            OutputStream outs = new FileOutputStream(path + file.getSubmittedFileName());

            is.read(data);

            outs.write(data);
            outs.flush();
            imageName = file.getSubmittedFileName();

            saveImageName(imageName);

            is.close();
            outs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
 public void saveImageName(String image){
     
      ConnectionClass con = new ConnectionClass();
        try {
            PreparedStatement pst = con.getConn().prepareStatement("insert into teacher_info values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, forhname);
            pst.setString(4, mname);
            pst.setDate(5, dob);
            pst.setString(6, gender);
            pst.setString(7, religeonn);
            pst.setString(8, bloodGroup);
            pst.setString(9, image);
            pst.setString(10, deparment);
            pst.setString(11, designation);
            
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }

    
 
 }

 public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
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

  
    

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

   

   


}
    

  

