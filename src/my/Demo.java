package my;
import java.io.*;
class Demo {
    File oldd[],newd[];
    String mypath;
    /*static String giveMyPath(String ts){
        mypath=ts;
        return mypath;
    }*/
    Demo(String ts){
          oldd=File.listRoots();
          mypath=ts;
      }
    String detect(File f1[],File f2[]){
        String p="";
        for(int i=0;i<f2.length;i++){
           boolean b=true;
           for(int j=0;j<f1.length;j++){
               String p1=f1[j].getPath();
               String p2=f2[i].getPath();
               if(p1.equals(p2)){
                   b=false;
                   break;
               }}
               if(b){
                  p=f2[i].getPath();
                  break;
               }
        }
        return p;
    }
   void detect(){
        while(true){
         newd=File.listRoots();
         int l1=oldd.length;
        int l2=newd.length;
        if(l1<l2){
            String path=this.detect(oldd,newd);
            int len=path.length();
            String s=path.substring(0,len-1);
            
            System.out.println(path+" detected");
            AppZip appZip = new AppZip(s,mypath);
    	    appZip.generateFileList(new File(s));
            appZip.zipIt(mypath);
            new ADCWindow().setVisible(true);
           
        } else if(l1>l2){
             String path=this.detect(newd,oldd);
            System.out.println(path+" ejected");   
          
        } oldd=newd;
        
    }
}
}