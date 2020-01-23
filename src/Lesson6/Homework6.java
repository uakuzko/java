
package Lesson6;


public class Homework6 {
    
    
    int homeworkmethod (int homemethod1){
        
        
        return homemethod1;
        
    } 
    
    
    int homeworkmethod (int homemethod1, int homemethod2){
        
        return homemethod1 + homemethod2;
        
    } 
    
    
    int homeworkmethod (int homemethod1, int homemethod2, int homemethod3){
        
        return homemethod1 + homemethod2 + homemethod3;
        
    } 
            
    int homeworkmethod (int homemethod1, int homemethod2, int homemethod3, int homemethod4){
        
        return homemethod1 + homemethod2 + homemethod3 + homemethod4;
        
    } 
                    
     int homeworkmethod (int homemethod1, int homemethod2, int homemethod3, int homemethod4, int homemethod5){
        
        return homemethod1 + homemethod2 + homemethod3 + homemethod4 + homemethod5;
        
    }
    
    

     
}


class HomeworkTest{
    

    public static void main (String [] args){
        
        Homework6 hmw = new Homework6();

        int a = hmw.homeworkmethod(0);
        int b = hmw.homeworkmethod(0, 10);
        int c = hmw.homeworkmethod(0, 10, 20);
        int d = hmw.homeworkmethod(0, 10, 20, 30);
        int e = hmw.homeworkmethod(0, 10, 20, 30, 40);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);        
        System.out.println(e);   
}
}