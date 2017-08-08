package cn.bssys.controller;

import cn.bssys.po.DataGrid;
import cn.bssys.po.Page;
import cn.bssys.service.GradProjService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 万洪基 on 2017/8/8.
 */
@Controller
@RequestMapping(value = "/bs",produces = {"application/json;charset=UTF-8"} )
public class GradProjController {

    @Autowired
    GradProjService gradProjService;

    @RequestMapping("/list/{year}")
    @ResponseBody
    public String list(Page page, @PathVariable Integer year){
        DataGrid dataGrid = new DataGrid();
        dataGrid.setRows(gradProjService.list(page,year));
        dataGrid.setTotal(gradProjService.getTotal());
        return JSON.toJSONString(dataGrid);
    }
}
