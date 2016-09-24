/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package header1;



import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Rabiul
 */
@ManagedBean
public class DateandTime {
    private Date d1=new  Date();
    private SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private String ds=sdf.format(d1);

    public DateandTime() {
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }
   

   
    
}
