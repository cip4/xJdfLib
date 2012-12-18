
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GluingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GluingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Glue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="GluingProductionID" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GluingParams", propOrder = {
    "glue"
})
public class GluingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Glue")
    protected List<Glue> glue;
    @XmlAttribute(name = "GluingProductionID")
    protected String gluingProductionID;

    /**
     * Gets the value of the glue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Glue }
     * 
     * 
     */
    public List<Glue> getGlue() {
        if (glue == null) {
            glue = new ArrayList<Glue>();
        }
        return this.glue;
    }

    /**
     * Gets the value of the gluingProductionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGluingProductionID() {
        return gluingProductionID;
    }

    /**
     * Sets the value of the gluingProductionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGluingProductionID(String value) {
        this.gluingProductionID = value;
    }

}
