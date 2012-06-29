
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumClasses.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumClasses">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Event"/>
 *     &lt;enumeration value="Information"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Fatal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumClasses")
@XmlEnum
public enum EnumClasses {

    @XmlEnumValue("Event")
    EVENT("Event"),
    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Fatal")
    FATAL("Fatal");
    private final String value;

    EnumClasses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumClasses fromValue(String v) {
        for (EnumClasses c: EnumClasses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
