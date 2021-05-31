/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRATYAKSH777
 */
public class User1{
    private String sid, datein,dateout, application, applications,applicationno; 
   public User1(String applicationno,String sid,String datein,String dateout,String application,String applications)    
   {this.datein=datein;
   this.dateout=dateout;
      this.applicationno=applicationno;
   this.application=application;
   this.applications=applications;
   this.sid=sid;
   }
     public String getapplicationno()
   {return applicationno;}
   public String getsid()
   {return sid;}
   public String getapplication()
   {return application;}
   public String getapplications()
   {return applications;}
     public String getdatein()
   {return datein;}
     public String getdateout()
   {return dateout;}


}
