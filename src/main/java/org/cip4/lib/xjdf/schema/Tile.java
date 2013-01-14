
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Tile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}MarkObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ClipBox" type="{http://www.CIP4.org/JDFSchema_2_0}rectangle" />
 *       &lt;attribute name="CTM" type="{http://www.CIP4.org/JDFSchema_2_0}matrix" />
 *       &lt;attribute name="MediaRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tile", propOrder = {
    "markObject"
})
public class Tile
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "MarkObject")
    protected List<MarkObject> markObject;
    @XmlAttribute(name = "ClipBox")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Rectangle.class)
    protected org.cip4.lib.xjdf.type.Rectangle clipBox;
    @XmlAttribute(name = "CTM")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Matrix.class)
    protected org.cip4.lib.xjdf.type.Matrix ctm;
    @XmlAttribute(name = "MediaRef")
    @XmlIDREF
    protected Object mediaRef;

    /**
     * Gets the value of the markObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkObject }
     * 
     * 
     */
    public List<MarkObject> getMarkObject() {
        if (markObject == null) {
            markObject = new ArrayList<MarkObject>();
        }
        return this.markObject;
    }

    /**
     * Gets the value of the clipBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Rectangle getClipBox() {
        return clipBox;
    }

    /**
     * Sets the value of the clipBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipBox(org.cip4.lib.xjdf.type.Rectangle value) {
        this.clipBox = value;
    }

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

    /**
     * Gets the value of the mediaRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMediaRef(Object value) {
        this.mediaRef = value;
    }

}
