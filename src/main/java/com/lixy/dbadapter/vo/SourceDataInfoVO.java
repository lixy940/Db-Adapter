package com.lixy.dbadapter.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 数据源的基本信息
 */
public class SourceDataInfoVO implements Serializable{

    private static final long serialVersionUID = 7796021271706334565L;


    /**
     * 是否是远程的数据库的标记，主要对前端使用
     * 1：远程
     * 0： 本体
     */
    @ApiModelProperty("是否是远程的标记")
    private Integer remoteTag = 0;


    /**
     * 数据库id
     */
    @ApiModelProperty("数据库id")
    private Integer dbId;
    /**
     *表名字
     */
    @ApiModelProperty("数据库表英文名")
    private String tableEname;

    /**
     *  表注释  中文名字
     */
    @ApiModelProperty("数据库表中文名")
    private String  tableCname;

    @ApiModelProperty("标签id")
    private Integer labelId;

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }


    public SourceDataInfoVO() {
    }


    public SourceDataInfoVO(Integer dbId, String tableEname, String tableCname) {
        this.dbId = dbId;
        this.tableEname = tableEname;
        this.tableCname = tableCname;
    }


    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }

    public String getTableEname() {
        return tableEname;
    }

    public void setTableEname(String tableEname) {
        this.tableEname = tableEname;
    }

    public String getTableCname() {
        return tableCname;
    }

    public void setTableCname(String tableCname) {
        this.tableCname = tableCname;
    }


    public Integer getRemoteTag() {
        return remoteTag;
    }

    public void setRemoteTag(Integer remoteTag) {
        this.remoteTag = remoteTag;
    }

}
