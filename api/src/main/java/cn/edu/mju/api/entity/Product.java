package cn.edu.mju.api.entity;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品
 * @author <a href="https://github.com/haidilaohotpot">cheng</a>
 * @since 1.0.0 2019/9/25
 */
@Data
public class Product {

    private String id;

    private String name;


    private String status;
    //起投金额
    private BigDecimal thresholdAmount;
    //投资步长
    private BigDecimal stepAmount;
    //锁定期
    private Integer lockTerm;
    //收益率 呀；因为要与其他数相乘 所以使用BigDecimal
    private BigDecimal rewardRate;

    private String memo;

    private Date createAt;

    private Date updateAt;

    private String createUser;

    private String updateUser;


}
