
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumAnchor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumAnchor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TopLeft"/>
 *     &lt;enumeration value="TopCenter"/>
 *     &lt;enumeration value="TopRight"/>
 *     &lt;enumeration value="CenterLeft"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="CenterRight"/>
 *     &lt;enumeration value="BottomLeft"/>
 *     &lt;enumeration value="BottomCenter"/>
 *     &lt;enumeration value="BottomRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumAnchor")
@XmlEnum
public enum EnumAnchor {

    @XmlEnumValue("TopLeft")
    TOP_LEFT("TopLeft"),
    @XmlEnumValue("TopCenter")
    TOP_CENTER("TopCenter"),
    @XmlEnumValue("TopRight")
    TOP_RIGHT("TopRight"),
    @XmlEnumValue("CenterLeft")
    CENTER_LEFT("CenterLeft"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("CenterRight")
    CENTER_RIGHT("CenterRight"),
    @XmlEnumValue("BottomLeft")
    BOTTOM_LEFT("BottomLeft"),
    @XmlEnumValue("BottomCenter")
    BOTTOM_CENTER("BottomCenter"),
    @XmlEnumValue("BottomRight")
    BOTTOM_RIGHT("BottomRight");
    private final String value;

    EnumAnchor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumAnchor fromValue(String v) {
        for (EnumAnchor c: EnumAnchor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
