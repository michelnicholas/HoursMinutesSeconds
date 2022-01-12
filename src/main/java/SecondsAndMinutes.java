public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "INVALID VALUE";
    public static void main(String[] args) {
        System.out.println(getDurationString(69,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-1));


    }

    public static String getDurationString(long minutes, long seconds){


        if ((minutes < 0) || (seconds < 0 ) || (seconds > 59) ){
         return INVALID_VALUE_MESSAGE;
    }
        long hour = minutes / 60;
        long remainingMinutes = minutes % 60;


        String hourString = hour + "h";
        if (hour < 10){
            hourString = "0" + hourString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondString = seconds + "s";
        if (seconds < 10){
            secondString = "0" + secondString;
        }

        return  hourString + " " + minutesString + " " + secondString + " ";
    }

    public static String getDurationString(long seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        long addedMinutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(addedMinutes,remainingSeconds);

    }



}
