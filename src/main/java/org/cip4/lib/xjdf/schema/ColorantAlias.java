
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColorantAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorantAlias">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="RawNames" type="{http://www.CIP4.org/JDFSchema_2_0}Any" />
 *       &lt;attribute name="ReplacementColorantName" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="SeparationNames" type="{http://www.CIP4.org/JDFSchema_2_0}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorantAlias")
public class ColorantAlias
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "RawNames")
    protected String rawNames;
    @XmlAttribute(name = "ReplacementColorantName")
    protected String replacementColorantName;
    @XmlAttribute(name = "SeparationNames")
    protected List<String> separationNames;

    /**
     * Gets the value of the rawNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawNames() {
        return rawNames;
    }

    /**
     * Sets the value of the rawNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawNames(String value) {
        this.rawNames = value;
    }

    /**
     * Gets the value of the replacementColorantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementColorantName() {
        return replacementColorantName;
    }

    /**
     * Sets the value of the replacementColorantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementColorantName(String value) {
        this.replacementColorantName = value;
    }

    /**
     * Gets the value of the separationNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the separationNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeparationNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeparationNames() {
        if (separationNames == null) {
            separationNames = new ArrayList<String>();
        }
        return this.separationNames;
    }

}
