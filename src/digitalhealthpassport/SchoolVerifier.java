package digitalhealthpassport;

import java.util.ArrayList;

public class SchoolVerifier extends Verifier {
    private String schoolName; 
    private ArrayList<Person> positiveCases = new ArrayList<>(); //arraylist of Person who is a student of the school that tested positive
}