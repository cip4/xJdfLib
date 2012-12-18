
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContactCopyParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactCopyParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="ContactScreen" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Cycle" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="PolarityChange" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="Vacuum" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="Diffusion" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RepeatStep" type="{http://www.CIP4.org/JDFSchema_2_0}XYPair" />
 *       &lt;attribute name="ScreeningParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactCopyParams")
public class ContactCopyParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "ContactScreen")
    protected Boolean contactScreen;
    @XmlAttribute(name = "Cycle")
    protected Integer cycle;
    @XmlAttribute(name = "PolarityChange")
    protected Boolean polarityChange;
    @XmlAttribute(name = "Vacuum")
    protected Double vacuum;
    @XmlAttribute(name = "Diffusion")
    @XmlSchemaType(name = "anySimpleType")
    protected String diffusion;
    @XmlAttribute(name = "RepeatStep")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.XYPair.class)
    protected org.cip4.lib.xjdf.type.XYPair repeatStep;
    @XmlAttribute(name = "ScreeningParamsRef")
    @XmlIDREF
    protected Object screeningParamsRef;

    /**
     * Gets the value of the contactScreen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactScreen() {
        return contactScreen;
    }

    /**
     * Sets the value of the contactScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactScreen(Boolean value) {
        this.contactScreen = value;
    }

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycle() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycle(Integer value) {
        this.cycle = value;
    }

    /**
     * Gets the value of the polarityChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPolarityChange() {
        return polarityChange;
    }

    /**
     * Sets the value of the polarityChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPolarityChange(Boolean value) {
        this.polarityChange = value;
    }

    /**
     * Gets the value of the vacuum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVacuum() {
        return vacuum;
    }

    /**
     * Sets the value of the vacuum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVacuum(Double value) {
        this.vacuum = value;
    }

    /**
     * Gets the value of the diffusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffusion() {
        return diffusion;
    }

    /**
     * Sets the value of the diffusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffusion(String value) {
        this.diffusion = value;
    }

    /**
     * Gets the value of the repeatStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.XYPair getRepeatStep() {
        return repeatStep;
    }

    /**
     * Sets the value of the repeatStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatStep(org.cip4.lib.xjdf.type.XYPair value) {
        this.repeatStep = value;
    }

    /**
     * Gets the value of the screeningParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getScreeningParamsRef() {
        return screeningParamsRef;
    }

    /**
     * Sets the value of the screeningParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setScreeningParamsRef(Object value) {
        this.screeningParamsRef = value;
    }

}
