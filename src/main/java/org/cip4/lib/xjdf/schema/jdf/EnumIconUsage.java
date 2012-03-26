
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumIconUsage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumIconUsage">
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
@XmlType(name = "EnumIconUsage")
@XmlEnum
public enum EnumIconUsage {

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

    EnumIconUsage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumIconUsage fromValue(String v) {
        for (EnumIconUsage c: EnumIconUsage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
