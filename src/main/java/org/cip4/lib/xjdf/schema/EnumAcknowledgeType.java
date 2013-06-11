
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumAcknowledgeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumAcknowledgeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Received"/>
 *     &lt;enumeration value="Applied"/>
 *     &lt;enumeration value="Completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumAcknowledgeType")
@XmlEnum
public enum EnumAcknowledgeType {

    @XmlEnumValue("Received")
    RECEIVED("Received"),
    @XmlEnumValue("Applied")
    APPLIED("Applied"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    EnumAcknowledgeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumAcknowledgeType fromValue(String v) {
        for (EnumAcknowledgeType c: EnumAcknowledgeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
