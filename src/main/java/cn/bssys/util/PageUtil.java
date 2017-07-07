package cn.bssys.util;

import org.apache.commons.io.FileUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 万洪基 on 2017/3/7.
 */
public class PageUtil {


    public static HttpSession getCurrentSession() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request.getSession();
    }

//    public static VoUser getUser(){
////        ContextLoader.getCurrentWebApplicationContext().getServletContext()
//        VoUser user = (VoUser) getCurrentSession().getAttribute(ContantKey.GLOBLE_USER_INFO);
//        return user;
//    }

    public static String uploadAnnex(HttpServletRequest request, CommonsMultipartFile file, String model, String model2) {
        String path = request.getRealPath("/upload/" + model + "/");
        String orginalFilename = file.getOriginalFilename();
        String suffix = orginalFilename.substring(orginalFilename.indexOf("."), orginalFilename.length());
        String fileName = model2 + suffix;
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path + fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path + fileName;
    }

    public static String setVoAnnexByUUID(String uuid) {
        return "<a href = \"#\" onclick=\"showTePaper('" + uuid + "')\">查看</a>";
    }

    public static void showImg(String filePath, HttpServletResponse response) throws IOException {
        response.setContentType("image/*");
        FileInputStream fileInputStream = new FileInputStream(filePath);
        OutputStream outputStream = response.getOutputStream();
        int len;
        byte[] bytes = new byte[1024 * 8];
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
            outputStream.flush();
        }
        fileInputStream.close();
        outputStream.close();
    }

    public static void showImg(InputStream inputStream, HttpServletResponse response) throws IOException {
        response.setContentType("image/*");
        OutputStream outputStream = response.getOutputStream();
        int len;
        byte[] bytes = new byte[1024 * 8];
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
            outputStream.flush();
        }
        inputStream.close();
        outputStream.close();
    }

    public static boolean deleteFile(String filePath) throws IOException {
        File file = new File(filePath);
        return file.delete();
    }

    public static String setVoNoticeActionByUUID(String uuid) {
        return "<a href = \"#\" onclick=\"showNotice('" + uuid + "')\">查看</a>";
    }

    public static String setRoleByRid(String rid) {
        if (rid.equals("1")) {
            return "管理员";
        } else {
            return "教师";
        }
    }

    public static String setAwardStateByasId(int asId) {
        switch (asId) {
            case 0:
                return "初始录入";
            case 1:
                return "审核中";
            case 2:
                return "同意";
            case 3:
                return "驳回";
            default:
                return null;
        }
    }

//    public static String setAwardActionByeId(String aId){
//        return  "<a href = \"#\" onclick=\"applyAwardBegin('"+aId+"')\">开始申请</a>";
//    }

    public static String setVoProcessAction(String deploymentId, String resourceName) {
        return "<a href = \"#\" onclick=\"showProPng('" + deploymentId + "','" + resourceName + "')\">查看</a>";
    }

    public static String setVoAwardVoFile(Long aid) {
        return "<a href = \"#\" onclick=\"showAwardPic('" + aid + "')\">查看附件</a>";
    }

    public static String setVoRoleSavailable(int available) {
        return available == 0 ? "正常" : "异常";
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static void downloadFile(String filePath, HttpServletResponse response) throws IOException {
        response.reset();
        String fileName = getFileNameByFilePath(filePath);
        String mimeType = URLConnection.guessContentTypeFromName(fileName);
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(FileUtils.readFileToByteArray(new File(filePath)));
        outputStream.flush();
        outputStream.close();
    }

    public static String getFileNameByFilePath(String filepath){
        String string[] = filepath.split("\\\\");
        return string[string.length-1];
    }
}


