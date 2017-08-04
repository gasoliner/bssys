package cn.bssys.service.impl;

import cn.bssys.mapper.BsStudentMapper;
import cn.bssys.mapper.BsTopicMapper;
import cn.bssys.po.BsStudent;
import cn.bssys.po.BsStudentExample;
import cn.bssys.po.FrontQueryResult;
import cn.bssys.po.Page;
import cn.bssys.service.StudentService;
import cn.bssys.service.SystemDDLService;
import cn.bssys.vo.VoStudent;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/1.
 */
 @Service("studentService")
 public class StudentServiceImpl implements StudentService {

    public long total;

    @Autowired
    BsStudentMapper bsStudentMapper;
    @Autowired
    SystemDDLService systemDDLService;
    @Autowired
    BsTopicMapper bsTopicMapper;

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
    public List<VoStudent> getStudentByTid(Integer tid) {
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
    public List<FrontQueryResult> myStudentList(Integer tid) {
        List<VoStudent> studentList = getStudentByTid(tid);
        List<FrontQueryResult> frontQueryResultList = new ArrayList<>();
         for(VoStudent student :
                 studentList){
             FrontQueryResult frontQueryResult = new FrontQueryResult();
             frontQueryResult.setVar1(student.getNumber());
             frontQueryResult.setVar2(student.getName());
             frontQueryResult.setVar3(bsTopicMapper.selectTopNameByTid(student.getTopid()));
             frontQueryResult.setVar4(systemDDLService.getDDLNameByDDLCode("clazz",student.getClazz()).getDdlname());
             frontQueryResult.setVar5(student.getPhone());
             frontQueryResult.setVar6(student.getEmail());
             frontQueryResult.setVar7(student.getStrongpoint());
             frontQueryResultList.add(frontQueryResult);
         }
        System.out.println(frontQueryResultList);
        return frontQueryResultList;
    }

}
