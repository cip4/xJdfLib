
package org.cip4.lib.xjdf.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.CIP4.org/JDFSchema_2_0}ObservationTarget" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="URL" type="{http://www.CIP4.org/JDFSchema_2_0}URL" />
 *       &lt;attribute name="RepeatStep" type="{http://www.CIP4.org/JDFSchema_2_0}integer" />
 *       &lt;attribute name="RepeatTime" type="{http://www.CIP4.org/JDFSchema_2_0}double" />
 *       &lt;attribute name="ChannelMode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RetryPolicy" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MinDelayTime" type="{http://www.CIP4.org/JDFSchema_2_0}duration" />
 *       &lt;attribute name="Format" type="{http://www.CIP4.org/JDFSchema_2_0}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "observationTarget"
})
@XmlRootElement(name = "Subscription")
public class Subscription
    implements Serializable
{

    @XmlElement(name = "ObservationTarget")
    protected List<ObservationTarget> observationTarget;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "RepeatStep")
    protected Integer repeatStep;
    @XmlAttribute(name = "RepeatTime")
    protected Double repeatTime;
    @XmlAttribute(name = "ChannelMode")
    @XmlSchemaType(name = "anySimpleType")
    protected String channelMode;
    @XmlAttribute(name = "RetryPolicy")
    @XmlSchemaType(name = "anySimpleType")
    protected String retryPolicy;
    @XmlAttribute(name = "MinDelayTime")
    @XmlJavaTypeAdapter(org.cip4.lib.xjdf.type.Duration.class)
    protected org.cip4.lib.xjdf.type.Duration minDelayTime;
    @XmlAttribute(name = "Format")
    protected String format;

    /**
     * Gets the value of the observationTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationTarget }
     * 
     * 
     */
    public List<ObservationTarget> getObservationTarget() {
        if (observationTarget == null) {
            observationTarget = new ArrayList<ObservationTarget>();
        }
        return this.observationTarget;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the repeatStep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepeatStep() {
        return repeatStep;
    }

    /**
     * Sets the value of the repeatStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepeatStep(Integer value) {
        this.repeatStep = value;
    }

    /**
     * Gets the value of the repeatTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRepeatTime() {
        return repeatTime;
    }

    /**
     * Sets the value of the repeatTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRepeatTime(Double value) {
        this.repeatTime = value;
    }

    /**
     * Gets the value of the channelMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelMode() {
        return channelMode;
    }

    /**
     * Sets the value of the channelMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelMode(String value) {
        this.channelMode = value;
    }

    /**
     * Gets the value of the retryPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryPolicy() {
        return retryPolicy;
    }

    /**
     * Sets the value of the retryPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryPolicy(String value) {
        this.retryPolicy = value;
    }

    /**
     * Gets the value of the minDelayTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.cip4.lib.xjdf.type.Duration getMinDelayTime() {
        return minDelayTime;
    }

    /**
     * Sets the value of the minDelayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinDelayTime(org.cip4.lib.xjdf.type.Duration value) {
        this.minDelayTime = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
