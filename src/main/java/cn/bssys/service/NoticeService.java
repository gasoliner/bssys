package cn.bssys.service;

import cn.bssys.po.BsNotice;
import cn.bssys.po.Page;
import cn.bssys.vo.VoNotice;
import cn.bssys.vo.VoTopic;

import java.util.List;

/**
 * Created by 万洪基 on 2017/6/26.
 */
public interface NoticeService {
    public List<VoNotice> getList(Page page);
    public int add(VoNotice voNotice);
    public int update(VoNotice voNotice);
    public void delete(String uuid);
    public BsNotice getObjectByPrimaryKey(String uuid);
}
