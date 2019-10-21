package com.lixy.dbadapter.controller;

import com.lixy.dbadapter.dao.SysDBInfoMapper;
import com.lixy.dbadapter.entity.SysDBInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author：MR LIS，2019/10/21
 * Copyright(C) 2019 All rights reserved.
 */
@Api(tags = {"数据库连接配置"})
@RestController
@RequestMapping("/dbadapter")
public class DbAdapterController {

    @Autowired
    private SysDBInfoMapper sysDBInfoMapper;
    /**
     * 获取所有的数据库连接
     *
     * @return
     * @Author: MR LIS
     * @Date: 16:24 2018/7/30
     */
    @ApiOperation(value = "获取所有的数据库连接", notes = "获取所有的数据库连接")
    @PostMapping(value = "/getSysDbInfoList")
    public List<SysDBInfo> getSysDbInfoList() {
        List<SysDBInfo> sysDBInfos = sysDBInfoMapper.selectAll();
        return sysDBInfos;
    }

    /**
     * 保存数据库连接
     *
     * @return
     * @Author: MR LIS
     * @Date: 16:24 2018/7/30
     */
    @ApiOperation(value = "保存数据库连接", notes = "保存数据库连接")
    @PostMapping(value = "/saveDbInfo")
    public long saveDbInfo(SysDBInfo sysDBInfo) {
        sysDBInfo.setStatus(1);
        return sysDBInfoMapper.insert(sysDBInfo);
    }





}
