package com.yxcr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName stu_pedit
 */
@TableName(value ="stu_pedit")
@Data
public class StuPedit implements Serializable {
    /**
     * 编号
     */
    @TableId
    private Long bh;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学号
     */
    private String sid;

    /**
     * 所在学校
     */
    private String school;

    /**
     * 所在班级
     */
    private String myclass;

    /**
     * 身高
     */
    private String height;

    /**
     * 体重
     */
    private String weight;

    /**
     * 血压
     */
    private String xy;

    /**
     * 肺活量
     */
    private String fhl;

    /**
     * 视力
     */
    private String sl;

    /**
     * 色觉
     */
    private String sm;

    /**
     * 血常规
     */
    private String xcg;

    /**
     * 心脏
     */
    private String xz;

    /**
     * 胸部X光
     */
    private String xbxg;

    /**
     * 医生寄语
     */
    private String ysjy;

    /**
     * 意见建议
     */
    private String yjjy;

    /**
     * 填表人
     */
    private String tbr;

    /**
     * 填表日期
     */
    private String rbrq;

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
        StuPedit other = (StuPedit) that;
        return (this.getBh() == null ? other.getBh() == null : this.getBh().equals(other.getBh()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getMyclass() == null ? other.getMyclass() == null : this.getMyclass().equals(other.getMyclass()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getXy() == null ? other.getXy() == null : this.getXy().equals(other.getXy()))
            && (this.getFhl() == null ? other.getFhl() == null : this.getFhl().equals(other.getFhl()))
            && (this.getSl() == null ? other.getSl() == null : this.getSl().equals(other.getSl()))
            && (this.getSm() == null ? other.getSm() == null : this.getSm().equals(other.getSm()))
            && (this.getXcg() == null ? other.getXcg() == null : this.getXcg().equals(other.getXcg()))
            && (this.getXz() == null ? other.getXz() == null : this.getXz().equals(other.getXz()))
            && (this.getXbxg() == null ? other.getXbxg() == null : this.getXbxg().equals(other.getXbxg()))
            && (this.getYsjy() == null ? other.getYsjy() == null : this.getYsjy().equals(other.getYsjy()))
            && (this.getYjjy() == null ? other.getYjjy() == null : this.getYjjy().equals(other.getYjjy()))
            && (this.getTbr() == null ? other.getTbr() == null : this.getTbr().equals(other.getTbr()))
            && (this.getRbrq() == null ? other.getRbrq() == null : this.getRbrq().equals(other.getRbrq()))
            && (this.getSfyx() == null ? other.getSfyx() == null : this.getSfyx().equals(other.getSfyx()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBh() == null) ? 0 : getBh().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getMyclass() == null) ? 0 : getMyclass().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getXy() == null) ? 0 : getXy().hashCode());
        result = prime * result + ((getFhl() == null) ? 0 : getFhl().hashCode());
        result = prime * result + ((getSl() == null) ? 0 : getSl().hashCode());
        result = prime * result + ((getSm() == null) ? 0 : getSm().hashCode());
        result = prime * result + ((getXcg() == null) ? 0 : getXcg().hashCode());
        result = prime * result + ((getXz() == null) ? 0 : getXz().hashCode());
        result = prime * result + ((getXbxg() == null) ? 0 : getXbxg().hashCode());
        result = prime * result + ((getYsjy() == null) ? 0 : getYsjy().hashCode());
        result = prime * result + ((getYjjy() == null) ? 0 : getYjjy().hashCode());
        result = prime * result + ((getTbr() == null) ? 0 : getTbr().hashCode());
        result = prime * result + ((getRbrq() == null) ? 0 : getRbrq().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", sid=").append(sid);
        sb.append(", school=").append(school);
        sb.append(", myclass=").append(myclass);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", xy=").append(xy);
        sb.append(", fhl=").append(fhl);
        sb.append(", sl=").append(sl);
        sb.append(", sm=").append(sm);
        sb.append(", xcg=").append(xcg);
        sb.append(", xz=").append(xz);
        sb.append(", xbxg=").append(xbxg);
        sb.append(", ysjy=").append(ysjy);
        sb.append(", yjjy=").append(yjjy);
        sb.append(", tbr=").append(tbr);
        sb.append(", rbrq=").append(rbrq);
        sb.append(", sfyx=").append(sfyx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}