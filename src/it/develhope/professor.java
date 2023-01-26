package it.develhope;

public class professor extends CollegePerson implements TeachingPerson{
   public String teachingSubject;

      public void teachToOtherPeople(){
          System.out.println(" Il professore" +" " +name + " " +"insegna agli studenti"+ ""+ teachingSubject);
      }
   public professor(String name, String surname,int id, String subject){
          this.name = name;
          this.surname = surname;
          this.collegeId = id;
          this.teachingSubject = subject;
   }
}
