
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomatedOverPrintParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomatedOverPrintParams">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.CIP4.org/JDFSchema_2_0}ParameterType">
 *       &lt;attribute name="TextBlackLevel" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="KnockOutCMYKWhite" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="TextSizeThreshold" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="LineArtBlackLevel" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="OverPrintBlackLineArt" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *       &lt;attribute name="OverPrintBlackText" type="{http://www.CIP4.org/JDFSchema_2_0}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomatedOverPrintParams")
public class AutomatedOverPrintParams
    extends ParameterType
    implements Serializable
{

    @XmlAttribute(name = "TextBlackLevel")
    protected Double textBlackLevel;
    @XmlAttribute(name = "KnockOutCMYKWhite")
    protected Boolean knockOutCMYKWhite;
    @XmlAttribute(name = "TextSizeThreshold")
    protected Integer textSizeThreshold;
    @XmlAttribute(name = "LineArtBlackLevel")
    protected Double lineArtBlackLevel;
    @XmlAttribute(name = "OverPrintBlackLineArt")
    protected Boolean overPrintBlackLineArt;
    @XmlAttribute(name = "OverPrintBlackText")
    protected Boolean overPrintBlackText;

    /**
     * Gets the value of the textBlackLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTextBlackLevel() {
        return textBlackLevel;
    }

    /**
     * Sets the value of the textBlackLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTextBlackLevel(Double value) {
        this.textBlackLevel = value;
    }

    /**
     * Gets the value of the knockOutCMYKWhite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKnockOutCMYKWhite() {
        return knockOutCMYKWhite;
    }

    /**
     * Sets the value of the knockOutCMYKWhite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKnockOutCMYKWhite(Boolean value) {
        this.knockOutCMYKWhite = value;
    }

    /**
     * Gets the value of the textSizeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTextSizeThreshold() {
        return textSizeThreshold;
    }

    /**
     * Sets the value of the textSizeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTextSizeThreshold(Integer value) {
        this.textSizeThreshold = value;
    }

    /**
     * Gets the value of the lineArtBlackLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLineArtBlackLevel() {
        return lineArtBlackLevel;
    }

    /**
     * Sets the value of the lineArtBlackLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLineArtBlackLevel(Double value) {
        this.lineArtBlackLevel = value;
    }

    /**
     * Gets the value of the overPrintBlackLineArt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverPrintBlackLineArt() {
        return overPrintBlackLineArt;
    }

    /**
     * Sets the value of the overPrintBlackLineArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverPrintBlackLineArt(Boolean value) {
        this.overPrintBlackLineArt = value;
    }

    /**
     * Gets the value of the overPrintBlackText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverPrintBlackText() {
        return overPrintBlackText;
    }

    /**
     * Sets the value of the overPrintBlackText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverPrintBlackText(Boolean value) {
        this.overPrintBlackText = value;
    }

}
