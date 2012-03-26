
package org.cip4.lib.xjdf.schema.jdf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumURLTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumURLTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JDFError"/>
 *     &lt;enumeration value="JDFInput"/>
 *     &lt;enumeration value="JDFOutput"/>
 *     &lt;enumeration value="JMF"/>
 *     &lt;enumeration value="SecureJMF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumURLTypes")
@XmlEnum
public enum EnumURLTypes {

    @XmlEnumValue("JDFError")
    JDF_ERROR("JDFError"),
    @XmlEnumValue("JDFInput")
    JDF_INPUT("JDFInput"),
    @XmlEnumValue("JDFOutput")
    JDF_OUTPUT("JDFOutput"),
    JMF("JMF"),
    @XmlEnumValue("SecureJMF")
    SECURE_JMF("SecureJMF");
    private final String value;

    EnumURLTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumURLTypes fromValue(String v) {
        for (EnumURLTypes c: EnumURLTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
