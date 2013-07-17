
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumResStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumResStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Incomplete"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="InUse"/>
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Available"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumResStatus")
@XmlEnum
public enum EnumResStatus {

    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("InUse")
    IN_USE("InUse"),
    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Available")
    AVAILABLE("Available");
    private final String value;

    EnumResStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumResStatus fromValue(String v) {
        for (EnumResStatus c: EnumResStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
