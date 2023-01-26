package it.develhope;

public class CollegePerson {
    public String name;
    public String surname;
    public int collegeId;

    public void  CollegePerson(){
        System.out.println( "name:"+ name +" "+ "surname:"+  surname + "colleggeId:" +collegeId );
    }
    public void goToCollege(){
        System.out.println(name+ " " + surname + " " + collegeId);
    }
}
