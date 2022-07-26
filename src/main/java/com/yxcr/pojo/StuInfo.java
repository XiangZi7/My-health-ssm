package com.yxcr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName stu_info
 */
@TableName(value ="stu_info")
@Data
public class StuInfo implements Serializable {
    /**
     * 编号
     */
    @TableId
    private Long bh;

    /**
     * 学号
     */
    private String sid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 所在学校
     */
    private String school;

    /**
     * 入学年份
     */
    private String rxnf;

    /**
     * 所在班级
     */
    private String myclass;

    /**
     * 民族
     */
    private String national;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 老师寄语
     */
    private String lsjy;

    /**
     * 母亲
     */
    private String mother;

    /**
     * 父亲
     */
    private String father;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 联系电话1
     */
    private String telephone1;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 登记人
     */
    private String djr;

    /**
     * 登记日期
     */
    private String djrq;

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
        StuInfo other = (StuInfo) that;
        return (this.getBh() == null ? other.getBh() == null : this.getBh().equals(other.getBh()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getRxnf() == null ? other.getRxnf() == null : this.getRxnf().equals(other.getRxnf()))
            && (this.getMyclass() == null ? other.getMyclass() == null : this.getMyclass().equals(other.getMyclass()))
            && (this.getNational() == null ? other.getNational() == null : this.getNational().equals(other.getNational()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getLsjy() == null ? other.getLsjy() == null : this.getLsjy().equals(other.getLsjy()))
            && (this.getMother() == null ? other.getMother() == null : this.getMother().equals(other.getMother()))
            && (this.getFather() == null ? other.getFather() == null : this.getFather().equals(other.getFather()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getTelephone1() == null ? other.getTelephone1() == null : this.getTelephone1().equals(other.getTelephone1()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDjr() == null ? other.getDjr() == null : this.getDjr().equals(other.getDjr()))
            && (this.getDjrq() == null ? other.getDjrq() == null : this.getDjrq().equals(other.getDjrq()))
            && (this.getSfyx() == null ? other.getSfyx() == null : this.getSfyx().equals(other.getSfyx()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBh() == null) ? 0 : getBh().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getRxnf() == null) ? 0 : getRxnf().hashCode());
        result = prime * result + ((getMyclass() == null) ? 0 : getMyclass().hashCode());
        result = prime * result + ((getNational() == null) ? 0 : getNational().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getLsjy() == null) ? 0 : getLsjy().hashCode());
        result = prime * result + ((getMother() == null) ? 0 : getMother().hashCode());
        result = prime * result + ((getFather() == null) ? 0 : getFather().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getTelephone1() == null) ? 0 : getTelephone1().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDjr() == null) ? 0 : getDjr().hashCode());
        result = prime * result + ((getDjrq() == null) ? 0 : getDjrq().hashCode());
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
        sb.append(", sid=").append(sid);
        sb.append(", name=").append(name);
        sb.append(", school=").append(school);
        sb.append(", rxnf=").append(rxnf);
        sb.append(", myclass=").append(myclass);
        sb.append(", national=").append(national);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", lsjy=").append(lsjy);
        sb.append(", mother=").append(mother);
        sb.append(", father=").append(father);
        sb.append(", telephone=").append(telephone);
        sb.append(", telephone1=").append(telephone1);
        sb.append(", address=").append(address);
        sb.append(", djr=").append(djr);
        sb.append(", djrq=").append(djrq);
        sb.append(", sfyx=").append(sfyx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}