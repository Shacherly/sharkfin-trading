package com.google.backend.trading.dao.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   用户系统配置表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table trade_user_system_setting
 */
public class TradeUserSystemSetting implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user_system_setting.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user_system_setting.uid
     *
     * @mbg.generated
     */
    private String uid;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user_system_setting.ctime
     *
     * @mbg.generated
     */
    private Date ctime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_user_system_setting.mtime
     *
     * @mbg.generated
     */
    private Date mtime;

    /**
	 * Database Column Remarks:
	 * 允许清算
	 * <p>
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column trade_user_system_setting.liquidation
	 *
	 * @mbg.generated
	 */
	private Boolean liquidation;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column trade_user_system_setting.remark
	 *
	 * @mbg.generated
	 */
	private String remark;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database table trade_user_system_setting
	 *
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column trade_user_system_setting.id
	 *
	 * @return the value of trade_user_system_setting.id
	 * @mbg.generated
	 */
	public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user_system_setting.id
     *
     * @param id the value for trade_user_system_setting.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user_system_setting.uid
     *
     * @return the value of trade_user_system_setting.uid
     *
     * @mbg.generated
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user_system_setting.uid
     *
     * @param uid the value for trade_user_system_setting.uid
     *
     * @mbg.generated
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user_system_setting.ctime
     *
     * @return the value of trade_user_system_setting.ctime
     *
     * @mbg.generated
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user_system_setting.ctime
     *
     * @param ctime the value for trade_user_system_setting.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user_system_setting.mtime
     *
     * @return the value of trade_user_system_setting.mtime
     *
     * @mbg.generated
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_user_system_setting.mtime
     *
     * @param mtime the value for trade_user_system_setting.mtime
     *
     * @mbg.generated
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_user_system_setting.liquidation
     *
     * @return the value of trade_user_system_setting.liquidation
     *
     * @mbg.generated
     */
    public Boolean getLiquidation() {
		return liquidation;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column trade_user_system_setting.liquidation
	 *
	 * @param liquidation the value for trade_user_system_setting.liquidation
	 * @mbg.generated
	 */
	public void setLiquidation(Boolean liquidation) {
		this.liquidation = liquidation;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column trade_user_system_setting.remark
	 *
	 * @return the value of trade_user_system_setting.remark
	 * @mbg.generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column trade_user_system_setting.remark
	 *
	 * @param remark the value for trade_user_system_setting.remark
	 * @mbg.generated
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table trade_user_system_setting
	 *
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", uid=").append(uid);
		sb.append(", ctime=").append(ctime);
		sb.append(", mtime=").append(mtime);
		sb.append(", liquidation=").append(liquidation);
		sb.append(", remark=").append(remark);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}