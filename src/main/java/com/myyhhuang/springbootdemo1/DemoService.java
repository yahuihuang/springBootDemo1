package com.myyhhuang.springbootdemo1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String getServerTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        String nowTime = df.format(new Date());

        return nowTime;
    }
}
