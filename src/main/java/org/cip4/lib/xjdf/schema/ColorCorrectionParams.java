
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
 * <p>Java class for ColorCorrectionParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorCorrectionParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ColorCorrectionOp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ColorManagementSystem" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *       &lt;attribute name="FileSpecRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorCorrectionParams", propOrder = {
    "colorCorrectionOp"
})
public class ColorCorrectionParams
    extends ParameterType
    implements Serializable
{

    @XmlElement(name = "ColorCorrectionOp")
    protected List<ColorCorrectionOp> colorCorrectionOp;
    @XmlAttribute(name = "ColorManagementSystem")
    protected String colorManagementSystem;
    @XmlAttribute(name = "FileSpecRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF fileSpecRef;

    /**
     * Gets the value of the colorCorrectionOp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorCorrectionOp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorCorrectionOp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorCorrectionOp }
     * 
     * 
     */
    public List<ColorCorrectionOp> getColorCorrectionOp() {
        if (colorCorrectionOp == null) {
            colorCorrectionOp = new ArrayList<ColorCorrectionOp>();
        }
        return this.colorCorrectionOp;
    }

    /**
     * Gets the value of the colorManagementSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorManagementSystem() {
        return colorManagementSystem;
    }

    /**
     * Sets the value of the colorManagementSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorManagementSystem(String value) {
        this.colorManagementSystem = value;
    }

    /**
     * Gets the value of the fileSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getFileSpecRef() {
        return fileSpecRef;
    }

    /**
     * Sets the value of the fileSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpecRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.fileSpecRef = value;
    }

}
