
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumPreviewUsages.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPreviewUsages">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Static3D"/>
 *     &lt;enumeration value="Animation"/>
 *     &lt;enumeration value="Identification"/>
 *     &lt;enumeration value="Separation"/>
 *     &lt;enumeration value="SeparationRaw"/>
 *     &lt;enumeration value="SeparatedThumbNail"/>
 *     &lt;enumeration value="ThumbNail"/>
 *     &lt;enumeration value="Viewable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumPreviewUsages")
@XmlEnum
public enum EnumPreviewUsages {

    @XmlEnumValue("Static3D")
    STATIC_3_D("Static3D"),
    @XmlEnumValue("Animation")
    ANIMATION("Animation"),
    @XmlEnumValue("Identification")
    IDENTIFICATION("Identification"),
    @XmlEnumValue("Separation")
    SEPARATION("Separation"),
    @XmlEnumValue("SeparationRaw")
    SEPARATION_RAW("SeparationRaw"),
    @XmlEnumValue("SeparatedThumbNail")
    SEPARATED_THUMB_NAIL("SeparatedThumbNail"),
    @XmlEnumValue("ThumbNail")
    THUMB_NAIL("ThumbNail"),
    @XmlEnumValue("Viewable")
    VIEWABLE("Viewable");
    private final String value;

    EnumPreviewUsages(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPreviewUsages fromValue(String v) {
        for (EnumPreviewUsages c: EnumPreviewUsages.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
