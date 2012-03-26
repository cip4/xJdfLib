
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumWorkStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumWorkStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Simplex"/>
 *     &lt;enumeration value="Perfecting"/>
 *     &lt;enumeration value="WorkAndBack"/>
 *     &lt;enumeration value="WorkAndTurn"/>
 *     &lt;enumeration value="WorkAndTumble"/>
 *     &lt;enumeration value="WorkAndTwist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumWorkStyle")
@XmlEnum
public enum EnumWorkStyle {

    @XmlEnumValue("Simplex")
    SIMPLEX("Simplex"),
    @XmlEnumValue("Perfecting")
    PERFECTING("Perfecting"),
    @XmlEnumValue("WorkAndBack")
    WORK_AND_BACK("WorkAndBack"),
    @XmlEnumValue("WorkAndTurn")
    WORK_AND_TURN("WorkAndTurn"),
    @XmlEnumValue("WorkAndTumble")
    WORK_AND_TUMBLE("WorkAndTumble"),
    @XmlEnumValue("WorkAndTwist")
    WORK_AND_TWIST("WorkAndTwist");
    private final String value;

    EnumWorkStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumWorkStyle fromValue(String v) {
        for (EnumWorkStyle c: EnumWorkStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
