package com.yxcr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName notification_is
 */
@TableName(value ="notification_is")
@Data
public class NotificationIs implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long bh;

    /**
     * 标题
     */
    private String bt;

    /**
     * 简介
     */
    private String intro;

    /**
     * 内容
     */
    private String nr;

    /**
     * 信息类型
     */
    private String xxlx;

    /**
     * 是否发布
     */
    private String sffb;

    /**
     * 发布日期
     */
    private String fbrq;

    /**
     * 是否有效
     */
    private String sfyx;

    /**
     * 登记人
     */
    private String djr;

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
        NotificationIs other = (NotificationIs) that;
        return (this.getBh() == null ? other.getBh() == null : this.getBh().equals(other.getBh()))
            && (this.getBt() == null ? other.getBt() == null : this.getBt().equals(other.getBt()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getNr() == null ? other.getNr() == null : this.getNr().equals(other.getNr()))
            && (this.getXxlx() == null ? other.getXxlx() == null : this.getXxlx().equals(other.getXxlx()))
            && (this.getSffb() == null ? other.getSffb() == null : this.getSffb().equals(other.getSffb()))
            && (this.getFbrq() == null ? other.getFbrq() == null : this.getFbrq().equals(other.getFbrq()))
            && (this.getSfyx() == null ? other.getSfyx() == null : this.getSfyx().equals(other.getSfyx()))
            && (this.getDjr() == null ? other.getDjr() == null : this.getDjr().equals(other.getDjr()))
            && (this.getDjrq() == null ? other.getDjrq() == null : this.getDjrq().equals(other.getDjrq()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBh() == null) ? 0 : getBh().hashCode());
        result = prime * result + ((getBt() == null) ? 0 : getBt().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getNr() == null) ? 0 : getNr().hashCode());
        result = prime * result + ((getXxlx() == null) ? 0 : getXxlx().hashCode());
        result = prime * result + ((getSffb() == null) ? 0 : getSffb().hashCode());
        result = prime * result + ((getFbrq() == null) ? 0 : getFbrq().hashCode());
        result = prime * result + ((getSfyx() == null) ? 0 : getSfyx().hashCode());
        result = prime * result + ((getDjr() == null) ? 0 : getDjr().hashCode());
        result = prime * result + ((getDjrq() == null) ? 0 : getDjrq().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bh=").append(bh);
        sb.append(", bt=").append(bt);
        sb.append(", intro=").append(intro);
        sb.append(", nr=").append(nr);
        sb.append(", xxlx=").append(xxlx);
        sb.append(", sffb=").append(sffb);
        sb.append(", fbrq=").append(fbrq);
        sb.append(", sfyx=").append(sfyx);
        sb.append(", djr=").append(djr);
        sb.append(", djrq=").append(djrq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}