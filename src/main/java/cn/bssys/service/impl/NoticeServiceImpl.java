package cn.bssys.service.impl;

import cn.bssys.mapper.BsNoticeMapper;
import cn.bssys.po.BsNotice;
import cn.bssys.po.BsNoticeExample;
import cn.bssys.po.Page;
import cn.bssys.service.NoticeService;
import cn.bssys.service.SystemDDLService;
import cn.bssys.service.NoticeService;
import cn.bssys.vo.VoNotice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by 万洪基 on 2017/6/27.
 */
@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

    public long total;
    @Autowired
    BsNoticeMapper noticeMapper;
    @Autowired
    SystemDDLService systemDDLService;

    @Override
    public List<VoNotice> getList(Page page) {
//        分页
        PageHelper.startPage(page.getPage(),page.getRows());
//        构造查询条件
        BsNoticeExample noticeExample = new BsNoticeExample();
//        查询
        List<BsNotice> noticeList = noticeMapper.selectByExample(noticeExample);
//        取分页信息
        PageInfo<BsNotice> pageInfo = new PageInfo<>(noticeList);
        this.total = pageInfo.getTotal();
//        对数字表示的字段进行可视化处理
        List<VoNotice> voNoticeList = new ArrayList<>();
        for (BsNotice notice:
                noticeList){
            VoNotice voNotice = new VoNotice();
            voNotice.setUuid(notice.getUuid());
            voNotice.setContent(notice.getContent());
            voNotice.setDate(notice.getDate());
            voNotice.setVoNoticeType(systemDDLService.getDDLNameByDDLCode("noticetype",notice.getNoticetype()).getDdlname());
            voNotice.setPublisher(notice.getPublisher());
            voNotice.setTitle(notice.getTitle());
//            如果有文件的话
            if (notice.getAnnex() != null && !notice.getAnnex().trim().equals("")){
                voNotice.setVoFile(setVoFile(notice.getUuid()));
            }
            voNoticeList.add(voNotice);
        }
//        按时间排序
        Collections.sort(voNoticeList);
        return voNoticeList;
    }

    private String setVoFile(String uuid){
        return  "<a href = \"#\" onclick=\"downloadFile('notice','"+uuid+"')\">有附件</a>";
    }

    @Override
    public int add(VoNotice notice) {
        notice.setUuid(UUID.randomUUID().toString());
        notice.setPublisher("王小明");
        notice.setDate(new Date(System.currentTimeMillis()));
        return noticeMapper.insertSelective(notice);
    }

    @Override
    public int update(VoNotice voNotice) {
        return noticeMapper.updateByPrimaryKeySelective(voNotice);
    }

    @Override
    public void delete(String uuid) {
        noticeMapper.deleteByPrimaryKey(uuid);
        return;
    }

    @Override
    public BsNotice getObjectByPrimaryKey(String uuid) {
        return noticeMapper.selectByPrimaryKey(uuid);
    }
}
