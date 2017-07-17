package com.smily.pay.cmb.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * @author ruanzh
 * @since 2017/7/14
 */
@XStreamAlias("SDKPAYRQX")
public @Data class Payment {
    private String BUSCOD; //业务类别
    private String BUSMOD;
    private String MODALS;


}
