
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumNamedColor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumNamedColor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="White"/>
 *     &lt;enumeration value="Black"/>
 *     &lt;enumeration value="Gray"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Yellow"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="Blue"/>
 *     &lt;enumeration value="Turquoise"/>
 *     &lt;enumeration value="Violet"/>
 *     &lt;enumeration value="Orange"/>
 *     &lt;enumeration value="Brown"/>
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Pink"/>
 *     &lt;enumeration value="Buff"/>
 *     &lt;enumeration value="Ivory"/>
 *     &lt;enumeration value="Goldenrod"/>
 *     &lt;enumeration value="DarkWhite"/>
 *     &lt;enumeration value="DarkBlack"/>
 *     &lt;enumeration value="DarkGray"/>
 *     &lt;enumeration value="DarkRed"/>
 *     &lt;enumeration value="DarkYellow"/>
 *     &lt;enumeration value="DarkGreen"/>
 *     &lt;enumeration value="DarkBlue"/>
 *     &lt;enumeration value="DarkTurquoise"/>
 *     &lt;enumeration value="DarkViolet"/>
 *     &lt;enumeration value="DarkOrange"/>
 *     &lt;enumeration value="DarkBrown"/>
 *     &lt;enumeration value="DarkGold"/>
 *     &lt;enumeration value="DarkSilver"/>
 *     &lt;enumeration value="DarkPink"/>
 *     &lt;enumeration value="DarkBuff"/>
 *     &lt;enumeration value="DarkIvory"/>
 *     &lt;enumeration value="DarkGoldenrod"/>
 *     &lt;enumeration value="DarkMustard"/>
 *     &lt;enumeration value="LightWhite"/>
 *     &lt;enumeration value="LightBlack"/>
 *     &lt;enumeration value="LightGray"/>
 *     &lt;enumeration value="LightRed"/>
 *     &lt;enumeration value="LightYellow"/>
 *     &lt;enumeration value="LightGreen"/>
 *     &lt;enumeration value="LightBlue"/>
 *     &lt;enumeration value="LightTurquoise"/>
 *     &lt;enumeration value="LightViolet"/>
 *     &lt;enumeration value="LightOrange"/>
 *     &lt;enumeration value="LightBrown"/>
 *     &lt;enumeration value="LightGold"/>
 *     &lt;enumeration value="LightSilver"/>
 *     &lt;enumeration value="LightPink"/>
 *     &lt;enumeration value="LightBuff"/>
 *     &lt;enumeration value="LightIvory"/>
 *     &lt;enumeration value="LightGoldenrod"/>
 *     &lt;enumeration value="LightMustard"/>
 *     &lt;enumeration value="ClearWhite"/>
 *     &lt;enumeration value="ClearBlack"/>
 *     &lt;enumeration value="ClearGray"/>
 *     &lt;enumeration value="ClearRed"/>
 *     &lt;enumeration value="ClearGreen"/>
 *     &lt;enumeration value="ClearBlue"/>
 *     &lt;enumeration value="ClearTurquoise"/>
 *     &lt;enumeration value="ClearViolet"/>
 *     &lt;enumeration value="ClearOrange"/>
 *     &lt;enumeration value="ClearBrown"/>
 *     &lt;enumeration value="ClearGold"/>
 *     &lt;enumeration value="ClearSilver"/>
 *     &lt;enumeration value="ClearPink"/>
 *     &lt;enumeration value="ClearBuff"/>
 *     &lt;enumeration value="ClearIvory"/>
 *     &lt;enumeration value="ClearGoldenrod"/>
 *     &lt;enumeration value="ClearMustard"/>
 *     &lt;enumeration value="ClearDarkWhite"/>
 *     &lt;enumeration value="ClearDarkBlack"/>
 *     &lt;enumeration value="ClearDarkGray"/>
 *     &lt;enumeration value="ClearDarkRed"/>
 *     &lt;enumeration value="ClearDarkYellow"/>
 *     &lt;enumeration value="ClearDarkGreen"/>
 *     &lt;enumeration value="ClearDarkBlue"/>
 *     &lt;enumeration value="ClearDarkTurquoise"/>
 *     &lt;enumeration value="ClearDarkViolet"/>
 *     &lt;enumeration value="ClearDarkOrange"/>
 *     &lt;enumeration value="ClearDarkBrown"/>
 *     &lt;enumeration value="ClearDarkGold"/>
 *     &lt;enumeration value="ClearDarkSilver"/>
 *     &lt;enumeration value="ClearDarkPink"/>
 *     &lt;enumeration value="ClearDarkBuff"/>
 *     &lt;enumeration value="ClearDarkIvory"/>
 *     &lt;enumeration value="ClearDarkGoldenrod"/>
 *     &lt;enumeration value="ClearLightWhite"/>
 *     &lt;enumeration value="ClearLightBlack"/>
 *     &lt;enumeration value="ClearLightGray"/>
 *     &lt;enumeration value="ClearLightRed"/>
 *     &lt;enumeration value="ClearLightYellow"/>
 *     &lt;enumeration value="ClearLightGreen"/>
 *     &lt;enumeration value="ClearLightBlue"/>
 *     &lt;enumeration value="ClearLightTurquoise"/>
 *     &lt;enumeration value="ClearLightViolet"/>
 *     &lt;enumeration value="ClearLightOrange"/>
 *     &lt;enumeration value="ClearLightBrown"/>
 *     &lt;enumeration value="ClearLightGold"/>
 *     &lt;enumeration value="ClearLightSilver"/>
 *     &lt;enumeration value="ClearLightPink"/>
 *     &lt;enumeration value="ClearLightBuff"/>
 *     &lt;enumeration value="ClearLightIvory"/>
 *     &lt;enumeration value="ClearLightGoldenrod"/>
 *     &lt;enumeration value="ClearLightMustard"/>
 *     &lt;enumeration value="MultiColor"/>
 *     &lt;enumeration value="NoColor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumNamedColor")
@XmlEnum
public enum EnumNamedColor {

    @XmlEnumValue("White")
    WHITE("White"),
    @XmlEnumValue("Black")
    BLACK("Black"),
    @XmlEnumValue("Gray")
    GRAY("Gray"),
    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Blue")
    BLUE("Blue"),
    @XmlEnumValue("Turquoise")
    TURQUOISE("Turquoise"),
    @XmlEnumValue("Violet")
    VIOLET("Violet"),
    @XmlEnumValue("Orange")
    ORANGE("Orange"),
    @XmlEnumValue("Brown")
    BROWN("Brown"),
    @XmlEnumValue("Gold")
    GOLD("Gold"),
    @XmlEnumValue("Silver")
    SILVER("Silver"),
    @XmlEnumValue("Pink")
    PINK("Pink"),
    @XmlEnumValue("Buff")
    BUFF("Buff"),
    @XmlEnumValue("Ivory")
    IVORY("Ivory"),
    @XmlEnumValue("Goldenrod")
    GOLDENROD("Goldenrod"),
    @XmlEnumValue("DarkWhite")
    DARK_WHITE("DarkWhite"),
    @XmlEnumValue("DarkBlack")
    DARK_BLACK("DarkBlack"),
    @XmlEnumValue("DarkGray")
    DARK_GRAY("DarkGray"),
    @XmlEnumValue("DarkRed")
    DARK_RED("DarkRed"),
    @XmlEnumValue("DarkYellow")
    DARK_YELLOW("DarkYellow"),
    @XmlEnumValue("DarkGreen")
    DARK_GREEN("DarkGreen"),
    @XmlEnumValue("DarkBlue")
    DARK_BLUE("DarkBlue"),
    @XmlEnumValue("DarkTurquoise")
    DARK_TURQUOISE("DarkTurquoise"),
    @XmlEnumValue("DarkViolet")
    DARK_VIOLET("DarkViolet"),
    @XmlEnumValue("DarkOrange")
    DARK_ORANGE("DarkOrange"),
    @XmlEnumValue("DarkBrown")
    DARK_BROWN("DarkBrown"),
    @XmlEnumValue("DarkGold")
    DARK_GOLD("DarkGold"),
    @XmlEnumValue("DarkSilver")
    DARK_SILVER("DarkSilver"),
    @XmlEnumValue("DarkPink")
    DARK_PINK("DarkPink"),
    @XmlEnumValue("DarkBuff")
    DARK_BUFF("DarkBuff"),
    @XmlEnumValue("DarkIvory")
    DARK_IVORY("DarkIvory"),
    @XmlEnumValue("DarkGoldenrod")
    DARK_GOLDENROD("DarkGoldenrod"),
    @XmlEnumValue("DarkMustard")
    DARK_MUSTARD("DarkMustard"),
    @XmlEnumValue("LightWhite")
    LIGHT_WHITE("LightWhite"),
    @XmlEnumValue("LightBlack")
    LIGHT_BLACK("LightBlack"),
    @XmlEnumValue("LightGray")
    LIGHT_GRAY("LightGray"),
    @XmlEnumValue("LightRed")
    LIGHT_RED("LightRed"),
    @XmlEnumValue("LightYellow")
    LIGHT_YELLOW("LightYellow"),
    @XmlEnumValue("LightGreen")
    LIGHT_GREEN("LightGreen"),
    @XmlEnumValue("LightBlue")
    LIGHT_BLUE("LightBlue"),
    @XmlEnumValue("LightTurquoise")
    LIGHT_TURQUOISE("LightTurquoise"),
    @XmlEnumValue("LightViolet")
    LIGHT_VIOLET("LightViolet"),
    @XmlEnumValue("LightOrange")
    LIGHT_ORANGE("LightOrange"),
    @XmlEnumValue("LightBrown")
    LIGHT_BROWN("LightBrown"),
    @XmlEnumValue("LightGold")
    LIGHT_GOLD("LightGold"),
    @XmlEnumValue("LightSilver")
    LIGHT_SILVER("LightSilver"),
    @XmlEnumValue("LightPink")
    LIGHT_PINK("LightPink"),
    @XmlEnumValue("LightBuff")
    LIGHT_BUFF("LightBuff"),
    @XmlEnumValue("LightIvory")
    LIGHT_IVORY("LightIvory"),
    @XmlEnumValue("LightGoldenrod")
    LIGHT_GOLDENROD("LightGoldenrod"),
    @XmlEnumValue("LightMustard")
    LIGHT_MUSTARD("LightMustard"),
    @XmlEnumValue("ClearWhite")
    CLEAR_WHITE("ClearWhite"),
    @XmlEnumValue("ClearBlack")
    CLEAR_BLACK("ClearBlack"),
    @XmlEnumValue("ClearGray")
    CLEAR_GRAY("ClearGray"),
    @XmlEnumValue("ClearRed")
    CLEAR_RED("ClearRed"),
    @XmlEnumValue("ClearGreen")
    CLEAR_GREEN("ClearGreen"),
    @XmlEnumValue("ClearBlue")
    CLEAR_BLUE("ClearBlue"),
    @XmlEnumValue("ClearTurquoise")
    CLEAR_TURQUOISE("ClearTurquoise"),
    @XmlEnumValue("ClearViolet")
    CLEAR_VIOLET("ClearViolet"),
    @XmlEnumValue("ClearOrange")
    CLEAR_ORANGE("ClearOrange"),
    @XmlEnumValue("ClearBrown")
    CLEAR_BROWN("ClearBrown"),
    @XmlEnumValue("ClearGold")
    CLEAR_GOLD("ClearGold"),
    @XmlEnumValue("ClearSilver")
    CLEAR_SILVER("ClearSilver"),
    @XmlEnumValue("ClearPink")
    CLEAR_PINK("ClearPink"),
    @XmlEnumValue("ClearBuff")
    CLEAR_BUFF("ClearBuff"),
    @XmlEnumValue("ClearIvory")
    CLEAR_IVORY("ClearIvory"),
    @XmlEnumValue("ClearGoldenrod")
    CLEAR_GOLDENROD("ClearGoldenrod"),
    @XmlEnumValue("ClearMustard")
    CLEAR_MUSTARD("ClearMustard"),
    @XmlEnumValue("ClearDarkWhite")
    CLEAR_DARK_WHITE("ClearDarkWhite"),
    @XmlEnumValue("ClearDarkBlack")
    CLEAR_DARK_BLACK("ClearDarkBlack"),
    @XmlEnumValue("ClearDarkGray")
    CLEAR_DARK_GRAY("ClearDarkGray"),
    @XmlEnumValue("ClearDarkRed")
    CLEAR_DARK_RED("ClearDarkRed"),
    @XmlEnumValue("ClearDarkYellow")
    CLEAR_DARK_YELLOW("ClearDarkYellow"),
    @XmlEnumValue("ClearDarkGreen")
    CLEAR_DARK_GREEN("ClearDarkGreen"),
    @XmlEnumValue("ClearDarkBlue")
    CLEAR_DARK_BLUE("ClearDarkBlue"),
    @XmlEnumValue("ClearDarkTurquoise")
    CLEAR_DARK_TURQUOISE("ClearDarkTurquoise"),
    @XmlEnumValue("ClearDarkViolet")
    CLEAR_DARK_VIOLET("ClearDarkViolet"),
    @XmlEnumValue("ClearDarkOrange")
    CLEAR_DARK_ORANGE("ClearDarkOrange"),
    @XmlEnumValue("ClearDarkBrown")
    CLEAR_DARK_BROWN("ClearDarkBrown"),
    @XmlEnumValue("ClearDarkGold")
    CLEAR_DARK_GOLD("ClearDarkGold"),
    @XmlEnumValue("ClearDarkSilver")
    CLEAR_DARK_SILVER("ClearDarkSilver"),
    @XmlEnumValue("ClearDarkPink")
    CLEAR_DARK_PINK("ClearDarkPink"),
    @XmlEnumValue("ClearDarkBuff")
    CLEAR_DARK_BUFF("ClearDarkBuff"),
    @XmlEnumValue("ClearDarkIvory")
    CLEAR_DARK_IVORY("ClearDarkIvory"),
    @XmlEnumValue("ClearDarkGoldenrod")
    CLEAR_DARK_GOLDENROD("ClearDarkGoldenrod"),
    @XmlEnumValue("ClearLightWhite")
    CLEAR_LIGHT_WHITE("ClearLightWhite"),
    @XmlEnumValue("ClearLightBlack")
    CLEAR_LIGHT_BLACK("ClearLightBlack"),
    @XmlEnumValue("ClearLightGray")
    CLEAR_LIGHT_GRAY("ClearLightGray"),
    @XmlEnumValue("ClearLightRed")
    CLEAR_LIGHT_RED("ClearLightRed"),
    @XmlEnumValue("ClearLightYellow")
    CLEAR_LIGHT_YELLOW("ClearLightYellow"),
    @XmlEnumValue("ClearLightGreen")
    CLEAR_LIGHT_GREEN("ClearLightGreen"),
    @XmlEnumValue("ClearLightBlue")
    CLEAR_LIGHT_BLUE("ClearLightBlue"),
    @XmlEnumValue("ClearLightTurquoise")
    CLEAR_LIGHT_TURQUOISE("ClearLightTurquoise"),
    @XmlEnumValue("ClearLightViolet")
    CLEAR_LIGHT_VIOLET("ClearLightViolet"),
    @XmlEnumValue("ClearLightOrange")
    CLEAR_LIGHT_ORANGE("ClearLightOrange"),
    @XmlEnumValue("ClearLightBrown")
    CLEAR_LIGHT_BROWN("ClearLightBrown"),
    @XmlEnumValue("ClearLightGold")
    CLEAR_LIGHT_GOLD("ClearLightGold"),
    @XmlEnumValue("ClearLightSilver")
    CLEAR_LIGHT_SILVER("ClearLightSilver"),
    @XmlEnumValue("ClearLightPink")
    CLEAR_LIGHT_PINK("ClearLightPink"),
    @XmlEnumValue("ClearLightBuff")
    CLEAR_LIGHT_BUFF("ClearLightBuff"),
    @XmlEnumValue("ClearLightIvory")
    CLEAR_LIGHT_IVORY("ClearLightIvory"),
    @XmlEnumValue("ClearLightGoldenrod")
    CLEAR_LIGHT_GOLDENROD("ClearLightGoldenrod"),
    @XmlEnumValue("ClearLightMustard")
    CLEAR_LIGHT_MUSTARD("ClearLightMustard"),
    @XmlEnumValue("MultiColor")
    MULTI_COLOR("MultiColor"),
    @XmlEnumValue("NoColor")
    NO_COLOR("NoColor");
    private final String value;

    EnumNamedColor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumNamedColor fromValue(String v) {
        for (EnumNamedColor c: EnumNamedColor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
