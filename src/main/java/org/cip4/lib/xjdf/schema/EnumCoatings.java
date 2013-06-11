
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumCoatings.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCoatings">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Coated"/>
 *     &lt;enumeration value="Glossy"/>
 *     &lt;enumeration value="HighGloss"/>
 *     &lt;enumeration value="InkJet"/>
 *     &lt;enumeration value="Matte"/>
 *     &lt;enumeration value="Polymer"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Satin"/>
 *     &lt;enumeration value="Semigloss"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumCoatings")
@XmlEnum
public enum EnumCoatings {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Coated")
    COATED("Coated"),
    @XmlEnumValue("Glossy")
    GLOSSY("Glossy"),
    @XmlEnumValue("HighGloss")
    HIGH_GLOSS("HighGloss"),
    @XmlEnumValue("InkJet")
    INK_JET("InkJet"),
    @XmlEnumValue("Matte")
    MATTE("Matte"),
    @XmlEnumValue("Polymer")
    POLYMER("Polymer"),
    @XmlEnumValue("Silver")
    SILVER("Silver"),
    @XmlEnumValue("Satin")
    SATIN("Satin"),
    @XmlEnumValue("Semigloss")
    SEMIGLOSS("Semigloss");
    private final String value;

    EnumCoatings(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCoatings fromValue(String v) {
        for (EnumCoatings c: EnumCoatings.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
