
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CompleteList"/>
 *     &lt;enumeration value="CompleteOrderedList"/>
 *     &lt;enumeration value="ContainedList"/>
 *     &lt;enumeration value="List"/>
 *     &lt;enumeration value="OrderedList"/>
 *     &lt;enumeration value="OrderedRangeList"/>
 *     &lt;enumeration value="Range"/>
 *     &lt;enumeration value="RangeList"/>
 *     &lt;enumeration value="SingleValue"/>
 *     &lt;enumeration value="Span"/>
 *     &lt;enumeration value="UniqueList"/>
 *     &lt;enumeration value="UniqueRangeList"/>
 *     &lt;enumeration value="UniqueOrderedList"/>
 *     &lt;enumeration value="UniqueOrderedRangeList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumListType")
@XmlEnum
public enum EnumListType {

    @XmlEnumValue("CompleteList")
    COMPLETE_LIST("CompleteList"),
    @XmlEnumValue("CompleteOrderedList")
    COMPLETE_ORDERED_LIST("CompleteOrderedList"),
    @XmlEnumValue("ContainedList")
    CONTAINED_LIST("ContainedList"),
    @XmlEnumValue("List")
    LIST("List"),
    @XmlEnumValue("OrderedList")
    ORDERED_LIST("OrderedList"),
    @XmlEnumValue("OrderedRangeList")
    ORDERED_RANGE_LIST("OrderedRangeList"),
    @XmlEnumValue("Range")
    RANGE("Range"),
    @XmlEnumValue("RangeList")
    RANGE_LIST("RangeList"),
    @XmlEnumValue("SingleValue")
    SINGLE_VALUE("SingleValue"),
    @XmlEnumValue("Span")
    SPAN("Span"),
    @XmlEnumValue("UniqueList")
    UNIQUE_LIST("UniqueList"),
    @XmlEnumValue("UniqueRangeList")
    UNIQUE_RANGE_LIST("UniqueRangeList"),
    @XmlEnumValue("UniqueOrderedList")
    UNIQUE_ORDERED_LIST("UniqueOrderedList"),
    @XmlEnumValue("UniqueOrderedRangeList")
    UNIQUE_ORDERED_RANGE_LIST("UniqueOrderedRangeList");
    private final String value;

    EnumListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumListType fromValue(String v) {
        for (EnumListType c: EnumListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
