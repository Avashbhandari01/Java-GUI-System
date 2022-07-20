public class AcademicCourse extends Course{  //Creating a class named AcademicCourse which inherits class Course.
    
    private String Lecturername;  //Declaring the attributes.
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int NumberofAssessments;
    private boolean isRegistered;
    
    public AcademicCourse(String courseID,String courseName,int duration,String Level,String Credit,int NumberofAssessments){  //Creating a Constructor and assigning Constructor's parameter.
        
        super(courseID,courseName,duration);  //Calling super class to get values of courseid, coursename and duration.
        
        this.NumberofAssessments = NumberofAssessments;  //Initializing the attributes.
        this.Level = Level;
        this.Credit = Credit;
        Lecturername = "";
        StartingDate = "";
        CompletionDate = "";
        isRegistered = false;     
    }
    
    public String getLecturername(){  //The accessor method (get method) is used to access the values from the attributes.
        
        return Lecturername;
    }
    
    public String getLevel(){
        
        return Level;
    }
    
    public String getCredit(){
        
        return Credit;
    }
    
    public String getStartingDate(){
        
        return StartingDate;
    }
    
    public String getCompletionDate(){
        
        return CompletionDate;
    }
    
    public int getNumberofAssessments(){
        
        return NumberofAssessments;
    }
    
    public boolean getisRegistered(){
        
        return isRegistered;
    }
    
    public void setLecturername(String newLecturername){  //The mutator method (set method) is made to set the new value of the lecturer name.
        
        this.Lecturername = newLecturername;
    }
    
    public void setNumberofAssessments(int newNumberofAssessments){  //The mutator method (set method) is made to set the new valur of the number of assessments.
        
        this.NumberofAssessments = newNumberofAssessments;
    }
    
    public void register(String courseLeader,String Lecturername,String StartingDate,String CompletionDate){  //The regitser method is made to register the academic course if the course is not registered.
        
        if(isRegistered == true){ //If the course is not registered then it registeres the course.
           
           System.out.println("The course has already been registered");
           System.out.println("The lecturer's name is: "+Lecturername);
           System.out.println("The starting date is: "+StartingDate);
           System.out.println("The completion date is: "+CompletionDate);  
        }
        
        else{  //If the course is registered then it prints the following outputs.
           
            setcourseLeader(courseLeader);  
            this.Lecturername = Lecturername;
            this.StartingDate = StartingDate;
            this.CompletionDate = CompletionDate;
            isRegistered = true;     
        }
    }
    
    public void display(){  //The display method is used to print the output.
        
        super.display();  //Super class display is called to print courseid, coursename and duration.
        
        if(isRegistered == true){  //If the course is registered then it output the course details.
            
            System.out.println("The lecturer name is: "+Lecturername);
            System.out.println("The level is: "+Level);
            System.out.println("The credit is: "+Credit);
            System.out.println("The startingdate is: "+StartingDate);
            System.out.println("The completiondate is: "+CompletionDate);
            System.out.println("The number of assessments is: "+NumberofAssessments);
        }        
    }    
}
