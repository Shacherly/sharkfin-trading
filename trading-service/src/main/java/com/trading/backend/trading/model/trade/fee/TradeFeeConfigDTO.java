package com.google.backend.trading.model.trade.fee;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author david.chen
 * @date 2022/1/5 20:03
 */
@Data
public class TradeFeeConfigDTO {

    /**
     * Database Column Remarks:
     *   唯一标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_fee_default_config.tag
     *
     * @mbg.generated
     */
    private String tag;

    /**
     * Database Column Remarks:
     *   用户ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_fee_user_config.uid
     *
     * @mbg.generated
     */
    private String uid;

    /**
     * Database Column Remarks:
     *   现货手续费率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_fee_default_config.spot_fee_rate
     *
     * @mbg.generated
     */
    private BigDecimal spotFeeRate;

    /**
     * Database Column Remarks:
     *   兑换手续费率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_fee_default_config.swap_fee_rate
     *
     * @mbg.generated
     */
    private BigDecimal swapFeeRate;

    /**
     * Database Column Remarks:
     *   杠杆手续费率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_fee_default_config.margin_fee_rate
     *
     * @mbg.generated
     */
    private BigDecimal marginFeeRate;

    /**
     * Database Column Remarks:
     *   算法手续费率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_fee_default_config.algorithmic_fee_rate
     *
     * @mbg.generated
     */
    private BigDecimal algorithmicFeeRate;

    /**
     * Database Column Remarks:
     *   交割服务费率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_fee_default_config.margin_settle_fee_rate
     *
     * @mbg.generated
     */
    private BigDecimal marginSettleFeeRate;

    /**
     * Database Column Remarks:
     *   资金费率收取开关
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_fee_default_config.funding_cost_enable
     *
     * @mbg.generated
     */
    private Boolean fundingCostEnable;
}
