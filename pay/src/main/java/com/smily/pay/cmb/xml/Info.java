package com.smily.pay.cmb.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;
import lombok.Data;
import lombok.extern.log4j.Log4j;

/**
 * @author ruanzh
 * @since 2017/7/14
 */
@Log4j
@XStreamAlias("INFO")
public @Data class Info {
    private String FUNNAM;
    private String DATTYP;
    private String LGNNAM;
    
    public static void main(String[] args) {
        Info info = new Info();
        info.setFUNNAM("DCPAYMENT");
        info.setDATTYP("2");
        info.setLGNNAM("WXYS");
        log.info("asd");
    
        XStream xStream = new XStream(new DomDriver("utf8"));
        xStream.processAnnotations(Info.class);
//        StringWriter stringWriter = new StringWriter();
//        xStream.marshal(info, new CompactWriter(stringWriter));
        String xml = xStream.toXML(info);
        System.out.println(xml);
    
    }
}
