package com.example.expeditionsupportapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator<Blog> {

    @Override
    public int compare(Blog blog, Blog t1) {
        Date d1 = fomatDate(blog.getDate());
        Date d2 = fomatDate(t1.getDate());
        if(d1.getTime() > d2.getTime()){
            return -1;
        }else if(d1.getTime() == d2.getTime()){
            return 0;
        }else {
            return 1;
        }
    }

    /**
     * 格式化日期(format date)
     * @return
     */
    public static Date fomatDate(String date) {
        if (date == null || date.equals("")) {
            return new Date();
        }else {
            try {
                SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                return sdfDay.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Date();
        }
    }
    /**
     * @Title: compareDate
     * @Description: TODO(日期比较，如果s>=e 返回true 否则返回false)（date compare, if s>=e return true, if not, return false)
     * @param s
     * @param e
     * @return boolean
     * @throws
     * @author
     */
    public static boolean compareDate(String s, String e) {
        if(fomatDate(s)==null||fomatDate(e)==null){
            return false;
        }
        System.out.println(fomatDate(s).getTime()+"=="+fomatDate(e).getTime());
        return fomatDate(s).getTime() >=fomatDate(e).getTime();
    }
}
