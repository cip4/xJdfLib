
package org.cip4.lib.xjdf.schema.jdf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EarlyChange" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="Predictor" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LZWParams")
public class LZWParams
    implements Serializable
{

    @XmlAttribute(name = "EarlyChange")
    protected Integer earlyChange;
    @XmlAttribute(name = "Predictor")
    protected Integer predictor;

    /**
     * Gets the value of the earlyChange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEarlyChange() {
        return earlyChange;
    }

    /**
     * Sets the value of the earlyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEarlyChange(Integer value) {
        this.earlyChange = value;
    }

    /**
     * Gets the value of the predictor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPredictor() {
        return predictor;
    }

    /**
     * Sets the value of the predictor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPredictor(Integer value) {
        this.predictor = value;
    }

}
