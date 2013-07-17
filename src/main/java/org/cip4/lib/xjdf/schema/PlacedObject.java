
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PlacedObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacedObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CTM" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacedObject")
@XmlSeeAlso({
    ContentObject.class,
    MarkObject.class
})
public abstract class PlacedObject implements Serializable
{

    @XmlAttribute(name = "CTM")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Matrix.class)
    protected org.cip4.lib.xjdf.type.Matrix ctm;

    /**
     * Gets the value of the ctm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Matrix getCTM() {
        return ctm;
    }

    /**
     * Sets the value of the ctm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTM(org.cip4.lib.xjdf.type.Matrix value) {
        this.ctm = value;
    }

}
