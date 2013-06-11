
package org.cip4.lib.xjdf.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumHoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumHoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="S1-generic"/>
 *     &lt;enumeration value="S-generic"/>
 *     &lt;enumeration value="R2-generic"/>
 *     &lt;enumeration value="R2m-DIN"/>
 *     &lt;enumeration value="R2m-ISO"/>
 *     &lt;enumeration value="R2m-MIB"/>
 *     &lt;enumeration value="R2i-US-a"/>
 *     &lt;enumeration value="R2i-US-b"/>
 *     &lt;enumeration value="R3-generic"/>
 *     &lt;enumeration value="R3i-US"/>
 *     &lt;enumeration value="R4-generic"/>
 *     &lt;enumeration value="R4m-DIN-A4"/>
 *     &lt;enumeration value="R4m-DIN-A5"/>
 *     &lt;enumeration value="R4m-swedish"/>
 *     &lt;enumeration value="R4i-US"/>
 *     &lt;enumeration value="R5-generic"/>
 *     &lt;enumeration value="R5i-US-a"/>
 *     &lt;enumeration value="R5i-US-b"/>
 *     &lt;enumeration value="R5i-US-c"/>
 *     &lt;enumeration value="R6-generic"/>
 *     &lt;enumeration value="R6m-4h2s"/>
 *     &lt;enumeration value="R6m-DIN-A5"/>
 *     &lt;enumeration value="R7-generic"/>
 *     &lt;enumeration value="R7i-US-a"/>
 *     &lt;enumeration value="R7i-US-b"/>
 *     &lt;enumeration value="R7i-US-c"/>
 *     &lt;enumeration value="R11m-7h4s"/>
 *     &lt;enumeration value="P16_9i-rect-0t"/>
 *     &lt;enumeration value="P12m-rect-0t"/>
 *     &lt;enumeration value="W2_1i-round-0t"/>
 *     &lt;enumeration value="W2_1i-square-0t"/>
 *     &lt;enumeration value="W3_1i-square-0t"/>
 *     &lt;enumeration value="C9.5m-round-0t"/>
 *     &lt;enumeration value="Explicit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumHoleType")
@XmlEnum
public enum EnumHoleType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("S1-generic")
    S_1_GENERIC("S1-generic"),
    @XmlEnumValue("S-generic")
    S_GENERIC("S-generic"),
    @XmlEnumValue("R2-generic")
    R_2_GENERIC("R2-generic"),
    @XmlEnumValue("R2m-DIN")
    R_2_M_DIN("R2m-DIN"),
    @XmlEnumValue("R2m-ISO")
    R_2_M_ISO("R2m-ISO"),
    @XmlEnumValue("R2m-MIB")
    R_2_M_MIB("R2m-MIB"),
    @XmlEnumValue("R2i-US-a")
    R_2_I_US_A("R2i-US-a"),
    @XmlEnumValue("R2i-US-b")
    R_2_I_US_B("R2i-US-b"),
    @XmlEnumValue("R3-generic")
    R_3_GENERIC("R3-generic"),
    @XmlEnumValue("R3i-US")
    R_3_I_US("R3i-US"),
    @XmlEnumValue("R4-generic")
    R_4_GENERIC("R4-generic"),
    @XmlEnumValue("R4m-DIN-A4")
    R_4_M_DIN_A_4("R4m-DIN-A4"),
    @XmlEnumValue("R4m-DIN-A5")
    R_4_M_DIN_A_5("R4m-DIN-A5"),
    @XmlEnumValue("R4m-swedish")
    R_4_M_SWEDISH("R4m-swedish"),
    @XmlEnumValue("R4i-US")
    R_4_I_US("R4i-US"),
    @XmlEnumValue("R5-generic")
    R_5_GENERIC("R5-generic"),
    @XmlEnumValue("R5i-US-a")
    R_5_I_US_A("R5i-US-a"),
    @XmlEnumValue("R5i-US-b")
    R_5_I_US_B("R5i-US-b"),
    @XmlEnumValue("R5i-US-c")
    R_5_I_US_C("R5i-US-c"),
    @XmlEnumValue("R6-generic")
    R_6_GENERIC("R6-generic"),
    @XmlEnumValue("R6m-4h2s")
    R_6_M_4_H_2_S("R6m-4h2s"),
    @XmlEnumValue("R6m-DIN-A5")
    R_6_M_DIN_A_5("R6m-DIN-A5"),
    @XmlEnumValue("R7-generic")
    R_7_GENERIC("R7-generic"),
    @XmlEnumValue("R7i-US-a")
    R_7_I_US_A("R7i-US-a"),
    @XmlEnumValue("R7i-US-b")
    R_7_I_US_B("R7i-US-b"),
    @XmlEnumValue("R7i-US-c")
    R_7_I_US_C("R7i-US-c"),
    @XmlEnumValue("R11m-7h4s")
    R_11_M_7_H_4_S("R11m-7h4s"),
    @XmlEnumValue("P16_9i-rect-0t")
    P_16_9_I_RECT_0_T("P16_9i-rect-0t"),
    @XmlEnumValue("P12m-rect-0t")
    P_12_M_RECT_0_T("P12m-rect-0t"),
    @XmlEnumValue("W2_1i-round-0t")
    W_2_1_I_ROUND_0_T("W2_1i-round-0t"),
    @XmlEnumValue("W2_1i-square-0t")
    W_2_1_I_SQUARE_0_T("W2_1i-square-0t"),
    @XmlEnumValue("W3_1i-square-0t")
    W_3_1_I_SQUARE_0_T("W3_1i-square-0t"),
    @XmlEnumValue("C9.5m-round-0t")
    C_9_5_M_ROUND_0_T("C9.5m-round-0t"),
    @XmlEnumValue("Explicit")
    EXPLICIT("Explicit");
    private final String value;

    EnumHoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumHoleType fromValue(String v) {
        for (EnumHoleType c: EnumHoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
