package cn.bssys.service.impl;

import cn.bssys.mapper.BsStudentMapper;
import cn.bssys.po.BsStudent;
import cn.bssys.po.BsStudentExample;
import cn.bssys.po.Page;
import cn.bssys.service.StudentService;
import cn.bssys.service.SystemDDLService;
import cn.bssys.vo.VoStudent;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.Collections;
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

    @Override
    public List<VoStudent> getList(Page page) {
       PageHelper.startPage(page.getPage(),page.getRows());

        BsStudentExample bsStudentExample = new BsStudentExample();
        List<BsStudent> bsStudentList = bsStudentMapper.selectByExample(bsStudentExample);

        PageInfo<BsStudent> pageInfo = new PageInfo<>(bsStudentList);
        this.total = pageInfo.getTotal();

        List<VoStudent> voStudentList = new ArrayList<>();
        for(BsStudent bsStudent :
                bsStudentList){
            VoStudent voStudent = new VoStudent();
            voStudent.setSid(bsStudent.getSid());
            voStudent.setVoMajor(systemDDLService.getDDLNameByDDLCode("major",bsStudent.getMajor()).getDdlname());
            voStudent.setVoClazz(systemDDLService.getDDLNameByDDLCode("clazz",bsStudent.getClazz()).getDdlname());
            voStudent.setNumber(bsStudent.getNumber());
            voStudent.setName(bsStudent.getName());
            voStudent.setGrade(bsStudent.getGrade());
            voStudent.setDegree(bsStudent.getDegree());
            voStudent.setIschoose(bsStudent.getIschoose());
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
        return  bsStudentMapper.updateByPrimaryKeySelective(bsStudent);
    }

    @Override
    public int delete(int sid) {
        return bsStudentMapper.deleteByPrimaryKey(sid);
    }
}
