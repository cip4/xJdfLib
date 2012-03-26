
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScreeningParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreeningParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ScreenSelector" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="IgnoreSourceFile" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScreeningParams", propOrder = {
    "screenSelectors"
})
public class ScreeningParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ScreenSelector")
    protected List<ScreenSelector> screenSelectors;
    @XmlAttribute(name = "IgnoreSourceFile")
    protected Boolean ignoreSourceFile;

    /**
     * Gets the value of the screenSelectors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screenSelectors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreenSelectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreenSelector }
     * 
     * 
     */
    public List<ScreenSelector> getScreenSelectors() {
        if (screenSelectors == null) {
            screenSelectors = new ArrayList<ScreenSelector>();
        }
        return this.screenSelectors;
    }

    /**
     * Gets the value of the ignoreSourceFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIgnoreSourceFile() {
        return ignoreSourceFile;
    }

    /**
     * Sets the value of the ignoreSourceFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreSourceFile(Boolean value) {
        this.ignoreSourceFile = value;
    }

}
