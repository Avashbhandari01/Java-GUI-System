public class Course{  //Creating a class named Course.
    
    private String courseID;  // Declaring the attributes.
    private String courseName;
    private int duration;
    private String courseLeader;
    
    public Course(String courseID, String courseName, int duration){  //Creating a Constructor and assigning Counstructor's parameter.
     
    this.courseID = courseID;  //Initializing the attributes.
    this.courseName = courseName;
    this.duration = duration;
    courseLeader = "";
    }
    
    public String getcourseID(){  //The accessor method (get method) is used to access the values from the attributes.
        
         return courseID;    
    }
    
    public String getcourseName(){
        
         return courseName;    
    }
    
    public int getduration(){
        
         return duration;   
    } 
    
    public String getcourseLeader(){
        
         return courseLeader;    
    }
    
    public void setcourseLeader(String newcourseLeader){  //The mutator method (set method) is made to set the new value of the courseleader.
        
         this.courseLeader = newcourseLeader;      
    }
    
    public void display(){  //The display method is used to print the output.
        
         System.out.println("The courseID is: "+courseID);
         System.out.println("The courseName is: "+courseName);
         System.out.println("The duration is: "+duration);
        
         if(courseLeader != ""){  //The if condition is used so that the course leader is not empty while printing the output.
            
          System.out.println("The courseLeader is: "+courseLeader);
    }
    
    }  
}