package com.cjrj.edu.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Department implements Serializable {
    private BigDecimal deptId;

    private String deptName;

    private String deptDesc;

    private Date createdate;

    private String createname;

    private String modifyname;

    private Date modifydate;

    private BigDecimal delFlag;

    private static final long serialVersionUID = 1L;

    public BigDecimal getDeptId() {
        return deptId;
    }

    public void setDeptId(BigDecimal deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc == null ? null : deptDesc.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public String getModifyname() {
        return modifyname;
    }

    public void setModifyname(String modifyname) {
        this.modifyname = modifyname == null ? null : modifyname.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public BigDecimal getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(BigDecimal delFlag) {
        this.delFlag = delFlag;
    }
}