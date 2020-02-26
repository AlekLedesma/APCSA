
/**
 * Write a description of class Classroom here.
 *
 * @author (Alek Ledesma)
 * @version (2.25.20)
 */
import java.util.ArrayList;
public class Classroom
{
    ArrayList<Student> studentList;
    public Classroom()
    {
        studentList = new ArrayList<Student>();
    }
    public void addStudents(Student newStudent)
    {
        studentList.add(newStudent);
    }
    public void dropStudent(int position)
    {
        studentList.remove(position);   //requires an index
    }
    public void dropStudent(Student oldStudent)
    {
       int pos = -1;
        //Find index of student
       for (int i = 0; i < studentList.size(); i++)
       {
           if(oldStudent.equals(studentList.get(i)))
           {
               pos = i;
           }
       }
        //remove
       if (pos >= 0)
       {
           studentList.remove(pos);
       }
        
    }
    public void dropStudent(Integer ID)
    {
        int id = ID.intValue();
        
        int positionOfStudents = -1; //Default is not found
        for (int i = 0; i < studentList.size(); i++)
        {
            if (studentList.get(i).getID() == id)
            {
                positionOfStudents = i;
            }
        }
        if (positionOfStudents >= 0)
        {
            studentList.remove(positionOfStudents);
        }

    } 
}
