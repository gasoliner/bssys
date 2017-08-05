package cn.bssys.test;

import cn.bssys.util.PageUtil;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import javax.mail.Session;
import javax.mail.Transport;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.UUID;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public class TestFun {
    @Test
    public void testFun1() throws Exception{
        System.out.println(UUID.randomUUID().toString());


//        String path = "F://test/hhhhhh.txt";
//        String fileName = "F://kk.txt";
//        try {
//            FileUtils.copyFile(new File(fileName),new File(path));
//        }catch (Exception e){
//            e.printStackTrace();
//        }




          //  ts.connect(prop.getProperty("mail.host"), prop.getProperty("mail.username"), prop.getProperty("mail.password"));
    }
}
