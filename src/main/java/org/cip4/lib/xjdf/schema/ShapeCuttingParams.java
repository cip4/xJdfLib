
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShapeCuttingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeCuttingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}Shape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DeliveryMode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SheetLay" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ModuleIndex" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="DieLayoutRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShapeCuttingParams", propOrder = {
    "shape"
})
public class ShapeCuttingParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "Shape")
    protected List<Shape> shape;
    @XmlAttribute(name = "DeliveryMode")
    @XmlSchemaType(name = "anySimpleType")
    protected String deliveryMode;
    @XmlAttribute(name = "SheetLay")
    @XmlSchemaType(name = "anySimpleType")
    protected String sheetLay;
    @XmlAttribute(name = "ModuleIndex")
    protected Integer moduleIndex;
    @XmlAttribute(name = "DieLayoutRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF dieLayoutRef;

    /**
     * Gets the value of the shape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shape }
     * 
     * 
     */
    public List<Shape> getShape() {
        if (shape == null) {
            shape = new ArrayList<Shape>();
        }
        return this.shape;
    }

    /**
     * Gets the value of the deliveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * Sets the value of the deliveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMode(String value) {
        this.deliveryMode = value;
    }

    /**
     * Gets the value of the sheetLay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetLay() {
        return sheetLay;
    }

    /**
     * Sets the value of the sheetLay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetLay(String value) {
        this.sheetLay = value;
    }

    /**
     * Gets the value of the moduleIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModuleIndex() {
        return moduleIndex;
    }

    /**
     * Sets the value of the moduleIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModuleIndex(Integer value) {
        this.moduleIndex = value;
    }

    /**
     * Gets the value of the dieLayoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getDieLayoutRef() {
        return dieLayoutRef;
    }

    /**
     * Sets the value of the dieLayoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieLayoutRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.dieLayoutRef = value;
    }

}
