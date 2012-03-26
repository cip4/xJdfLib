
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumOrientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumOrientation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Flip0"/>
 *     &lt;enumeration value="Flip90"/>
 *     &lt;enumeration value="Flip180"/>
 *     &lt;enumeration value="Flip270"/>
 *     &lt;enumeration value="Rotate0"/>
 *     &lt;enumeration value="Rotate90"/>
 *     &lt;enumeration value="Rotate180"/>
 *     &lt;enumeration value="Rotate270"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumOrientation")
@XmlEnum
public enum EnumOrientation {

    @XmlEnumValue("Flip0")
    FLIP_0("Flip0"),
    @XmlEnumValue("Flip90")
    FLIP_90("Flip90"),
    @XmlEnumValue("Flip180")
    FLIP_180("Flip180"),
    @XmlEnumValue("Flip270")
    FLIP_270("Flip270"),
    @XmlEnumValue("Rotate0")
    ROTATE_0("Rotate0"),
    @XmlEnumValue("Rotate90")
    ROTATE_90("Rotate90"),
    @XmlEnumValue("Rotate180")
    ROTATE_180("Rotate180"),
    @XmlEnumValue("Rotate270")
    ROTATE_270("Rotate270");
    private final String value;

    EnumOrientation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumOrientation fromValue(String v) {
        for (EnumOrientation c: EnumOrientation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
