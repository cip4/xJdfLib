
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumComponentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumComponentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Block"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Ribbon"/>
 *     &lt;enumeration value="Sheet"/>
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="FinalProduct"/>
 *     &lt;enumeration value="PartialProduct"/>
 *     &lt;enumeration value="Proof"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumComponentType")
@XmlEnum
public enum EnumComponentType {

    @XmlEnumValue("Block")
    BLOCK("Block"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Ribbon")
    RIBBON("Ribbon"),
    @XmlEnumValue("Sheet")
    SHEET("Sheet"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("FinalProduct")
    FINAL_PRODUCT("FinalProduct"),
    @XmlEnumValue("PartialProduct")
    PARTIAL_PRODUCT("PartialProduct"),
    @XmlEnumValue("Proof")
    PROOF("Proof");
    private final String value;

    EnumComponentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumComponentType fromValue(String v) {
        for (EnumComponentType c: EnumComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
