package cn.bssys.test;

import cn.bssys.util.PageUtil;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.util.UUID;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public class TestFun {
    @Test
    public void testFun1(){
        System.out.println(UUID.randomUUID().toString());

        int length = 6;

        for (int i = 0; i < length; i++){
            System.out.println(i);
        }


//        String path = "F://test/hhhhhh.txt";
//        String fileName = "F://kk.txt";
//        try {
//            FileUtils.copyFile(new File(fileName),new File(path));
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
