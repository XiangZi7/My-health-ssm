package com.yxcr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName class_idt
 */
@TableName(value ="class_idt")
@Data
public class ClassIdt implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long bh;

    /**
     * 班级编号
     */
    private Integer cdId;

    /**
     * 班级名称
     */
    private String cdName;

    /**
     * 排序号
     */
    private Integer cdIndex;

    /**
     * 学校编号
     */
    private String schId;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 是否有效
     */
    private Integer sfyx;
    //    逻辑视图
    public String getStatusStr(){
        if (sfyx == null){
            return "未知";
        }
        return sfyx ==0? "禁用":"启用";
    }

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
        ClassIdt other = (ClassIdt) that;
        return (this.getBh() == null ? other.getBh() == null : this.getBh().equals(other.getBh()))
            && (this.getCdId() == null ? other.getCdId() == null : this.getCdId().equals(other.getCdId()))
            && (this.getCdName() == null ? other.getCdName() == null : this.getCdName().equals(other.getCdName()))
            && (this.getCdIndex() == null ? other.getCdIndex() == null : this.getCdIndex().equals(other.getCdIndex()))
            && (this.getSchId() == null ? other.getSchId() == null : this.getSchId().equals(other.getSchId()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getSfyx() == null ? other.getSfyx() == null : this.getSfyx().equals(other.getSfyx()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBh() == null) ? 0 : getBh().hashCode());
        result = prime * result + ((getCdId() == null) ? 0 : getCdId().hashCode());
        result = prime * result + ((getCdName() == null) ? 0 : getCdName().hashCode());
        result = prime * result + ((getCdIndex() == null) ? 0 : getCdIndex().hashCode());
        result = prime * result + ((getSchId() == null) ? 0 : getSchId().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getSfyx() == null) ? 0 : getSfyx().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bh=").append(bh);
        sb.append(", cdId=").append(cdId);
        sb.append(", cdName=").append(cdName);
        sb.append(", cdIndex=").append(cdIndex);
        sb.append(", schId=").append(schId);
        sb.append(", linkman=").append(linkman);
        sb.append(", telephone=").append(telephone);
        sb.append(", sfyx=").append(sfyx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}