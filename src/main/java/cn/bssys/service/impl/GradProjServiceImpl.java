package cn.bssys.service.impl;

import cn.bssys.mapper.BsGradprojMapper;
import cn.bssys.po.BsGradproj;
import cn.bssys.po.BsGradprojExample;
import cn.bssys.po.Page;
import cn.bssys.service.*;
import cn.bssys.vo.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 万洪基 on 2017/8/8.
 */
@Service("gradProjService")
public class GradProjServiceImpl implements GradProjService {

    private Long totle;

    @Autowired
    BsGradprojMapper gradprojMapper;
    @Autowired
    StudentService studentService;
    @Autowired
    UserService userService;
    @Autowired
    TopicService topicService;
    @Autowired
    DefenseGroupService defenseGroupService;

    @Override
    public List<VoGradProj> list(Page page, Integer year) {
        PageHelper.startPage(page.getPage(),page.getRows());
        BsGradprojExample example = new BsGradprojExample();
        BsGradprojExample.Criteria criteria = example.createCriteria();
        criteria.andYearEqualTo(year);
        List<BsGradproj> gradprojList = gradprojMapper.selectByExample(example);
        PageInfo<BsGradproj> pageInfo = new PageInfo<>(gradprojList);
        totle = pageInfo.getTotal();
        List<VoGradProj> voGradProjList = new ArrayList<>();
        for (BsGradproj gradproj:
                gradprojList){
            VoGradProj voGradProj = new VoGradProj(gradproj);
//            根据sid获取学生对象
            VoStudent voStudent = studentService.getObjectByPrimaryKey(voGradProj.getSid());
//            根据学生对象获取的tid，topid分别获取教师对象，课题对象
//            获取教师对象
            VoUser voUser = userService.selectByPrimaryKey(voStudent.getTid());
//            获取课题对象
            VoTopic voTopic = topicService.selectByPrimaryKey(voStudent.getTopid());
//            根据voGradProj的dgid获取答辩委员会
            VodefenseGroup vodefenseGroup = defenseGroupService.getObjectByPrimaryKey(voGradProj.getDgid());
//            获取评阅人
            VoUser reviewer = userService.selectByPrimaryKey(voGradProj.getReviewer());
//            装填字段到voGrandProj
            voGradProj.setVoStuNumber(voStudent.getNumber());
            voGradProj.setVoStuName(voStudent.getName());
            voGradProj.setVoStuClazz(voStudent.getVoClazz());
            voGradProj.setVoTopicName(voTopic.getName());
            voGradProj.setVoTopicSource(voTopic.getVosrc());
            voGradProj.setVoTopicCategory(voTopic.getVocategory());
            voGradProj.setVoTopicType(voTopic.getVotype());
            voGradProj.setVoTeacher(voUser.getUsername());
            voGradProj.setVoTeaTitle(voUser.getVoTitle());
            voGradProj.setVoTeaDep(voUser.getVoDep());
            voGradProj.setVoTeaMajor(voUser.getVoMajor());
            voGradProj.setVoTeaDirc(voUser.getDirection());
            voGradProj.setVoReviewer(reviewer.getUsername());
            voGradProj.setVoRevieTitle(reviewer.getVoTitle());
            voGradProj.setVoDefenseGroup(vodefenseGroup.getMembers());

            voGradProjList.add(voGradProj);
        }
        return voGradProjList;
    }

    @Override
    public Long getTotal() {
        return totle;
    }
}
