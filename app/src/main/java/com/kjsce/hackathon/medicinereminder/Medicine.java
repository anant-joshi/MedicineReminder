package com.kjsce.hackathon.medicinereminder;

/**
 * Created by anant on 30/9/16.
 */

public class Medicine {
    private String name;
    private int dinner;
    private int breakfast;
    private int lunch;
    private int daysOfWeek;
    private boolean[] daysOfWeekArray;

    public int getBreakfast() {
        return breakfast;
    }

    public String getName() {
        return name;
    }

    public int getDinner() {
        return dinner;
    }

    public int getLunch() {
        return lunch;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }
    private void setDaysOfWeek(){
        for (int i = 0; i< daysOfWeekArray.length; i++){
            daysOfWeek+=(daysOfWeekArray[i])?Math.pow(2,i):0;
        }
    }
    public static boolean[] getDaysOfWeekArray(int daysOfWeek){
        boolean[] arr =  new boolean[7];
        for(int i = 6; i>=0; i--){
            int power = (int) Math.pow(2,i);
            if(daysOfWeek>=power){
                arr[i] = true;
                daysOfWeek -= power;
            }
        }
        return arr;
    }


    /*
    * 0 - Sunday
    * 1 - Monday
    * 2 - Tuesday
    * ...
    * 6 - Saturday
    * */
    public void setDaysOfWeekArray(boolean[] daysOfWeekArray) {
        this.daysOfWeekArray = daysOfWeekArray;
        setDaysOfWeek();
    }
}
