
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumDeviceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDeviceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Idle"/>
 *     &lt;enumeration value="Down"/>
 *     &lt;enumeration value="Setup"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Cleanup"/>
 *     &lt;enumeration value="Stopped"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumDeviceStatus")
@XmlEnum
public enum EnumDeviceStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("Down")
    DOWN("Down"),
    @XmlEnumValue("Setup")
    SETUP("Setup"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Cleanup")
    CLEANUP("Cleanup"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped");
    private final String value;

    EnumDeviceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumDeviceStatus fromValue(String v) {
        for (EnumDeviceStatus c: EnumDeviceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
