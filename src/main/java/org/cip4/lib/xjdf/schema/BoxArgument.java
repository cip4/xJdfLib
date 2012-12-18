
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Overlap" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Box" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MirrorMargins" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Offset" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BoxArgument")
public class BoxArgument
    implements Serializable
{

    @XmlAttribute(name = "Overlap")
    protected Boolean overlap;
    @XmlAttribute(name = "Box")
    @XmlSchemaType(name = "anySimpleType")
    protected String box;
    @XmlAttribute(name = "MirrorMargins")
    @XmlSchemaType(name = "anySimpleType")
    protected String mirrorMargins;
    @XmlAttribute(name = "Offset")
    protected List<Double> offsets;

    /**
     * Gets the value of the overlap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverlap() {
        return overlap;
    }

    /**
     * Sets the value of the overlap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverlap(Boolean value) {
        this.overlap = value;
    }

    /**
     * Gets the value of the box property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBox() {
        return box;
    }

    /**
     * Sets the value of the box property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBox(String value) {
        this.box = value;
    }

    /**
     * Gets the value of the mirrorMargins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMirrorMargins() {
        return mirrorMargins;
    }

    /**
     * Sets the value of the mirrorMargins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMirrorMargins(String value) {
        this.mirrorMargins = value;
    }

    /**
     * Gets the value of the offsets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getOffsets() {
        if (offsets == null) {
            offsets = new ArrayList<Double>();
        }
        return this.offsets;
    }

}
