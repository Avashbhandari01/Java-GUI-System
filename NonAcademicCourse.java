public class NonAcademicCourse extends Course{  //Creating a class named NonAcademicCourse which inherits class Course.
    
    private String Instructorname;  //Declaring the attributes.
    private int Duration;
    private String Startdate;
    private String Completiondate;
    private String Examdate;
    private String Prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    public NonAcademicCourse(String courseID,String courseName,int duration,String prerequisite){  //Creating a Constructor and assigning Constructor's parameter.
        
       super(courseID,courseName,duration);  //Calling super class to get values of courseid, coursename and duration.
       
       this.Prerequisite = prerequisite;  //Initializing the attributes.
       Startdate = "";
       Completiondate = "";
       Examdate = "";
       isRegistered = false;
       isRemoved = false;
    }
    
    public String getInstructorname(){  //The accessor method (get method) is used to access the values from the attributes.
        
        return Instructorname;
    }
    
    public int getDuration(){
        
        return Duration;
    }
    
    public String getStartdate(){
        
        return Startdate;
    }
    
    public String getCompletiondate(){
        
        return Completiondate;
    }
    
    public String getExamdate(){
        
        return Examdate;
    }
    
    public String getPrerequisite(){
        
        return Prerequisite;
    }
    
    public boolean getisRegistered(){
        
        return isRegistered;
    }
    
    public boolean getisRemoved(){
        
        return isRemoved;
    }
    
    public void setInstructorname(String newInstructorname){  //The mutator method (set method) is made to set new value of a instructor name.
        
        if(isRegistered == false){  //Can only set new value of instructor name if the course is not registered.
            
            this.Instructorname = newInstructorname;
        }
        
        else{
             
            System.out.println("Cannot change the instructor name.");
        }
    }
    
    public void register(String courseLeader,String Instructorname,String Startdate,String Completiondate,String Examdate){  //The register method is used to register NonAcademic course if the course is not registered.
        
        setcourseLeader(courseLeader);
        this.Startdate = Startdate;
        this.Completiondate = Completiondate;
        this.Examdate = Examdate;
        
        if(isRegistered == true){  //To register the course details
            
            System.out.println("The course has already been registered.");            
        }
        
        else{
            setcourseLeader(courseLeader);
            this.Startdate = Startdate;
            this.Completiondate = Completiondate;
            this.Examdate = Examdate;
            setInstructorname(Instructorname);
            isRegistered = true;
            isRemoved = false;
        }
    }
    
    public void remove(){  //The remove method is used to remove the course that has been registered.
        
        if(isRemoved == true){  //Checks if the course is removed and removes the course if not removed.
            
            System.out.println("The course has already been removed.");
        }
        
        else{
            
            setcourseLeader("");
            Instructorname = "";
            Startdate = "";
            Completiondate = "";
            Examdate = "";
            isRegistered = false;
            isRemoved = true;
        }
    }
    
    public void display(){  //The display method is used to print the output.
        
        super.display();  //Super class display is called to print courseid, coursename and duration.
        
        if(isRegistered == true){  //If the course is registered then it prints the details.
            
            System.out.println("The instructor name is: "+Instructorname);
            System.out.println("The starting date is:"+Startdate);
            System.out.println("The completion date is: "+Completiondate);
            System.out.println("The exam date is: "+Examdate);
            System.out.println("The prerequisite is:"+Prerequisite);
        }
    }
}