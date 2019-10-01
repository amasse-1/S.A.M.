package chatbot;

import java.util.concurrent.TimeUnit;

/**
 *
 * @authors Anthony, Ryan, and Kevin
 */
public class cB {
    
    String uName = null;
    Exception e = null;
    String day = null;
    String college = null;
    String work = null;
    String major = null;
    String hobby = null;
    
    
    public cB(){}
    
    public void opening(){
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                TimeUnit.SECONDS.sleep(3/2);
            }
        } catch (InterruptedException ex) {
            e = ex;
        }
        System.out.println();
        System.out.println("Pssssssst....say hello");
    }
    
    public void setUName(String uName){
        this.uName = uName;
    }
    public String getUName(){
        return uName;
    }
    public void created(){
        System.out.println("S.A.M.: I was created by 3 people there names are "
                + "Ryan, Anthony, and Kevin");
    }
    public void standFor(){
        System.out.println("S.A.M.: My name is S.A.M. and it "
                + "stands for: Super Artificial Machine");
        System.out.println("S.A.M.: My creators thought I was pretty "
                + "super I guess");
    }
    
    public void setDay(String day){
        this.day = day;
    }
    public String getDay(){
        return day;
    }
    
    public void setCollege(String college){
        this.college = college;
    }
    public String getCollege(){
        return college;
    }
    
    public void setWork(String work){
        this.work = work;
    }
    public String getWork(){
        return work;
    }
    
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public String getHobby(){
        return hobby;
    }
}
