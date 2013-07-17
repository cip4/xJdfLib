
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JacketingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JacketingParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="FoldingWidth" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JacketingParams")
public class JacketingParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "FoldingWidth")
    protected Double foldingWidth;

    /**
     * Gets the value of the foldingWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFoldingWidth() {
        return foldingWidth;
    }

    /**
     * Sets the value of the foldingWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFoldingWidth(Double value) {
        this.foldingWidth = value;
    }

}
