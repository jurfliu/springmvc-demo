package com.ljf.spring.mvc.demo.convter;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateConvter
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/01/13 08:00:14 
 * @Version: V1.0
 **/
public class DateConvter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        //将日期转换成日期对象
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date=simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
