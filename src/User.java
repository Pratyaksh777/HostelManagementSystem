/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRATYAKSH777
 */
class User {
    private String complainno,sid, complain, complains, complaindate; 
   public User(String complainno,String sid,String complain,String complains,String complaindate)    
   {this.complain=complain;
   this.complainno=complainno;
   this.complaindate=complaindate;
   this.complains=complains;
   this.sid=sid;
   }
   public String getsid()
   {return sid;}
      public String getcomplainno()
   {return complainno;}
   public String getcomplain()
   {return complain;}
   public String getcomplains()
   {return complains;}
     public String getcomplaindate()
   {return complaindate;}
             
}
   

