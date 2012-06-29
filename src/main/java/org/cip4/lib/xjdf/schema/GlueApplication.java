
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlueApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlueApplication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="GluingTechnique" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlueApplication", propOrder = {
    "glueLines"
})
public class GlueApplication
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "GlueLine")
    protected List<GlueLine> glueLines;
    @XmlAttribute(name = "GluingTechnique")
    @XmlSchemaType(name = "anySimpleType")
    protected String gluingTechnique;

    /**
     * Gets the value of the glueLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueLine }
     * 
     * 
     */
    public List<GlueLine> getGlueLines() {
        if (glueLines == null) {
            glueLines = new ArrayList<GlueLine>();
        }
        return this.glueLines;
    }

    /**
     * Gets the value of the gluingTechnique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGluingTechnique() {
        return gluingTechnique;
    }

    /**
     * Sets the value of the gluingTechnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGluingTechnique(String value) {
        this.gluingTechnique = value;
    }

}
