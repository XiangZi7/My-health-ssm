package com.yxcr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName sch_idt
 */
@TableName(value ="sch_idt")
@Data
public class SchIdt implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Integer bh;

    /**
     * 学校编号
     */
    private String sdId;

    /**
     * 学校名称
     */
    private String sdName;

    /**
     * 排序号
     */
    private Integer sdIndex;

    /**
     * 地址
     */
    private String address;

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
        SchIdt other = (SchIdt) that;
        return (this.getBh() == null ? other.getBh() == null : this.getBh().equals(other.getBh()))
            && (this.getSdId() == null ? other.getSdId() == null : this.getSdId().equals(other.getSdId()))
            && (this.getSdName() == null ? other.getSdName() == null : this.getSdName().equals(other.getSdName()))
            && (this.getSdIndex() == null ? other.getSdIndex() == null : this.getSdIndex().equals(other.getSdIndex()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getSfyx() == null ? other.getSfyx() == null : this.getSfyx().equals(other.getSfyx()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBh() == null) ? 0 : getBh().hashCode());
        result = prime * result + ((getSdId() == null) ? 0 : getSdId().hashCode());
        result = prime * result + ((getSdName() == null) ? 0 : getSdName().hashCode());
        result = prime * result + ((getSdIndex() == null) ? 0 : getSdIndex().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
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
        sb.append(", sdId=").append(sdId);
        sb.append(", sdName=").append(sdName);
        sb.append(", sdIndex=").append(sdIndex);
        sb.append(", address=").append(address);
        sb.append(", linkman=").append(linkman);
        sb.append(", telephone=").append(telephone);
        sb.append(", sfyx=").append(sfyx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}