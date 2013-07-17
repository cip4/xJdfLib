
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TrapRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrapRegion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="Pages" type="{http://www.CIP4.org/JDFSchema_2_0}IntegerRangeList" />
 *       &lt;attribute name="TrapZone" type="{http://www.CIP4.org/JDFSchema_2_0}PDFPath" />
 *       &lt;attribute name="TrappingParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrapRegion")
public class TrapRegion
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "Pages")
    protected Integer pages;
    @XmlAttribute(name = "TrapZone")
    protected String trapZone;
    @XmlAttribute(name = "TrappingParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF trappingParamsRef;

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPages(Integer value) {
        this.pages = value;
    }

    /**
     * Gets the value of the trapZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrapZone() {
        return trapZone;
    }

    /**
     * Sets the value of the trapZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrapZone(String value) {
        this.trapZone = value;
    }

    /**
     * Gets the value of the trappingParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getTrappingParamsRef() {
        return trappingParamsRef;
    }

    /**
     * Sets the value of the trappingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrappingParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.trappingParamsRef = value;
    }

}
