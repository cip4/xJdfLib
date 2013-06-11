
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="DoubleFeeds" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="IncorrectComponentQuality" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BadFeeds" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="BadFeedQuality" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DoubleFeedQuality" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IncorrectComponents" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FeederQualityParams")
public class FeederQualityParams
    implements Serializable
{

    @XmlAttribute(name = "DoubleFeeds")
    protected Integer doubleFeeds;
    @XmlAttribute(name = "IncorrectComponentQuality")
    @XmlSchemaType(name = "anySimpleType")
    protected String incorrectComponentQuality;
    @XmlAttribute(name = "BadFeeds")
    protected Integer badFeeds;
    @XmlAttribute(name = "BadFeedQuality")
    @XmlSchemaType(name = "anySimpleType")
    protected String badFeedQuality;
    @XmlAttribute(name = "DoubleFeedQuality")
    @XmlSchemaType(name = "anySimpleType")
    protected String doubleFeedQuality;
    @XmlAttribute(name = "IncorrectComponents")
    protected Integer incorrectComponents;

    /**
     * Gets the value of the doubleFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoubleFeeds() {
        return doubleFeeds;
    }

    /**
     * Sets the value of the doubleFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoubleFeeds(Integer value) {
        this.doubleFeeds = value;
    }

    /**
     * Gets the value of the incorrectComponentQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncorrectComponentQuality() {
        return incorrectComponentQuality;
    }

    /**
     * Sets the value of the incorrectComponentQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncorrectComponentQuality(String value) {
        this.incorrectComponentQuality = value;
    }

    /**
     * Gets the value of the badFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBadFeeds() {
        return badFeeds;
    }

    /**
     * Sets the value of the badFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBadFeeds(Integer value) {
        this.badFeeds = value;
    }

    /**
     * Gets the value of the badFeedQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadFeedQuality() {
        return badFeedQuality;
    }

    /**
     * Sets the value of the badFeedQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadFeedQuality(String value) {
        this.badFeedQuality = value;
    }

    /**
     * Gets the value of the doubleFeedQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoubleFeedQuality() {
        return doubleFeedQuality;
    }

    /**
     * Sets the value of the doubleFeedQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoubleFeedQuality(String value) {
        this.doubleFeedQuality = value;
    }

    /**
     * Gets the value of the incorrectComponents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncorrectComponents() {
        return incorrectComponents;
    }

    /**
     * Sets the value of the incorrectComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncorrectComponents(Integer value) {
        this.incorrectComponents = value;
    }

}
