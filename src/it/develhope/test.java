package it.develhope;

public class test {
    public static void main(String[] args) {
        professor professor = new professor("Gianfranco", "Di Bella" ,1878,"Informatica");
        student student = new student("Marco","Abbondanza",1998, 5);
        assistent assistent = new assistent("Vittoria","De Fenzo", 1312, true);
        professor.goToCollege();
        assistent.goToCollege();
        student.goToCollege();
        professor.teachToOtherPeople();
        assistent.teachToOtherPeople();
        assistent.studyAtHome();
        student.studyAtHome();
    }
}
