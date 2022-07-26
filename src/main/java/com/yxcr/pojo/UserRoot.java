package com.yxcr.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName user_root
 */
@TableName(value ="user_root")
@Data
public class UserRoot implements Serializable {
    /**
     * 
     */
    @TableId
    private String aid;
    private Integer zwid;
    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String password;

    /**
     * 
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
    private String token;
    /**
     * 
     */
    private String avatar;

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
        UserRoot other = (UserRoot) that;
        return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSfyx() == null ? other.getSfyx() == null : this.getSfyx().equals(other.getSfyx()))
                && (this.getZwid() == null ? other.getZwid() == null : this.getZwid().equals(other.getZwid()))

                && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSfyx() == null) ? 0 : getSfyx().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getZwid() == null) ? 0 : getZwid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", sfyx=").append(sfyx);
        sb.append(", avatar=").append(avatar);
        sb.append(", zwid=").append(zwid);

        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}