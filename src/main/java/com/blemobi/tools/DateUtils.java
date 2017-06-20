package com.blemobi.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Description:
 * User: HUNTER.POON
 * Date: 2017/6/9 11:25
 */
public final class DateUtils {
    private static final long _MIN = 1000 * 60;
    public static long getNowMins(){
        return getMins(System.currentTimeMillis());
    }
    public static long getMins(long time){
        return time / _MIN * _MIN;
    }
    public static String getYYMM(){
        SimpleDateFormat sdf = new SimpleDateFormat("YYMM");
        return sdf.format(new Date());
    }

    public static String getMM(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        return sdf.format(new Date());
    }

    public static String getMMDDHHMM(){
        SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmm");
        return sdf.format(new Date());
    }

    public static String getYYYYMMDD(){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
        return sdf.format(new Date());
    }
    public static String getDate19(){
        return getDate19(new Date());
    }

    public static String getDate19(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static Long getTime(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd HH:mm:ss");
        try {
            Date dt = sdf.parse(date);
            return dt.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Long getDayStart(){
        Calendar currentDate = new GregorianCalendar();
        currentDate.set(Calendar.HOUR_OF_DAY, 0);
        currentDate.set(Calendar.MINUTE, 0);
        currentDate.set(Calendar.SECOND, 0);
        return currentDate.getTime().getTime();
    }
    public static Long getWeekStart(){
        Calendar currentDate = new GregorianCalendar();
        currentDate.setFirstDayOfWeek(Calendar.MONDAY);
        currentDate.set(Calendar.HOUR_OF_DAY, 0);
        currentDate.set(Calendar.MINUTE, 0);
        currentDate.set(Calendar.SECOND, 0);
        currentDate.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return currentDate.getTime().getTime();
    }
    public static void main(String[] args) {
        System.out.println(getWeekStart());
        System.out.println(System.currentTimeMillis());
    }
}
