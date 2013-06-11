
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FontPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FontPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="UseDefaultFont" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="UseFontEmulation" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="PreferredFont" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKEN" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FontPolicy")
public class FontPolicy
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "UseDefaultFont")
    protected Boolean useDefaultFont;
    @XmlAttribute(name = "UseFontEmulation")
    protected Boolean useFontEmulation;
    @XmlAttribute(name = "PreferredFont")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String preferredFont;

    /**
     * Gets the value of the useDefaultFont property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDefaultFont() {
        return useDefaultFont;
    }

    /**
     * Sets the value of the useDefaultFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDefaultFont(Boolean value) {
        this.useDefaultFont = value;
    }

    /**
     * Gets the value of the useFontEmulation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFontEmulation() {
        return useFontEmulation;
    }

    /**
     * Sets the value of the useFontEmulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFontEmulation(Boolean value) {
        this.useFontEmulation = value;
    }

    /**
     * Gets the value of the preferredFont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredFont() {
        return preferredFont;
    }

    /**
     * Sets the value of the preferredFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredFont(String value) {
        this.preferredFont = value;
    }

}
