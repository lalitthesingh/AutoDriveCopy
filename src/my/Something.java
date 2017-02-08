package my;
import java.io.*;
import java.util.*;
class Something{
    
    public static void main( String[] args )throws Exception
    {  
        new OpenWindow().setVisible(true);
        
        String path1=System.getProperty("user.home");
        File f=new File(path1+"\\Pendrivecopy");
        f.mkdirs();
        Calendar c=Calendar.getInstance();
        String date=c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR);
        Date d=new Date();
        String time=d.getHours()+"."+d.getMinutes();
        String path2=date+"_"+time;
        String p=System.getProperty("user.home")+"\\Pendrivecopy";
        String saveto=p+"\\"+path2+".zip";
       
        Demo demo=new Demo(saveto);
        demo.detect();
    
    
    }
 }