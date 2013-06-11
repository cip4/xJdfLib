
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumXYRelation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumXYRelation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="gt"/>
 *     &lt;enumeration value="ge"/>
 *     &lt;enumeration value="ne"/>
 *     &lt;enumeration value="eq"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="le"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumXYRelation")
@XmlEnum
public enum EnumXYRelation {

    @XmlEnumValue("gt")
    GT("gt"),
    @XmlEnumValue("ge")
    GE("ge"),
    @XmlEnumValue("ne")
    NE("ne"),
    @XmlEnumValue("eq")
    EQ("eq"),
    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("le")
    LE("le");
    private final String value;

    EnumXYRelation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumXYRelation fromValue(String v) {
        for (EnumXYRelation c: EnumXYRelation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
