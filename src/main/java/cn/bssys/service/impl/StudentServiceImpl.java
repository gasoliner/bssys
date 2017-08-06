package cn.bssys.service.impl;

import cn.bssys.mapper.BsStudentMapper;
import cn.bssys.mapper.BsTopicMapper;
import cn.bssys.mapper.BsUserMapper;
import cn.bssys.po.*;
import cn.bssys.service.StudentService;
import cn.bssys.service.SystemDDLService;
import cn.bssys.service.TopicService;
import cn.bssys.service.UserService;
import cn.bssys.vo.VoStudent;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;


 @Service("studentService")
 public class StudentServiceImpl implements StudentService {

    public long total;

    @Autowired
    BsStudentMapper bsStudentMapper;

    @Autowired
    SystemDDLService systemDDLService;

    @Autowired
     TopicService topicService;
    @Autowired
     UserService userService;
    @Override
    public List<VoStudent> getList(Page page) {
//        设置分页
        PageHelper.startPage(page.getPage(), page.getRows());
//        创建查询规则
        BsStudentExample bsStudentExample = new BsStudentExample();
//        查询
        List<BsStudent> bsStudentList = bsStudentMapper.selectByExample(bsStudentExample);
//        获取查询信息
        PageInfo<BsStudent> pageInfo = new PageInfo<>(bsStudentList);
        this.total = pageInfo.getTotal();
//        vo化
        List<VoStudent> voStudentList = new ArrayList<>();
        for (BsStudent bsStudent :
                bsStudentList) {
            VoStudent voStudent = new VoStudent();
            voStudent.setSid(bsStudent.getSid());
            voStudent.setVoMajor(systemDDLService.getDDLNameByDDLCode("major", bsStudent.getMajor()).getDdlname());
            voStudent.setVoClazz(systemDDLService.getDDLNameByDDLCode("clazz", bsStudent.getClazz()).getDdlname());
            voStudent.setNumber(bsStudent.getNumber());
            voStudent.setName(bsStudent.getName());
            voStudent.setGrade(bsStudent.getGrade());
            voStudent.setDegree(bsStudent.getDegree());
            voStudent.setVoIschoose(systemDDLService.getYesOrNoByZeroOrOne(bsStudent.getIschoose()));
            voStudentList.add(voStudent);
        }
        return voStudentList;
    }

    @Override
    public int add(BsStudent bsStudent) {
        return bsStudentMapper.insertSelective(bsStudent);
    }

    @Override
    public int update(BsStudent bsStudent) {
        return bsStudentMapper.updateByPrimaryKeySelective(bsStudent);
    }

    @Override
    public int delete(int sid) {
        return bsStudentMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public long getTotal() {
        return total;
    }

    @Override
    public List<VoStudent> getStudentByTid(Long tid) {
        BsStudentExample studentExample = new BsStudentExample();
        BsStudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andTidEqualTo(tid);
        List<BsStudent> studentList = bsStudentMapper.selectByExample(studentExample);
        List<VoStudent> voStudentList = new ArrayList<>();
        for (BsStudent student:
                studentList){
            VoStudent voStudent = new VoStudent(student);
            voStudentList.add(voStudent);
        }
        return voStudentList;
    }

    @Override
    public VoStudent getObjectByPrimaryKey(int id) {
        return new VoStudent(bsStudentMapper.selectByPrimaryKey(id));
    }

    @Override
    public List<FrontQueryResult> myStudentList(Long tid) {
        List<VoStudent> studentList = getStudentByTid(tid);
        List<FrontQueryResult> frontQueryResultList = new ArrayList<>();
         for(VoStudent student :
                 studentList){
             FrontQueryResult frontQueryResult = new FrontQueryResult();
             frontQueryResult.setVar1(student.getNumber());
             frontQueryResult.setVar2(student.getName());
             frontQueryResult.setVar3(topicService.selectByPrimaryKey(student.getTopid()).getName());
             frontQueryResult.setVar4(systemDDLService.getDDLNameByDDLCode("clazz",student.getClazz()).getDdlname());
             frontQueryResult.setVar5(student.getPhone());
             frontQueryResult.setVar6(student.getEmail());
             frontQueryResult.setVar7(student.getStrongpoint());
             frontQueryResultList.add(frontQueryResult);

         }
        return frontQueryResultList;
    }

    @Override
    public List<FrontQueryResult> selectedTopicList(Page page) {
        //        设置分页
        PageHelper.startPage(page.getPage(), page.getRows());

        BsStudentExample bsStudentExample = new BsStudentExample();
        List<BsStudent> bsStudentList = bsStudentMapper.selectByExample(bsStudentExample);

        PageInfo<BsStudent> pageInfo = new PageInfo<>(bsStudentList);
        this.total = pageInfo.getTotal();

        List<FrontQueryResult> frontQueryResultList = new ArrayList<>();
        for(BsStudent bsStudent :
                bsStudentList){
            FrontQueryResult frontQueryResult = new FrontQueryResult();
            frontQueryResult.setVar1(bsStudent.getNumber());
            frontQueryResult.setVar2(systemDDLService.getDDLNameByDDLCode("major",bsStudent.getMajor()).getDdlname());
            frontQueryResult.setVar3(bsStudent.getName());
            frontQueryResult.setVar4(topicService.selectByPrimaryKey(bsStudent.getTopid()).getName());
            frontQueryResult.setVar5(userService.selectByPrimaryKey(bsStudent.getTid()).getUsername());
            //Date 转为 String类型
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = topicService.selectByPrimaryKey(bsStudent.getTopid()).getChoosetime();
            String str=sdf.format(date);

            frontQueryResult.setVar6(str);
            frontQueryResultList.add(frontQueryResult);

        }
        return frontQueryResultList;

    }

    @Override
    public List<FrontQueryResult> timePlaceList(Page page, int year) {
        //        设置分页
        PageHelper.startPage(page.getPage(), page.getRows());
       //根据年度查到课题
        BsTopicExample bsTopicExample = new BsTopicExample();
        BsTopicExample.Criteria criteria = bsTopicExample.createCriteria();
        criteria.andYearEqualTo(year);
        List<BsTopic> bsTopicList = topicService.selectByExample(bsTopicExample);
        PageInfo<BsTopic> pageInfo = new PageInfo<>(bsTopicList);
        this.total = pageInfo.getTotal();
        List<FrontQueryResult> frontQueryResultList = new ArrayList<>();
        for(BsTopic bsTopic:
                bsTopicList){
            FrontQueryResult frontQueryResult = new FrontQueryResult();
            frontQueryResult.setVar1(userService.selectByPrimaryKey(bsTopic.getTid()).getUsername());
           //根据课题 topid 来查询学生
            BsStudentExample bsStudentExample = new BsStudentExample();
            BsStudentExample.Criteria criteria1 = bsStudentExample.createCriteria();
            criteria1.andTopidEqualTo(bsTopic.getToid());
            List<BsStudent> bsStudent = bsStudentMapper.selectByExample(bsStudentExample);

            frontQueryResult.setVar2(bsStudent.get(0).getName());
            frontQueryResult.setVar3(bsStudent.get(0).getNumber());
            frontQueryResult.setVar4(systemDDLService.getDDLNameByDDLCode("clazz",bsStudent.get(0).getClazz()).getDdlname());
            frontQueryResult.setVar5(userService.selectByPrimaryKey(bsTopic.getTid()).getDefensetime());
            frontQueryResult.setVar6(userService.selectByPrimaryKey(bsTopic.getTid()).getDefenseplace());
            frontQueryResultList.add(frontQueryResult);
        }
        return frontQueryResultList;
    }

    @Override
    public BsStudent getStudentByTopicId(Integer topicId) {
        BsStudentExample example = new BsStudentExample();
        BsStudentExample.Criteria criteria = example.createCriteria();
        criteria.andTopidEqualTo(topicId);
        List<BsStudent> studentList = bsStudentMapper.selectByExample(example);
        return studentList.get(0);
   }

}
