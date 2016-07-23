package com.example.android.reportcard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by salva on 23/07/2016.
 */

/** Report card class takes as parameter a Student and stores the list of subjects,
 * scores from the exams, to prepare a report card.
 */
public class ReportCard {


    // A map of the subjects and scores
    private Map<String,Float> Grades;


    // Constructor is empty as we don't know what subjects and scores will be included
    public ReportCard(){

        Grades = new HashMap<String,Float>();
    }

    // This method allows to enter a new score if it exists
    public void setGrades(String subject, float score) {

        Grades.put(subject,score);

    }

    public float getGrades(String subject) {

        if (Grades.containsKey(subject)) {

            return Grades.get(subject);
        } else return 0;
    }

    @Override
    public String toString(){

        String CardReport = "Report card statement: /n";

        for (String key:Grades.keySet()) {

            CardReport = CardReport + key + ": " + Grades.get(key)+ "/n";

        }

        return  CardReport;
    }

}
