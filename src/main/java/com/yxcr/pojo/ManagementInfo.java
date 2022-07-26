package com.yxcr.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName management_info
 */
@TableName(value ="management_info")
@Data
public class ManagementInfo implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long bh;
    private Integer zwid;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 职位
     */
    private String zw;

    /**
     * 用户级别
     */
    private String yhjb;

    /**
     * 用户权限
     */
    private String yhqx;

    /**
     * 登记日期
     */
    private String djrq;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ManagementInfo other = (ManagementInfo) that;
        return (this.getBh() == null ? other.getBh() == null : this.getBh().equals(other.getBh()))
            && (this.getXm() == null ? other.getXm() == null : this.getXm().equals(other.getXm()))
            && (this.getZw() == null ? other.getZw() == null : this.getZw().equals(other.getZw()))
            && (this.getYhjb() == null ? other.getYhjb() == null : this.getYhjb().equals(other.getYhjb()))
            && (this.getYhqx() == null ? other.getYhqx() == null : this.getYhqx().equals(other.getYhqx()))
            && (this.getZwid() == null ? other.getZwid() == null : this.getZwid().equals(other.getZwid()))
            && (this.getDjrq() == null ? other.getDjrq() == null : this.getDjrq().equals(other.getDjrq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBh() == null) ? 0 : getBh().hashCode());
        result = prime * result + ((getXm() == null) ? 0 : getXm().hashCode());
        result = prime * result + ((getZw() == null) ? 0 : getZw().hashCode());
        result = prime * result + ((getYhjb() == null) ? 0 : getYhjb().hashCode());
        result = prime * result + ((getYhqx() == null) ? 0 : getYhqx().hashCode());
        result = prime * result + ((getDjrq() == null) ? 0 : getDjrq().hashCode());
        result = prime * result + ((getZwid() == null) ? 0 : getZwid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bh=").append(bh);
        sb.append(", xm=").append(xm);
        sb.append(", zw=").append(zw);
        sb.append(", yhjb=").append(yhjb);
        sb.append(", yhqx=").append(yhqx);
        sb.append(", djrq=").append(djrq);
        sb.append(", zwid=").append(zwid);

        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}