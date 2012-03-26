
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumStatusList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumStatusList">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Waiting"/>
 *     &lt;enumeration value="Held"/>
 *     &lt;enumeration value="Removed"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="PendingReturn"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Aborted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumStatusList")
@XmlEnum
public enum EnumStatusList {

    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Waiting")
    WAITING("Waiting"),
    @XmlEnumValue("Held")
    HELD("Held"),
    @XmlEnumValue("Removed")
    REMOVED("Removed"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),
    @XmlEnumValue("PendingReturn")
    PENDING_RETURN("PendingReturn"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Aborted")
    ABORTED("Aborted");
    private final String value;

    EnumStatusList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumStatusList fromValue(String v) {
        for (EnumStatusList c: EnumStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
