package programming.chapter5.conditional_statements;


public class Exercises05p7 {
    public static void main(String[] args) {
        Day day1 = new Day(2020, 04, 13, 1);
        Day day2 = new Day(2020, 04, 13, 1);
        System.out.println(day2.equal(day1));
        System.out.println(day1);
        day1.nextDay();
        System.out.println(day1);
        day1.leapyear();
        day1.faster(day2);
        day2.faster(day1);
        Day dayleap = new Day(2020,2,28,1);
        System.out.println(dayleap);
        dayleap.nextDay();
        System.out.println(dayleap);
        dayleap.nextDay();
        System.out.println(dayleap);
    }
}
class Day{
    int year, month, day;
    int[] dayNum = {31,28,31,30,31,30,31,31,30,31,30,31};
    int givenDay;
    boolean isLeapyear;

    public Day(int year, int month, int day, int givenDay) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.givenDay = givenDay;
        if(year % 4 == 0 && (year % 100 != 0|| year % 400 == 0)) isLeapyear =true;
        else isLeapyear = false;
    }

    @Override
    public String toString() {
        return "DDay{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public boolean equal(Day day){
        return day.year == this.year && day.month == this.month && day.day == this.day;
    }
    public void leapyear(){
        if(isLeapyear) {
            System.out.println("윤년입니다");
        }else {
            System.out.println("윤년이 아닙니다");
        }
    }
    public void faster(Day day){
        if(day.equal(this)){
            System.out.println("같은 날 입니다");
            return;
        }
        if(day.year > this.year){
            System.out.println("파라미터보다 과거");
            return;
        }else if(day.year == this.year){
            if(day.month > this.month){
                System.out.println("파라미터보다 과거");
                return;
            }else if(day.month == this.month){
                if(day.day > this.day){
                    System.out.println("파라미터보다 과거");
                    return;
                }
            }

        }
        System.out.println("파라미터보다 미래");

    }
    public void nextDay() {
        day++;
        if (day > dayNum[month-1]) {
            if(isLeapyear && month == 2 && day == 29){
                return;
            }else {
                month++;
                day = 1;
            }
        }
        if(month > 12){
            year++;
            if(year % 4 == 0 && (year % 100 != 0|| year % 400 == 0)) isLeapyear =true;
            else isLeapyear = false;
            month = 1;
            day = 1;
        }
        if(givenDay == 7){
            givenDay = 1;
        }
        else givenDay++;
    }
}