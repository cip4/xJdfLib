
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumSourceCSs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumSourceCSs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CalGray"/>
 *     &lt;enumeration value="CalRGB"/>
 *     &lt;enumeration value="Calibrated"/>
 *     &lt;enumeration value="CIEBased"/>
 *     &lt;enumeration value="CMYK"/>
 *     &lt;enumeration value="DeviceN"/>
 *     &lt;enumeration value="DevIndep"/>
 *     &lt;enumeration value="RGB"/>
 *     &lt;enumeration value="Gray"/>
 *     &lt;enumeration value="ICCBased"/>
 *     &lt;enumeration value="ICCCMYK"/>
 *     &lt;enumeration value="ICCGray"/>
 *     &lt;enumeration value="ICCLAB"/>
 *     &lt;enumeration value="ICCRGB"/>
 *     &lt;enumeration value="Lab"/>
 *     &lt;enumeration value="Separtation"/>
 *     &lt;enumeration value="YUV"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumSourceCSs")
@XmlEnum
public enum EnumSourceCSs {

    @XmlEnumValue("CalGray")
    CAL_GRAY("CalGray"),
    @XmlEnumValue("CalRGB")
    CAL_RGB("CalRGB"),
    @XmlEnumValue("Calibrated")
    CALIBRATED("Calibrated"),
    @XmlEnumValue("CIEBased")
    CIE_BASED("CIEBased"),
    CMYK("CMYK"),
    @XmlEnumValue("DeviceN")
    DEVICE_N("DeviceN"),
    @XmlEnumValue("DevIndep")
    DEV_INDEP("DevIndep"),
    RGB("RGB"),
    @XmlEnumValue("Gray")
    GRAY("Gray"),
    @XmlEnumValue("ICCBased")
    ICC_BASED("ICCBased"),
    ICCCMYK("ICCCMYK"),
    @XmlEnumValue("ICCGray")
    ICC_GRAY("ICCGray"),
    ICCLAB("ICCLAB"),
    ICCRGB("ICCRGB"),
    @XmlEnumValue("Lab")
    LAB("Lab"),
    @XmlEnumValue("Separtation")
    SEPARTATION("Separtation"),
    YUV("YUV"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    EnumSourceCSs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumSourceCSs fromValue(String v) {
        for (EnumSourceCSs c: EnumSourceCSs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
