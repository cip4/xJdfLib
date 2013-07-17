
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumNodeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumNodeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Waiting"/>
 *     &lt;enumeration value="Setup"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Cleanup"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="Stopped"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Aborted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumNodeStatus")
@XmlEnum
public enum EnumNodeStatus {

    @XmlEnumValue("Waiting")
    WAITING("Waiting"),
    @XmlEnumValue("Setup")
    SETUP("Setup"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Cleanup")
    CLEANUP("Cleanup"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Aborted")
    ABORTED("Aborted");
    private final String value;

    EnumNodeStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumNodeStatus fromValue(String v) {
        for (EnumNodeStatus c: EnumNodeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
