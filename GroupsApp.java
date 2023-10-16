/*
* GroupsApp.java
* @author: Ata Turkoglu & Idil Zehra Tatar
* Date: 14/02/2023
*/

import javax.swing.JOptionPane;
public class GroupsApp{
    public static void main(String args[]){
        //Declare variables
        int students, groups, remainder, size;

        //Declare objects 
        Groups myGroups;

        //Create objects
        myGroups = new Groups();

        //Input 
        students = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of the students: "));
        myGroups.setStudents(students);
        size = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter group size: "));
        myGroups.getSize(size);

        //Process
        myGroups.computeGroups();
        myGroups.computeRemainder();

        //Output
        groups = myGroups.getGroups();
        remainder = myGroups.getRemainder();

        JOptionPane.showMessageDialog(null,"You can make "+groups+" groups with "+remainder+" leftover.");
    }
}