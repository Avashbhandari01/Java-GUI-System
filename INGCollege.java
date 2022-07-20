/**
 * Class:- INGCollege.
 * @author (Avash Bhandari)
 * @version (5.0.1)
 */
import java.awt.*; 
import javax.swing.*;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class INGCollege implements ActionListener
{
    //Instance Variables
    //Variable of Frame
    private JFrame f_Home,f_Academic,f_Nonacademic;
        
    //Variables of Panel
    private JPanel p, p2, p3;
    
    //Variables of JLabel of Home GUI
    private JLabel Wmsg_HG, Smsg_HG;
    
    //Varibales of JButton of Home GUI
    private JButton ACourse_HG, NACourse_HG;
        
    //Variables of JLabel of Academic Course
    private JLabel Academic_Course, CID_AC, CName_AC, Duration_AC, Level_AC, Credit_AC, NOA_AC,
    PanelNo_AC, CLeader_AC, LName_AC, SDate_AC, CDate_AC;
        
    //Variables of JTextField of Academic Course
    private JTextField fcid_AC, fcname_AC, fduration_AC, flevel_AC, fcredit_AC, fnoa_AC,
    fcleader_AC, flname_AC;
        
    //Variables of JComboBox of Academic Course
    private JComboBox sdyear_AC, sdmonth_AC, sdday_AC, cdyear_AC, cdmonth_AC, cdday_AC;
        
    //Variables of JButton of Academic Course
    private JButton btaddac_AC, btback_AC, btexit_AC, btregisterac_AC, btdisplay_AC,
    btclear_AC;
    
    //Variables of JLabel of Non-Academic Course
    private JLabel NonAcademic_Course, CID_NC, CName_NC, Duration_NC, Prerequisite_NC, PanelNo_NC, CLeader_NC, IName_NC,
    SDate_NC, CDate_NC, EDate_NC;
        
    //Variables of JTextField of Non-Academic Course
    private JTextField fcid_NC, fcname_NC, fduration_NC, fprerequisite_NC, fcleader_NC,
    finame_NC;
        
    //Variables of JComboBox of Non-Academic Course
    private JComboBox sdyear_NC, sdmonth_NC, sdday_NC, cdyear_NC, cdmonth_NC, cdday_NC, edyear_NC, edmonth_NC,
    edday_NC;
        
    //Variables of JButton Non-Academic Course
    private JButton btaddnc_NC, btremovenc_NC, btback_NC, btexit_NC, btregisternc_NC,
    btdisplay_NC, btclear_NC;
    
    //Creating Array List
    public static ArrayList<Course> AList = new ArrayList <Course>();
    public static AcademicCourse ACourse;
    public static NonAcademicCourse NACourse;
    
    public void Home_GUI() throws IOException
    {
        //Creating a Frame
        f_Home = new JFrame("INGCollege");
        f_Home.setBounds(450,220,630,440); 
        f_Home.setResizable(false);
        
        //Color of Frame
        Color f_color = new Color(250,250,239);
        f_Home.getContentPane().setBackground(f_color);
        
        //Creating a Panel
        JPanel p = new JPanel();
        p.setBounds(0,0,630,440);
        p.setBackground(f_color);
        
        //Ing Group Logo in Panel
        BufferedImage myPicture = ImageIO.read(new File("Logo.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setBounds(170,50,300,100);
        p.add(picLabel);
        
        //Welcome Message
        Wmsg_HG = new JLabel();
        Wmsg_HG.setText("Welcome to ING College!!!");
        Wmsg_HG.setBounds(175,180,680,40);
        
        //Font for Welcome Message
        Font font_welcomemsg = new Font("Times New Roman",Font.BOLD,25);
        Wmsg_HG.setFont(font_welcomemsg);
        p.add(Wmsg_HG);
        
        //Select Message
        Smsg_HG = new JLabel();
        Smsg_HG.setText("Select the course that you would like to study.");
        Smsg_HG.setBounds(75,235,680,40);
        
        //Font for Select Message
        Font font_selectmsg = new Font("Times New Roman",Font.BOLD,25);
        Smsg_HG.setFont(font_selectmsg);
        p.add(Smsg_HG);
        
        //Academic Course Button
        ACourse_HG = new JButton("Academic Course");
        ACourse_HG.setBounds(80,300,185,60);
        ACourse_HG.setFocusable(false);
        ACourse_HG.addActionListener(this);
        p.add(ACourse_HG);
        
        //Color for Academic Course Button
        Color academic_color = new Color(251, 235, 216);
        ACourse_HG.setBackground(academic_color);
        
        //Font for Academic Course Button
        Font font_academicourse = new Font("Times New Roman",Font.BOLD,18);
        ACourse_HG.setFont(font_academicourse);

        //Non Academic Course Button
        NACourse_HG = new JButton("Non-Academic Course");
        NACourse_HG.setBounds(300,300,220,60);
        NACourse_HG.setFocusable(false);
        NACourse_HG.addActionListener(this);
        p.add(NACourse_HG);
        
        // Color for Non Academic Course
        Color nonacademic_color = new Color(251, 235, 216);
        NACourse_HG.setBackground(nonacademic_color);
        
        //Font for Non Academic Course Button
        Font font_nonacademicourse = new Font("Times New Roman",Font.BOLD,18);
        NACourse_HG.setFont(font_nonacademicourse);
        
        f_Home.setVisible(true);
        f_Home.setLayout(null);
        p.setLayout(null);
        f_Home.add(p);
    }
    
    public void Academic_GUI(){
        //Creating a Frame
        f_Academic = new JFrame("Academic Course");
        f_Academic.setBounds(310,100,900,550);
        f_Academic.setResizable(false);
        
        //Color for Frame
        Color f_color = new Color(250,250,239);
        f_Academic.getContentPane().setBackground(f_color);
        
        //Panel for Heading 
        JPanel p = new JPanel();
        p.setBounds(0,0,900,70);
        
        //Adding Color to Heading Panel
        p.setBackground(f_color);
        
        //Left Panel
        JPanel p2 = new JPanel();
        p2.setBounds(35,85,400,390);
        
        //Adding color to left panel
        Color c = new Color(251, 235, 216); 
        p2.setBackground(c);
        
        //Right Panel
        JPanel p3 = new JPanel();
        p3.setBounds(455,85,400,390);
        
        //Adding color to right panel
        Color c2 = new Color(251, 235, 216);
        p3.setBackground(c2);
    
        //Academic Course
        Academic_Course = new JLabel("Academic Course");
        Academic_Course.setBounds(325,20,230,40);
        
        //Font For Academic Course
        Font font_academicourse = new Font("Times New Roman",Font.BOLD,30);
        Academic_Course.setFont(font_academicourse);
        p.add(Academic_Course);
        
        //Course ID
        CID_AC = new JLabel("Course ID:");
        CID_AC.setBounds(20,25,150,20);
        
        //Font for Course ID
        Font font = new Font("Times New Roman",Font.PLAIN,20);
        CID_AC.setFont(font);
        p2.add(CID_AC);
        
        //Jtextfield of Course ID
        fcid_AC = new JTextField();
        fcid_AC.setBounds(180,20,200,30);
        p2.add(fcid_AC);
        
        //Course Name
        CName_AC = new JLabel("Course Name:");
        CName_AC.setBounds(20,70,150,20);
        
        //Font for the Course Name
        CName_AC.setFont(font);
        p2.add(CName_AC);
        
        //Jtextfield of Course Name
        fcname_AC = new JTextField();
        fcname_AC.setBounds(180,65,200,30);
        p2.add(fcname_AC);
        
        //Duration
        Duration_AC = new JLabel("Duration:");
        Duration_AC.setBounds(20,115,150,20);
        
        //Font for the Duration
        Duration_AC.setFont(font);
        p2.add(Duration_AC);
        
        //Jtextfield of Duration
        fduration_AC = new JTextField();
        fduration_AC.setBounds(180,110,200,30);
        p2.add(fduration_AC);
        
        //Level
        Level_AC = new JLabel("Level:");
        Level_AC.setBounds(20,160,150,20);
        
        //Font for the Level
        Level_AC.setFont(font);
        p2.add(Level_AC);
        
        //Jtextfield of Level
        flevel_AC = new JTextField();
        flevel_AC.setBounds(180,155,200,30);
        p2.add(flevel_AC);
        
        //JLabel --> Credit
        Credit_AC = new JLabel("Credit:");
        Credit_AC.setBounds(20,205,150,20);
        
        //Font for the Credit
        Credit_AC.setFont(font);
        p2.add(Credit_AC);
        
        //Jtextfield of Credit
        fcredit_AC = new JTextField();
        fcredit_AC.setBounds(180,200,200,30);
        p2.add(fcredit_AC);
        
        //JLabel --> Number of Assessments
        NOA_AC = new JLabel("Number of Assessments:");
        NOA_AC.setBounds(20,250,210,20);
        
        //Font for the Number of Assessments
        NOA_AC.setFont(font);
        p2.add(NOA_AC);
        
        //Jtextfield of Number of Assessments
        fnoa_AC = new JTextField();
        fnoa_AC.setBounds(240,245,140,30);
        p2.add(fnoa_AC);
        
        //Add Course for Academic Course Button
        btaddac_AC = new JButton("Add Course for Academic Course");
        btaddac_AC.setBounds(20,305,360,40);
        btaddac_AC.setFocusable(false);
        btaddac_AC.addActionListener(this);
        p2.add(btaddac_AC);
        
        //Color for Add Academic Course
        Color addac_color = new Color(245, 227, 169);
        btaddac_AC.setBackground(addac_color); 
        
        //Back Button
        btback_AC = new JButton("Back");
        btback_AC.setBounds(20,15,65,40);
        btback_AC.setFocusable(false);
        btback_AC.addActionListener(this);
        p3.add(btback_AC);
        
        //Color for Back Button
        Color back_color = new Color(245, 227, 169);
        btback_AC.setBackground(back_color); 
        
        //Exit Button
        btexit_AC = new JButton("Exit Window");
        btexit_AC.setBounds(100,15,225,40);
        btexit_AC.setFocusable(false);
        btexit_AC.setForeground(Color.white);
        btexit_AC.addActionListener(this);
        p3.add(btexit_AC);
        
        //Color of Button Exit
        Color exit_color = new Color(255,102,102);
        btexit_AC.setBackground(exit_color);
        
        //Panel Number 1 of 2
        PanelNo_AC = new JLabel("1 of 2");
        PanelNo_AC.setBounds(340,15,110,25);
        p3.add(PanelNo_AC);
        
        //Course Leader
        CLeader_AC = new JLabel("Course Leader:");
        CLeader_AC.setBounds(20,80,150,20);

        //Font for Course Leader
        CLeader_AC.setFont(font);
        p3.add(CLeader_AC);
        
        //Jtextfield of Course Leader
        fcleader_AC = new JTextField();
        fcleader_AC.setBounds(180,75,200,30);
        p3.add(fcleader_AC);
        
        //Lecturer Name
        LName_AC = new JLabel("Lecturer Name:");
        LName_AC.setBounds(20,125,150,20);
        
        //Font for Lecturer Name
        LName_AC.setFont(font);
        p3.add(LName_AC);
        
        //Jtextfield of Lecturer Name
        flname_AC = new JTextField();
        flname_AC.setBounds(180,120,200,30);
        p3.add(flname_AC);
        
        //Starting Date
        SDate_AC = new JLabel("Starting Date:");
        SDate_AC.setBounds(20,170,150,20);
        
        //Font for the Starting Date
        SDate_AC.setFont(font);
        p3.add(SDate_AC);
        
        //ComboBox Starting Date Year
        String[] start_year ={"xxxx","1990","1991","1992","1993","1994",
                              "1995","1996","1997","1998","1999","2000",
                              "2001","2002","2003","2004","2005","2006",
                              "2007","2008","2009","2010","2011","2012",
                              "2013","2014","2015","2016","2017","2018",
                              "2019","2020","2021"}; 
        sdyear_AC = new JComboBox(start_year);
        sdyear_AC.setBounds(180,165,60,30);
        p3.add(sdyear_AC);
        
        //Color for Starting Year
        Color sdate_year = new Color(255, 255, 255);
        sdyear_AC.setBackground(sdate_year);  
        
        //ComboBox Starting Date Month
        String[] start_month ={"xx","January","Feburary","March",
                               "April","May","June","July",
                               "August","Semptember","October","November",
                               "December"};
        sdmonth_AC = new JComboBox(start_month);
        sdmonth_AC.setBounds(250,165,80,30);
        p3.add(sdmonth_AC);
        
        //Color for Starting Month
        Color sdate_month = new Color(255, 255, 255);
        sdmonth_AC.setBackground(sdate_month);
        
        //ComboBox Starting Date Day
        String[] start_day ={"xx","01","02","03","04",
                             "05","06","07","08","09",
                             "10","11","12","13","14",
                             "15","16","17","18","19",
                             "20","21","22","23","24",
                             "25","26","27","28","29",
                             "30","31"};
        sdday_AC = new JComboBox(start_day);
        sdday_AC.setBounds(340,165,40,30);
        p3.add(sdday_AC);
        
        //Color for Starting Day
        Color sdate_day = new Color(255, 255, 255);
        sdday_AC.setBackground(sdate_day);
        
        //Completion Date
        CDate_AC = new JLabel("Completion Date:");
        CDate_AC.setBounds(20,215,150,20);
        
        //Font for the Completion Date
        CDate_AC.setFont(font);
        p3.add(CDate_AC);
        
        //ComboBox Completion Date Year
        String[] complete_year ={"xxxx","1990","1991","1992","1993","1994",
                                 "1995","1996","1997","1998","1999","2000",
                                 "2001","2002","2003","2004","2005","2006",
                                 "2007","2008","2009","2010","2011","2012",
                                 "2013","2014","2015","2016","2017","2018",
                                 "2019","2020","2021"};                    
        cdyear_AC = new JComboBox(complete_year);
        cdyear_AC.setBounds(180,210,60,30);
        p3.add(cdyear_AC);
        
        //Color for Completion Year
        Color cdate_year = new Color(255, 255, 255);
        cdyear_AC.setBackground(cdate_year);
        
        //ComboBox Completion Date Month
        String[] complete_month ={"xx","January","Feburary","March",
                               "April","May","June","July",
                               "August","Semptember","October","November",
                               "December"};
        cdmonth_AC = new JComboBox(complete_month);
        cdmonth_AC.setBounds(250,210,80,30);
        p3.add(cdmonth_AC);
        
        //Color for Completion Month
        Color cdate_month = new Color(255, 255, 255);
        cdmonth_AC.setBackground(cdate_month);
        
        //ComboBox Completion Date Day
        String[] complete_day ={"xx","01","02","03","04",
                               "05","06","07","08","09",
                               "10","11","12","13","14",
                               "15","16","17","18","19",
                               "20","21","22","23","24",
                               "25","26","27","28","29",
                               "30","31"};
        cdday_AC = new JComboBox(complete_day);
        cdday_AC.setBounds(340,210,40,30);
        p3.add(cdday_AC);
        
        //Color for Completion Day
        Color cday_color = new Color(255, 255, 255);
        cdday_AC.setBackground(cday_color);
        
        //Register Academic Course Button
        btregisterac_AC = new JButton("Register Academic Course");
        btregisterac_AC.setBounds(20,270,360,40);
        btregisterac_AC.setFocusable(false);
        btregisterac_AC.addActionListener(this);
        p3.add(btregisterac_AC);
        
        //Color for Register Academic Course Button
        Color register_color = new Color(245, 227, 169);
        btregisterac_AC.setBackground(register_color); 
        
        //Display Button
        btdisplay_AC = new JButton("Display");
        btdisplay_AC.setBounds(20,330,165,40);
        btdisplay_AC.setFocusable(false);
        btdisplay_AC.addActionListener(this);
        p3.add(btdisplay_AC);
        
        //Color for Display Button
        Color display_color = new Color(245, 227, 169);
        btdisplay_AC.setBackground(display_color); 
        
        //Clear Button
        btclear_AC = new JButton("Clear");
        btclear_AC.setForeground(Color.white);
        btclear_AC.setBounds(215,330,165,40);
        btclear_AC.setFocusable(false);
        btclear_AC.addActionListener(this);
        p3.add(btclear_AC);
        
        //Color for Clear Button
        Color clear_color = new Color(255,102,102);
        btclear_AC.setBackground(clear_color);
        
        f_Academic.setVisible(true);
        f_Academic.setLayout(null);
        p.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        f_Academic.add(p);
        f_Academic.add(p2);
        f_Academic.add(p3);
    }
    
    public void NonAcademic_GUI(){
        f_Nonacademic = new JFrame("Non Academic Course");
        f_Nonacademic.setBounds(310,150,900,570);
        f_Nonacademic.setResizable(false);
        
        Color f_color = new Color(250,250,239);
        f_Nonacademic.getContentPane().setBackground(f_color);
        
        //Panel for Heading
        JPanel p = new JPanel();
        p.setBounds(0,0,900,70);
        p.setBackground(f_color);
        
        //Left Panel
        JPanel p2 = new JPanel();
        p2.setBounds(35,85,400,410);
        
        //Adding color to left panel
        Color c = new Color(251, 235, 216);
        p2.setBackground(c);
        
        //Right Panel
        JPanel p3 = new JPanel();
        p3.setBounds(455,85,400,410);
        
        //Adding color to right panel
        Color c2 = new Color(251, 235, 216);
        p3.setBackground(c2);
        
        //Non Academic Course
        NonAcademic_Course = new JLabel("Non Academic Course");
        NonAcademic_Course.setBounds(300,20,290,40);
        
        //Font for Non Academic Course
        Font font_nonacademicourse = new Font("Times New Roman",Font.BOLD,30);
        NonAcademic_Course.setFont(font_nonacademicourse);
        p.add(NonAcademic_Course);
        
        //Course ID
        CID_NC = new JLabel("Course ID:");
        CID_NC.setBounds(20,25,150,20);
        
        //Font for the Course ID
        Font font = new Font("Times New Roman",Font.PLAIN,20);
        CID_NC.setFont(font);
        p2.add(CID_NC);
        
        //Jtextfield of Course ID
        fcid_NC = new JTextField();
        fcid_NC.setBounds(180,20,200,30);
        p2.add(fcid_NC);
        
        //Course Name
        CName_NC = new JLabel("Course Name:");
        CName_NC.setBounds(20,70,150,20);
        
        //Font for the Course Name
        CName_NC.setFont(font);
        p2.add(CName_NC);
        
        //Jtextfield of Course Name
        fcname_NC = new JTextField();
        fcname_NC.setBounds(180,65,200,30);
        p2.add(fcname_NC);
        
        //Duration
        Duration_NC = new JLabel("Duration:");
        Duration_NC.setBounds(20,115,150,20);
        
        //Font for the Duration
        Duration_NC.setFont(font);
        p2.add(Duration_NC);
        
        //Jtextfield of Duration
        fduration_NC = new JTextField();
        fduration_NC.setBounds(180,110,200,30);
        p2.add(fduration_NC);
        
        //Prerequisite
        Prerequisite_NC = new JLabel("Prerequisite:");
        Prerequisite_NC.setBounds(20,160,150,20);
        
        //Font for the Prerequisite
        Prerequisite_NC.setFont(font);
        p2.add(Prerequisite_NC);
        
        //Jtextfield of Prerequisite
        fprerequisite_NC = new JTextField();
        fprerequisite_NC.setBounds(180,155,200,30);
        p2.add(fprerequisite_NC);
        
        //Add Course for Non-Academic Course Button
        btaddnc_NC = new JButton("Add Course for Non-Academic Course");
        btaddnc_NC.setBounds(20,220,360,40);
        btaddnc_NC.setFocusable(false);
        btaddnc_NC.addActionListener(this);
        p2.add(btaddnc_NC);
        
        //Color for Add Non Academic Course Button
        Color add_color = new Color(245, 227, 169);
        btaddnc_NC.setBackground(add_color);
        
        //JButton Remove Non-Academic Course
        btremovenc_NC = new JButton("Remove Non-Academic Course");
        btremovenc_NC.setBounds(20,280,360,40);
        btremovenc_NC.setFocusable(false);
        btremovenc_NC.addActionListener(this);
        p2.add(btremovenc_NC);
        
        //Color for Remove Non Academic Button
        Color remove_color = new Color(245, 227, 169);
        btremovenc_NC.setBackground(remove_color);
        
        //Panel Number 2 of 2
        PanelNo_NC = new JLabel("2 of 2");
        PanelNo_NC.setBounds(340,15,110,25);
        p3.add(PanelNo_NC); 
        
        //Back Button
        btback_NC = new JButton("Back");
        btback_NC.setBounds(20,15,65,40);
        btback_NC.setFocusable(false);
        btback_NC.addActionListener(this);
        p3.add(btback_NC);
        
        //Color for Back Button
        Color back_color = new Color(245, 227, 169);
        btback_NC.setBackground(back_color);
        
        //Exit Window Button
        btexit_NC = new JButton("Exit Window");
        btexit_NC.setBounds(100,15,225,40);
        btexit_NC.setForeground(Color.white);
        btexit_NC.setFocusable(false);
        btexit_NC.addActionListener(this);
        p3.add(btexit_NC);
        
        //Color for Exit Window Button
        Color exit_color = new Color(255,102,102);
        btexit_NC.setBackground(exit_color);
        
        //Course Leader
        CLeader_NC = new JLabel("Course Leader:");
        CLeader_NC.setBounds(20,75,150,20);
        
        //Font for the Course Leader
        CLeader_NC.setFont(font);
        p3.add(CLeader_NC);
        
        //Jtextfield of Course Leader
        fcleader_NC = new JTextField();
        fcleader_NC.setBounds(180,70,200,30);
        p3.add(fcleader_NC);
        
        //Instructor Name
        IName_NC = new JLabel("Instructor Name:");
        IName_NC.setBounds(20,120,150,20);
        
        //Font for the Instructor Name
        IName_NC.setFont(font);
        p3.add(IName_NC);
        
        //Jtextfield of Instructor Name
        finame_NC = new JTextField();
        finame_NC.setBounds(180,115,200,30);
        p3.add(finame_NC);
        
        //Starting Date
        SDate_NC = new JLabel("Starting Date:");
        SDate_NC.setBounds(20,165,150,20);
        
        //Font for the Starting Date
        SDate_NC.setFont(font);
        p3.add(SDate_NC);
        
        //ComboBox Starting Date Year
        String[] start_year ={"xxxx","1990","1991","1992",
                              "1993","1994","1995","1996",
                              "1997","1998","1999","2000",
                              "2001","2002","2003","2004",
                              "2005","2006","2007","2008",
                              "2009","2010","2011","2012",
                              "2013","2014","2015","2016",
                              "2017","2018","2019","2020",
                              "2021"};
        sdyear_NC = new JComboBox(start_year);
        sdyear_NC.setBounds(180,160,60,30);
        p3.add(sdyear_NC);
        
        //Color for Starting Date Year
        Color syear_color = new Color(255, 255, 255);
        sdyear_NC.setBackground(syear_color);
        
        //ComboBox Starting Date Month
        String[] start_month ={"xx","January","Feburary","March",
                               "April","May","June","July",
                               "August","Semptember","October","November",
                               "December"};
        sdmonth_NC = new JComboBox(start_month);
        sdmonth_NC.setBounds(250,160,80,30);
        p3.add(sdmonth_NC);
        
        //Color for Starting Date Month
        Color smonth_color = new Color(255, 255, 255);
        sdmonth_NC.setBackground(smonth_color);
        
        //ComboBox Starting Date Day
        String[] start_day ={"xx","01","02","03","04",
                             "05","06","07","08","09",
                             "10","11","12","13","14",
                             "15","16","17","18","19",
                             "20","21","22","23","24",
                             "25","26","27","28","29",
                             "30","31"};
        sdday_NC = new JComboBox(start_day);
        sdday_NC.setBounds(340,160,40,30);
        p3.add(sdday_NC);
        
        //Color for Starting Date Day
        Color sday_color = new Color(255, 255, 255);
        sdday_NC.setBackground(sday_color);
        
        //Completion Date
        CDate_NC = new JLabel("Completion Date:");
        CDate_NC.setBounds(20,210,150,20);
        
        //Font for the Completion Date
        CDate_NC.setFont(font);
        p3.add(CDate_NC);
        
        //JComboBox Completion Date Year
        String[] complete_year ={"xxxx","1990","1991","1992",
                                 "1993","1994","1995","1996",
                                 "1997","1998","1999","2000",
                                 "2001","2002","2003","2004",
                                 "2005","2006","2007","2008",
                                 "2009","2010","2011","2012",
                                 "2013","2014","2015","2016",
                                 "2017","2018","2019","2020",
                                 "2021"};
        cdyear_NC = new JComboBox(complete_year);
        cdyear_NC.setBounds(180,205,60,30);
        p3.add(cdyear_NC);
        
        //Color for Completion Date Year
        Color cyear_color = new Color(255, 255, 255);
        cdyear_NC.setBackground(cyear_color);
        
        //JComboBox Completion Date Month
        String[] complete_month ={"xx","January","Feburary","March",
                                  "April","May","June","July",
                                  "August","Semptember","October","November",
                                  "December"};
        cdmonth_NC = new JComboBox(complete_month);
        cdmonth_NC.setBounds(250,205,80,30);
        p3.add(cdmonth_NC);
        
        //Color for Completion Date Month
        Color cmonth_color = new Color(255, 255, 255);
        cdmonth_NC.setBackground(cmonth_color);
        
        //JComboBox Completion Date Day
        String[] complete_day ={"xx","01","02","03","04",
                                "05","06","07","08","09",
                                "10","11","12","13","14",
                                "15","16","17","18","19",
                                "20","21","22","23","24",
                                "25","26","27","28","29",
                                "30","31"};
        cdday_NC = new JComboBox(complete_day);
        cdday_NC.setBounds(340,205,40,30);
        p3.add(cdday_NC);
        
        //Color for Completion Date Day
        Color cday_color = new Color(255, 255, 255);
        cdday_NC.setBackground(cday_color);
        
        //Exam Date
        EDate_NC = new JLabel("Exam Date:");
        EDate_NC.setBounds(20,255,150,20);
        
        //Font for the Exam Date
        EDate_NC.setFont(font);
        p3.add(EDate_NC);
        
        //JComboBox Exam Date Year
        String[] exam_year ={"xxxx","1990","1991","1992",
                             "1993","1994","1995","1996",
                             "1997","1998","1999","2000",
                             "2001","2002","2003","2004",
                             "2005","2006","2007","2008",
                             "2009","2010","2011","2012",
                             "2013","2014","2015","2016",
                             "2017","2018","2019","2020",
                             "2021"};
        edyear_NC = new JComboBox(exam_year);
        edyear_NC.setBounds(180,250,60,30);
        p3.add(edyear_NC);
        
        //Color for Exam Date Day
        Color eyear_color = new Color(255, 255, 255);
        edyear_NC.setBackground(eyear_color);
        
        //JComboBox Exam Date Month
        String[] exam_month ={"xx","January","Feburary","March",
                              "April","May","June","July",
                              "August","Semptember","October","November",
                              "December"};
        edmonth_NC = new JComboBox(exam_month);
        edmonth_NC.setBounds(250,250,80,30);
        p3.add(edmonth_NC);
        
        //Color for Exam Date Day
        Color emonth_color = new Color(255, 255, 255);
        edmonth_NC.setBackground(emonth_color);
        
        //JComboBox Exam Date Day
        String[] exam_day ={"xx","01","02","03","04",
                            "05","06","07","08","09",
                            "10","11","12","13","14",
                            "15","16","17","18","19",
                            "20","21","22","23","24",
                            "25","26","27","28","29",
                            "30","31"};
        edday_NC = new JComboBox(exam_day);
        edday_NC.setBounds(340,250,40,30);
        p3.add(edday_NC);
        
        //Color for Exam Date Day
        Color eday_color = new Color(255, 255, 255);
        edday_NC.setBackground(eday_color);
        
        //Register Non Academic Course Button
        btregisternc_NC = new JButton("Register Non-Academic Course");
        btregisternc_NC.setBounds(20,300,360,40);
        btregisternc_NC.setFocusable(false);
        btregisternc_NC.addActionListener(this);
        p3.add(btregisternc_NC);
        
        //Color for Register Non Academic Button
        Color register_color = new Color(245, 227, 169);
        btregisternc_NC.setBackground(register_color);
        
        //Display Button
        btdisplay_NC = new JButton("Display");
        btdisplay_NC.setBounds(20,355,165,40);
        btdisplay_NC.setFocusable(false);
        btdisplay_NC.addActionListener(this);
        p3.add(btdisplay_NC);
        
        //Color for Display Button
        Color display_color = new Color(245, 227, 169);
        btdisplay_NC.setBackground(display_color); 
        
        //Clear Button
        btclear_NC = new JButton("Clear");
        btclear_NC.setForeground(Color.white);
        btclear_NC.setBounds(215,355,165,40);
        btclear_NC.setFocusable(false);
        btclear_NC.addActionListener(this);
        p3.add(btclear_NC);
        
        //Color for Clear Button
        Color clear_color = new Color(255,102,102);
        btclear_NC.setBackground(clear_color);
    
        f_Nonacademic.setVisible(true);
        f_Nonacademic.setLayout(null);
        p.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        f_Nonacademic.add(p3);
        f_Nonacademic.add(p2);
        f_Nonacademic.add(p);
    }
    
    // Giving method body to the interface method
    public void actionPerformed(ActionEvent e){
        
        //In home page when Academic Button is clicked it takes to Academic Course Frame.
        if(e.getSource() == ACourse_HG){
            f_Home.dispose();
            Academic_GUI();
        
        }
        
        //In home page when Non-Academic Button is clicked it takes to Non-Academic Course Frame.
        else if(e.getSource() == NACourse_HG){
            f_Home.dispose();
            NonAcademic_GUI();
        
        }
        
        //In Academic Course Frame when Exit Window Button is clicked frame is closed
        else if(e.getSource() == btexit_AC){
            f_Academic.dispose(); 
        
        }
    
        //In Academic Course Frame when Back Button is clicked takes back Home Frame
        else if(e.getSource() == btback_AC){
        
            f_Academic.dispose();
        
            try
            {
                Home_GUI();
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
    
        //In Non-Academic Course Frame when Back Button is clicked takes back Home Frame
        else if(e.getSource() == btback_NC){
            f_Nonacademic.dispose();
        
            try
            {
                Home_GUI();
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }   
        }
    
        //In Non-Academic Course Frame when Exit Window Button is clicked frame is closed
        else if(e.getSource() ==  btexit_NC){
            f_Nonacademic.dispose(); 
        
        }
    
        //When the button is clicked Academic Course is added
        else if(e.getSource() == btaddac_AC){
            String CourseId = fcid_AC.getText();
            String CourseName = fcname_AC.getText();
            String Duration = fduration_AC.getText();
            String Level = flevel_AC.getText();
            String Credit = fcredit_AC.getText();
            String NumberOfAssessments = fnoa_AC.getText();
        
            if(CourseId.isEmpty() || CourseName.isEmpty() || Duration.isEmpty() || Level.isEmpty() || Credit.isEmpty() 
                || NumberOfAssessments.isEmpty())
                {
                    
                //Dialog Box for empty text fields
                JOptionPane dialogemptyfield_AC = new JOptionPane();
                String message = "Please fill up all the text fields!!";
                dialogemptyfield_AC.showMessageDialog(f_Academic , message);
                }
            else{
                
                boolean repeatedCourseID = false;
                boolean isValid = true;
            
                for(Course course_obj : AList){
                    if (course_obj.getcourseID().equals(CourseId)){
                        //Dialog box for same Course Id.
                        JOptionPane dialognotadded_AC = new JOptionPane();
                        String message = "This Course ID has already been added.";
                        dialognotadded_AC.showMessageDialog(f_Academic , message);
                        repeatedCourseID = true;
                        break;
                    }
                }   
                
                if(repeatedCourseID != true){
                    
                    int intDuration = 0;
                    int intAssessments = 0;
                    
                    try{
                        intDuration = Integer.parseInt(fduration_AC.getText());
                        intAssessments = Integer.parseInt(fnoa_AC.getText());
                
                    }
            
                    catch(NumberFormatException exception){
                        //Dialog Box for invalid Academic Course.
                        JOptionPane dialoginvalid_AC = new JOptionPane();
                        String message = "Invalid input for Duration and Number of Assessments.";
                        dialoginvalid_AC.showMessageDialog(f_Academic , message);
                        isValid = false;
                    }
                    
                    if(isValid == true){
                        ACourse = new AcademicCourse(CourseId,CourseName,intDuration,Level,Credit,intAssessments);
                        AList.add(ACourse);
            
                        //Dialog Box for successfully added Academic Course.
                        JOptionPane dialogadded_AC = new JOptionPane();
                        String message = "The Course has been added.";
                        dialogadded_AC.showMessageDialog(f_Academic , message);
                    }
                }
        }
        
        }
        
        //When the button is clicked Non-Academic Course is added.
        else if(e.getSource() == btaddnc_NC){
            String CourseId = fcid_NC.getText();
            String CourseName = fcname_NC.getText();
            String Duration = fduration_NC.getText();
            String Prerequisite = fprerequisite_NC.getText();
        
        if(CourseId.isEmpty() || CourseName.isEmpty() || Duration.isEmpty() || Prerequisite.isEmpty())
        {
                    
            //Dialog Box for empty text fields
            JOptionPane dialogemptyfield_AC = new JOptionPane();
            String message = "Please fill up all the text fields!!";
            dialogemptyfield_AC.showMessageDialog(f_Nonacademic , message);
        }
        else{
            
            boolean repeatedCourseID = false;
            boolean isValid = true;
            
            for(Course course_obj : AList){
            
                if (course_obj.getcourseID().equals(CourseId)){
                
                    //Dialog box for same Course Id.
                    JOptionPane dialognotadded_AC = new JOptionPane();
                    String message = "This Course ID has already been added.";
                    dialognotadded_AC.showMessageDialog(f_Nonacademic , message);
                    repeatedCourseID = true;
                    break;
                }
            }
        
            if(repeatedCourseID != true){
                
                int intDuration = 0;
                
                try{
                    intDuration = Integer.parseInt(Duration);
                    
                }
                catch(NumberFormatException exception){
                    //Dialog Box for invalid Academic Course.
                    JOptionPane dialoginvalid_NC = new JOptionPane();
                    String message = "Invalid input for Duration";
                    dialoginvalid_NC.showMessageDialog(f_Nonacademic , message);
                    isValid = false;
                    
                }
                
                if(isValid == true){
                    NACourse = new NonAcademicCourse(CourseId,CourseName,intDuration,Prerequisite);
                    AList.add(NACourse);
            
                    //Dialog Box for successfully added Academic Course.
                    JOptionPane dialogadded_NC = new JOptionPane();
                    String message = "The Course has been added.";
                    dialogadded_NC.showMessageDialog(f_Nonacademic , message);
                }
            }
        }   
        }
        
        //Clear all the textfield of Academic Course when the button is clicked.
        else if(e.getSource() == btclear_AC){
            
            fcid_AC.setText("");
            fcname_AC.setText("");
            fduration_AC.setText("");
            flevel_AC.setText("");
            fcredit_AC.setText("");
            fnoa_AC.setText("");
            fcleader_AC.setText("");
            flname_AC.setText("");
            sdyear_AC.setSelectedItem("xxxx");
            sdmonth_AC.setSelectedItem("xx");
            sdday_AC.setSelectedItem("xx");
            cdyear_AC.setSelectedItem("xxxx");
            cdmonth_AC.setSelectedItem("xx");
            cdday_AC.setSelectedItem("xx");
        }
        
        //Clear all the textfield of Non-Academic Course when the button is clicked.
        else if(e.getSource() == btclear_NC){
            
            fcid_NC.setText("");
            fcname_NC.setText("");
            fduration_NC.setText("");
            fprerequisite_NC.setText("");
            fcleader_NC.setText("");
            finame_NC.setText("");
            sdyear_NC.setSelectedItem("xxxx");
            sdmonth_NC.setSelectedItem("xx");
            sdday_NC.setSelectedItem("xx");
            cdyear_NC.setSelectedItem("xxxx");
            cdmonth_NC.setSelectedItem("xx");
            cdday_NC.setSelectedItem("xx");
            edyear_NC.setSelectedItem("xxxx");
            edmonth_NC.setSelectedItem("xx");
            edday_NC.setSelectedItem("xx");
        }
        
        //Register Academic Course
        else if(e.getSource() == btregisterac_AC){
            String CourseID = fcid_AC.getText();
            String CourseLeader = fcleader_AC.getText();
            String LecturerName = flname_AC.getText();
            String SDateYear = (sdyear_AC.getSelectedItem()).toString();
            String SDateMonth = (sdmonth_AC.getSelectedItem()).toString();
            String SDateDay = (sdday_AC.getSelectedItem()).toString();
            String CDateYear = (cdyear_AC.getSelectedItem()).toString();
            String CDateMonth = (cdmonth_AC.getSelectedItem()).toString();
            String CDateDay = (cdday_AC.getSelectedItem()).toString();
            String StartingDate = SDateYear + SDateMonth + SDateDay;
            String CompletionDate = CDateYear + CDateMonth + CDateDay;
            
            if(CourseID.isEmpty() || CourseLeader.isEmpty() || LecturerName.isEmpty() || SDateYear.equals("xxxx") ||
                SDateMonth.equals("xx") || SDateDay.equals("xx") || CDateYear.equals("xxxx") || CDateMonth.equals("xx") ||
                CDateDay.equals("xx"))
            {
                    
                //Dialog Box for empty text fields
                JOptionPane dialogemptyfield_AC = new JOptionPane();
                String message = "Please fill up all the text fields!!";
                dialogemptyfield_AC.showMessageDialog(f_Academic , message);
            }
            else{
                
                boolean repeatedCourseID = false;
                
                for(Course course_obj : AList){
                    if(course_obj.getcourseID().equals(CourseID)){
                        if(course_obj instanceof AcademicCourse){
                            ACourse = (AcademicCourse)course_obj;
                            repeatedCourseID = true;
                            
                            if(ACourse.getisRegistered() != true){
                                ACourse.register(CourseLeader,LecturerName,StartingDate,CompletionDate);
                                
                                //Dialog Box for Academic Course Registered.
                                JOptionPane dialogregisteredfield_AC = new JOptionPane();
                                String message = "Academic Course has been registered.";
                                dialogregisteredfield_AC.showMessageDialog(f_Academic , message);
                                AList.add(ACourse);
                                break;
                            }
                            else{
                                //Dialog Box for Academic Course which was already Registered.
                                JOptionPane dialogalreadyregisteredfield_AC = new JOptionPane();
                                String message = "Academic Course has already been registered.";
                                dialogalreadyregisteredfield_AC.showMessageDialog(f_Academic , message);
                                break;
                            }
                        }
                    }
                }
                
                if(repeatedCourseID != true){
                    
                    //Dialog Box for Course ID doesnt exist for Academic Course
                    JOptionPane dialogadded_AC = new JOptionPane();
                    String message = "The Course ID you are trying to register doesnot exist.";
                    dialogadded_AC.showMessageDialog(f_Academic , message);
                    }
            }
        }
        
        //Register Non-Academic Course
        else if(e.getSource() == btregisternc_NC){
            String CourseID = fcid_NC.getText();
            String CourseLeader = fcleader_NC.getText();
            String InstructorName = finame_NC.getText();
            String SDateYear = (sdyear_NC.getSelectedItem()).toString();
            String SDateMonth = (sdmonth_NC.getSelectedItem()).toString();
            String SDateDay = (sdday_NC.getSelectedItem()).toString();
            String CDateYear = (cdyear_NC.getSelectedItem()).toString();
            String CDateMonth = (cdmonth_NC.getSelectedItem()).toString();
            String CDateDay = (cdday_NC.getSelectedItem()).toString();
            String EDateYear = (edyear_NC.getSelectedItem()).toString();
            String EDateMonth = (edmonth_NC.getSelectedItem()).toString();
            String EDateDay = (edday_NC.getSelectedItem()).toString();
            String StartingDate = SDateYear + SDateMonth + SDateDay;
            String CompletionDate = CDateYear + CDateMonth + CDateDay;
            String ExamDate = EDateYear + EDateMonth + EDateDay;
            
            if(CourseID.isEmpty() || CourseLeader.isEmpty() || InstructorName.isEmpty() || SDateYear.equals("xxxx") ||
                SDateMonth.equals("xx") || SDateDay.equals("xx") || CDateYear.equals("xxxx") || CDateMonth.equals("xx") ||
                CDateDay.equals("xx") || EDateYear.equals("xxxx") || EDateMonth.equals("xx") || EDateDay.equals("xx")){
                    
                //Dialog Box for empty text fields
                JOptionPane dialogemptyfield_NC = new JOptionPane();
                String message = "Please fill up all the text fields!!";
                dialogemptyfield_NC.showMessageDialog(f_Nonacademic , message);   
                }
            else{
                
                boolean repeatedCourseID = false;
                
                for(Course course_obj : AList){
                    if(course_obj. getcourseID().equals(CourseID)){
                        if(course_obj instanceof NonAcademicCourse){
                            NACourse = (NonAcademicCourse)course_obj;
                            repeatedCourseID = true;
                            
                            if(NACourse.getisRegistered() != true){
                                NACourse.register(CourseLeader,InstructorName,StartingDate,CompletionDate,ExamDate);
                                //Dialog Box for Non Academic Course Registered.
                                JOptionPane dialogregisteredfield_NC = new JOptionPane();
                                String message = "Non-Academic Course has been registered.";
                                dialogregisteredfield_NC.showMessageDialog(f_Nonacademic , message);
                                AList.add(NACourse);
                                break;
                            }
                            else{
                                //Dialog Box for Non Academic Course which was already Registered.
                                JOptionPane dialogalreadyregisteredfield_AC = new JOptionPane();
                                String message = "Non-Academic Course has already been registered.";
                                dialogalreadyregisteredfield_AC.showMessageDialog(f_Nonacademic , message);
                                break;
                            }
                        }
                
                    }
                }
                if(repeatedCourseID != true){
                    
                    //Dialog Box for Course ID doesnt exist in Non Academic Course.
                    JOptionPane dialogadded_NC = new JOptionPane();
                    String message = "The Course ID you are trying to register doesnot exist.";
                    dialogadded_NC.showMessageDialog(f_Nonacademic , message);
                }
            }    
        }
            
        //Displaying Academic Course
        else if(e.getSource() == btdisplay_AC){
            boolean isEmpty = true;
            boolean repeatedCourseID = false;
            
            for(Course course_obj : AList){
                isEmpty = false;
                
                if(course_obj.getcourseID().equals(fcid_AC.getText())){
                    if (course_obj instanceof AcademicCourse){
                        ACourse = (AcademicCourse)course_obj;
                        
                        //Dialog Box for Displaying all the details of Academic Course.
                        JOptionPane dialogdisplay_AC = new JOptionPane();
                        String message = "\n The Course ID is "+ACourse.getcourseID() +
                             "\n The Course Name is "+ACourse.getcourseName() + 
                             "\n The Duration is "+ACourse.getduration() + 
                             "\n The Level is "+ACourse.getLevel() +
                             "\n The Credit is "+ACourse.getCredit() +
                             "\n The Number Of Asessments is "+ACourse.getNumberofAssessments() + 
                             "\n The Course Leader is "+ACourse.getcourseLeader() + 
                             "\n The Lecturer Name is "+ACourse.getLecturername() + 
                             "\n The Starting Date is "+ACourse.getStartingDate() + 
                             "\n The Completion Date is "+ACourse.getCompletionDate();               
                        dialogdisplay_AC.showMessageDialog(f_Academic , message);
                        repeatedCourseID = true;
                        break;
                        
                    }
                }
            }
            
            if(isEmpty == true){
                //Dialog Box Course is Empty
                JOptionPane dialogdisplay_AC = new JOptionPane();
                String message = "The Course that you are trying to display is empty.";
                dialogdisplay_AC.showMessageDialog(f_Academic , message);
            }
            
            else if(repeatedCourseID == false){
                //Dialog Box Course ID not found
                JOptionPane dialogdisplay_AC = new JOptionPane();
                String message = "The Course ID that you are trying to display not found.";
                dialogdisplay_AC.showMessageDialog(f_Academic , message);
            }
            
        }
        
        //Displaying Non-Academic Course
        else if(e.getSource() == btdisplay_NC){
            boolean isEmpty = true;
            boolean repeatedCourseID = false;
            
            for(Course course_obj : AList){
                isEmpty = false;
                
                if(course_obj.getcourseID().equals(fcid_NC.getText())){
                    if (course_obj instanceof NonAcademicCourse){
                        NACourse = (NonAcademicCourse)course_obj;
                        
                        //Dialog Box for Displaying all the details of Non Academic Course.
                        JOptionPane dialogdisplay_NC = new JOptionPane();
                        String message = "\n The Course ID is "+NACourse.getcourseID() +
                             "\n The Course Name is "+NACourse.getcourseName() + 
                             "\n The Duration is "+NACourse.getduration() + 
                             "\n The Prerequisite is "+NACourse.getPrerequisite() + 
                             "\n The Course Leader is "+NACourse.getcourseLeader() + 
                             "\n The Starting Date is "+NACourse.getStartdate() + 
                             "\n The Completion Date is "+NACourse.getCompletiondate() +
                             "\n The Examination Date is "+NACourse.getExamdate(); 
                        dialogdisplay_NC.showMessageDialog(f_Nonacademic , message);
                        repeatedCourseID = true;
                        break;
                        
                    }
                }
            }
            
            if(isEmpty == true){
                //Dialog Box Course is Empty Non Academic Course
                JOptionPane dialogdisplay_NC = new JOptionPane();
                String message = "The Course that you are trying to display is empty.";
                dialogdisplay_NC.showMessageDialog(f_Nonacademic , message);
            }
            
            else if(repeatedCourseID == false){
                //Dialog Box Course ID not found
                JOptionPane dialogdisplay_NC = new JOptionPane();
                String message = "The Course ID that you are trying to display is not found.";
                dialogdisplay_NC.showMessageDialog(f_Nonacademic , message);
            }
            
        }
        
        //Removing Non-Academic Course
        else if(e.getSource() == btremovenc_NC){
            boolean isEmpty = true;
            boolean repeatedCourseID = false;
            boolean alreadyRemoved = false;
                
            for(Course course_obj : AList){
                isEmpty = false;
                    
                if(course_obj.getcourseID().equals(fcid_NC.getText())){
                    repeatedCourseID = true;
                    
                    if (course_obj instanceof NonAcademicCourse){
                        NACourse = (NonAcademicCourse)course_obj;
                        
                        if(NACourse.getisRemoved() == true){
                            alreadyRemoved = true;
                            break;
                        }
                        else{
                            NACourse.remove();
                            //Dialog The Course is removed.
                            JOptionPane dialogdisplay_NC = new JOptionPane();
                            String message = "The Course has been removed.";
                            dialogdisplay_NC.showMessageDialog(f_Nonacademic , message); 
                            break;
                        }
                    }

                }
            }
            
            if(isEmpty == true){
                //Dialog Box Course is Empty Non Academic Course.
                JOptionPane dialogdisplay_NC = new JOptionPane();
                String message = "The Course that you are trying to remove is doesn't exist";
                dialogdisplay_NC.showMessageDialog(f_Nonacademic , message);
            }
            
            else if(repeatedCourseID == false){
                //Dialog Box Course ID not found Non-Academic Course.
                JOptionPane dialogdisplay_NC = new JOptionPane();
                String message = "The Course ID that you are trying to remove is not found.";
                dialogdisplay_NC.showMessageDialog(f_Nonacademic , message);
            }
            
            else if(alreadyRemoved == true){
                //Dialog Box Non Academic Course has already been removed
                JOptionPane dialogalready_NC = new JOptionPane();
                String message = "The Non-Academic Course has already been removed.";
                dialogalready_NC.showMessageDialog(f_Nonacademic , message);
            }
            
        }
    }
    
    public static void main(String[]Args){
        INGCollege obj = new INGCollege();
        
        try
        {
            obj.Home_GUI();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    } 
    }
    

