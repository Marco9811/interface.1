package it.develhope;

public class assistent extends CollegePerson implements LearningPerson, TeachingPerson {
    public boolean isGoingToBeAPhD;

    public void teachToOtherPeople(){
        System.out.println("insegna alle altre persone");
    }
   public void studyAtHome(){
       System.out.println(name + " " + "Può studiare da casa");
   }
   public assistent(String name,String surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;
   }
}
