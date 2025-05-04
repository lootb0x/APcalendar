public class APCalendar
{
/** Returns true if year is a leap year and false otherwise. */
private static boolean isLeapYear(int year)
{ 
    boolean regular = year%4==0;
    booolean century = year%100==0;
    booolean fourcentury = year%400==0;
    
    if(fourcentury) return true;
    if(century) return false;
    return regular;
}
/** Returns the number of leap years between year1 and year2, inclusive.
* Precondition: 0 <= year1 <= year2
*/
public static int numberOfLeapYears(int year1, int year2)
{ 
    int count =0;
    for(int x= year1; x<year2; x++) if(APCalendar.isLeapYear(x)) count++;
    return count;
}
/** Returns the value representing the day of the week for the first day of year,
* where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
*/
private static int firstDayOfYear(int year)
{ 
    return 2;


}
/** Returns n, where month, day, and year specify the nth day of the year.
* Returns 1 for January 1 (month = 1, day = 1) of any year.
* Precondition: The date represented by month, day, year is a valid date.
*/
private static int dayOfYear(int month, int day, int year)
{ 
    int leapday =0;
    if(isLeapYear(year)) leapday=1;
    int month1 =0;

    if(month==1) month1=31;
    if(month==2) month1=59;
    if(month==3) month1=90;
    if(month==4) month1=120;
    if(month==5) month1=151;
    if(month==6) month1=181;
    if(month==7) month1=212;
    if(month==8) month1=243;
    if(month==9) month1=273;
    if(month==10) month1=304;
    if(month==11) month1=334;
    if(month==12) month1=365;

    int value =month1+day+leapday;
    return value;

}
/** Returns the value representing the day of the week for the given date
* (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
* and 6 denotes Saturday.
* Precondition: The date represented by month, day, year is a valid date.
*/
public static int dayOfWeek(int month, int day, int year)
{ 
    int weekday = dayOfYear(month, day, year)+firstDayOfYear(year);
    if(weekday%7!=0) return weekday%7;
    return 0;
 


}
// There may be instance variables, constructors, and other methods not shown.



}
