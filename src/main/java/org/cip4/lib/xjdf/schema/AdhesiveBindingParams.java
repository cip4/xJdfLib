
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF coverApplicationParamsRef;
    @XmlAttribute(name = "SpineTapingParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF spineTapingParamsRef;
    @XmlAttribute(name = "SpinePreparationParamsRef")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.IDREF.class)
    protected org.cip4.lib.xjdf.type.IDREF spinePreparationParamsRef;

    /**
     * Gets the value of the coverApplicationParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getCoverApplicationParamsRef() {
        return coverApplicationParamsRef;
    }

    /**
     * Sets the value of the coverApplicationParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverApplicationParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.coverApplicationParamsRef = value;
    }

    /**
     * Gets the value of the spineTapingParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getSpineTapingParamsRef() {
        return spineTapingParamsRef;
    }

    /**
     * Sets the value of the spineTapingParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpineTapingParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.spineTapingParamsRef = value;
    }

    /**
     * Gets the value of the spinePreparationParamsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.IDREF getSpinePreparationParamsRef() {
        return spinePreparationParamsRef;
    }

    /**
     * Sets the value of the spinePreparationParamsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpinePreparationParamsRef(org.cip4.lib.xjdf.type.IDREF value) {
        this.spinePreparationParamsRef = value;
    }

}
