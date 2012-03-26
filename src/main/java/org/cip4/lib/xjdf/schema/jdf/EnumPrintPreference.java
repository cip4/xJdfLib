
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumPrintPreference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPrintPreference">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Balanced"/>
 *     &lt;enumeration value="CostEffective"/>
 *     &lt;enumeration value="Fastest"/>
 *     &lt;enumeration value="HightestQuality"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumPrintPreference")
@XmlEnum
public enum EnumPrintPreference {

    @XmlEnumValue("Balanced")
    BALANCED("Balanced"),
    @XmlEnumValue("CostEffective")
    COST_EFFECTIVE("CostEffective"),
    @XmlEnumValue("Fastest")
    FASTEST("Fastest"),
    @XmlEnumValue("HightestQuality")
    HIGHTEST_QUALITY("HightestQuality");
    private final String value;

    EnumPrintPreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPrintPreference fromValue(String v) {
        for (EnumPrintPreference c: EnumPrintPreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
