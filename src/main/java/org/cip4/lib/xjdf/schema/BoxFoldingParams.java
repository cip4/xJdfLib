
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
 * <p>Java class for BoxFoldingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoxFoldingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}BoxFoldAction" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}GlueLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="BlankDimensionsY" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="BoxFoldingType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BlankDimensionsX" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoxFoldingParams", propOrder = {
    "boxFoldAction",
    "glueLine"
})
public class BoxFoldingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "BoxFoldAction")
    protected List<BoxFoldAction> boxFoldAction;
    @XmlElement(name = "GlueLine")
    protected List<GlueLine> glueLine;
    @XmlAttribute(name = "BlankDimensionsY")
    protected String blankDimensionsY;
    @XmlAttribute(name = "BoxFoldingType")
    @XmlSchemaType(name = "anySimpleType")
    protected String boxFoldingType;
    @XmlAttribute(name = "BlankDimensionsX")
    protected String blankDimensionsX;

    /**
     * Gets the value of the boxFoldAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxFoldAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxFoldAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoxFoldAction }
     * 
     * 
     */
    public List<BoxFoldAction> getBoxFoldAction() {
        if (boxFoldAction == null) {
            boxFoldAction = new ArrayList<BoxFoldAction>();
        }
        return this.boxFoldAction;
    }

    /**
     * Gets the value of the glueLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glueLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlueLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlueLine }
     * 
     * 
     */
    public List<GlueLine> getGlueLine() {
        if (glueLine == null) {
            glueLine = new ArrayList<GlueLine>();
        }
        return this.glueLine;
    }

    /**
     * Gets the value of the blankDimensionsY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlankDimensionsY() {
        return blankDimensionsY;
    }

    /**
     * Sets the value of the blankDimensionsY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlankDimensionsY(String value) {
        this.blankDimensionsY = value;
    }

    /**
     * Gets the value of the boxFoldingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxFoldingType() {
        return boxFoldingType;
    }

    /**
     * Sets the value of the boxFoldingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxFoldingType(String value) {
        this.boxFoldingType = value;
    }

    /**
     * Gets the value of the blankDimensionsX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlankDimensionsX() {
        return blankDimensionsX;
    }

    /**
     * Sets the value of the blankDimensionsX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlankDimensionsX(String value) {
        this.blankDimensionsX = value;
    }

}
