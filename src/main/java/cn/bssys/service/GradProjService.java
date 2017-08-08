package cn.bssys.service;

import cn.bssys.po.Page;
import cn.bssys.vo.VoGradProj;

import java.util.List;

/**
 * Created by 万洪基 on 2017/8/8.
 */
public interface GradProjService {
    List<VoGradProj> list(Page page, Integer year);

    Long getTotal();
}
