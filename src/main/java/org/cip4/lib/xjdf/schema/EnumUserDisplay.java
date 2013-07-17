
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumUserDisplay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumUserDisplay">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="Hide"/>
 *     &lt;enumeration value="Dependent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumUserDisplay")
@XmlEnum
public enum EnumUserDisplay {

    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Hide")
    HIDE("Hide"),
    @XmlEnumValue("Dependent")
    DEPENDENT("Dependent");
    private final String value;

    EnumUserDisplay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumUserDisplay fromValue(String v) {
        for (EnumUserDisplay c: EnumUserDisplay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
