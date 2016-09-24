/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hostel;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Rabiul
 */
@ManagedBean
@ViewScoped
public class HostelDropDownClass implements Serializable{
    
    private Map<String,Map<String,String>> data = new HashMap<String, Map<String,String>>();
    private String medium; 
    private String department;  
    private Map<String,String> mediums;
    private Map<String,String> departments;
    private String year;
    private String hall;
    private String roomNumber;
    private String errMsg;
    
    
    
   
     
    @PostConstruct
    public void init() {
        mediums  = new HashMap<String, String>();
        mediums.put("HSC", "HSC");
        mediums.put("Honours", "Honours");
        mediums.put("Masters", "Masters");
         
        Map<String,String> map = new HashMap<String, String>();
        map.put("HSC-Science", "HSC-Science");
        map.put("HSC-Humanities", "HSC-Humanities");
        map.put("HSC-Business Studies", "HSC-Business Studies");
        data.put("HSC", map);
         
        map = new HashMap<String, String>();
        map.put("Accounting", "Accounting");
        map.put("Bangla", "Bangla");
        map.put("Botany", "Botany");
        map.put("History", "History");
        map.put("Philosophy", "Philosophy");
        map.put("Psychology", "Psychology");
        map.put("Mathmetics", "Mathmetics");
        map.put("English", "English");
        map.put("Economics", "Economics");
        map.put("Management", "Management");
        data.put("Honours", map);
        
        map = new HashMap<String, String>();
        map.put("Accounting", "Accounting");
        map.put("Bangla", "Bangla");
        map.put("Botany", "Botany");
        map.put("History", "History");
        map.put("Philosophy", "Philosophy");
        map.put("Psychology", "Psychology");
        map.put("Mathmetics", "Mathmetics");
        map.put("English", "English");
        map.put("Economics", "Economics");
        map.put("Management", "Management");
        data.put("Masters", map);
        
      /*  departments  = new HashMap<String, String>();    
       
        departments.put("HSC-Science", "HSC-Science");
        departments.put("HSC-Humanities", "HSC-Humanities");
        departments.put("HSC-Business Studies", "HSC-Business Studies");
        
        departments.put("Accounting", "Accounting");
        departments.put("Bangla", "Bangla");
        departments.put("Botany", "Botany");
        departments.put("History", "History");
        departments.put("Philosophy", "Philosophy");
        departments.put("Psychology", "Psychology");
        departments.put("Mathmetics", "Mathmetics");
        departments.put("English", "English");
        departments.put("Economics", "Economics");
        departments.put("Management", "Management");
        
        departments.put("Accounting", "Accounting");
        departments.put("Bangla", "Bangla");
        departments.put("Botany", "Botany");
        departments.put("History", "History");
        departments.put("Philosophy", "Philosophy");
        departments.put("Psychology", "Psychology");
        departments.put("Mathmetics", "Mathmetics");
        departments.put("English", "English");
        departments.put("Economics", "Economics");
        departments.put("Management", "Management");
        
        
        
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
          data.put("HSC-Science", map);
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
          data.put("HSC-Humanities", map);
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
          data.put("HSC-Business Studies", map);
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("Accounting", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("Bangla", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("Botany", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("History", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("Philosophy", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("Psychology", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("Mathmetics", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("English", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
          data.put("Economics", map);
          
          
         map = new HashMap<String, String>();
         map.put("1st Year", "1st  Year ");
         map.put("2nd Year", "2nd  year");
         map.put("3rd Year", "3rd  year");
         map.put("4th Year", "4th  year");
        data.put("Management", map);
        
         map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("Accounting", map);
        
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("Bangla", map);
        
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("Botany", map);
        
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("History", map);
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("Philosophy", map);
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("Psychology", map);
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("Mathmetics", map);
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("English", map);
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("Economics", map);
        
          map = new HashMap<String, String>();
         map.put("Final Year", "Final  Year ");
        data.put("Management", map);
        
        */
        
          
    }
 
  
  /*  public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }*/

    public Map<String,Map<String,String>> getData() {
        return data;
    }

    public void setData(Map<String,Map<String,String>> data) {
        this.data = data;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String,String> getMediums() {
        return mediums;
    }

    public void setMediums(Map<String,String> mediums) {
        this.mediums = mediums;
    }

    public Map<String,String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String,String> departments) {
        this.departments = departments;
    }

  /*  public Map<String,String> getYears() {
        return years;
    }

    public void setYears(Map<String,String> years) {
        this.years = years;
    }*/
    
    
      
    public void onMediumChange() {
        if(medium !=null && !medium.equals(""))
            departments = data.get(medium);
        else
            departments = new HashMap<String, String>();
    }
   /* public void onDepartmentChange() {
        if(department !=null && !department.equals(""))
            years = data.get(department);
        else
            years = new HashMap<String, String>();
    }
     */
    
    public void displayLocation() {
        FacesMessage msg;
        if(medium != null && department != null )
            msg = new FacesMessage("Selected",department + " of " + medium);
         else 
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "department is not selected."); 
         
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

} 
    
   //  public String adminLogin() {

       // s = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
      /*  try {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaka_college", "root", "apcl123456");
             PreparedStatement pstmt =con.prepareStatement("select * from user_account where id=? and pass =?");
                  
            pstmt.setString(1, userId);
            pstmt.setString(2, userPass);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                sessionUser = rs.getString(1);
                String path = "/jsfpage/admin_home.xhtml?faces-redirect=true";
                return path;
            }

        } catch (Exception e) {
            
            errorMsg = "User identity or passowrd is not match";
        }

        return "homePage?faces-redirect=true";
    }

}
*/