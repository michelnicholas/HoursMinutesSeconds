public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(69,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-1));


    }

    public static String getDurationString(long minutes, long seconds){


        if ((minutes < 0) || (seconds < 0 ) || (seconds > 59) ){
         return "Invalid Value";
    }
        long hour = minutes / 60;
        long remainingMinutes = minutes % 60;


        return  hour +  "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds){
        if (seconds < 0){
            return "Invalid Value";
        }

        long addedMinutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(addedMinutes,remainingSeconds);

    }



}
