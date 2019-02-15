package com.stackroute.practice;

public class Student {
    public String gradeOfStudents(int numberOfStudent, int [] grades) {
        String result = "";
        if(grades != null && numberOfStudent>0){
            result = result + "The average is "+ avg(numberOfStudent,grades) +"\n";
            result = result + "The minimum is "+ min(numberOfStudent,grades)+"\n";
            result = result + "The maximum is "+ max(numberOfStudent,grades);
            return result;
        }
        return null;
    }
    float avg(int numberOfStudent,int[] grades){
        float avg = 0;
        for(int i=0; i<numberOfStudent; i++){
            avg = avg + grades[i];
        }
        return avg/numberOfStudent;
    }

    int max(int numberOfStudent,int[] grades){
        int max = 0;
        for(int i=0; i<numberOfStudent; i++){
            if(max < grades[i])
                max =  grades[i];
        }
        return max;
    }

    int min(int numberOfStudent,int[] grades){
        int min = 100;
        for(int i=0; i<numberOfStudent; i++){
            if(min > grades[i])
                min =  grades[i];
        }
        return min;
    }
}
