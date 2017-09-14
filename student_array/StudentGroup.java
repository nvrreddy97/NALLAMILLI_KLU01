import java.util.Date;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private final Student[] students;
        int i,len=0;	
	LinkedList<Student> p=new LinkedList<>();
	public StudentGroup(int length) {
		this.students = new Student[length];
	len=length;
        }

	
        @Override
	public Student[] getStudents() {
                
		return students;
	}


        @Override
	public void setStudents(Student[] students) throws IllegalArgumentException {
	
        if(students!=null){
           for(int x=0;x<p.size();x++)p.add(students[x]);
        }
        else{
            throw new IllegalArgumentException();
        }
	}


        @Override
	public Student getStudent(int index)  throws IllegalArgumentException{
		if(index>=0&&index<p.size())return p.get(index);
         else{
            throw new IllegalArgumentException();
        }
	}

	
        @Override
	public void setStudent(Student student, int index) throws IllegalArgumentException{
		if(index>=0&&index<p.size())p.set(index, student);
	else{
            throw new IllegalArgumentException();
        }
        }

	
        @Override
	public void addFirst(Student student) throws IllegalArgumentException{
		p.set(0, student);
	
        }

	
        @Override
	public void addLast(Student student) {
	p.set((p.size()-1), student);
	}


        @Override
	public void add(Student student, int index)throws IllegalArgumentException {
		
                if(index>=0&&index<p.size())p.set(index, student);
                  else{
            throw new IllegalArgumentException();
        }
                
               
	}

	
        @Override
	public void remove(int index) throws IllegalArgumentException{
		if(index>=0&&index<p.size())p.remove(index);
	else{
            throw new IllegalArgumentException();
        }
        }

	
        @Override
	public void remove(Student student)throws IllegalArgumentException {
	int k=0,x;
            if(student!=null){
            for(x=0;x<p.size();x++)
            {
                if(p.get(x)==student)
                {
                    p.set(i,null);
               k=1;
                    break;
                }
            }
        }
        if(k==0)System.out.println("Student not exist");
        else{
            throw new IllegalArgumentException();
        }
        }

	
        @Override
	public void removeFromIndex(int index) throws IllegalArgumentException{
		
            if(index>=0&&index<p.size()){
                  p.remove(index);
                }
	else{
            throw new IllegalArgumentException();
        }
        }

	
        @Override
	public void removeFromElement(Student student)  throws IllegalArgumentException{
	int f=0,x;
            if(student!=null){
           for(x=0;x<p.size();x++)if(p.get(x)==student)break;
           while(x<p.size()){
               if(p.get(i)==student)p.set(x,null);
               x++;
           }
	}
        else{
            throw new IllegalArgumentException();
        }
        }
	
        @Override
	public void removeToIndex(int index) throws IllegalArgumentException{
		if(index>=0&&index<p.size()){
                    for(int x=index+1;x<p.size();x++)p.set(x,null);
                }
	else{
            throw new IllegalArgumentException();
        }
        }

	
        @Override
	public void removeToElement(Student student) throws IllegalArgumentException{
		if(student!=null){
                    for(i=0;i<p.size();i++)if(p.get(i)==student)break;
                    while(i<p.size()){
                        if(p.get(i)==student)p.set(i, null);
                    }
                }
	else{
            throw new IllegalArgumentException();
        }
        }

	
        @Override
	public void bubbleSort() {
		int s;
                Student temp;
                for(int r=0;r<p.size();r++){
                    for(s=r+1;s<p.size();s++){
                        if(p.get(r).getId()>p.get(s).getId()){
                            temp=p.get(r);
                            p.set(r,p.get(s));
                            p.set(s,temp);
                        }
                    }
                }
	}

	
        @Override
	public Student[] getByBirthDate(Date date)throws IllegalArgumentException {
		if(date!=null){
                    Student[] birth=new Student[p.size()];
                
                int k=0;
                for(int x=0;x<p.size();x++){
                  if(date.compareTo(p.get(x).getBirthDate())<=0)birth[k++]=p.get(x);
                    
                }
		return birth;
        }
                
                else{
            throw new IllegalArgumentException();
        }
	}

	
        @Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) throws IllegalArgumentException{
		Student[] birth=new Student[p.size()];
                int j=0;
                if(firstDate!=null&&lastDate!=null){
                for(i=0;i<p.size();i++){
                    if(firstDate.compareTo(p.get(i).getBirthDate())>=0&&lastDate.compareTo(p.get(i).getBirthDate())<=0)birth[j++]=p.get(i);
                }
		return birth;
                }
        
                else{
            throw new IllegalArgumentException();
        }        
        }

	
        @Override
	public Student[] getNearBirthDate(Date date, int days)throws IllegalArgumentException {
	if(date!=null){	
            Student[] birth=new Student[p.size()];
                int j=0;
                for(i=0;i<p.size();i++){
                    if(date.compareTo(p.get(i).getBirthDate())<=days)birth[j++]=p.get(i);
                }
		return birth;
        }
	
                else{
            throw new IllegalArgumentException();
        }        
        }

	
        @Override
	public int getCurrentAgeByDate(int indexOfStudent) {
            Date age=null;
            if(indexOfStudent!=0){
                    Date date=p.get(indexOfStudent).getBirthDate();
                    long agein=new Date().getTime()-date.getTime();
                 age=new Date(agein);
                
                }
	return age.getYear();
        }

	
        @Override
	public Student[] getStudentsByAge(int age) {
		Student[] birth=new Student[p.size()];
          
		return null;
	}

	
        @Override
	public Student[] getStudentsWithMaxAvgMark() {
	double max=-1;
        int j=0;
        Student[] marks=new Student[p.size()];
              for(i=0;i<p.size();i++)if(max<p.get(i).getAvgMark())max=p.get(i).getAvgMark();
              for(i=0;i<p.size();i++)if(max==p.get(i).getAvgMark())marks[j++]=p.get(i);
               
              		return marks;
	}

	
        @Override
	public Student getNextStudent(Student student)throws IllegalArgumentException {
		if(student!=null){
                    for(i=0;i<p.size();i++)if(p.get(i)==student)break;
        	return p.get(i+1);            
                }
	
	else{
            throw new IllegalArgumentException();
        }        
        }
}
