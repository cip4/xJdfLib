
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NumberingIntent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberingIntent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}IntentType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}NumberItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ColorRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="ColorName" type="{http://www.CIP4.org/JDFSchema_2_0}EnumNamedColor" />
 *       &lt;attribute name="ColorNameDetails" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberingIntent", propOrder = {
    "numberItem"
})
public class NumberingIntent
    extends IntentType
    implements Serializable
{

    @XmlElement(name = "NumberItem")
    protected List<NumberItem> numberItem;
    @XmlAttribute(name = "ColorRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF colorRef;
    @XmlAttribute(name = "ColorName")
    protected EnumNamedColor colorName;
    @XmlAttribute(name = "ColorNameDetails")
    protected String colorNameDetails;

    /**
     * Gets the value of the numberItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberItem }
     * 
     * 
     */
    public List<NumberItem> getNumberItem() {
        if (numberItem == null) {
            numberItem = new ArrayList<NumberItem>();
        }
        return this.numberItem;
    }

    /**
     * Gets the value of the colorRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getColorRef() {
        return colorRef;
    }

    /**
     * Sets the value of the colorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.colorRef = value;
    }

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link EnumNamedColor }
     *     
     */
    public EnumNamedColor getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNamedColor }
     *     
     */
    public void setColorName(EnumNamedColor value) {
        this.colorName = value;
    }

    /**
     * Gets the value of the colorNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorNameDetails() {
        return colorNameDetails;
    }

    /**
     * Sets the value of the colorNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorNameDetails(String value) {
        this.colorNameDetails = value;
    }

}
