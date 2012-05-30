
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumSourceObjects.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumSourceObjects">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="ImagePhotographic"/>
 *     &lt;enumeration value="ImageScreenShot"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="LineArt"/>
 *     &lt;enumeration value="SmoothShades"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumSourceObjects")
@XmlEnum
public enum EnumSourceObjects {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("ImagePhotographic")
    IMAGE_PHOTOGRAPHIC("ImagePhotographic"),
    @XmlEnumValue("ImageScreenShot")
    IMAGE_SCREEN_SHOT("ImageScreenShot"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("LineArt")
    LINE_ART("LineArt"),
    @XmlEnumValue("SmoothShades")
    SMOOTH_SHADES("SmoothShades");
    private final String value;

    EnumSourceObjects(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumSourceObjects fromValue(String v) {
        for (EnumSourceObjects c: EnumSourceObjects.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
