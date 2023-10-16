/*
* Groups.java
* @author: Ata Turkoglu & Idil Zehra Tatar
* Date: 14/02/2023
*/

public class Groups {
    //Declare data members - All private
    private int students;
    private int groups;
    private int remainder;
    private int size;

     //Constructor - Same name as the class, give each variable a default value 
     public Groups(){
        students = 0;
        groups = 0;
        remainder = 0;
        size = 0;
    }

    //Setters - One for every input variable
    public void setStudents(int students){
        this.students = students;
    }
    public void getSize(int size){
        this.size = size;
    }

    //Compute method(s)
    public void computeGroups(){
        groups = students/size;
    }
    public void computeRemainder(){
        remainder = students%size;
    }

    //Getters - One for every output variable
    public int getGroups(){
        return groups;
    }
    public int getRemainder(){
        return remainder;
    }
}
