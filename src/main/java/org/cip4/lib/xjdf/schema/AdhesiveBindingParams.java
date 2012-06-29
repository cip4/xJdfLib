
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdhesiveBindingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdhesiveBindingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="CoverApplicationParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SpineTapingParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *       &lt;attribute name="SpinePreparationParamsRef" type="{http://www.CIP4.org/JDFSchema_2_0}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhesiveBindingParams")
public class AdhesiveBindingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "CoverApplicationParamsRef")
    @XmlIDREF
    protected Object coverApplicationParamsRef;
    @XmlAttribute(name = "SpineTapingParamsRef")
    @XmlIDREF
    protected Object spineTapingParamsRef;
    @XmlAttribute(name = "SpinePreparationParamsRef")
    @XmlIDREF
    protected Object spinePreparationParamsRef;

    /**
     * Gets the value of the coverApplicationParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoverApplicationParamsRef() {
        return coverApplicationParamsRef;
    }

    /**
     * Sets the value of the coverApplicationParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCoverApplicationParamsRef(Object value) {
        this.coverApplicationParamsRef = value;
    }

    /**
     * Gets the value of the spineTapingParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSpineTapingParamsRef() {
        return spineTapingParamsRef;
    }

    /**
     * Sets the value of the spineTapingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSpineTapingParamsRef(Object value) {
        this.spineTapingParamsRef = value;
    }

    /**
     * Gets the value of the spinePreparationParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSpinePreparationParamsRef() {
        return spinePreparationParamsRef;
    }

    /**
     * Sets the value of the spinePreparationParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSpinePreparationParamsRef(Object value) {
        this.spinePreparationParamsRef = value;
    }

}
