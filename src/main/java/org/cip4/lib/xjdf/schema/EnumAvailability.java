
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumAvailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotInstalled"/>
 *     &lt;enumeration value="NotLicensed"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Installed"/>
 *     &lt;enumeration value="Module"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumAvailability")
@XmlEnum
public enum EnumAvailability {

    @XmlEnumValue("NotInstalled")
    NOT_INSTALLED("NotInstalled"),
    @XmlEnumValue("NotLicensed")
    NOT_LICENSED("NotLicensed"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("Installed")
    INSTALLED("Installed"),
    @XmlEnumValue("Module")
    MODULE("Module");
    private final String value;

    EnumAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumAvailability fromValue(String v) {
        for (EnumAvailability c: EnumAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
